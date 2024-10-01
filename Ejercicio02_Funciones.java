public class Ejercicio03_Funciones {
    public static void main(String[] args) {
        sinParametros();
        System.out.println(unParametro(2));;
        System.out.println(dosParametros(2, 3));;
        System.out.println(funcionDentroDeOtra(2, 3));

        System.out.println(extra("mult3", "mult5"));

    }

    //Funciones básicas
    public static void sinParametros() {
        System.out.println("Hola");
    }

    public static int unParametro(int a) {
        return a;
    }

    public static String dosParametros(int a, int b) {
        return a + "+" + b;
    }

    public static String funcionDentroDeOtra(int a, int b) {
        return dosParametros(a, b);
    }

    
    public static int extra(String str1, String str2){
        int contadorNumeros = 0;
        for (int i = 0; i <= 100; i++) {
            String cadenaFinal = "";
            if(i % 3 == 0){
                cadenaFinal += str1 + " ";
            }
            if(i % 5 == 0){
                cadenaFinal += str2;
            }
            if(cadenaFinal.isEmpty()){
                contadorNumeros++;
            }
        }
        return contadorNumeros;
    }    
    
}
