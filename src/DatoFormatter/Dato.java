package DatoFormatter;
import java.util.Objects;
import java.util.Scanner;

//Dato (Geeks / basisniveau)
//Skriv et Java-program, der udskriver den aktuelle dato i to forskellige formater:
//        • Amerikansk format → Måned Dag, År (fx 31 August, 2025 eller August 31, 2025)
//        • Europæisk format → Dag Måned År (fx 31 August 2025)
//Programmet skal:
//        • Formatere input (datoen) forskelligt afhængigt af region.
//        • Udskrive begge versioner til konsollen.

public class Dato {
    //attributes
    int day;
    String month;
    int year;

    //constructor -- instruktioner til at lave en instans af klassen Dato
    public Dato(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //metode, der retunerer en string med det rette dato format
    public String getFormat() {
        String format;
        Scanner in = new Scanner(System.in);

        System.out.print("Euro or US?");
        while (true) { //kører det følgende for evigt indtil afbrudt (her af return)
            format = in.nextLine();

            if (Objects.equals(format, "Euro")) {
                return day + " " + month + " " + year;
            } else if (Objects.equals(format, "US")) {
                return month + " " + day + " " + year;
            } else {
                System.out.println("Wrong input");
            }
        }
    }

    //main med dato data (main skal ligges i en ande klasse i fremtiden)
    public static void main(String[] args) {
        Dato dagsDato = new Dato(4, "February", 2026);
        String datoFormat = dagsDato.getFormat(); //bruger metoden getFormat på dagsDato instansen af klassen Dato
        System.out.println(datoFormat);
    }
}