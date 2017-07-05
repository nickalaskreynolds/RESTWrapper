package io.ph.restwrappers.imgur;

import io.ph.restwrappers.imgur.model.album.Album;
import io.ph.restwrappers.imgur.model.image.Image;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface ImgurAPI {
	final String ENDPOINT = "https://api.imgur.com/3/";

	@GET("image/{id}")
	Call<Image> getImage(@Path("id") String id,
			@Header("Authorization") String authId);

	@GET("album/{id}")
	Call<Album> getAlbum(@Path("id") String id,
			@Header("Authorization") String authId);
}
