package com.example.examplemod;

public class GnomeRace implements Race {
    @Override
    public String getId() {
        return "gnome";
    }

    @Override
    public String getName() {
        return "Гном";
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3.0F;
    }
}
