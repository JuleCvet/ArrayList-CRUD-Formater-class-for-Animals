package com.company;

import java.util.ArrayList;

public class Animal {

    private int id;
    private static int idCounter = 1;
    private int lifeLength;
    private String type;
    private String lifeEnvironment;
    private ArrayList<String> food;

    public static int getIdCounter() {
        return idCounter;
    }

    public Animal(int lifeLength, ArrayList<String> food, String type, String lifeEnvironment) {
        this.lifeLength = lifeLength;
        this.type = type;
        this.lifeEnvironment = lifeEnvironment;
        this.food = food;

        this.id= idCounter;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public int getLifeLength() {
        return lifeLength;
    }

    public void setLifeLength(int lifeLength) {
        this.lifeLength = lifeLength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLifeEnvironment() {
        return lifeEnvironment;
    }

    public void setLifeEnvironment(String lifeEnvironment) {
        this.lifeEnvironment = lifeEnvironment;
    }

    public ArrayList<String> getFood() {
        return food;
    }

    public void setFood(ArrayList<String> food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "lifeLength = " + lifeLength +
                ", type = '" + type + '\'' +
                ", lifeEnvironment: '" + lifeEnvironment + '\'' +
                ", food = " + food;
    }
}
