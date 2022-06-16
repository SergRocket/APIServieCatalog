package api_endpoints;

public interface EndPointsCatalog {
    String GET_ALL = "all";

    String GET_ALL_SCHEDULED = "all/scheduled";

    String GET_BY_FEEDNAME = "feedName/GOOGLE";

    String PUT_CONFIG_INSERT = "insert";

    String PUT_CONFIG_UPDATE = "update";

    String GET_FEED_CONTROLLER = "feed/create";

    String GET_FEED_BY_VENDOR = "feed/create/BLOOMREACH";

    String POST_CREATE_FEED = "feed/createFeed";

    String GET_DEBUG_BY_ATTRIBUTE_NAME = "attributealias/forceRefresh";

    String GET_ATTRIBUTE_MAPPINGS = "attributemappings";

    String GET_ATTRIBUTE_BY_PRODUCT_CODE = "attributes/productCode/2037483";

    String GET_ATTRIBUTES_BY_PRODUCT_CODE_AND_SKU_CODE = "attributes/productCode/2037483/skuCode/2037486";

    String POST_DEBUG_CREATE_FEED = "createFeed";

    String GET_DEBUG_FILE_HYSTORY_BY_FEEDNAME_AND_STORE_CODE = "fileHistory/lastComplete/BLOOMREACH/SFLY";

    String GET_GOOGLE_ATTRIBUTES_BY_PRODUCT_CODE = "googleattributes/productCode/1160921";

    String GET_DEBUG_GENERATE_FULL_FEED = "generateFullFeed";

    String GET_GOOGLE_ATTRIBUTES_BY_PRODUCT_CODE_AND_SKU_CODE = "googleattributes/productCode/2037483/skuCode/2037486";

    String GET_DEBUG_MAPPINGS = "mappings";

    String GET_DEBUG_MOBILE_BY_SKU_CODE = "mobile/2037486/";

    String GET_DEBUG_PIM_TABLES = "pimtables";

    String GET_DEBUG_PIPI_DATA_BY_PRODUCT_CODE = "pipDataService/2037481";

    String GET_DEBUG_BY_PRODUCT_CODE = "productCode/2037481";

    String POST_DEBUG_RESET_REPO_IDS = "resetRepositoryIds/{password}";

    String GET_DEBUG_SKU_BY_PRODUCT_CODE_AND_SKU_CODE = "sflySkus/2037481/2037484";

    String GET_DEBUG_SHIPPING_PRICE_BY_SKU_AND_QNT_DEFAULT_SHIPPING = "shippingPrice/2037484/1/true";

    String GET_DEBUG_TABLE_MAPPING = "tablemapping";

    String POST_DEBUG_TEST_AVALIABILITY = "testAvailability";

    String GET_DEBUG_TEST_FF = "testFF";

    String POST_DEBUG_TEST_PRICING_BY_PRODUCT_CODE_AND_MIN_QNT = "testPricingForProductVariation/{productCode}/{minQty}";

    String POST_DEBUG_RETRIEVE_PRODUCTS = "testRetrieveProducts";

    String GET_THUMBNAIL_URL_BY_PRODUCT_CODE_AND_SKU_CODE_AND_IMAGE_SIZE = "thumbnailUrl/476299/476300/24";

    String GET_DEBUG_THUBNAIL_URL_BY_PRODUCT_CODE_AND_IMAGE_SIZE = "thumbnailUrls/476299/24";

    String GET_DEBUG_V1_EPA_ATTRIBUTE_BY_KEY = "v1/epattribute/{key}";

    String GET_DEBUG_V1_PIM_ATTRIBUTE_BY_KEY = "v1/pimattribute/{key}";

    String GET_PRODUCTS_DOWNLOAD = "feed/download";

    String GET_FILE_HISTORY_BY_NUMBER_OF_RECORDS = "ALL/10";

    String GET_FILE_HISTORY_BY_FEED_STATUS_ID = "vendor/feedId/9112";

    String GET_FILE_HISTORY_BY_NO_OF_DAYS = "vendor/feedIds/5";

    String GET_FILE_HISTORY_BY_FEED_NAME = "vendor/feedName/BLOOMREACH";

    String GET_STATUS_FOR_ALL = "ALL";

    String GET_STATUS_V1_BY_VENDOR = "v1/BLOOMREACH";

    String GET_STATUS_BY_VENDOR = "BLOOMREACH";

}
