package FactoryPC;

import java.util.Scanner;

import static FactoryPC.Commands.EXIT;


public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ComputerFactory computerFactory = null;

        //printCPUinformation(new IntelCPU());
        //printGPUinformation(new AMDGPU());


        Commands x;
        do {
            System.out.print("List of commands:\n"
                    + "* if you wanna buy: BUY,\n"
                    + "* if you wanna change deliverer: CHANGETOAMD or CHANGETOINTEL,\n"
                    + "* if you wanna exit: EXIT.");

            x = Commands.valueOf(s.nextLine());

            switch (x) {
                case CHANGETOAMD:
                    System.out.println("You choosed AMD.");
                    computerFactory = new AMDComputerFactory();
                    break;

                case CHANGETOINTEL:
                    System.out.println("You choosed INTEL");
                    computerFactory = new IntelComputerFactory();
                    break;

                case BUY:
                    printGPUinformation(computerFactory.buidGPU());
                    printCPUinformation(computerFactory.buildCPU());
                    break;
            }
        }
        while (!EXIT.equals(x));
    }


    static void printCPUinformation(CPU cpu) {

        int coresInformation = cpu.getCores();
        String cpuName = cpu.getName();
        String manufacturerName = cpu.getManufacturer();

        System.out.println("CPU information: \n" + "* Number of cores: " + coresInformation + "\n"
                + "* Name: " + cpuName + "\n"
                + "* Manufacturer: " + manufacturerName);
    }

    static void printGPUinformation(GPU gpu) {

        float memoryInformation = gpu.getMemory();
        String gpuName = gpu.getName();
        String manufacturerName = gpu.getManufacturer();

        System.out.println("GPU information: \n" + "* Number of cores: " + memoryInformation + "\n"
                + "* Name: " + gpuName + "\n"
                + "* Manufacturer: " + manufacturerName);
    }
}
