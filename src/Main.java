import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //code below here
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width, height);
             System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
             System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        }
    }
