package Lesson01.WriteToConsol;

//forskellen fra v2 til v3: i Message03 defineres teksten som en String variable, som så derefter kaldes
// fremfor at teksten er hardcodet.
public class WriteToConsol03 {
    public static void main(String[] args) {
        Message03();
    }

    public static void Message03() {
        //This is a variable.
        String text = "Sejr B)";
        //The value of the variable is written to the consol.
        System.out.println(text);
    }
}