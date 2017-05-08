import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("how many K's can you pay?");
    String strNum = console.readLine();
    Integer maxAfford = Integer.parseInt(strNum);

    Person off1 = new Person("Susan",34,"brown",true, false,40);
    Person off2 = new Person("Brian",46,"blonde",false,true,75);
    Person off3 = new Person("Chris",27,"brown",false,false,55);

  Person[] hatch = {off1,off2,off3};

    for  (Person coworker : hatch) {
      if (coworker.afford(maxAfford)) {
        System.out.println(coworker.pName);
      }



      // System.out.println(coworker.pName);
      // System.out.println(coworker.afford(maxAfford));
    }
  }
}
