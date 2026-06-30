package org.example;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    private int age;
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object Created");
    }

//    @ConstructorProperties({"age", "laptop"})
//    public Alien(int age, Computer computer) {
//        this.age = age;
//        this.computer = computer;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code() {
        System.out.println("Alien");
        computer.compile();
    }
}
