package FactoryPC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String product;

        do {
            System.out.print("Please specify product you wanna buy ('EXIT' ---> end program) : ");
            product = s.nextLine();
            System.out.println("You bought " + product);
        }
        while (!product.equals("EXIT"));
    }


    void printCPUinformation(CPU cpu) {

        int coresInformation = cpu.getCores();
        String cpuName = cpu.getName();
        String manufacturerName = cpu.getManufacturer();

        System.out.println("CPU information: \n" + "* Number of cores: " + coresInformation +
                "\n" + "* Name: " + cpuName +
                "\n" + "* Manufacturer: " + manufacturerName);
    }

    void printGPUinformation(GPU gpu) {

        float memoryInformation = gpu.getMemory();
        String gpuName = gpu.getName();
        String manufacturerName = gpu.getManufacturer();

        System.out.println("CPU information: \n" + "* Number of cores: " + memoryInformation +
                "\n" + "* Name: " + gpuName +
                "\n" + "* Manufacturer: " + manufacturerName);
    }
}
