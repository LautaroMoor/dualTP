package clases;

import enums.Gender;

public class Cat extends Animal{
    public Cat(String name, Integer age, Person owner, Gender gender, Double weight) {
        super(name, age, owner, gender, weight);
    }
}
