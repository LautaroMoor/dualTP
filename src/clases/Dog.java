package clases;

import enums.Gender;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, Integer age, Person owner, Gender gender, Double weight, String breed) {
        super(name, age, owner, gender, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Tipo de Animal: " + getClass().getSimpleName() + "\n"+
                "Nombre: " + name + "\n"+
                "Edad: " + age + "\n"+
                "Dueño: " + getOwner().getName() + "\n"+
                "DNI Dueño: " + getOwner().getDni() + "\n"+
                "Sexo: " + gender + "\n"+
                "Peso: " + weight + " grs"+ "\n"+
                "Raza: " + breed + " grs"+ "\n"
                ;
    }
}
