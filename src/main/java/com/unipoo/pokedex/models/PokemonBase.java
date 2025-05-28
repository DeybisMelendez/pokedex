package com.unipoo.pokedex.models;

import java.util.List;
import java.util.Map;

public abstract class PokemonBase {
    protected int id;
    protected String name;
    protected int height;
    protected int weight;
    protected List<String> types;
    protected Map<String, Integer> stats;
    protected int baseExperience;

    public PokemonBase(int id, String name, int height, int weight, List<String> types,
            Map<String, Integer> stats, int baseExperience) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.types = types;
        this.stats = stats;
        this.baseExperience = baseExperience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public List<String> getTypes() {
        return types;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public String getPokemonInfo() {
        return "Pokémon: " + name + "\n" +
                "ID: " + id + "\n" +
                "Altura: " + height + "\n" +
                "Peso: " + weight + "\n" +
                "Tipos: " + String.join(", ", types) + "\n" +
                "Estadísticas: " + stats.toString() + "\n" +
                "Experiencia Base: " + baseExperience;
    }

    public abstract String getBattleCry();
}
