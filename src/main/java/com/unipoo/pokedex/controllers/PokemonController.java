package com.unipoo.pokedex.controllers;

import com.unipoo.pokedex.models.Pokemon;
import com.unipoo.pokedex.services.PokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon")
    public String getPokemon(@RequestParam String name, Model model) {
        try {
            Pokemon pokemon = pokemonService.getPokemonByName(name);
            model.addAttribute("pokemon", pokemon);
            return "pokemon"; // renderiza pokemon.html
        } catch (Exception e) {
            model.addAttribute("error", "No se encontró el Pokémon con el nombre: " + name);
            return "error"; // renderiza error.html
        }
    }

    @GetMapping("/")
    public String home() {
        return "index"; // renderiza index.html
    }
}
