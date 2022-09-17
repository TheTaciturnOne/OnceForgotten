package net.thetaciturnone.onceforgotten.entity.ai.goal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.thetaciturnone.onceforgotten.entity.custom.FallenFootsoldierEntity;

public class FallenFootsoldierAttackGoal extends MeleeAttackGoal {
        private final FallenFootsoldierEntity fallenFootsoldier;
        private int ticks;

        public FallenFootsoldierAttackGoal(FallenFootsoldierEntity fallenFootsoldier, double speed, boolean pauseWhenMobIdle) {
            super(fallenFootsoldier, speed, pauseWhenMobIdle);
            this.fallenFootsoldier = fallenFootsoldier;
        }

        public void start() {
            super.start();
            this.ticks = 0;
        }

        public void stop() {
            super.stop();
            this.fallenFootsoldier.setAttacking(false);
        }

        public void tick() {
            super.tick();
            ++this.ticks;
            if (this.ticks >= 5 && this.getCooldown() < this.getMaxCooldown() / 2) {
                this.fallenFootsoldier.setAttacking(true);
            } else {
                this.fallenFootsoldier.setAttacking(false);
            }

        }
    }
