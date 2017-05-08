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

  public int shape(Triangle uTri){
    return uTri.sideA;
  }

  public boolean trueTri(Triangle uTri){
    if (sideA + sideB > sideC || sideA + sideC > sideB || sideB + sideC > sideA) {
      return realTriangle = true;
    } else {
      return realTriangle = false;
    }
  }
}
