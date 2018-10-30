package FactoryPC;

public class AMDGPU implements GPU {

    float memory;
    String name;
    String manufacturer;

    @Override
    public float getMemory() {
        this.memory = 3f;
        return memory;
    }

    @Override
    public String getName() {
        this.name = "AMD Graphic HD 4x";
        return name;
    }

    @Override
    public String getManufacturer() {
        this.manufacturer = "AMD GPU & Co.";
        return manufacturer;
    }
}
