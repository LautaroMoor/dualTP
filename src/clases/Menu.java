package clases;
import enums.Environment;
import enums.Gender;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {

    public static void optionOne(ArrayList<Animal> animalList){
        Scanner sc = new Scanner(System.in);
        int animalType = 0;
        String name;
        int age;
        Gender gender;
        double weight;
        Person owner;

        Environment fishEnvironment;
        String breed;

        Animal newAnimal = null;

        // Owner Creation
        int dni;
        String ownerName, address;
        do {
            System.out.println("REGISTRANDO UN DATOS DUEÑO");
            //======================
            System.out.print("DNI: "); //:Integer
            try{
                dni = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Error: Ingreso de datos Incorrecto!");
                sc.nextLine();
                continue;
            }
            System.out.print("Nombre: "); //:String
            ownerName = sc.nextLine();
            if (ownerName.isBlank() || ownerName.matches("[^a-zA-Z]")) {
                System.out.println("Error: Formato de Nombre Incorrecto!");
                continue;
            }
            System.out.print("Direccion: "); //:String
            address = sc.nextLine();
            if (address.isBlank() || !address.matches("^[a-zA-Z]+\s[0-9]{1,6}$")) {
                System.out.println("Error: Formato de Direccion Incorrecto!");
                continue;
            }
            owner = new Person(dni, ownerName, address);
            break;
        }while (true);
        do {
            System.out.println("REGISTRANDO UN ANIMAL EN LA GUARDERIA");
            //======================
            System.out.println("TIPO DE ANIMAL");
            System.out.println("1) Perro");
            System.out.println("2) Gato");
            System.out.println("3) Pescado");
            System.out.println("4) Hamster");
            System.out.print("--> ");
            try{
                animalType = sc.nextInt();
                sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println("Opcion invalida!");
                sc.nextLine();
                continue;
            }
            if (animalType >= 1 && animalType <= 4){
                break;
            }else{
                System.out.println("Opcion invalida!");
            }
        }while (true);

        // Loop for Setting The Animal Data (Name, Age, Gender, ...)
        do {
            //Animal Name Input
            System.out.print("Nombre: "); //:String
            name = sc.nextLine();
            if (name.isBlank() || !name.matches("^[a-zA-Z]+$")) {
                System.out.println("Error: Formato de Nombre Incorrecto!");
                continue;
            }
            // Animal Age Input
            System.out.print("Edad: "); //:Integer
            try {
                age = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Error: Ingreso de datos Incorrecto!");
                sc.nextLine();
                continue;
            }
            // Animal Gender Input
            System.out.println("Genero: "); //:Gender
            System.out.println("Seleccione el Genero: ");
            System.out.println("1) Macho "); //:Gender
            System.out.println("2) Hembra: "); //:Gender
            int genderOption;
            try {
                System.out.print("--> ");
                genderOption = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Error: Ingreso de datos Incorrecto!");
                sc.nextLine();
                continue;
            }

            switch (genderOption){
                case 1:
                    gender = Gender.M;
                    break;
                case 2:
                    gender = Gender.F;
                    break;
                default:
                    System.out.println("Error: No Selecciona una opción valida!");
                    continue;
            }
            System.out.print("Peso: "); //:Double
            try{
                weight = sc.nextDouble();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Error: Ingreso de datos Incorrecto!");
                sc.nextLine();
                continue;
            }
            break;
        }while(true);

        // Additional Data
        switch (animalType){
            case 1:
                do {
                    System.out.println("Raza: ");
                    breed = sc.nextLine();
                    if (breed.isBlank() || !breed.matches("^[a-zA-Z]+$")){
                        System.out.println("Error: Formato de Raza Incorrecto!");
                        continue;
                    }
                    break;
                }while(true);
                newAnimal = new Dog(name, age, owner, gender, weight, breed);
                break;
            case 2:
                newAnimal = new Cat(name, age, owner, gender, weight);
                break;
            case 3:
                int waterType = 0;
                do {
                    System.out.println("TIPO DE AGUA PESCADO");
                    System.out.println("1) Fria");
                    System.out.println("2) Tropical");
                    System.out.print("--> ");
                    try{
                        waterType = sc.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("Error: Ingreso de datos Incorrecto!");
                        sc.nextLine();
                        continue;
                    }
                    switch (waterType){
                        case 1:
                            fishEnvironment = Environment.COLD;
                            break;
                        case 2:
                            fishEnvironment = Environment.TROPICAL;
                            break;
                        default:
                            System.out.println("Opcion invalida!");
                            System.out.println("Porfavor, vuelva a ingresar...");
                            continue;
                    }
                    newAnimal = new Fish(name, age, owner, gender, weight, fishEnvironment);
                    break;
                }while (true);
                break;
            case 4:
                newAnimal = new Hamster(name, age, owner, gender, weight);
                break;
        }
        animalList.add(newAnimal);
    }
    public static void optionTwo(ArrayList<Animal> animalList){
        if (animalList.size() == 0) {
            System.out.println("---- No hay animales cargados ----");
        }else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese la posición del animal en la lista: ");
            int pos = 0;
            try {
                pos = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Error: Ingreso de datos invalido");
            }
            if (pos >= 0 && pos <= animalList.size()) {
                System.out.println(pos);
                animalList.remove(--pos);
                System.out.println("Animal Eliminado de la lista correctamente!");
            }else{
                System.out.println("Ingrese un posición valida!");
            }

        }
    }
    public static void optionThree(ArrayList<Animal> animalList){
        System.out.println("Cantidad de Animales en la lista: " + animalList.size());
    }
    public static void optionFour(ArrayList<Animal> animalList) {
        if (animalList.size() == 0) {
            System.out.println("---- No hay animales cargados ----");
        }else{
            System.out.println("---- Animales actualmente en la guardería ----");
            int i = 1;
            for (Animal animal: animalList) {
                System.out.println(animal.toString());
                System.out.println("Posición en la lista: "+ i);
                System.out.println("--------------------------------------");
                i++;
            }
        }
    }
    public static void optionFive(ArrayList<Animal> animalList) {
        System.out.println("--------------------------------------");
        if (animalList.size() == 0) {
            System.out.println("---- No hay animales cargados ----");
        }else{
            for (Animal animal: animalList) {
                animal.welcome();
                System.out.println("--------------------------------------");
            }
        }

    }
}
