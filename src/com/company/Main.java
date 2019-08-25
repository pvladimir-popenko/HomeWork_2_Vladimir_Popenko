package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String name = "Вася";
        int age = generateRandomAge();
        int temp = 5;

        System.out.println(name + " в возрасте " + age + " " + "лет");

        if (age > 20 && age < 45) {
            if (temp < -20 || temp > 30) {
                System.out.println(name + " остался дома");
            } else {
                System.out.println(name + " пошел в гости к другу");
            }
        }else if(age<20){
            if (temp <0 && temp < 28){
                System.out.println(name + " остался дома, потому, что молод в такую погоду гулять");
            }else{
                System.out.println(name + " может пойти гулять");
            }
        }else if (age>45){
            if (temp < -10 && temp > 25){
                System.out.println(name + " остался дома, из-за погоды");
            }else{
                System.out.println(name + " отправился гулять к другу");
            }
        }
    }

    public static int generateRandomAge(){
        Random rnd = new Random();
        int age = rnd.nextInt(108);
        return age;
    }
}
