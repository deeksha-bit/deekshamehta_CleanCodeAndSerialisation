package org.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Construction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter material type");
        String material= scanner.nextLine();
        System.out.println("Enter area");
        int area= scanner.nextInt();
        System.out.println("Enter automation type");
        String automation=scanner.next();
        Cost cost=new Cost(material,area,automation);
        int finalPrice=cost.calculateCost();
        try
        {
            FileOutputStream fileOutputStream=new FileOutputStream("src//main//java//Output.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.write(finalPrice);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    }

