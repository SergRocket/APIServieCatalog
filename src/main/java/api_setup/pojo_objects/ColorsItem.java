package api_setup.pojo_objects;

public class ColorsItem{
	private Hsl hsl;
	private double luminance;
	private double distance;
	private String requestedHex;
	private String name;
	private String hex;
	private Rgb rgb;
	private Lab lab;
	private double luminanceWCAG;

	public Hsl getHsl(){
		return hsl;
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

	public Rgb getRgb(){
		return rgb;
	}

	public Lab getLab(){
		return lab;
	}

	public double getLuminanceWCAG(){
		return luminanceWCAG;
	}
}
