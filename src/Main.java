import java.util.*;

public class Main {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("+----- M E N U   G U A R D E R I A -----+");
            System.out.println("1) Cargar Animal ");
            System.out.println("2) Cargar Dueños");
            System.out.println("3) Obtener Animales");
            System.out.println("4) Obtener Dueños");
            System.out.println("5) Salir del Programa");
            try {
                int c = sc.nextInt();
                if (!(c>=0 && c<=5)){
                    System.out.println("Ingrese una opción correcta");
                    continue;
                }
                if (c == 5){
                    System.out.println("Saliendo del Sistema...");
                    break;
                }
                switch (c){
                    case 1:
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Error en el ingreso de datos...");
            }
        }while(true);
    }
}

