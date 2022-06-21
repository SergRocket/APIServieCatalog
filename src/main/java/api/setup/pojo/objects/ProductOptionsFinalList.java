package api.setup.pojo.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductOptionsFinalList {
    public String value;
    public Integer displayOrder;
    public String displayName;
    public String uniqueKey;
    public String avaliability;

    public ProductOptionsFinalList(String value, Integer displayOrder, String displayName, String uniqueKey,
                                   String avaliability) {
        this.value = value;
        this.displayOrder = displayOrder;
        this.displayName = displayName;
        this.uniqueKey = uniqueKey;
        this.avaliability = avaliability;
    }

    public ProductOptionsFinalList(){
        super();
    }

    public String getValue() {
        return value;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public String getAvaliability() {
        return avaliability;
    }
}
