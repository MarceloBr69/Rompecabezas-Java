import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class rompecabezas {
    public static void main(String [] args){
        //Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de todos los números en el arreglo. El método también debe retornar un arreglo que  incluya solo los números que son mayores a 10 (Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).
        //ArrayList<Integer> ArraySuma = new ArrayList<Integer> ();
        int [] ArraySuma = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> Mayoresde10 = new ArrayList<Integer>();
        int suma = 0;
        for(int i = 0; i<ArraySuma.length; i++){
            suma += ArraySuma[i];
            if(ArraySuma[i]>10){
                Mayoresde10.add(ArraySuma[i]);
            }
        }
        System.out.println(suma);
        System.out.println(Mayoresde10);



        //Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método también devuelva un arreglo con los nombres que tienes más de 5 caracteres.
        //String [] Nombres = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> Nombres = new ArrayList<String>();
        Nombres.add("Nancy");
        Nombres.add("Jinichi");
        Nombres.add("Fujibayashi");
        Nombres.add("Momochi");
        Nombres.add("Ishikawa");

        Collections.sort(Nombres);
        System.out.println(Nombres);

        Collections.shuffle(Nombres);
        System.out.println(Nombres);

        ArrayList<String> Nombres5Char = new ArrayList<String>();
        for(String nombre : Nombres) {
            if(nombre.length() > 5) {
               Nombres5Char.add(nombre);
            }
        }
        System.out.println(Nombres5Char);


        //Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. También debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.Para mezclar una colección, puede utilizar el método shuffle de la clase Collections. 

        ArrayList<String> Alfabeto = new ArrayList<String>();
        Alfabeto.add("a");
        Alfabeto.add("b");
        Alfabeto.add("c");
        Alfabeto.add("d");
        Alfabeto.add("e");
        Alfabeto.add("f");
        Alfabeto.add("g");
        Alfabeto.add("h");
        Alfabeto.add("i");
        Alfabeto.add("j");
        Alfabeto.add("k");
        Alfabeto.add("l");
        Alfabeto.add("m");
        Alfabeto.add("n");
        Alfabeto.add("ñ");
        Alfabeto.add("o");
        Alfabeto.add("p");
        Alfabeto.add("q");
        Alfabeto.add("r");
        Alfabeto.add("s");
        Alfabeto.add("t");
        Alfabeto.add("u");
        Alfabeto.add("v");
        Alfabeto.add("w");
        Alfabeto.add("x");
        Alfabeto.add("y");
        Alfabeto.add("z");
        
        Collections.shuffle(Alfabeto);
        String [] vocales = {"a","e","i","o","u"};
        for(int i = 0; i<vocales.length; i++){
            if(Alfabeto.getFirst() == vocales[i]){
                System.out.println("Hola!");
            }
        }
        System.out.println(Alfabeto.getFirst());
        System.out.println(Alfabeto.getLast());





        //Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 Para obtener un número entero aleatorio, puede utilizar el método nextInt de la clase Random. Documentación de la Clase Random.

        Random r = new Random();
        ArrayList<Integer> ArrayContenedor = new ArrayList<Integer>();
        for(int i = 0; i<=10; i++){
            
            int RandomNumber = r.nextInt(55, 100);//Generador numero random 55-100
            ArrayContenedor.add(RandomNumber);
        }
        System.out.println(ArrayContenedor);
        

        //Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y hacer que estén ordenados (mostrar el número más pequeño en el principio del arreglo). Imprimir todos los números del arreglo. Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.Para ordenar una colección, puede utilizar el método sort de la clase Collections.
        ArrayList<Integer> numerosArrays = new ArrayList<Integer>();
        Random z = new Random();
        for(int i = 0; i<=10; i++){
            
            int RandomNumber2 = z.nextInt(55, 100);//Generador numero random 55-100
            numerosArrays.add(RandomNumber2);

        }
        
        Collections.sort(numerosArrays);
        System.out.println(numerosArrays);

        int Maximo = Collections.max(numerosArrays);
        int Minimo = Collections.min(numerosArrays);

        System.out.println(Maximo);
        System.out.println(Minimo);
        








        //Crear una cadena aleatoria con 5 caracteres de longitud.
        String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int longitudCadena = 5;
        Random random = new Random();
        StringBuilder cadenaAleatoria = new StringBuilder();
        
        for (int i = 0; i < longitudCadena; i++) {
            int indice = random.nextInt(caracteresPermitidos.length());
            cadenaAleatoria.append(caracteresPermitidos.charAt(indice));
        }
        System.out.println("Cadena aleatoria: " + cadenaAleatoria.toString());

        

        //Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.
        String[] cadenasAleatorias = new String[10];
                for (int i = 0; i < 10; i++) {
            StringBuilder cadena = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                // Genera un caracter aleatorio entre 'a' y 'z'
                char caracter = (char) (random.nextInt(26) + 'a');
                cadena.append(caracter);
            }
            cadenasAleatorias[i] = cadena.toString();
        }
        for (String cadena : cadenasAleatorias) {
            System.out.println(cadena);
        }

    }   




 
}
