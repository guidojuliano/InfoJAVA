package Iniciado;

public class Ejercicio7 {
    public static void main(String[] args) {
        double numReal1 = 3.5;
        double numReal2 = 2.0;
        int numEntero1 = 5;
        int numEntero2 = 2;
        
        double resultadoReal = numReal1 * numReal2;
        int resultadoEntero = numEntero1 * numEntero2;
        
        double suma = resultadoReal + resultadoEntero;
        
        System.out.println("Resultado de la multiplicación de los números reales: " + resultadoReal);
        System.out.println("Resultado de la multiplicación de los números enteros: " + resultadoEntero);
        System.out.println("Suma de las dos multiplicaciones: " + suma);
    }
}

//El resultado depende del valor de los números que se están multiplicando. Si ambos números son enteros, el resultado de la multiplicación será un número entero. Si al menos uno de los números es un número real, el resultado de la multiplicación será un número real.
//En cuanto a la suma de las dos multiplicaciones, si los números son enteros, el resultado será un número entero. Si al menos uno de los números es un número real, el resultado de la suma será un número real.