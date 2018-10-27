package builder;

public class HouseBuilderFluentApi implements Builder<House> {

    private House result;

    public HouseBuilderFluentApi() {
        result = new House();
    }

    public HouseBuilderFluentApi setArea(float area) {
        result.setArea(area);
        return this;
    }

    public HouseBuilderFluentApi setGarage(boolean hasGarage) {
        result.setHasGarrage(hasGarage);
        return this;
    }

    public House build() {
        return result;
    }
}
