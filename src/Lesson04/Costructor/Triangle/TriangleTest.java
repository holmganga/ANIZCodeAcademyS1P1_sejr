package Lesson04.Costructor.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();

        Triangle t2 = new Triangle(6, 6, 6);
        t2.showInfo();

        Triangle t3 = new Triangle(10,12,9);
        t3.showInfo();

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