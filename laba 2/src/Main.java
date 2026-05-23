import java.util.Scanner;
abstract class Peripheral {

    protected String brand;
    protected double price;
    protected boolean isWireless;
    protected static int count = 0;

    public Peripheral() {
        this.brand = "Unknown";
        this.price = 0;
        this.isWireless = false;
        count++;
    }

    public Peripheral(String brand, double price, boolean isWireless) {
        this.brand = brand;
        this.price = price;
        this.isWireless = isWireless;
        count++;
    }

    public void turnOn() {
        System.out.println("Устройство включено");
    }

    public void turnOn(String mode) {
        System.out.println("Устройство включено в режиме: " + mode);
    }

    public abstract void showInfo();

    public static int getCount() {
        return count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class Keyboard extends Peripheral {
    private int keysCount;

    public Keyboard() {
        super();
        this.keysCount = 104;
    }

    public Keyboard(String brand, double price, boolean isWireless, int keysCount) {
        super(brand, price, isWireless);
        this.keysCount = keysCount;
    }

    @Override
    public void showInfo() {
        System.out.println("Клавиатура");
        System.out.println("Бренд: " + brand);
        System.out.println("Цена: " + price);
        System.out.println("Беспроводная: " + isWireless);
        System.out.println("Клавиш: " + keysCount);
    }

    public int getKeysCount() {
        return keysCount;
    }

    public void setKeysCount(int keysCount) {
        this.keysCount = keysCount;
    }
}
class Headphones extends Peripheral {
    private boolean hasMicrophone;

    public Headphones() {
        super();
        this.hasMicrophone = false;
    }

    public Headphones(String brand, double price, boolean isWireless, boolean hasMicrophone) {
        super(brand, price, isWireless);
        this.hasMicrophone = hasMicrophone;
    }

    @Override
    public void showInfo() {
        System.out.println("Наушники");
        System.out.println("Бренд: " + brand);
        System.out.println("Цена: " + price);
        System.out.println("Микрофон: " + hasMicrophone);
    }
    public boolean getHasMicrophone() {
        return hasMicrophone;
    }

    public void setHasMicrophone(boolean hasMicrophone) {
        this.hasMicrophone = hasMicrophone;
    }
}
class GraphicTablet extends Peripheral {
    private double screenSize;

    public GraphicTablet() {
        super();
        this.screenSize = 10.0;
    }

    public GraphicTablet(String brand, double price, boolean isWireless, double screenSize) {
        super(brand, price, isWireless);
        this.screenSize = screenSize;
    }

    @Override
    public void showInfo() {
        System.out.println("Графический планшет");
        System.out.println("Бренд: " + brand);
        System.out.println("Экран: " + screenSize);
    }
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите бренд клавиатуры: ");
        String brand = sc.nextLine();

        System.out.print("Введите цену: ");
        double price = sc.nextDouble();

        System.out.print("Беспроводная? true/false: ");
        boolean wireless = sc.nextBoolean();

        System.out.print("Количество клавиш: ");
        int keys = sc.nextInt();

        Keyboard keyboard = new Keyboard(brand, price, wireless, keys);

        System.out.println("\nИнформация об объекте:");
        keyboard.showInfo();

        System.out.println("Создано объектов: " + Peripheral.getCount());

        sc.close();

    }
}