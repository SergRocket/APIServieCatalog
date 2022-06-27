package api.setup.pojo.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ColorsItem{
	private HslValues hslValues;
	private double luminance;
	private double distance;
	private String requestedHex;
	private String name;
	private String hex;
	private RgbValues rgb;
	private Lab lab;
	private double luminanceWCAG;

	public HslValues getHslValues(){
		return hslValues;
	}

	public double getLuminance(){
		return luminance;
	}

	public double getDistance(){
		return distance;
	}

	public String getRequestedHex(){
		return requestedHex;
	}

	public String getName(){
		return name;
	}

	public String getHex(){
		return hex;
	}

	public RgbValues getRgbValues(){
		return getRgbValues();
	}

	public Lab getLab(){
		return lab;
	}

	public double getLuminanceWCAG(){
		return luminanceWCAG;
	}
}
