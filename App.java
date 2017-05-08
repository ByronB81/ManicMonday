public class App {
  public static void main(String[] args) {
    Person off1 = new Person();
      off1.pName = "Susan";
      off1.pAge = 34;
      off1.pHair = "brown";
      off1.pLoud = true;
      off1.pMet = false;

    Person off2 = new Person();
      off2.pName = "Brian";
      off2.pAge = 46;
      off2.pHair = "blonde";
      off2.pLoud = false;
      off2.pMet = true;

    Person off3 = new Person();
      off3.pName = "Chris";
      off3.pAge = 27;
      off3.pHair = "brown";
      off3.pLoud = false;
      off3.pMet = false;

    Person[] hatch = {off1.off2,off3};

    for Person (coworker : hatch) {
      System.out.println(coworker.pName);
    }
  }
}
