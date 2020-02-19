package org.example;

public class Cost {
    String material;
    int area;
    String automation;
    int price;
    Cost(String material,int area,String automation)
    {
        this.material=material;
        this.area=area;
        this.automation=automation;
        this.price=0;
    }

    public int calculateCost() {
        if(material.equalsIgnoreCase("standard"))
        {
            if(automation.equalsIgnoreCase("fully"))
                price+=1900*area;//1200->standard&&700->fully
            else
                price+=1200*area;
        }
        else if(material.equalsIgnoreCase("above standard"))
        {
            if(automation.equalsIgnoreCase("fully"))
                price+=2200*area;//1500->high standard&&700->fully
            else
                price+=1500*area;
        }
        else if(material.equalsIgnoreCase("high standard"))
        {
            if(automation.equalsIgnoreCase("fully"))
                price+=2500*area;//1800->high standard&&700->fully
            else
                price+=1800*area;
        }
        return price;
    }
    }

