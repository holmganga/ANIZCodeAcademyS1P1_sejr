package TShirtExercise;

public class tShirt {
    String color;
    String print;
    String size;
    double cost;
    boolean inStock;

    //constructor
    public tShirt(String color, String size, String print, double cost, boolean inStock){
        this.color = color;
        this.size = size;
        this.print = print;
        this.cost = cost;
        this.inStock = inStock;
    }

    public void tShirtDescription() {
        System.out.println("Man kan købe en " + color + " t-shirt med " + print + " på i størrelse " + size + ". Den koster " + cost + " euro.");
                if (inStock){
                    System.out.println("Varen er på lager.");
                }
                else {
                    System.out.println("Varen er ikke på lager.");
                }
    }
    public static void main(String[] args) {
        tShirt t1 = new tShirt("sort", "XL", "blomster", 15.49, true);
        t1.tShirtDescription();
        tShirt t2 = new tShirt("rød", "M","en sol",19.99, false);
        t2.tShirtDescription();
        tShirt t3 = new tShirt("blå", "S","et træ", 12.30,true);
    }
}
