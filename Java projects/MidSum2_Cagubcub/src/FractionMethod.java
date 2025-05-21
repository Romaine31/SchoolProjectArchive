/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Romaine Cagubcub
 */
public class FractionMethod {
    private int numerator;
    private int denominator;

public void setNum(int numerator){
    this.numerator = numerator;
}
public void setDen(int denominator){
    this.denominator = denominator;
}
public int getNum(){
    return this.numerator;
}
public int getDen(){
    return this.denominator;
}

public FractionMethod(){
    this.numerator = 1;
    this.denominator = 1;
}

public void valCheck(int num, int den){
    if (num != 0)
        this.numerator = num;
    else this.numerator = 1;
    if (den != 0)
        this.denominator = den;
    else this.denominator = 1;
}
    @Override
    public String toString(){
    return String.format(this.numerator+"/"+this.denominator);
}

public void addFraction (int num, int den){
    int numR,numR1,numR2,denR;
    denR = this.denominator * den;
    numR1 = this.numerator * den;
    numR2 = num * this.denominator;
    numR = numR1 + numR2;
    this.denominator = denR;
    this.numerator = numR;
}

public void multiplyFraction (int num, int den){
    int numR, denR;
    numR = this.numerator * num;
    denR = this.denominator * den;
    this.numerator = numR;
    this.denominator = denR;
}

}