import java.util.Scanner;

public class Funciones {
    public double X;
    public double Y;

    public double Resultado = 1;
    public double contador = 0;


    public Funciones(int x, int y) {
        this.X = x;
        this.Y = y;
    }


    public double apartadoA (){
        do {
            Resultado = Resultado * X;
            contador++;

        }while (contador != Y);
        return Resultado;
    }
}
