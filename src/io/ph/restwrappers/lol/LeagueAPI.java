package io.ph.restwrappers.lol;

import io.ph.restwrappers.lol.model.LeaguePlayer;
import io.ph.restwrappers.lol.model.LeagueStats;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LeagueAPI {
	static final String ENDPOINT = "https://na.api.pvp.net/";

	@GET("api/lol/{region}/v1.3/stats/by-summoner/{summonerId}/summary")
	Call<LeagueStats> getStats(@Path("summonerId") String summonerId,
			@Path("region") String region,
			@Query("api_key") String apiKey);

	@GET("api/lol/{region}/v1.4/summoner/by-name/{name}")
	Call<LeaguePlayer> getSummoner(@Path("name") String name,
			@Path("region") String region,
			@Query("api_key") String apiKey);
}
