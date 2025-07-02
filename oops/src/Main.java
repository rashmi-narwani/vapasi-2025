package src;

public class Main {
    public static void main(String[] args) {
        Processor processorOne = new Processor();
        processorOne.setCapacity(16);
        processorOne.setGeneration("Generation One");

        Ram ramOne = new src.Ram();
        ramOne.setGeneration("Ram1");
        ramOne.setSize(8);

        Harddrive hardDriveOne = new Harddrive();
        hardDriveOne.setSize(256);
        hardDriveOne.setType("Standard");

        Laptop laptopOne = new Laptop("Mac", processorOne, ramOne, hardDriveOne);
        System.out.println("Laptop delivered to Manav:" + laptopOne);

        Processor processorTwo = new Processor();
        processorTwo.setCapacity(32);
        processorTwo.setGeneration("Generation Two");

        Ram ramTwo = new Ram();
        ramTwo.setGeneration("Ram2");
        ramTwo.setSize(16);
        Harddrive hardDrive2 = new Harddrive();
        hardDrive2.setSize(512);
        hardDrive2.setType("Premium");

        Laptop laptop2 = new Laptop("Mac Pro", processorTwo, ramTwo, hardDrive2);
        System.out.println("Laptop delivered to Rashmi:" + laptop2);
    }
}