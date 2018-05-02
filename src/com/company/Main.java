package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean runAgain = true;
    static ArrayList<Animal> zoo = new ArrayList<>();

    public static void main(String[] args) {
        do {
            switchChoice(mainMenu());
            }
            while (runAgain);
        }

    private static void switchChoice(int mainMenu) {
        switch (mainMenu){
            case 1:
                runAgain = false;
                break;

            case 2:
                createAnimal();
                break;

            case 3:
                findAnimalById();
                break;

            case 4:
                removeAnimal();
                break;

            case 5:
                updateAnimal();
                break;

            case 6:
                System.out.println("\nPrinting the list of animals and their details.");
                System.out.println(AnimalFormater.format(zoo));
                //System.out.println(zoo.toString());
                break;
                default:
                    System.out.println("Wrong input. Valid choices are: 1, 2 or 3!");
        }

    }

    private static int mainMenu() {//reads number from the user, and returns one number
        System.out.println("Welcome to the ZOO management system!");
        System.out.println("=====================================");
        System.out.println("1. Exit ");
        System.out.println("2. Create animal");
        System.out.println("3. Find animal by Id");
        System.out.println("4. Remove animal by Id");
        System.out.println("5. Update animal");
        System.out.println("6. Print Animals");

        System.out.println("\nMake your choice: (1, 2, 3, 4, 5, 6): ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static void createAnimal() {

        boolean loop = true;
        ArrayList<String> food = new ArrayList<>();

        System.out.println("What kind of animal would you like to create?");
        String kind = sc.nextLine();

        System.out.println("Estimated life length?");
        int lifeLength = sc.nextInt();
        sc.nextLine();

        System.out.println("Natural living environment for " + kind + " : ");
        String environment = sc.nextLine();

        System.out.println("What kind of food does " + kind + " eat? ");

            do{//while loop = true
                String food1 = sc.nextLine();
                food.add(food1);

                System.out.println("Would you like to add an other food? (y/n)");
                String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("y")){
                        System.out.println("What more does " + kind + " eat?");
                        sc.nextLine();
                    }else{
                        loop = false;
                    }
            }while (loop);



        Animal animal1 = new Animal(22, food, kind, environment);
        zoo.add(animal1);

        System.out.println("Animal created");
        System.out.println(animal1);
    }

    public static Animal findAnimalById(){
        System.out.println(zoo.toString());
        System.out.println("What is the Id of the animal you want to find?");
        int idFind = sc.nextInt();

        for (Animal animal: zoo) {
            if (idFind == animal.getId()){
                return animal;
            }
        }
        return null;
    }

    public  static void removeAnimal(){
        Animal animalForREmove = findAnimalById();
        zoo.remove(animalForREmove);
        System.out.println("Animal is removed from the list!");
        System.out.println("***************************Printing list********************");
        System.out.println(zoo.toString());
    }

    public static void updateAnimal(){
        Animal animalToUpdate = findAnimalById();

        System.out.println("Before updating :");
        System.out.println(animalToUpdate);

        System.out.println("What would you like to change the type to?");
        String newType = sc.nextLine();
        animalToUpdate.setType(newType);

        System.out.println("After update");
        System.out.println(animalToUpdate);
    }
}
