package br.com.confitec.teste.genius.model;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {

    @JsonProperty("unreviewed_annotations")
    private Integer unreviewedAnnotations;
    private Boolean hot;
    private Integer pageviews;

    public Stats() {
    }

    @JsonProperty("unreviewed_annotations")
    public Integer getUnreviewedAnnotations() {
        return unreviewedAnnotations;
    }

    @JsonProperty("unreviewed_annotations")
    public void setUnreviewedAnnotations(Integer unreviewedAnnotations) {
        this.unreviewedAnnotations = unreviewedAnnotations;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Integer getPageviews() {
        return pageviews;
    }

    public void setPageviews(Integer pageviews) {
        this.pageviews = pageviews;
    }

}