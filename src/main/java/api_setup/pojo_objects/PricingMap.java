package api_setup.pojo_objects;

public class PricingMap {
    public String sku;
    public Integer quantity;
    public Double origUnitPrice;
    public Double saleUnitPrice;
    public Double origTotalPrice;
    public Double saleTotalPrice;

    public PricingMap(String sku, Integer quantity,
                       Double origUnitPrice, Double saleUnitPrice, Double origTotalPrice, Double saleTotalPrice) {
        this.sku = sku;
        this.quantity = quantity;
        this.origUnitPrice = origUnitPrice;
        this.saleUnitPrice = saleUnitPrice;
        this.origTotalPrice = origTotalPrice;
        this.saleTotalPrice = saleTotalPrice;
    }

    public PricingMap()
    {
        super();
    }

    public String getSku() {
        return sku;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getOrigUnitPrice() {
        return origUnitPrice;
    }

    public Double getSaleUnitPrice() {
        return saleUnitPrice;
    }

    public Double getOrigTotalPrice() {
        return origTotalPrice;
    }

    public Double getSaleTotalPrice() {
        return saleTotalPrice;
    }
}
