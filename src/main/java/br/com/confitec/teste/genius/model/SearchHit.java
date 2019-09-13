package br.com.confitec.teste.genius.model;

public class SearchHit {
    private String index;
    private String type;
    private Song result;

    public SearchHit() {
    }


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Song getResult() {
        return result;
    }

    public void setResult(Song result) {
        this.result = result;
    }
}
