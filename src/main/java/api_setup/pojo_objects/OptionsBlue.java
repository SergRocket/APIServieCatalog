package api_setup.pojo_objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionsBlue {
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<OptionsMap> optionsMap;
    public String skuCode;
    public String sizeId;
    public String styleId;
    public String occasionId;
    public String bundledId;
    public String pricingSku;
    public String premiumSku;
    public String premiumSizeId;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<OptionsForBlue> options;

    public OptionsBlue(ArrayList<OptionsMap> optionsMap, String skuCode, String sizeId, String styleId, String occasionId, String bundledId, String pricingSku, String premiumSku, String premiumSizeId, ArrayList<OptionsForBlue> options) {
        this.optionsMap = optionsMap;
        this.skuCode = skuCode;
        this.sizeId = sizeId;
        this.styleId = styleId;
        this.occasionId = occasionId;
        this.bundledId = bundledId;
        this.pricingSku = pricingSku;
        this.premiumSku = premiumSku;
        this.premiumSizeId = premiumSizeId;
        this.options = options;
    }

    public OptionsBlue(){
        super();
    }

    public ArrayList<OptionsMap> getOptionsMap() {
        return optionsMap;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public String getSizeId() {
        return sizeId;
    }

    public String getStyleId() {
        return styleId;
    }

    public String getOccasionId() {
        return occasionId;
    }

    public String getBundledId() {
        return bundledId;
    }

    public String getPricingSku() {
        return pricingSku;
    }

    public String getPremiumSku() {
        return premiumSku;
    }

    public String getPremiumSizeId() {
        return premiumSizeId;
    }

    public ArrayList<OptionsForBlue> getOptions() {
        return options;
    }
}
