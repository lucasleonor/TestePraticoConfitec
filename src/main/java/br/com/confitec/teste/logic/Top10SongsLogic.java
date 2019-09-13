package br.com.confitec.teste.logic;

import br.com.confitec.teste.genius.api.ArtistClient;
import br.com.confitec.teste.genius.api.SearchClient;
import br.com.confitec.teste.genius.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Top10SongsLogic {

    private final ArtistClient artistClient;
    private final SearchClient searchClient;

    @Autowired
    public Top10SongsLogic(ArtistClient artistClient, SearchClient searchClient) {
        this.artistClient = artistClient;
        this.searchClient = searchClient;
    }

    public List<Song> getTop10Songs(Integer artistId) {
        return artistClient.getTop10Songs(artistId);
    }

    public List<Song> getTop10Songs (String artistName) {
        Integer artistId = searchClient.getArtistId(artistName);
        return getTop10Songs(artistId);
    }
}
