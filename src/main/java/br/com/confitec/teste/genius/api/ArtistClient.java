package br.com.confitec.teste.genius.api;

import br.com.confitec.teste.genius.model.Artist;
import br.com.confitec.teste.genius.model.Response;
import br.com.confitec.teste.genius.model.Song;
import org.springframework.stereotype.Component;

import java.util.List;

import static br.com.confitec.teste.genius.api.GeniusConstants.BASE_URL;

@Component
public class ArtistClient extends Client<ArtistResponse> {

    private static final String ARTIST_ENDPOINT = "%s/artists/%s/songs?sort=popularity&per_page=10";

    public List<Song> getTop10Songs(Integer artistId) {
        String uri = String.format(ARTIST_ENDPOINT, BASE_URL, artistId);
        ArtistResponse artist = request(uri, ArtistResponse.class);
        return artist.getResponse().getSongs();
    }

}

class ArtistResponse extends Response<Artist> {
}
