package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Pet[] ownedPet = makePetList();
        for (Pet p : ownedPet) {
            System.out.println(p.getName() + " " + p.speak());
        }
    }

    public static Pet[] makePetList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = sc.nextInt();
        Pet[] petList = new Pet[numOfPets];
        for (int i = 0; i < petList.length; i++) {
            System.out.println("What kind of pets are they?");
            String typeOfPet = sc.next();
            System.out.println("What is their name?");
            String nameOfPet = sc.next();
            if (typeOfPet.equals("Dog")) {
                Dog dog = new Dog(nameOfPet);
                petList[i] = dog;
            } else if (typeOfPet.equals("Cat")) {
                Cat cat = new Cat(nameOfPet);
                petList[i] = cat;
            } else if (typeOfPet.equals("Cow")) {
                Cow cow = new Cow(nameOfPet);
                petList[i] = cow;
            }
        }
        return petList;
    }

}
