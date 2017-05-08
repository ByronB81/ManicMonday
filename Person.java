class Person {
  public String pName;
  public int pAge;
  public String pHair;
  public boolean pLoud;
  public boolean pMet;
  public int pPrice;

  public Person(String name, int age, String hair, boolean loud, boolean met, int price) {
    pName = name;
    pAge = age;
    pHair = hair;
    pLoud = loud;
    pMet = met;
    pPrice = price;
  }

  public boolean afford(int maxAfford) {
    return (pPrice <= maxAfford);
  }
}
