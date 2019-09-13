package br.com.confitec.teste.logic;

import br.com.confitec.teste.exepction.NotFoundException;
import br.com.confitec.teste.genius.api.ArtistClient;
import br.com.confitec.teste.genius.api.SearchClient;
import br.com.confitec.teste.genius.model.Song;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Top10SongsLogicTest {

    private Top10SongsLogic top10SongsLogic;

    @Before
    public void setup(){
        top10SongsLogic = new Top10SongsLogic(new ArtistClient(), new SearchClient());
    }

    @Test(expected = HttpClientErrorException.class)
    public void getTop10SongsId_Exception() {
        top10SongsLogic.getTop10Songs(-1);
    }

    @Test
    public void getTop10SongsId() {
        int id = 1;
        List<Song> top10Songs = top10SongsLogic.getTop10Songs(id);
        assertThat(top10Songs.size(), is(10));
        int lastViews = top10Songs.get(0).getStats().getPageviews();
        for(Song song : top10Songs){
            // nao é possivel fazer esse teste pois o artista pode nao ser o principal e assim nao temos como comparar o id
//            assertThat(song.getPrimaryArtist().getId(), is(id));
            assertThat(song.getStats().getPageviews(), lessThanOrEqualTo(lastViews));
        }
    }

    @Test
    public void getTop10SongsName() {
        String name = "Kendrick Lamar";
        List<Song> top10Songs = top10SongsLogic.getTop10Songs(name);
        assertThat(top10Songs.size(), is(10));
        int lastViews = top10Songs.get(0).getStats().getPageviews();
        for(Song song : top10Songs){
            //verifica se é o artista principal ou se ele só fez participacao
            assertTrue(song.getPrimaryArtist().getName().equals(name)
                    // aparentemente a API retorna um caracter diferente do whitespace no TitleWithFeatured
                    || song.getTitleWithFeatured().replace(" ", " ").contains(name));
            assertThat(song.getStats().getPageviews(), lessThanOrEqualTo(lastViews));
        }
    }

    @Test(expected = NotFoundException.class)
    public void getTop10SongsName_Exception() {
        top10SongsLogic.getTop10Songs("Confitec");
    }
}