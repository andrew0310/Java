package FactoryPC;

public class AMDCPU implements CPU {

    int cores;
    String name;
    String manufacturer;

    @Override
    public int getCores() {
        this.cores = 8;
        return cores;
    }

    @Override
    public String getName() {
        this.name = "Athlon X10";
        return name;
    }

    @Override
    public String getManufacturer() {
        this.manufacturer = "AMD Corporation";
        return manufacturer;
    }
}
