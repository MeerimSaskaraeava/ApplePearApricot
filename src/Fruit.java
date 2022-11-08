public class Fruit {
    private double price;
    private double weight;

    public Fruit(){}
    public Fruit(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void sellFruits (double kg, Apple apple, Pear pear, Apricot apricot) {

        System.out.println("Apple total: "+kg*apple.getPrice()+" som");
        System.out.println("Pear  total: "+kg*pear.getPrice()+" som");
        System.out.println("Apricot  total: "+kg*apricot.getPrice()+" som");

        double kgg1=  apple.getWeight();
        double kgg2=  pear.getWeight();
        double kgg3=  apricot.getWeight();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Balance apple: "+(kgg1-kg));
        System.out.println("Balance pear: "+(kgg2-kg));
        System.out.println("Balance apricot: "+(kgg3-kg));

    }
}
