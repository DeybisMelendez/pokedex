package com.unipoo.pokedex.models;

import java.util.List;
import java.util.Map;

public class FirePokemon extends Pokemon {

    public FirePokemon(int id, String name, int height, int weight, List<String> types,
            Map<String, Integer> stats, int baseExperience) {
        super(id, name, height, weight, types, stats, baseExperience);
    }

    @Override
    public String getBattleCry() {
        return "¡Fuegooo ardiente!";
    }
}
