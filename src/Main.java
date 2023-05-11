import clases.Animal;
import clases.Cat;
import clases.Menu;
import clases.Person;

import java.util.*;

public class Main {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animalList = new ArrayList<Animal>();
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
                sc.nextLine(); // Salto de linea para Scanner
            }
            if (!(option>=0 && option<=6)){
                System.out.println("Ingrese una opción correcta");
                continue;
            }
            if (option == 6){
                System.out.println("Saliendo del Sistema...");
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Opción Seleccionada: " + option);
                    Menu.optionOne(animalList);
                    break;
                case 2:
                    System.out.println("Opción Seleccionada: " + option);
                    Menu.optionTwo(animalList);
                    break;
                case 3:
                    System.out.println("Opción Seleccionada: " + option);
                    Menu.optionThree(animalList);
                    break;
                case 4:
                    System.out.println("Opción Seleccionada: " + option);
                    Menu.optionFour(animalList);
                    break;
                case 5:
                    System.out.println("Opción Seleccionada: " + option);
                    Menu.optionFive(animalList);
                    break;
            }
        }while(true);
    }

}

