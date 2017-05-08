import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    Person off1 = new Person("Susan",34,"brown",true, false,40);
    Person off2 = new Person("Brian",46,"blonde",false,true,75);
    Person off3 = new Person("Chris",27,"brown",false,false,55);

    Person[] hatch = {off1,off2,off3};

    System.out.println("Hello, would you like a full list, priced list, or add to list??");
    String navigate = console.readLine();

    if (navigate.equals("full")||navigate.equals("Full")){
      for (Person coworker : hatch) {
        System.out.println("--------------");
        System.out.println(coworker.pName);
        System.out.println(coworker.pAge);
        System.out.println(coworker.pHair);
        System.out.println(coworker.pLoud);
        System.out.println(coworker.pMet);
        System.out.println(coworker.pPrice);
      }
    }else if (navigate.equals("priced")||navigate.equals("priced list")){

    System.out.println("Okay, how many K's can you pay");
    String strNum = console.readLine();
    Integer maxAfford = Integer.parseInt(strNum);

      for  (Person coworker : hatch) {
        if (coworker.afford(maxAfford)) {
          System.out.println("--------------");
          System.out.println(coworker.pName);
          System.out.println(coworker.pPrice);
        }
      }

    }else if(navigate.equals("add")||navigate.equals("Add")){
      System.out.println("What is this persons name?");
      String pName = console.readLine();
      System.out.println("What is this persons age?");
      int pAge = Integer.parseInt(console.readLine());
      System.out.println("What color is this persons hair?");
      String pHair = console.readLine();
      System.out.println("Is this person loud?");
      boolean pLoud = Boolean.parseBoolean(console.readLine());
      System.out.println("Have you met this person?");
      boolean pMet = Boolean.parseBoolean(console.readLine());
      System.out.println("How much does this person make?");
      int pPrice = Integer.parseInt(console.readLine());

    }else{
      System.out.println("I'm sorry I don't recognize that response. Please start over.");
    }


  }
}
