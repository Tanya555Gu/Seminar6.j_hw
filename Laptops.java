public class Laptops {
    private double screenSize;

    private String cpu;

    private int ram;

    private int storage;

    private String brand;

    private String colour;

    private int price;

    public Laptops(double screenSize, String cpu, int ram, int storage, String brand, String colour, int price) {
        this.screenSize = screenSize;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getCPU() {
        return cpu;
    }

    public int getRAM() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ScreenSize : " + screenSize + ", CPU : " + cpu + ", RAM : " + ram + ", Storage : " + storage
                + ", Brand : " + brand + ", Colour : " + colour + ", Price : " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Laptops))
            return false;
        Laptops laptop = (Laptops) o;
        return screenSize == laptop.screenSize && cpu.equals(laptop.cpu) && ram == laptop.ram
                && storage == laptop.storage && brand.equals(laptop.brand) && colour.equals(laptop.colour)
                && price == laptop.price;
    }

    @Override
    public int hashCode() {
        return 3 * (int) screenSize + 4 * cpu.hashCode() + 8 * ram + 2 * storage + 5 * brand.hashCode()
                + 8 * colour.hashCode() + 4 * price;
    }

}
