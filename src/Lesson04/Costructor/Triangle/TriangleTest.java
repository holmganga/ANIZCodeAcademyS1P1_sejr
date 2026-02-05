package Lesson04.Costructor.Triangle;

public class TriangleTest {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();

        Triangle t2 = new Triangle(6, 6, 6);
        t2.showInfo();

        Triangle t3 = new Triangle(10,12,9);
        t3.showInfo();

//        Triangle Largest;
//        if (t1.getArea() > t2.getArea() && t1.getArea() > t3.getArea()){
//            Largest = t1;
//        }else if (t2.getArea() > t1.getArea() && t2.getArea() > t3.getArea()){
//            Largest = t2;
//        }else if (t3.getArea() > t2.getArea() && t3.getArea() > t1.getArea()){
//            Largest = t3;}
//        else {
//            System.out.print("error");
//        }

        //tester om Triangle 1 har et størrere areal end først Triangle 2 (t1 > t2), derefter Triangle 3 (t1 > t3)
        //og printer "Triangle 1 is largest" til konsolen så fremt både t1 > t2 og t1 > t3 er sande udsagn

        //gentager derefter for alle andre mulige udfald med brug af "else if"

        //sidste "else" tror jeg er unødvendigt, har blot sat den op så jeg (forhåbenligt) ville have lettere ved at
        //identificere fejl

        if (t1.getArea() > t2.getArea() && t1.getArea() > t3.getArea()){
            System.out.print("Triangle 1 is largest.");
        }else if (t2.getArea() > t1.getArea() && t2.getArea() > t3.getArea()){
            System.out.print("Triangle 2 is largest.");
        }else if (t3.getArea() > t2.getArea() && t3.getArea() > t1.getArea()){
            System.out.print("Triangle 3 is largest.");
        }else {
            System.out.print("error");
        }

        }
    }