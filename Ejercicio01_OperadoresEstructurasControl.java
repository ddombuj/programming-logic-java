public class Ejercicio01_OperadoresEstructurasControl {
    public static void main(String[] args) {
        /*EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos. */

        System.out.println("----------------------");
        System.out.println("OPERADORES ARITMÉTICOS");
        int a = 4;
        int b = 2;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        System.out.println("----------------------");
        System.out.println("OPERADORES DE COMPARACIÓN");
        System.out.println("Mayor que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Igual a: " + (a == b));
        System.out.println("Distinto de: " + (a != b));
        

        System.out.println("----------------------");
        System.out.println("OPERADORES LÓGICOS");
        boolean x = true;
        boolean y = false;
        System.out.println("AND lógico: " + (x && y));
        System.out.println("OR lógico: " + (x || y));
        System.out.println("NOT lógico: " + (!x));

        System.out.println("----------------------");
        System.out.println("OPERADORES DE ASIGNACIÓN");
        int c = a;
        System.out.println("Asignacion: " + c);

        System.out.println("----------------------");
        System.out.println("AND bit a bit: " + (a & b));
        System.out.println("OR bit a bit: " + (a | b));
        System.out.println("XOR bit a bit: " + (a ^ b));
        System.out.println("Desplazamiento a la izquierda: " + (a << 2));
        System.out.println("Desplazamiento a la derecha: " + (a >> 2));


        System.out.println("----------------------");
        System.out.println("OPERADORES COMBINADOS DE ASIGNACIÓN");
        System.out.println("Suma y asignación: " + (a += b));
        System.out.println("Resta y asignación: " + (a -= b));
        System.out.println("Multiplicación y asignación: " + (a *= b));
        System.out.println("División y asignación: " + (a /= b));
        System.out.println("Módulo y asignación: " + (a %= b));        


        System.out.println();
        System.out.println();
        System.out.println("ESTRUCTURAS DE CONTROL");
        System.out.println("----------------------");
        System.out.println("CONDICIONALES");
        if (a > b) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("a no es mayor que b");
        }

        System.out.println("ITERATIVAS");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        System.out.println("EXCEPCIONES");
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[4]);
        } catch (Exception e) {
            System.out.println("Algo salió mal.");
        }

        System.out.println("CONCATENAR CADENAS");
		String cadena1 = "Operadores";
		String cadena2 = "estructuras de control";
		
		System.out.println(cadena1 + " y " + cadena2);

        

        //Mostrar por consola los números comprendidos entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3
        System.out.println("Números entre 10 y 55 (pares y no 16 ni multiplos de 3)");
        for (int i = 10; i <= 55; i++) {
            if(i % 2 == 0 && i != 16 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}
