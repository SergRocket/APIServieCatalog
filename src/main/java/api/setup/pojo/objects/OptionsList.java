package api.setup.pojo.objects;

import java.util.ArrayList;

public class OptionsList {
    public String key;
    public String displayName;
    public ArrayList<ProductOptionsFinalList> values;

    public OptionsList(String key, String displayName, ArrayList<ProductOptionsFinalList> values) {
        this.key = key;
        this.displayName = displayName;
        this.values = values;
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
