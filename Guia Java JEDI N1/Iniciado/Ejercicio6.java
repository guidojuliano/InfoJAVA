package Iniciado;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de su última mascota: ");
        String nombreMascota = scanner.nextLine();
        
        System.out.print("Ingrese el nombre de la última película vista: ");
        String nombrePelicula = scanner.nextLine();
        
        System.out.println("Nombre de la próxima bebida: " + nombreMascota + " " + nombrePelicula);
    }
}
