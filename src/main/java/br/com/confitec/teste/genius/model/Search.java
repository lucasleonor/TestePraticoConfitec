package br.com.confitec.teste.genius.model;

import java.util.List;

public class Search {

    private List<SearchHit> hits;

    public Search() {
    }

    public List<SearchHit> getHits() {
        return hits;
    }

    public void setHits(List<SearchHit> hits) {
        this.hits = hits;
    }
}
