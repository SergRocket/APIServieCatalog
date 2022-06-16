package api_setup;

public class BaseSevice  {



        public static String getBaseUrl(String env) {
        String url = "https://product-feed."+env+".shutterfly.com";

        return url;
    }

    public static String getBaseUrlReg(String env) {
        String url = "https://api2."+env+".shutterfly.com";

        return url;
    }

    public static String getBaseUrlRegGetPricing(String env) {
        String url = "https://pricing-orchestration."+env+".shutterfly.com";

        return url;
    }

    public static String getBaseUrlRegFeatureFlag(String env) {
        String url = "https://product-feed."+env+".shutterfly.com";

        return url;
    }

    public static String getBaseUrlRegFeatureFlagonOff(String env) {
        String url = "https://configserver-cloud-int."+env+".shutterfly.com";

        return url;
    }

    public static String getBaseUrlRegVerifySizeId(String env) {
        String url = "https://product-catalog."+env+".shutterfly.com";

        return url;
    }

    protected String getBasePathRegPricing() {
        return "/productprice/v1/";
    }

    protected String getBasePathRegPricingSaleProducts() {
        return "swagger-ui.html#!/product-price-controller/";
    }

    protected String getBasePathRegFeatureFlag() {
        return "/debug/";
    }

    protected String getBasePathRegFeatureFlagOnOff() {
        return "/_internal/properties/services_product_feed/";
    }

    protected String getBasePathReg() {
        return "/pipdata/v1/";
    }

    protected String getBasePathRegVerifySizeId() {
        return "/product/catalog/v1/";
    }



}
