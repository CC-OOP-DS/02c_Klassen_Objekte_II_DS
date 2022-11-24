package com.cc.java;

public class Cat {
 
   private String name;
   private String furColor;
   private int age;
   private boolean isFemale;

   

    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
}

    public String getStringAttributes(String flag) {

        switch (flag) {
            case "#name":
                return name;                
            case "#Color":
                return furColor;                     
            default:
                return "F#!%ING ERROR";         
        }
    }

    public String getAge() {
        if (!isFemale) {
            return String.valueOf(age); //oder Integer.toString(age);
        } else {
            return "29+"; 
        }
    }



    



    


    
}
