package api.setup.pojo.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionsForResourceMap {
    @JsonProperty("PHOTO_BOOK_SIZE")
    public String photoBookSize;
    @JsonProperty("PHOTO_BOOK_COVER")
    public String photoBookCover;
    @JsonProperty("PHOTO_BOOK_PAGE_OPTIONS")
    public String photoBookPageOptions;

    public OptionsForResourceMap(String photoBookSize, String photoBookCover, String photoBookPageOptions) {
        this.photoBookSize = photoBookSize;
        this.photoBookCover = photoBookCover;
        this.photoBookPageOptions = photoBookPageOptions;
    }

    public OptionsForResourceMap(){
        super();
    }

    public String getPhotoBookSize() {
        return photoBookSize;
    }

    public String getPhotoBookCover() {
        return photoBookCover;
    }

    public String getPhotoBookPageOptions() {
        return photoBookPageOptions;
    }
}
