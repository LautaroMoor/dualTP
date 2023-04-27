package clases;

import enums.Environment;
import enums.Gender;

import java.util.Objects;

public class Fish extends Animal{
    private static Environment environment;
    public Fish(String name, Integer age, Person owner, Gender gender, Double weight, Environment environment) {
        super(name, age, owner, gender, weight);
        this.environment = environment;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fish fish = (Fish) o;
        return environment == Fish.environment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "nombre='" + name + '\'' +
                ", año=" + age +
                ", dueño=" + owner.getName() +
                ", genero=" + gender +
                ", peso=" + weight +
                ", ambiente=" + environment +
                '}';
    }
}
