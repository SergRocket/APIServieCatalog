package APISetup;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptionsMap {
    public String color;
    @JsonProperty("CARD_SIZE_ID")
    public String cARD_SIZE_ID;
    @JsonProperty("GREETING")
    public String gREETING;
    @JsonProperty("PAPER_TYPE")
    public String pAPER_TYPE;
    @JsonProperty("TRIM")
    public String tRIM;
    @JsonProperty("PAPER_FINISH")
    public String pAPER_FINISH;

    public OptionsMap()
    {
        super();
    }

    public OptionsMap(String color, String cARD_SIZE_ID, String gREETING, String pAPER_TYPE, String tRIM, String pAPER_FINISH) {
        this.color = color;
        this.cARD_SIZE_ID = cARD_SIZE_ID;
        this.gREETING = gREETING;
        this.pAPER_TYPE = pAPER_TYPE;
        this.tRIM = tRIM;
        this.pAPER_FINISH = pAPER_FINISH;
    }

    public String getColor() {
        return color;
    }

    public String getcARD_SIZE_ID() {
        return cARD_SIZE_ID;
    }

    public String getgREETING() {
        return gREETING;
    }

    public String getpAPER_TYPE() {
        return pAPER_TYPE;
    }

    public String gettRIM() {
        return tRIM;
    }

    public String getpAPER_FINISH() {
        return pAPER_FINISH;
    }
}
