package FactoryPC;

public class IntelCPU implements CPU {

    int cores;
    String name;
    String manufacturer;


    @Override
    public int getCores() {
        this.cores = 16;
        return cores;
    }

    @Override
    public String getName() {
        this.name = "Core I9 x1600";
        return name;
    }

    @Override
    public String getManufacturer() {
        this.manufacturer = "Intel Inside";
        return manufacturer;
    }
}
