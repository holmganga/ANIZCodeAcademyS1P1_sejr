package Lesson03.DotOperator;

public class PersonTest {

    public static void main(String[] args) {

        String fName1 = "Andreas";
        String mName1 = "Elias";
        String lName1 = "Mogensen";
        int age1 = 47;
        String prof1 = "Astronaut";

        OpretNytPersonObjekt(fName1, mName1, lName1, age1, prof1);

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

