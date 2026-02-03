package Lesson03.DotOperator;

public class PersonTest {

    public static void main(String[] args) {

        String fName = "Andreas";
        String mName = "Elias";
        String lName = "Mogensen";
        int age = 47;
        String prof = "Astronaut";

        OpretNytPersonObjekt(fName, mName, lName, age, prof);

        String fName2 = "Sejr";
        String mName2 = "Staugaard";
        String lName2 = "Thomsen";
        int age2 = 29;
        String prof2 = "Studerende";

        OpretNytPersonObjekt (fName2, mName2, lName2, age2, prof2); //hvordan genkender metoden disse variabler?

    }

    public static void OpretNytPersonObjekt(String fName, String mName, String lName, int age, String prof)
    {

        // Opretter et nyt Person-objekt
        Person p = new Person();

        // Sætter værdier
        p.firstName = fName;
        p.middleName = mName;
        p.lastName = lName;
        p.age = age;
        p.profession = prof;

        //Udskriv
        p.WritePersonInfo();
    }
}

