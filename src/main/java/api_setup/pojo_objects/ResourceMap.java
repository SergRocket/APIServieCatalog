package api_setup.pojo_objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceMap {
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> optionsMap;
    public String skuCode;
    public String creationalPathUrl;
    public String nautilusCreationPath;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> creationPath;
    public String optionResourceUID;
    public String shortDescription;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> imageUrls;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> altViews;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> ideaPageViews;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> embellishmentViews;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> backgroundViews;
    public Boolean isEPDefault;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> details;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> moreDetails;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> pricingSkus;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public String bookAdditionalPageSku;
    public String formFactor;
    public String marketplaceBackgroundName;
    public String availability;

    public ResourceMap(ArrayList<Object> optionsMap, String skuCode, String creationalPathUrl, String nautilusCreationPath,
                       ArrayList<Object> creationPath, String optionResourceUID, String shortDescription, ArrayList<Object> imageUrls,
                       ArrayList<Object> altViews, ArrayList<Object> ideaPageViews, ArrayList<Object> embellishmentViews,
                       ArrayList<Object> backgroundViews, Boolean isEPDefault, ArrayList<Object> details, ArrayList<Object> moreDetails,
                       ArrayList<Object> pricingSkus, String bookAdditionalPageSku, String formFactor, String marketplaceBackgroundName,
                       String availability) {
        this.optionsMap = optionsMap;
        this.skuCode = skuCode;
        this.creationalPathUrl = creationalPathUrl;
        this.nautilusCreationPath = nautilusCreationPath;
        this.creationPath = creationPath;
        this.optionResourceUID = optionResourceUID;
        this.shortDescription = shortDescription;
        this.imageUrls = imageUrls;
        this.altViews = altViews;
        this.ideaPageViews = ideaPageViews;
        this.embellishmentViews = embellishmentViews;
        this.backgroundViews = backgroundViews;
        this.isEPDefault = isEPDefault;
        this.details = details;
        this.moreDetails = moreDetails;
        this.pricingSkus = pricingSkus;
        this.bookAdditionalPageSku = bookAdditionalPageSku;
        this.formFactor = formFactor;
        this.marketplaceBackgroundName = marketplaceBackgroundName;
        this.availability = availability;
    }

    public ResourceMap(){
        super();
    }
    public ArrayList<Object> getOptionsMap() {
        return optionsMap;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public String getCreationalPathUrl() {
        return creationalPathUrl;
    }

    public String getNautilusCreationPath() {
        return nautilusCreationPath;
    }

    public ArrayList<Object> getCreationPath() {
        return creationPath;
    }

    public String getOptionsResourceUID() {
        return optionResourceUID;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public ArrayList<Object> getImageUrls() {
        return imageUrls;
    }

    public ArrayList<Object> getAltViews() {
        return altViews;
    }

    public ArrayList<Object> getIdeaPageViews() {
        return ideaPageViews;
    }

    public ArrayList<Object> getEmbellishmentViews() {
        return embellishmentViews;
    }

    public ArrayList<Object> getBackgroundViews() {
        return backgroundViews;
    }

    public Boolean getEPDefault() {
        return isEPDefault;
    }

    public ArrayList<Object> getDetails() {
        return details;
    }

    public ArrayList<Object> getMoreDetails() {
        return moreDetails;
    }

    public ArrayList<Object> getPricingSkus() {
        return pricingSkus;
    }

    public String getBookAdditionalPageSku() {
        return bookAdditionalPageSku;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getMarketplaceBackgroundName() {
        return marketplaceBackgroundName;
    }

    public String getAvailability() {
        return availability;
    }
}
