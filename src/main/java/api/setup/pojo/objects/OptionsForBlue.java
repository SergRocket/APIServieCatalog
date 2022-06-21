package api.setup.pojo.objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionsForBlue {
    public String key;
    public String defaultValue;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    public ArrayList<Object> values;
    public String dysplayName;

    public OptionsForBlue(String key, String defaultValue, ArrayList<Object> values, String dysplayName) {
        this.key = key;
        this.defaultValue = defaultValue;
        this.values = values;
        this.dysplayName = dysplayName;
    }
    public OptionsForBlue(){
        super();
    }

    public String getKey() {
        return key;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public ArrayList<Object> getValues() {
        return values;
    }

    public String getDysplayName() {
        return dysplayName;
    }
}
