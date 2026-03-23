import java.util.Scanner;

class Item {
    int code;
    double price;

    void input(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();
        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for item " + (i + 1));
            items[i] = new Item();
            items[i].input(sc);
            total += items[i].price;
        }

        // Display
        System.out.println("\nCode\t\tPrice");
        System.out.println("----------------------");
        for (int i = 0; i < 5; i++) {
            items[i].display();
        }

        // Total price
        System.out.println("----------------------");
        System.out.println("Total Price = " + total);
    }
}