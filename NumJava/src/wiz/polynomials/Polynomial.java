package wiz.polynomials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {
    private String inputPoly;
    private ArrayList<String> coef;
    private ArrayList<String> exp;
    private Pattern patternC = Pattern.compile("([+-]?[0-9]+[x])");
    private Matcher matchC;
    private Pattern patternE = Pattern.compile("([\\^][+-]?[0-9]+)");
    private Matcher matchE;
    private String finalPoly = "";

    public Polynomial(){
        this.coef = new ArrayList<>();
        this.exp = new ArrayList<>();
    }
    public Polynomial(String inputPoly){
        this.inputPoly = inputPoly;
        this.coef = new ArrayList<>();
        this.exp = new ArrayList<>();
        parsePoly();
    }

    private void parsePoly() {
        //Place components into coef and exp
        matchC = patternC.matcher(this.inputPoly);

        while(matchC.find()){
            coef.add(matchC.group(1));
        }
        matchE = patternE.matcher(this.inputPoly);
        while(matchE.find()){
            exp.add(matchE.group(1));
        }
        sort();
        finalizePoly();
    }

    private void sort() {
        int n = exp.size();
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if (Integer.parseInt(exp.get(j).substring(1)) > Integer.parseInt(exp.get(j+1).substring(1))) {
                    String temp = coef.get(j);
                    coef.set(j,coef.get(j+1));
                    coef.set(j+1,temp);
                    // swap exp
                    String temp2 = exp.get(j);
                    exp.set(j,exp.get(j+1));
                    exp.set(j+1,temp2);

                }
            }
        }

    }

    private void finalizePoly() {
        for(int i=0; i<coef.size(); i++){
            this.finalPoly+= coef.get(i)+exp.get(i);
        }
    }
    //End of private functions

    //Utility functions for polynomials
    public void printDegree(){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<this.exp.size(); i++){
            if(Integer.parseInt(this.exp.get(i).substring(1))>max){
                max = Integer.parseInt(this.exp.get(i).substring(1));
            }
        }
        System.out.println(max);
    }

    public int getDegree(){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<this.exp.size(); i++){
            if(Integer.parseInt(this.exp.get(i).substring(1))>max){
                max = Integer.parseInt(this.exp.get(i).substring(1));
            }
        }
        return max;
    }

    //Basic arithmetic functions
    public Polynomial addPoly(Polynomial b){
        Polynomial poly = new Polynomial();

        poly.sort();
        poly.finalizePoly();
        return poly;
    }

    public Polynomial subPoly(){
        Polynomial poly = new Polynomial();

        poly.sort();
        poly.finalizePoly();
        return poly;

    }

    public void multPoly(){

    }

    public void divPoly(){

    }

    public void printPoly(){
        System.out.println(finalPoly);
    }


}
