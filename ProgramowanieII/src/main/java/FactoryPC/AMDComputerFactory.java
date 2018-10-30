package FactoryPC;

public class AMDComputerFactory implements ComputerFactory {

    CPU amdCPU;
    GPU amdGPU;

    @Override
    public CPU buildCPU() {
        this.amdCPU = new AMDCPU();
        return amdCPU;
    }

    @Override
    public GPU buidGPU() {
        this.amdGPU = new AMDGPU();
        return amdGPU;
    }
}
