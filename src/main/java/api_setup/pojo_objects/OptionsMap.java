package api_setup.pojo_objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionsMap {
    public String color;
    @JsonProperty("CARD_SIZE_ID")
    public String cart_size_Id;
    @JsonProperty("GREETING")
    public String greeting;
    @JsonProperty("PAPER_TYPE")
    public String paper_type;
    @JsonProperty("TRIM")
    public String trim;
    @JsonProperty("PAPER_FINISH")
    public String paper_finish;

    public OptionsMap()
    {
        super();
    }

    public OptionsMap(String color, String cart_size_Id, String greeting, String paper_type, String trim, String paper_finish) {
        this.color = color;
        this.cart_size_Id = cart_size_Id;
        this.greeting = greeting;
        this.paper_type = paper_type;
        this.trim = trim;
        this.paper_finish = paper_finish;
    }

    public String getColor() {
        return color;
    }

    public String getCart_size_Id() {
        return cart_size_Id;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getPaper_type() {
        return paper_type;
    }

    public String getTrim() {
        return trim;
    }

    public String getPaper_finish() {
        return paper_finish;
    }
}
