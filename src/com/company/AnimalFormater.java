package com.company;

import java.util.List;

public class AnimalFormater {

    public static String format(Animal animal){

        String header = header();//this method returns a String representing the header
        StringBuilder sb = new StringBuilder();//with sb we can change strings

        sb.append(header).append('\n');

        sb.append(formatWithoutBorder(animal)).append('\n');

        sb.append(footer());
        return sb.toString();
    }

    public static String format(List<Animal> animals){//for format() all list zoo

        String header = header();
        StringBuilder sb = new StringBuilder();

        sb.append(header).append('\n');

        for (Animal animal : animals) {
            sb.append(formatWithoutBorder(animal)).append('\n');
        }

        sb.append(footer());
        return sb.toString();


    }

    public static String formatWithoutBorder(Animal animal){//putting the animals fitted to the header by creating a table in this method
        return String.format("| %-4o | %-17s | %-19o | %-21s | %-17s |", animal.getId(),
                animal.getType(), animal.getLifeLength(), animal.getLifeEnvironment(), animal.getFood());
//the o is used for INT, and the numbers tells how much space should be allocated
//the s is used for string in the same way
    }

    public static String footer(){
        return "********************************************************************************************************\n";

    }

    public static String header(){
        return "*********************************************************************************************************\n" +
                "|      ID     |      TYPE      |     Life length     |      Living environment      |     Feed with    |\n" +
                "********************************************************************************************************";

    }
}
