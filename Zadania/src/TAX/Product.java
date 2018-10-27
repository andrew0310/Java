package TAX;

public class Product {
    private String productName;
    private double nettPrice;
    private Tax tax;

    public Product(Tax tax) {
        this.tax = tax;
    }

    public Product(String productName, double nettPrice, Tax tax) {
        this.tax = tax;
        this.productName = productName;
        this.nettPrice = nettPrice;
    }

    public double grossPrice() {

        double grossPrice = nettPrice + (nettPrice * (tax.getValue()) / 100);
        return grossPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getNettPrice() {
        return nettPrice;
    }

    public void setNettPrice(double nettPrice) {
        this.nettPrice = nettPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", nettPrice=" + nettPrice +
                ", tax=" + tax +
                '}';
    }
}
