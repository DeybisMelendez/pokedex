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

    @GetMapping("/pokemon") // Por metodo get (via url) obtendrá el name del pokemon:
                            // /pokemon?name=bulbasaur
    public String getPokemon(@RequestParam("name") String name, Model model) {
        Pokemon pokemon = pokemonService.getPokemonByName(name);

        if (pokemon == null) {
            model.addAttribute("error", "No se encontró el Pokémon con el nombre: " + name);
            return "error"; // Debes crear una vista 'error.html' para mostrar errores
        }

        model.addAttribute("pokemon", pokemon);
        return "pokemon"; // Esto buscará una plantilla 'pokemon.html' para mostrar el resultado
    }

    @GetMapping("/")
    public String home() {
        return "index"; // 'index.html' Vista principal donde puedes poner un formulario para buscar
    }
}
