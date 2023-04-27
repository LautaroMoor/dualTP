package clases;

import java.util.Objects;

public class Person {
    private Integer dni;
    private String name;
    private String address;

    public Person(Integer dni, String name, String address) {
        this.dni = dni;
        this.name = name;
        this.address = address;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni) && Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, name, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
