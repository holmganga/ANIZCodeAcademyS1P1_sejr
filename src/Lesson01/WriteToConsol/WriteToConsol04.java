package Lesson01.WriteToConsol;
// forskel fra v3 til v4: al funktionalitet ligger i main, variabler er defineret i String Message04
// void betyder den ikke skal returnere noget -- Message04 er ikke en void, men returnere værdien af
// den pågældende String

public class WriteToConsol04 {
    public static void main(String[] args) {

        System.out.print(Message04());
        System.out.print(", som har sko størrelse ");
        System.out.println(Sko());
    }
    // Hops! This method is returning a String value.
    public static String Message04() {
        String navn = "Jenny";
        // Hops! This method is returning a String value.
        return navn;
    }
    public static int Sko(){
        int skoStr = 40;
        return skoStr;
    }
}
