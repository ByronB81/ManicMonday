class Triangle {
  public int sideA;
  public int sideB;
  public int sideC;
  public boolean realTriangle;

  public Triangle(int a, int b, int c){
    sideA = a;
    sideB = b;
    sideC = c;
  }

  // public int shape(Triangle uTri){
  //   if (uTri.sideA == uTri.sideB && uTri.sideB == uTri.sideC){
  //     System.out.println("This is an equilateral triangle.");
  //   } else if (uTri.sideA == uTri.sideB || uTri.sideB == uTri.sideC || uTri.sideC == uTri.sideA) {
  //     System.out.println( "This is an isosceles triangle");
  //   } else {
  //     System.out.println("This is a scalene triangle");
  //     }
  //


  public boolean trueTri(Triangle uTri){
    if (uTri.sideA + uTri.sideB > uTri.sideC || uTri.sideA + uTri.sideC > uTri.sideB || uTri.sideB + uTri.sideC > uTri.sideA) {
      return realTriangle = true;
      System.out.println("Shit's true yo");
    } else {
      return realTriangle = false;
    }
  }
}
