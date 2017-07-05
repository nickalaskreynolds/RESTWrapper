package io.ph.restwrappers.wow;

import io.ph.restwrappers.wow.model.WowCharacter;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WowAPI {
	static final String NA_ENDPOINT = "https://na.api.battle.net/wow/";
	static final String EU_ENDPOINT = "https://eu.api.battle.net/wow/";
	static final String KR_ENDPOINT = "https://kr.api.battle.net/wow/";
	static final String TW_ENDPOINT = "https://tw.api.battle.net/wow/";
	
	@GET("character/{server}/{username}?locale=en_us")
	Call<WowCharacter> getCharacter(@Path("server") String server,
				@Path("username") String username,
				@Query("apikey") String apiKey);
}
