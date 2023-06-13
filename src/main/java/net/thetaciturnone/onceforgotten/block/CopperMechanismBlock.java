package net.thetaciturnone.onceforgotten.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.thetaciturnone.onceforgotten.OnceForgotten;

public class CopperMechanismBlock extends Block implements Oxidizable {
    private final net.minecraft.block.Oxidizable.OxidationLevel OxidationLevel;

    public CopperMechanismBlock(
            net.minecraft.block.Oxidizable.OxidationLevel OxidationLevel,
            Settings settings
    ) {
        super(settings);
        this.OxidationLevel = OxidationLevel;
    }

    @Override
    public void randomTick(
            BlockState state,
            ServerWorld world,
            BlockPos pos,
            Random random
    ) {
        super.randomTick(state, world, pos, random);
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public net.minecraft.block.Oxidizable.OxidationLevel getDegradationLevel() {
        return this.OxidationLevel;
    }

    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        if (this.OxidationLevel == OxidationLevel.UNAFFECTED) {
            return 15;
        } else if (this.OxidationLevel == OxidationLevel.EXPOSED) {
            return 10;
        } else if (this.OxidationLevel == OxidationLevel.WEATHERED) {
            return 5;
        } else return 0;
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
            double d = (double)pos.getX() + 0.5D;
            double e = (double)pos.getY();
            double f = (double)pos.getZ() + 0.5D;
            if (random.nextDouble() < 0.1D) {
                world.playSound(d, e, f, OnceForgotten.CLOCKWORK_SOUND_EVENT, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

    }
}
