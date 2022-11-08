import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static Dictionary<String,String> colores = new Hashtable<String,String>();
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        colores.put("negro","\u001B[30m");
        colores.put("rojo","\u001B[31m");
        colores.put("verde","\u001B[32m");
        colores.put("amarillo","\u001B[33m");
        colores.put("azul","\u001B[34m");
        colores.put("morado","\u001B[35m");
        colores.put("cyan","\u001B[36m");
        colores.put("blanco","\u001B[37m");
        colores.put("reset","\u001B[0m");

        int personaje = menu(new String[]{"Maggie","Bart","Hommer"});

        if (personaje==0){
            System.out.println("Has elegido a Maggie");
            Maggie();
        } else if (personaje==1) {
            System.out.println("Has elegido a Bart");
            Bart();
        }else{
            System.out.println("Has elegido a Hommer");
            Homer();
        }
    }

    static void Bart() throws InterruptedException {
        System.out.println("");
        System.out.println("Bart se despierta y mira el reloj.");
        System.out.println("Son las 6:45 todavía le quedan 15 minutos para levantarse.");
        int input = -1;
        input = menu(new String[]{"Seguir durmiendo","Levantarse ya"});
        //Sigue durmiendo
        if (input==0){
            log("Marge","Qué te crees que estás haciendo Bart, no ves que horas es","cyan");
            logr("Bart","Qué dices mamá todavía tengo tiempo de sobra","blanco");
            System.out.println("Bart mira el reloj.");
            logr("Bart","Ostrás, qué tarde es voy a perder el bus","blanco");
            System.out.println("El bus se va sin el, Bart intenta alcanzar el bus pero es inútil");
            log("Bart","No voy a llegar a tiempo al instituto","blanco");
            System.out.println("Se acerca un coche a bart");
            log("???","Hey chaval quieres que te lleve?","rojo");
            System.out.println("No se puede apreciar al señor del coche porque tiene los cristales tintados");
            log("Bart","No me gusta subirme a coches de desconocidos pero si no subo no llegaré a tiempo","blanco");
            input = menu(new String[]{"Subirse","No subirse"});
            //Se sube al coche
            if (input==0){
                System.out.println("Bart se sube al coche");
                log("Bart","Perdona te has saltado el colegio era mas atrás","blanco");
                logr("???","He cambiado de opinión no te voy a llevar al colegio jajajajajaja","rojo");
                System.out.println("El coche frena");
                System.out.println("Nada mas frena el coche bart intenta salir corriendo");
                log("???","A donde te crees que vas renacuajo","rojo");
                logr("Bart","Auxiliooo!!! ayudaaaa!! ayumfonsfonfjen...","blanco");
                log("Apu","Qué ha sido ese ruido","morado");
                System.out.println("Bart siente como le tapan la boca y no puede hablar");
                System.out.println("Le empieza a faltar el aire a bart");
                log("Apu","Tú que te crees que haces con el chico","morado");
                logr("???","Y tú quien eres te vas a enterar","rojo");
                System.out.println("Se empiezan a pegar");
                System.out.println("Bart mira en sus bolsillos para ver que puede utilizar en la pelea");
                input = menu(new String[]{"Tirachinas","Cucaracha","Chicle"});
                //Tirachinas
                if (input == 0){

                }//Cucaracha
                else if (input == 1) {

                }//Chicle
                else{
                    log("Bart","Toma esto listillo","blanco");
                    System.out.println("Bart le tira el chicle ferozmente");
                    logr("???","Pero que haces niño","rojo");
                    System.out.println("Bart se despierta");
                    log("Bart","Que mareo, que ha pasado","blanco");
                    logr("Marge","Ayyyy mi hijo porque te metiste en el coche de ese señor","cyan");
                    log("Bart","Bueno mamá no pasa nada ya estoy bien","blanco");
                    logr("Eddie","Siento mucho su perdida señora","azul");
                    logr("Apu","Lo siento señora Simpson, no puede salvarle","morado");
                    log("Bart","Como que su perdida","blanco");
                    System.out.println("Bart se mira");
                    log("Bart","Uaaaaaaa pero si estoy volando","blanco");
                    System.out.println("Bart se estaba viendo en tercera persona");
                    log("Bart","Que hago separado de mi cuerpo","blanco");
                    logr("Dios","Asi es hijo mío","cyan");
                    log("Bart","Supongo que tendre que irme contigo entonces","blanco");
                    logr("Dios","Asi es hijo mío, a ver si tienes mas suerte la proxima vez","cyan");
                    System.out.println("Final malo");
                    System.out.println("Quieres reintentarlo?");
                    input = menu(new String[]{"Si","No"});
                    if (input == 0){
                        dead("bart");
                    }
                }
            }//No se sube al coche
            else{

            }
        }//Se levanta ya
        else{

        }
    }
    static void Maggie(){

    }

    static void Homer(){

    }

    //region menus y nubes y validaciones
    static void dead(String personaje) throws InterruptedException {
        if (personaje.equalsIgnoreCase("bart")){
            Bart();
        } else if (personaje.equalsIgnoreCase("maggie")) {
            Maggie();
        }else{
            Homer();
        }
    }

    static void log(String personaje, String texto, String color) throws InterruptedException {
        //6 letras maximo el personaje
        System.out.print(colores.get(color));
        System.out.println("       ︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵");
        System.out.println("      (                              )");

        if (texto.length() == 26){
            System.out.println("      (  "+texto+"  )");
        }else{
            int numeroDeFilas = texto.length()/26;
            numeroDeFilas = numeroDeFilas +1 ;
            for (int i = 1; i <= numeroDeFilas; i++) {
                String textoParaEscribir = devolucion(texto,(i-1)*26,i*26);
                System.out.println("      (  " + textoParaEscribir + "  )");
            }
        }

        System.out.println(returnMenu(personaje,5)+":<                              )");
        System.out.println("       ︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶");
        System.out.print(colores.get("reset"));
        TimeUnit.SECONDS.sleep(5);
    }

    static void logr(String personaje, String texto, String color) throws InterruptedException {
        //6 letras maximo el personaje
        System.out.print(colores.get(color));
        System.out.println("       ︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵");
        System.out.println("      (                              )");

        if (texto.length() == 26){
            System.out.println("      (  "+texto+"  )");
        }else{
            int numeroDeFilas = texto.length()/26;
            numeroDeFilas = numeroDeFilas +1 ;
            for (int i = 1; i <= numeroDeFilas; i++) {
                String textoParaEscribir = devolucion(texto,(i-1)*26,i*26);
                System.out.println("      (  " + textoParaEscribir + "  )");
            }
        }

        System.out.println("      (                              :>"+personaje);
        System.out.println("       ︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶");
        System.out.print(colores.get("reset"));
        TimeUnit.SECONDS.sleep(5);
    }

    static String devolucion(String texto, int x, int y){
        String sub = "";

        //en la ultima fila puede darse el caso que y sea mayor que el string porque le añadimos 26 siempre en el bucle
        if (y <= texto.length()) {
            sub = texto.substring(x, y);
        }else{
            sub = texto.substring(x, texto.length());
        }

        //si empieza por espacio una linea le quitamos el espacio
        if (sub.startsWith(" ")){
            sub = sub.substring(1);
        }

        //para que la ultima linea no se vea fea le añadimos espacios al string hasta que que consiga 26
        while (sub.length() < 26){
            sub = sub + " ";
        }
        return sub;
    }

    static int menu(String[] opciones){
        String input = "";
        boolean askedOnce = false;
        int x = -1;
        do {
            if (askedOnce){
                System.out.println("Eso no es una respuesta válida");
            }
            System.out.println(".  ....................  .");
            System.out.println("."+colores.get("azul")+"    Elige una opción    "+colores.get("reset")+".");
            System.out.println(".  ....................  .");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println(".  "+(i+1)+". "+returnMenu(opciones[i],17)+"  .");
            }
            System.out.println(".  ....................  .");

            input = lector.nextLine();
            if (tryParseInt(input)){
                x = Integer.parseInt(input);
                x -= 1;
            }
            askedOnce = true;
        }while(!Arrays.asList(opciones).contains(input)&&!indexExists(opciones,x));

        if (indexExists(opciones,x)){
            return Arrays.asList(opciones).indexOf(opciones[x]);
        }else {
            return Arrays.asList(opciones).indexOf(input);
        }
    }

    public static boolean tryParseInt(String value){
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException a) {
            return false;
        }
    }

    static boolean indexExists(String[] opciones,int index){
        if (index >= opciones.length || index < 0){
            return false;
        }else{
            return true;
        }
    }

    static String returnMenu(String texto, int longitud){
        if (texto.length() == longitud){
            return texto;
        }else{
            while (texto.length() != longitud){
                texto = texto+" ";
            }
            return texto;
        }
    }
    //endregion
}