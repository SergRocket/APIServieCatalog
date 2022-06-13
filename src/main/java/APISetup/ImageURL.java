package APISetup;

public class ImageURL {
    public String label;
    public String imageUrl;


    public ImageURL() {
        super();
    }

    public ImageURL(String label, String imageUrl) {
        this.label = label;
        this.imageUrl = imageUrl;
    }

    public String getLabel() {
        return label;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

