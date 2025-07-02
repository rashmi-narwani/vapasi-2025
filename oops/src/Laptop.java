package src;

public class Laptop {
    String logo;
    Processor processor;
    Ram ram;
    Harddrive hdd;

    Laptop(String logo, Processor processor, Ram ram, Harddrive hdd) {
        this.logo = logo;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String toString() {
        String logo = this.logo;
        return "Laptop{'Logo='" + logo + "', Processor='" + this.processor + "', Ram='" + this.ram + "', HDD='" + this.hdd + "'}";
    }
}
