package dynamic;

public class Triangle implements Geometry{
    double sideA,sideB,sideC,area;
public Triangle(double a, double b, double c){
sideA =a;
sideB=b;
sideC =c;
}

public Triangle() {
	// TODO Auto-generated constructor stub
}

public double getArea(){
double p =(sideA + sideB+ sideC)/2.0;
area = Math. sqrt(p*(p- sideA)*(p-sideB)*(p-sideC));
return area;
}

public void setABC(double a, double b, double c) {
    sideA = a;
    sideB = b;
    sideC = c;
}
public double getSideA() {
    return sideA;
}

public double getSideB() {
    return sideB;
}

public double getSideC() {
    return sideC;
}
}
