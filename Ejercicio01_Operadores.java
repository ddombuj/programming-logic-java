public class Ejercicio02_Operadores {
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

        System.out.println("Operadores aritméticos");
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(c);

        System.out.println("Operadores lógicos");
        boolean x = true;
        boolean y = false;
        boolean z = x && y;
        System.out.println(z);

        System.out.println("Operadores de comparación");
        int a1 = 2;
        int b1 = 3;
        boolean c1 = a1 == b1;
        System.out.println(c1);

        System.out.println("Operadores de asignación");
        int a2 = 2;
        int b2 = 3;
        a2 = b2;
        System.out.println(a2);

        System.out.println("Operadores de identidad");
        int a3 = 2;
        int b3 = 3;
        boolean c3 = a3 == b3;
        boolean d3 = a3 != b3;
        System.out.println(c3);
        System.out.println(d3);

        System.out.println("Operadores de pertenencia");
        int a4 = 2;
        int b4 = 3;
        boolean c4 = a4 < b4;
        boolean d4 = a4 > b4;
        System.out.println(c4);
        System.out.println(d4);

        System.out.println("Operadores de bits");
        int a5 = 2;
        int b5 = 3;
        int c5 = a5 & b5;
        int d5 = a5 | b5;
        int e5 = a5 ^ b5;
        System.out.println(c5);
        System.out.println(d5);
        System.out.println(e5);

        System.out.println("Operadores de desplazamiento");
        int a6 = 2;
        int b6 = 3; 
        int c6 = a6 << b6;
        int d6 = a6 >> b6;
        int e6 = a6 >>> b6;
        System.out.println(c6);
        System.out.println(d6);
        System.out.println(e6); 

        System.out.println("Operadores de agrupación");
        int a7 = 2;
        int b7 = 3;
        int c7 = a7 + b7;
        int d7 = a7 - b7;
        int e7 = a7 * b7;
        int f7 = a7 / b7;
        int g7 = a7 % b7;
        System.out.println(c7);
        System.out.println(d7);
        System.out.println(e7); 
        System.out.println(f7); 
        System.out.println(g7);

        System.out.println("Operadores de incremento y decremento");
        int a8 = 2;
        int b8 = 3;
        int c8 = a8++;
        int d8 = b8--;
        System.out.println(c8);
        System.out.println(d8);

        System.out.println("Operadores de cortocircuito");
        int a9 = 2;
        int b9 = 3;
        int c9 = a9 == b9 ? 1 : 0;
        System.out.println(c9);


        //Mostrar por consola los números comprendidos entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3
        System.out.println("Números entre 10 y 55 (pares y no 16 ni multiplos de 3)");
        for (int i = 10; i <= 55; i++) {
            if(i % 2 == 0 && i != 16 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}
