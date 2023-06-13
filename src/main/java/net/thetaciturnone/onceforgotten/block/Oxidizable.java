package net.thetaciturnone.onceforgotten.block;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

@SuppressWarnings({"rawtypes", "unchecked"})
public interface Oxidizable extends net.minecraft.block.Oxidizable {
    Supplier<BiMap<Block, Block>> OXIDATION_LEVEL_INCREASES = Suppliers.memoize(() -> {
        return (BiMap) ImmutableBiMap.builder()
                .put(OFBlocks.CLOCKWORK_MECHANISM, OFBlocks.EXPOSED_CLOCKWORK_MECHANISM)
                .put(OFBlocks.EXPOSED_CLOCKWORK_MECHANISM, OFBlocks.WEATHERED_CLOCKWORK_MECHANISM)
                .put(OFBlocks.WEATHERED_CLOCKWORK_MECHANISM, OFBlocks.OXIDIZED_CLOCKWORK_MECHANISM)
                .put(OFBlocks.REVERSED_OXIDIZED_CLOCKWORK_MECHANISM, OFBlocks.REVERSED_WEATHERED_CLOCKWORK_MECHANISM)
                .put(OFBlocks.REVERSED_WEATHERED_CLOCKWORK_MECHANISM, OFBlocks.REVERSED_EXPOSED_CLOCKWORK_MECHANISM)
                .put(OFBlocks.REVERSED_EXPOSED_CLOCKWORK_MECHANISM, OFBlocks.CLOCKWORK_MECHANISM)
                .build();
    });
    Supplier<BiMap<Block, Block>> OXIDATION_LEVEL_DECREASES = Suppliers.memoize(() -> {
        return ((BiMap)OXIDATION_LEVEL_INCREASES.get()).inverse();
    });

    static Optional<Block> getDecreasedOxidationBlock(Block block) {
        return Optional.ofNullable((Block)((BiMap)OXIDATION_LEVEL_DECREASES.get()).get(block));
    }

    static Block getUnaffectedOxidationBlock(Block block) {
        Block block2 = block;

        for(Block block3 = (Block)((BiMap)OXIDATION_LEVEL_DECREASES.get()).get(block); block3 != null; block3 = (Block)((BiMap)OXIDATION_LEVEL_DECREASES.get()).get(block3)) {
            block2 = block3;
        }

        return block2;
    }

    static Optional<BlockState> getDecreasedOxidationState(BlockState state) {
        return getDecreasedOxidationBlock(state.getBlock()).map((block) -> {
            return block.getStateWithProperties(state);
        });
    }

    static Optional<Block> getIncreasedOxidationBlock(Block block) {
        return Optional.ofNullable((Block)((BiMap)OXIDATION_LEVEL_INCREASES.get()).get(block));
    }

    static BlockState getUnaffectedOxidationState(BlockState state) {
        return getUnaffectedOxidationBlock(state.getBlock()).getStateWithProperties(state);
    }

    default Optional<BlockState> getDegradationResult(BlockState state) {
        return getIncreasedOxidationBlock(state.getBlock()).map((block) -> {
            return block.getStateWithProperties(state);
        });
    }

    default float getDegradationChanceMultiplier() {
        return this.getDegradationLevel() == net.minecraft.block.Oxidizable.OxidationLevel.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum OxidationLevel {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;

        private OxidationLevel() {
        }
    }
}
