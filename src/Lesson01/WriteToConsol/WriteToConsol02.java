package Lesson01.WriteToConsol;

// forskel fra v1 til v2 lægger metoden i sin egen static void, som så kaldes i "main", i stedet for at
// funktionaliteten ligger direkte i main
// This is a class
public class WriteToConsol02 {
    public static void main(String[] args) {
        //The method is called.
        Message02();
    }

    // This is a method.
    public static void Message02() {
        System.out.println("I forgot my lunch box! Ver02");
    }
}
