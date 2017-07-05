package io.ph.restwrappers.overwatch;

import io.ph.restwrappers.overwatch.model.OverwatchPlayer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OverwatchAPI {
	static final String ENDPOINT = "https://owapi.net/api/v3/u/";

	@GET("{name}-{discriminator}/stats")
	Call<OverwatchPlayer> getPlayer(@Path("name") String name,
				@Path("discriminator") int discriminator);

}
