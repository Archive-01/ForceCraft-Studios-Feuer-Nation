package mrbysco.forcecraft.tiles.energy;

import net.minecraftforge.energy.EnergyStorage;

public class ForceEnergyStorage extends EnergyStorage {

    public ForceEnergyStorage(int capacity, int maxReceive) {
        super(capacity, maxReceive, 0);
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void consumePower(int energy) {
        this.energy -= energy;

        if(this.energy < 0) {
            this.energy = 0;
        }
    }
}