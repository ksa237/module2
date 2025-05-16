
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] products = {"Сахар", "Соль", "Мука", "Молоко"};
        int[] prices = {312, 103, 231, 117};


        System.out.println("-=Список возможных товаров для покупки=-");
        for (int i=0; i < products.length; i++) {
            System.out.println(i+1 + ". "+ products[i] + ", " + prices[i] + " руб./шт." );
        }

        int[] basket = new int[products.length]; // здесь изначально все нули, кол-во =0, это удобно.

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Ввведите два числа. Номер продукта из списка и количество выбранного продукта в формате:");
            System.out.println("номер_продукта количество");


            String input = scanner.nextLine();
            if("end".equals(input)) {
                double sum = 0;
                for (int item=0; item < basket.length; item++) {
                    sum += (basket[item] * prices[item] );
                }
                System.out.println("Итого, в корзине товаров на " + sum + " руб.");
                    System.out.println("-=Программа завершена=-");
                break;
            }

            String[] arrInput = input.split(" ");
            int numProduct = Integer.parseInt(arrInput[0]) - 1;
            int countProduct = Integer.parseInt(arrInput[1]);

            basket[numProduct]= basket[numProduct] + countProduct;




        }
        
    }
}
