package api_setup.pojo_objects;

import api_setup.pojo_objects.MetaData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.ArrayList;
import java.util.List;

public class BlueprintOption {
    @JsonIgnoreProperties(ignoreUnknown = true)
        public OptionsMap optionsMap;
        public MetaData metadata;
        @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
        public ArrayList<ProductOptions> productOptions;
        @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
        public ArrayList<OptionsBlue> blueprintOptions;
        public Object formatOptions;
        public Object quantityOptions;
        public String productCode;
        public String skuCode;
        public String sizeId;
        public String styleId;
        public String occasionId;
        public Object bundleId;
        public String pricingSku;
        @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
        public ArrayList<ResourceMap> optionResourceMap;
        public String premiumSku;
        public String premiumSizeId;


        public BlueprintOption(){
            super();
        }

        public BlueprintOption(OptionsMap optionsMap,ArrayList<ResourceMap> optionResourceMap, Object quantityOptions,
                               Object formatOptions, ArrayList<OptionsBlue> blueprintOptions,
                               ArrayList<ProductOptions> productOptions,String productCode, String skuCode,
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

    public ArrayList<ResourceMap> getOptionResourceMap() {
        return optionResourceMap;
    }

    public Object getQuantityOptions() {
        return quantityOptions;
    }

    public Object getFormatOptions() {
        return formatOptions;
    }

    public ArrayList<OptionsBlue> getBlueprintOptions() {
        return blueprintOptions;
    }

    public ArrayList<ProductOptions> getProductOptions() {
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

