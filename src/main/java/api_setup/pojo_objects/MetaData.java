package api_setup.pojo2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaData {

        public String title;
        public String categoryCode;
        public String brand;

        public MetaData(){
            super();
        }
        public MetaData(String title, String categoryCode, String brand) {
            this.title = title;
            this.categoryCode = categoryCode;
            this.brand = brand;
        }

        public String getTitle() {
            return title;
        }

        public String getCategoryCode() {
            return categoryCode;
        }

        public String getBrand() {
            return brand;
        }

}
