package api_setup.pojo_objects;

import api_setup.pojo2.MetaData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

public class BlueprintOption {
    @JsonIgnoreProperties(ignoreUnknown = true)
        public OptionsMap optionsMap;
        public MetaData metadata;
        public Object productOptions;
        public Object blueprintOptions;
        public Object formatOptions;
        public Object quantityOptions;
        public String productCode;
        public String skuCode;
        public String sizeId;
        public String styleId;
        public String occasionId;
        public Object bundleId;
        public String pricingSku;
        public Object optionResourceMap;
        public String premiumSku;
        public String premiumSizeId;


        public BlueprintOption(){
            super();
        }

        public BlueprintOption(Object optionResourceMap, Object quantityOptions, Object formatOptions, Object blueprintOptions, Object productOptions,String productCode, String skuCode,
                               String sizeId, String styleId,
                               String occasionId, Object bundleId,
                               String pricingSku, String premiumSku,
                               String premiumSizeId) {
            this.optionsMap = optionsMap;
            this.optionResourceMap = optionResourceMap;
            this.quantityOptions = quantityOptions;
            this.formatOptions = formatOptions;
            this.blueprintOptions = blueprintOptions;
            this.productOptions = productOptions;
            this.productCode = productCode;
            this.skuCode = skuCode;
            this.sizeId = sizeId;
            this.styleId = styleId;
            this.occasionId = occasionId;
            this.bundleId = bundleId;
            this.pricingSku = pricingSku;
            this.premiumSku = premiumSku;
            this.premiumSizeId = premiumSizeId;
            }

    public Object getOptionResourceMap() {
        return optionResourceMap;
    }

    public Object getQuantityOptions() {
        return quantityOptions;
    }

    public Object getFormatOptions() {
        return formatOptions;
    }

    public Object getBlueprintOptions() {
        return blueprintOptions;
    }

    public Object getProductOptions() {
        return productOptions;
    }

    public MetaData getMetadata() {
        return metadata;
    }

    public String getProductCode() {
        return productCode;
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

        public Object getBundleId() {
            return bundleId;
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

    }

