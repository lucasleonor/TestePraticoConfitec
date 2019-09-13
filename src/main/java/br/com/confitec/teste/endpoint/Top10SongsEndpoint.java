package br.com.confitec.teste.endpoint;

import br.com.confitec.teste.genius.model.Song;
import br.com.confitec.teste.logic.Top10SongsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/top10songs")
public class Top10SongsEndpoint {

    private final Top10SongsLogic top10SongsLogic;

    @Autowired
    public Top10SongsEndpoint(Top10SongsLogic top10SongsLogic) {
        this.top10SongsLogic = top10SongsLogic;
    }

    @RequestMapping(value = "/artistId/{artistId}", method = RequestMethod.GET)
    public List<Song> top10songs(@PathVariable("artistId") Integer artistId) {
        return top10SongsLogic.getTop10Songs(artistId);
    }
    @RequestMapping(value = "/artistName/{artistName}", method = RequestMethod.GET)
    public List<Song> top10songs(@PathVariable("artistName") String artistName) {
        return top10SongsLogic.getTop10Songs(artistName);
    }
}
