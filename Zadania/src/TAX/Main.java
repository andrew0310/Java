package TAX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Kaszanka", 12.0, Tax.VAT8);
        Product product2 = new Product("Komputer", 1650.0, Tax.VAT23);
        Product product3 = new Product("Woda", 2.7, Tax.VAT5);
        Product product4 = new Product("Telefon", 799.99, Tax.VAT8);
        Product product5 = new Product("Masło", 4.5, Tax.VAT23);

        System.out.println(Arrays.asList(product1, product2, product3, product4, product5));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        Receipt receipt = new Receipt(products);
        receipt.printProducts();
        System.out.println(receipt.getGrossPriceSum());
    }
}
