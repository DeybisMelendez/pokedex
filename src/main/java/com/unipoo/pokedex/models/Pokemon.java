package com.unipoo.pokedex.models;

import java.util.List;
import java.util.Map;

public class Pokemon {
    private int id;
    private String name;
    private int height;
    private int weight;
    private List<String> types;
    private Map<String, Integer> stats; // Usamos Map para almacenar stats como "hp", "attack", "defense", etc.
    private int baseExperience;

    // Constructor
    public Pokemon(int id, String name, int height, int weight, List<String> types, Map<String, Integer> stats,
            int baseExperience) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.types = types;
        this.stats = stats;
        this.baseExperience = baseExperience;
    }

    // Getters y Setters
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

    // Método para mostrar información detallada del Pokémon
    public String getPokemonInfo() {
        return "Pokémon: " + name + "\n" +
                "ID: " + id + "\n" +
                "Altura: " + height + "\n" +
                "Peso: " + weight + "\n" +
                "Tipos: " + String.join(", ", types) + "\n" +
                "Estadísticas: " + stats.toString() + "\n" +
                "Experiencia Base: " + baseExperience;
    }
}
