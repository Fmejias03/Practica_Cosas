import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de X: ");
        int x = sc.nextInt();
        System.out.println("Introduce el valor de Y: ");
        int y = sc.nextInt();
        Funciones funciones = new Funciones(x, y);
        System.out.println("El resultado de la operación es: " + funciones.apartadoA());
    }


}
