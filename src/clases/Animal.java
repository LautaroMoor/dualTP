package clases;

import enums.Gender;

import java.util.Objects;

public class Animal {
    protected String name;
    protected Integer age;
    protected Person owner;
    protected Gender gender;
    protected Double weight;

    public Animal(String name, Integer age, Person owner, Gender gender, Double weight) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    protected String welcome(){
        return "Hola me llamo " + this.name + " y soy un " + this.getClass();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(age, animal.age) && Objects.equals(owner, animal.owner) && gender == animal.gender && Objects.equals(weight, animal.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, owner, gender, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                ", dueño=" + owner.getName() +
                ", genero=" + gender +
                ", peso=" + weight +
                '}';
    }
}
