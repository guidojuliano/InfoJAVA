package Iniciado;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;
        String paridad;
        
        if (resultado % 2 == 0) {
            paridad = "par";
        } else {
            paridad = "impar";
        }

        System.out.println("La suma es: " + resultado + " y es " + paridad);
        
    }
}
