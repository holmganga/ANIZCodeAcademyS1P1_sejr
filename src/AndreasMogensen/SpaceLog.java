package AndreasMogensen;

public class SpaceLog {
    public static void main(String[] args){
        table();
    }

    public static void table(){
        String text = "Mission\t Year\t Days in Space\n" +
                "IRISS\t 2015\t 10\n" +
                "Huginn\t 2025\t 180\n";
        System.out.print(text);
    }
}