import wiz.polynomials.Polynomial;

public class Tester {

    public static void main(String[] args){

        //Create two new Polynomials
        Polynomial myPoly1 = new Polynomial("3x^2");
        Polynomial myPoly2 = new Polynomial("1x^2");

        //System.out.println(myPoly1.getExponents());
        //System.out.println(myPoly1.getPolyDegree());
        //System.out.println("");

        //Add poly1 and poly2
        Polynomial myPoly3 = myPoly1.addPoly(myPoly2);
        System.out.println("Polynomial 3 is "+myPoly3.getParsedPolynomial());
        System.out.println("");

        //Subtract poly1 and poly 2
        Polynomial myPoly4 = myPoly1.subPoly(myPoly2);
        System.out.println("Polynomial 4 is "+myPoly4.getParsedPolynomial());
    }
}
