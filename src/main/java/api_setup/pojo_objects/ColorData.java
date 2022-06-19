package api_setup.pojo_objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ColorData{
	private String paletteTitle;
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<ColorsItem> colors;

	public ColorData(String paletteTitle, List<ColorsItem> colors) {
		this.paletteTitle = paletteTitle;
		this.colors = colors;
	}

	public String getPaletteTitle(){
		return paletteTitle;
	}

	public List<ColorsItem> getColors(){
		return colors;
	}
}