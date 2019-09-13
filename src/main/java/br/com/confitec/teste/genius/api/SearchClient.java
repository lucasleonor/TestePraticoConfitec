package br.com.confitec.teste.genius.api;

import br.com.confitec.teste.exepction.NotFoundException;
import br.com.confitec.teste.genius.model.*;
import org.springframework.stereotype.Component;

import static br.com.confitec.teste.genius.api.GeniusConstants.BASE_URL;

@Component
public class SearchClient extends Client<SearchResponse> {

    private static final String SEARCH_ENDPOINT = "%s/search?q=%s";

    public Integer getArtistId(String artistName) {
        String uri = String.format(SEARCH_ENDPOINT, BASE_URL, artistName);
        SearchResponse response = request(uri, SearchResponse.class);
        for (SearchHit searchHit : response.getResponse().getHits()) {
            Artist artist = searchHit.getResult().getPrimaryArtist();
            if(artistName.equals(artist.getName())){
                return artist.getId();
            }
        }
        throw new NotFoundException("Artist Not Found");
    }


}

class SearchResponse extends Response<Search> {
}


