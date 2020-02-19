package org.example;

public class Calculate {
    double principal;
    double rate;
    double time;

    public Calculate(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }


    public double SimpleInterest() {
        return (principal*rate*time)/100;
    }


    public double CompoundInterest() {
      double amount=principal*(Math.pow(1+(rate/100),time));
      return amount-principal;
    }
}
