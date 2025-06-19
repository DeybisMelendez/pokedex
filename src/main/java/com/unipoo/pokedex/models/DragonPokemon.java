package com.unipoo.pokedex.models;

import java.util.List;
import java.util.Map;

public class DragonPokemon extends Pokemon {

    public DragonPokemon(int id, String name, int height, int weight, List<String> types,
            Map<String, Integer> stats, int baseExperience, String spriteUrl) {
        super(id, name, height, weight, types, stats, baseExperience, spriteUrl);
    }

    @Override
    public String getBattleCry() {
        return "¡El rugido ancestral del dragón!";
    }
}
