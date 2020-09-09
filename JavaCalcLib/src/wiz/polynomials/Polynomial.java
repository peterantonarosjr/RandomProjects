package wiz.polynomials;

import wiz.differentiateIntegrate.DerivativeIntegral;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial extends DerivativeIntegral {
    private String polynomial;
    private ArrayList<String> coefficients;
    private ArrayList<String> exponents;
    private ArrayList<String> finalPoly;
    private Pattern patternP = Pattern.compile("([+-]?[0-9]+[x])");//x variable must be lowercase Constants must be given in form Cx^0
    private Pattern patternE = Pattern.compile("([\\^][0-9]+)");//Needs to be totally fixed
    private Matcher matchP;
    private Matcher matchE;

    //Constructor 1
    public Polynomial() {
        coefficients = new ArrayList<String>();
        exponents = new ArrayList<String>();
        finalPoly = new ArrayList<String>();
    }

    //Constructor 2
    public Polynomial(String polynomial){
        this.polynomial=polynomial;
        coefficients = new ArrayList<String>();
        exponents = new ArrayList<String>();
        finalPoly = new ArrayList<String>();
        parsePolynomial();

    }

    private void parsePolynomial() {
        matchP = patternP.matcher(polynomial);

        while(matchP.find()) {
            //Adds coefficients to arrayList
            coefficients.add(matchP.group(1));

        }
        matchE = patternE.matcher(polynomial);
        while(matchE.find()){
            //Adds exponents to arrayList
            exponents.add(matchE.group(1));
        }
    }

    private String returnPolynomial(){
        return polynomial;
    }

    private int getCoefficient(int index){
        String val = coefficients.get(index);
        int valIndex = val.indexOf('x');
        String value = val.substring(0,valIndex);

        //System.out.println("Coeff value: "+value);
        return Integer.parseInt(value);
    }

    private int getExponent(int index){

        return Integer.parseInt(String.valueOf(exponents.get(index).charAt(1)));
    }

    public String finalPolyToString(){
        StringBuilder finalPolyToString = new StringBuilder();
        for(int i=0; i<finalPoly.size(); i++){
            finalPolyToString.append(finalPoly.get(i));
        }
        return finalPolyToString.toString();
    }

    public ArrayList<String> getParsedPolynomial(){
        for(int i=0; i< coefficients.size(); i++){

            finalPoly.add(coefficients.get(i)+exponents.get(i));
        }
        return finalPoly;
    }

    public ArrayList<String> getExponents(){

        return exponents;
    }
    public ArrayList<String> getCoefficients(){

        return coefficients;
    }

    public int getPolyDegree(){
        //char d = exponents.get(0).charAt(1);
        int degree = 0;
        for(int i=0; i<exponents.size(); i++){
            String checker = exponents.get(i).substring(1);
            if(Integer.parseInt(checker)>=degree){
                degree = Integer.parseInt(checker);
            }
        }
        return degree-1;
    }

    public Polynomial addPoly(Polynomial poly2){
        Polynomial newPoly = new Polynomial();
        int shorter = Math.min(this.coefficients.size(),poly2.coefficients.size());
        int longer = Math.max(this.coefficients.size(),poly2.coefficients.size());

        int check = this.coefficients.size()-poly2.coefficients.size();
        for(int i=0; i<shorter; i++){
            if(this.getExponent(i)==poly2.getExponent(i)) {
                int cof1 = this.getCoefficient(i) + poly2.getCoefficient(i);
                newPoly.coefficients.add(cof1 + "x");
                newPoly.exponents.add("^" + this.getExponent(i));
            }
        }
        for(int j=shorter; j<longer; j++){
            if(check<0){
                int cof3 = poly2.getCoefficient(j);
                newPoly.coefficients.add(cof3 + "x");
                newPoly.exponents.add("^"+ poly2.getExponent(j));
            }else if(check>0){
                int cof4 = this.getCoefficient(j);
                newPoly.coefficients.add(cof4 + "x");
                newPoly.exponents.add("^"+ this.getExponent(j));
            }else{
                continue;
            }
        }
        return newPoly;
    }

    public Polynomial subPoly(Polynomial poly2){
        Polynomial newPoly = new Polynomial();
        int shorter = Math.min(this.coefficients.size(),poly2.coefficients.size());
        int longer = Math.max(this.coefficients.size(),poly2.coefficients.size());

        int check = this.coefficients.size()-poly2.coefficients.size();
        for(int i=0; i<shorter; i++){
            if(this.getExponent(i)==poly2.getExponent(i)) {
                int cof1 = this.getCoefficient(i) - poly2.getCoefficient(i);
                newPoly.coefficients.add(cof1 + "x");
                newPoly.exponents.add("^" + this.getExponent(i));
            }
        }
        for(int j=shorter; j<longer; j++){
            if(check<0){
                int cof3 = poly2.getCoefficient(j);
                newPoly.coefficients.add(cof3 + "x");
                newPoly.exponents.add("^"+ poly2.getExponent(j));
            }else if(check>0){
                int cof4 = this.getCoefficient(j);
                newPoly.coefficients.add(cof4 + "x");
                newPoly.exponents.add("^"+ this.getExponent(j));
            }else{
                continue;
            }
        }
        return newPoly;
    }

    public Polynomial multPoly(Polynomial poly2){
        Polynomial newPoly = new Polynomial();

        return newPoly;
    }

    public Polynomial divPoly(Polynomial poly2){
        Polynomial newPoly = new Polynomial();

        return newPoly;
    }

    public Polynomial derivativeOf(Polynomial poly){
        derivative(poly.finalPoly);
        Polynomial newPoly = new Polynomial(poly.finalPolyToString());
        return newPoly;
    }

    public Polynomial integralOf(Polynomial poly){
        integral(poly.finalPoly);
        Polynomial newPoly = new Polynomial(poly.finalPolyToString());
        return newPoly;
    }

}
