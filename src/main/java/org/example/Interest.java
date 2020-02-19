package org.example;

import java.io.*;
import java.util.Scanner;

public class Interest
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        double principal=sc.nextInt();
        System.out.println("Enter Rate");
        double rate=sc.nextInt();
        System.out.println("Enter Time");
        double time=sc.nextInt();
        Calculate calculate=new Calculate(principal,rate,time);
        double SI=calculate.SimpleInterest();
        double CI=calculate.CompoundInterest();
        try
        {
            FileOutputStream fileOutputStream=new FileOutputStream("src//main//java//Output.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeDouble((double)SI);
            objectOutputStream.writeDouble((double)CI);

        }
        catch (FileNotFoundException e)
        {
         e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
