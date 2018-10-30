package FactoryPC;

public class IntelComputerFactory implements ComputerFactory {

    CPU intelCPU;
    GPU intelGPU;

    @Override
    public CPU buildCPU() {
        this.intelCPU = new IntelCPU();
        return intelCPU;
    }

    @Override
    public GPU buidGPU() {
        this.intelGPU = new IntelGPU();
        return intelGPU;
    }
}
