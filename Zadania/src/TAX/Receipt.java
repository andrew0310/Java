package TAX;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private List<Product> listOfProducts;

    public Receipt(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public Receipt() {
        this.listOfProducts = new ArrayList<>();
    }

    public void printProducts() {
        System.out.println(listOfProducts);
    }

    public double getGrossPriceSum() {

        double sum = 0;

        for (Product product : listOfProducts) {
            sum += product.grossPrice();
        }
        return sum;

    }

    public double getNetPriceSum() {

        double sum = 0;

        for (Product product : listOfProducts) {
            sum += product.getNettPrice();
        }
        return sum;
    }


    public double roznicaGrossNett(){

       double roznica =  getGrossPriceSum() - getNetPriceSum();
        return roznica;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "listOfProducts=" + listOfProducts +
                '}';
    }
}
