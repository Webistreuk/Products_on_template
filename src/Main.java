import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("Введите названия продуктов через точку с запятой:");
            input = scanner.nextLine();
            String[] products = input.split(";");

            if (products.length >= 1 && !products[0].trim().isEmpty()) {
                break;
            } else {
                System.out.println("Ошибка: введено меньше 1 продукта. Попробуйте снова.");
            }
        }

        String[] products = input.split(";");
        for (String product : products) {
            System.out.println("Я выбрал " + product.trim());
        }

        scanner.close();
    }
}