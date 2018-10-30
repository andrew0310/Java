package FactoryPC;

public class IntelGPU implements GPU {

    float memory;
    String name;
    String manufacturer;

    @Override
    public float getMemory() {
        this.memory = 2f;
        return memory;
    }

    @Override
    public String getName() {
        this.name = "Intel HD Graphics 4200";
        return name;
    }

    @Override
    public String getManufacturer() {
        this.manufacturer = "Intel Media";
        return manufacturer;
    }
}
