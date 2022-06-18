package api_setup.pojo_objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductOptions {
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<OptionsList> productOptions;
    public String key;
    public String displayName;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<ProductOptionsFinalList> values;

    public ProductOptions(ArrayList<OptionsList> productOptions, String key, String displayName,
                          ArrayList<ProductOptionsFinalList> values) {
        this.productOptions = productOptions;
        this.key = key;
        this.displayName = displayName;
        this.values = values;
    }
    public ProductOptions(){
        super();
    }

    public ArrayList<OptionsList> getProductOptions() {
        return productOptions;
    }

    public String getKey() {
        return key;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ArrayList<ProductOptionsFinalList> getValues() {
        return values;
    }
}
