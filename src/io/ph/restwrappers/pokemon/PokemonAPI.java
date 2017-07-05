package io.ph.restwrappers.pokemon;

import io.ph.restwrappers.pokemon.model.Pokemon;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonAPI {
	final String ENDPOINT = "http://pokeapi.co/api/v2/";
	
	@GET("pokemon/{search}")
	Call<Pokemon> getPokemon(@Path("search") String searchQuery);
}
