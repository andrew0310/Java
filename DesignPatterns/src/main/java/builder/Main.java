package builder;

public class Main {
    public static void main(String[] args) {

        HouseBuilder builder = new HouseBuilder();
        builder.setAdress("Aleje Jerozolimskie 12");

        House h = builder.build();
        System.out.println(h.getAdress());

        h = new HouseBuilderFluentApi()
                .setArea(55.7f)
                .setGarage(true)
                .build();
    }
}
