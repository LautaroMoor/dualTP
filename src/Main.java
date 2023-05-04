import clases.Person;

import java.util.*;

public class Main {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("+----- M E N U   G U A R D E R I A -----+");
            System.out.println("1) Cargar animal a la guarderia");
            System.out.println("2) Retirar un animal de la guarderia");
            System.out.println("3) Cantidad de animales en la guarderia");
            System.out.println("4) Listar animales de la guarderia");
            System.out.println("5) Hacer saludar a todos los animales");
            System.out.println("6) Salir del Programa");
            System.out.print("--> ");
            try {
                option = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error en el ingreso de datos...");
                sc.nextLine();
            }
            if (!(option>=0 && option<=6)){
                System.out.println("Ingrese una opción correcta");
            }
        }while(!(option>=0 && option<=6));
                if (option == 6){
                    System.out.println("Saliendo del Sistema...");
                }
                switch (option){
                    case 1:
                        System.out.println("Opción Seleccionada: " + option);
                        System.out.println("REGISTRANDO UN ANIMAL EN LA GUARDERIA");
                        //======================
                        int opcionTipoAnimal = 0;
                        do {
                            System.out.println("TIPO DE ANIMAL");
                            System.out.println("1) Perro");
                            System.out.println("2) Gato");
                            System.out.println("3) Pescado");
                            System.out.println("4) Hamster");
                            System.out.print("--> ");
                            opcionTipoAnimal = sc.nextInt();
                            if (opcionTipoAnimal < 1 || opcionTipoAnimal > 4)
                                System.out.println("Opcion invalida!");
                        }while (opcionTipoAnimal < 1 || opcionTipoAnimal > 4);

                        System.out.println("Nombre: "); //:String
                        System.out.println("Edad: "); //:Integer
                        System.out.println("Genero: "); //:Gender
                        System.out.println("Peso: "); //:Double
                        if (opcionTipoAnimal == 1) {
                            System.out.println("Raza: ");
                        }
                        if (opcionTipoAnimal == 3) {
                            int opcionTipoAgua = 0;
                            do {
                                System.out.println("TIPO DE AGUA PESCADO");
                                System.out.println("1) Fria");
                                System.out.println("2) Tropical");
                                System.out.print("--> ");
                                opcionTipoAgua = sc.nextInt();
                                if (opcionTipoAgua < 1 || opcionTipoAgua > 2)
                                    System.out.println("Opcion invalida!");
                            }while (opcionTipoAgua < 1 || opcionTipoAgua > 2);
                        }
                        break;
                    case 2:
                        System.out.println("Opción Seleccionada: " + option);
                        break;
                    case 3:
                        System.out.println("Opción Seleccionada: " + option);
                        break;
                    case 4:
                        System.out.println("Opción Seleccionada: " + option);
                        break;
                    case 5:
                        System.out.println("Opción Seleccionada: " + option);
                        break;
                }
    }
    public Person crearDueno(){
        Scanner sc = new Scanner(System.in);
        int dni;
        String nombre, direccion;
        System.out.println("DATOS DEL DEL DUEÑO");
        System.out.print("DNI: "); //:Integer
        dni = sc.nextInt();
        System.out.print("Nombre: "); //:String
        nombre = sc.nextLine();
        System.out.print("Direccion: "); //:String
        direccion = sc.nextLine();
        return new Person(dni,nombre,direccion);
    }
}

