package com.unipoo.pokedex.models;

import java.util.List;
import java.util.Map;

public abstract class PokemonFactory {

    public static Pokemon createPokemon(int id, String name, int height, int weight,
            List<String> types, Map<String, Integer> stats,
            int baseExperience, String spriteUrl) {

        if (types.contains("fire")) {
            return new FirePokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        } else if (types.contains("water")) {
            return new WaterPokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        } else if (types.contains("grass")) {
            return new GrassPokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        } else if (types.contains("electric")) {
            return new ElectricPokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        } else if (types.contains("psychic")) {
            return new PsychicPokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        } else if (types.contains("ice")) {
            return new IcePokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        } else if (types.contains("dragon")) {
            return new DragonPokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        } else {
            return new Pokemon(id, name, height, weight, types, stats, baseExperience, spriteUrl);
        }
    }
}
