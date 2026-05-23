import java.util.HashMap;

class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name,
                   double price,
                   int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {

        return "Товар: " + name +
                ", цена: " + price +
                ", количество: " + quantity;
    }
}

public class task2 {

    public static void main(String[] args) {

        HashMap<String, Product> products =
                new HashMap<>();

        products.put(
                "123456",
                new Product(
                        "Молоко",
                        120,
                        15
                )
        );

        products.put(
                "777888",
                new Product(
                        "Хлеб",
                        60,
                        30
                )
        );

        products.put(
                "999111",
                new Product(
                        "Сыр",
                        350,
                        8
                )
        );

        System.out.println(
                "Поиск товара:"
        );

        System.out.println(
                products.get("123456")
        );

        System.out.println();

        System.out.println(
                "Удаление товара:"
        );

        products.remove("777888");

        System.out.println(
                products.get("777888")
        );

        System.out.println();

        System.out.println(
                "Все товары:"
        );

        for (String key : products.keySet()) {

            System.out.println(
                    "Штрихкод: " + key
            );

            System.out.println(
                    products.get(key)
            );

            System.out.println();
        }
    }
}