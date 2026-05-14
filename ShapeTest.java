import java.util.Scanner;
import org.shapes.*;

public class ShapeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();

                Square sq = new Square(side);

                System.out.println("Area = " + sq.area());
                System.out.println("Perimeter = " + sq.perimeter());
                break;

            case 2:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();

                Circle c = new Circle(r);

                System.out.println("Area = " + c.area());
                System.out.println("Perimeter = " + c.perimeter());
                break;

            case 3:
                System.out.print("Enter three sides: ");

                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double cc = sc.nextDouble();

                Triangle t = new Triangle(a, b, cc);

                System.out.println("Area = " + t.area());
                System.out.println("Perimeter = " + t.perimeter());
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}