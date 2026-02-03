package Lesson01.PrintOrPrintln;

public class NameTag_alt {
    public static void main (String[] args){
        System.out.print(nameTag());
    }

    public static String nameTag(){
        String tag = "***********************\n" +
                "*        SETH         *\n" +
                "* seth1000@stud.ek.dk *\n" +
                "***********************";
        return tag;
    }
}
