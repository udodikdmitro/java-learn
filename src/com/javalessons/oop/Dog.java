package com.javalessons.oop;

public class Dog {
    private int paws;
    private int tail;
    private String name;
    private String breed;
    private static int dogsCount;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is "+dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("big") ||
                size.equalsIgnoreCase("average") ||
                size.equalsIgnoreCase("small")) {
            this.size = size;
        } else
            System.out.println("Size should be one of these: big, average, small!!!");
    }

    private String size;

    public void setName(String name) {
        this.name = name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign " + paws + " paws for a dog");
        }

    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried to assign " + tail + " tails for a dog");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void bark() {
        if (size.equalsIgnoreCase("big")) {
            System.out.println("Wof - wof!!");
        } else if (size.equalsIgnoreCase("average")) {
            System.out.println("Raf -raf!!");
        } else {
            System.out.println("Tiaf - tiaf!!");
        }

    }

    public void bite() {
        if (dogsCount>2) {
            System.out.println("Dogs are biting you!!");
        } else {
            bark();
        }
    }

}
