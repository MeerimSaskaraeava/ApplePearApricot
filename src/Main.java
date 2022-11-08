import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fruit fruit=new Fruit();

        Apple apple = new Apple(60.00, 50);
        Pear pear = new Pear(90.00, 35.50);
        Apricot apricot = new Apricot(150.50, 40.65);

        System.out.println("Choose kg ");
        int kg =  scanner.nextInt();
        fruit.sellFruits(kg,apple,pear,apricot);




    }
}