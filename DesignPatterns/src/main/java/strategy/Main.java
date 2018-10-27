package strategy;

public class Main {
    public static void main(String[] args) {

        InverterFormat fi = new InverterFormat();
        System.out.println(fi.format("aaaAAA1,/"));

        SplitterFormat sf = new SplitterFormat();
        System.out.println(sf.format("aaaAAA1,/ Andrzej./"));
    }
}
