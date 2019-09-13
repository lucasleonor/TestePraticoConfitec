package br.com.confitec.teste.genius.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {

    private Integer annotationCount;
    private String apiPath;
    private String fullTitle;
    private String headerImageThumbnailUrl;
    private String headerImageUrl;
    private Integer id;
    private Integer lyricsOwnerId;
    private String lyricsState;
    private String path;
    private Integer pyongsCount;
    private String songArtImageThumbnailUrl;
    private String songArtImageUrl;
    private Stats stats;
    private String title;
    private String titleWithFeatured;
    private String url;
    private Artist primaryArtist;

    public Song() {
    }

    @JsonProperty("annotation_count")
    public Integer getAnnotationCount() {
        return annotationCount;
    }

    @JsonProperty("annotation_count")
    public void setAnnotationCount(Integer annotationCount) {
        this.annotationCount = annotationCount;
    }

    @JsonProperty("api_path")
    public String getApiPath() {
        return apiPath;
    }

    @JsonProperty("api_path")
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    @JsonProperty("full_title")
    public String getFullTitle() {
        return fullTitle;
    }

    @JsonProperty("full_title")
    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    @JsonProperty("header_image_thumbnail_url")
    public String getHeaderImageThumbnailUrl() {
        return headerImageThumbnailUrl;
    }

    @JsonProperty("header_image_thumbnail_url")
    public void setHeaderImageThumbnailUrl(String headerImageThumbnailUrl) {
        this.headerImageThumbnailUrl = headerImageThumbnailUrl;
    }

    @JsonProperty("header_image_url")
    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    @JsonProperty("header_image_url")
    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("lyrics_owner_id")
    public Integer getLyricsOwnerId() {
        return lyricsOwnerId;
    }

    @JsonProperty("lyrics_owner_id")
    public void setLyricsOwnerId(Integer lyricsOwnerId) {
        this.lyricsOwnerId = lyricsOwnerId;
    }

    @JsonProperty("lyrics_state")
    public String getLyricsState() {
        return lyricsState;
    }

    @JsonProperty("lyrics_state")
    public void setLyricsState(String lyricsState) {
        this.lyricsState = lyricsState;
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("pyongs_count")
    public Integer getPyongsCount() {
        return pyongsCount;
    }

    @JsonProperty("pyongs_count")
    public void setPyongsCount(Integer pyongsCount) {
        this.pyongsCount = pyongsCount;
    }

    @JsonProperty("song_art_image_thumbnail_url")
    public String getSongArtImageThumbnailUrl() {
        return songArtImageThumbnailUrl;
    }

    @JsonProperty("song_art_image_thumbnail_url")
    public void setSongArtImageThumbnailUrl(String songArtImageThumbnailUrl) {
        this.songArtImageThumbnailUrl = songArtImageThumbnailUrl;
    }

    @JsonProperty("song_art_image_url")
    public String getSongArtImageUrl() {
        return songArtImageUrl;
    }

    @JsonProperty("song_art_image_url")
    public void setSongArtImageUrl(String songArtImageUrl) {
        this.songArtImageUrl = songArtImageUrl;
    }


    public Stats getStats() {
        return stats;
    }


    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title_with_featured")
    public String getTitleWithFeatured() {
        return titleWithFeatured;
    }

    @JsonProperty("title_with_featured")
    public void setTitleWithFeatured(String titleWithFeatured) {
        this.titleWithFeatured = titleWithFeatured;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("primary_artist")
    public Artist getPrimaryArtist() {
        return primaryArtist;
    }

    @JsonProperty("primary_artist")
    public void setPrimaryArtist(Artist primaryArtist) {
        this.primaryArtist = primaryArtist;
    }
}