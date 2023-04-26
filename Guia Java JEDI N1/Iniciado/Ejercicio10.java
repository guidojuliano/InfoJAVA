package Iniciado;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 3;
        double acumulacion = 0;
        
        for (int i = 1; i <= 15; i++) {
            int multiplicacion = numero1 * numero2;
            double division = multiplicacion / i;
            acumulacion += division;
        }
        
        System.out.println("La acumulación es " + acumulacion);
    }
}
