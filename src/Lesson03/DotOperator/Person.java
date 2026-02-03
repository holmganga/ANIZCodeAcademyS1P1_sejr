package Lesson03.DotOperator;

public class Person {
    // Attributter
    String firstName;
    String lastName;
    String middleName;
    int age;
    String profession;

    public void WritePersonInfo()
    {
        // Udskriver oplysninger
        System.out.println("Navn: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Alder: " + age);
        System.out.println(profession);
    }
}
