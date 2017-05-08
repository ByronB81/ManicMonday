import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class TriangleTracker {
  public static void main(String[] args){
    Console console = System.console();

    Triangle try = new Triangle(2,4,6);

    System.out.println("Making triangles!!!!!!!!");

    System.out.println("What is the length of side A?");
    int a = Integer.parseInt(console.readLine());
    System.out.println("What is the length of side B?");
    int b = Integer.parseInt(console.readLine());
    System.out.println("What is the length of side C?");
    int c = Integer.parseInt(console.readLine());
    Triangle uTriangle = new Triangle(a,b,c);

    if (a + b > c || a + c > b || b + c > a) {
      System.out.println("This is a triangle");

      System.out.println(shape(try));


    }else {
      System.out.println("This is not a triangle");
    }

  }
}
