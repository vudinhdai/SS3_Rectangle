import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a width:");
        double width = scanner.nextDouble();
        System.out.println("enter a height:");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        Rectangle rectangleObj = new Rectangle();


        System.out.println("Rectangle is :\n" + rectangle.display());
        System.out.println(" Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("rectangleObj enter :" + rectangleObj.display());
    }
}
