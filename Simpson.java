import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static int espera = 0;//define el tiempo que esperamos entre bocadillo y bocadillo

    //Creamos un diccionario de colores
    static Dictionary<String,String> colores = new Hashtable<String,String>();

    //El scaner es estático para no tener que declararlo en todas las funciones
    static Scanner lector = new Scanner(System.in);

    //MAIN
    public static void main(String[] args) throws InterruptedException {

        //Metemos los colores en el diccionario
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
            //Llamamos a la funcion maggie donde se ejecuta toda el código de la historia de maggie.
            maggie();
        } else if (personaje==1) {
            System.out.println("Has elegido a Bart");
            //Llamamos a la funcion bart donde se ejecuta toda el código de la historia de maggie.
            bart();
        }else{
            System.out.println("Has elegido a Hommer");
            //Llamamos a la funcion hommer donde se ejecuta toda el código de la historia de maggie.
            homer();
        }
    }

    //Parte de bart realizada por Pablo Hermida Gómez
    static void bart() throws InterruptedException {
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
                malechor();
            }//No se sube al coche
            else{
                log("Bart","No gracias ya voy yo andando","blanco");
                logr("???","Tu veras chaval","rojo");
                System.out.println("Bart llega al colegio tarde");
                colegio();
            }
        }//Se levanta ya
        else{
            System.out.println("Bart se encuentra a su padre viendo la tele y se queda viendola un rato");
            log("Bart","Ostras que tarde es tengo que ir corriendo al insti","blanco");
            colegio();
        }
    }

    //Parte de maggie realizada por Johannes Isturiz
    static void maggie() throws InterruptedException {
        Scanner lector= new Scanner(System.in);
        String si="";
        String no="";
        String pregunta ="si";
        String pregunta1 ="no";
        String comida ="";
        String cosas ="";

        System.out.println("      ^^                         \r\n"
                + "                 .^::^7~7?^::^.                   \r\n"
                + "                 7!~7JJJ?JY!!??                   \r\n"
                + "               .^?^^~7!!7?!^^7J^:                 \r\n"
                + "              :J!^~!!~^!~!~^^~~7J!                \r\n"
                + "               .!Y~^:~!^^^!!^^~J7                 \r\n"
                + "                 7^^:!~ :.~7^^!??.                \r\n"
                + "                 .J??!~!~~!7?7?77^                \r\n"
                + "                  JP5Y!^^^!5JJ?                   \r\n"
                + "                  ?5GGJ!!7?YJ!:                   \r\n"
                + "                 .:!??!!!!!!7?7.                  \r\n"
                + "             ::!!777?~~~~!!7!!?Y.                 \r\n"
                + "            ^P5YY?JJ!~!!!!!??!75:                 \r\n"
                + "             ~7^^:J~~!!!!!Y5YYY!                  \r\n"
                + "                 .Y7~!!!!!7?JJ5.                  \r\n"
                + "                .?!!~~!!!!~!7JYJ!....             \r\n"
                + "                ^Y!!!!!!!!!7????J?!~^^^^:.        \r\n"
                + "                 ^77?????JJJJJJJJJY?^::::.        \r\n"
                + "                      ..:::..:..::.  ");

            System.out.println("Comenzamos el juego? si/no" );
            si=lector.nextLine();
            if(si.equals(pregunta)) {
                System.out.println("Se levanta de la cuna? " );
            } no=lector.nextLine();
            if(no.equals (pregunta1))
                System.out.println("Se queda  durmiendo en la cuna" );
            else
            {
                System.out.println("baja a la cocina");
                System.out.println("abre la nevera y elije un alimento" + comida);

                System.out.println("selecciona: "  +  " leche" + ", zumo" +  " o  sopa ? " );
                comida=lector.nextLine();
                switch (comida) {
                    case "leche":
                        System.out.println("has elegido leche");
                        System.out.println("le duele la tripa ") ;
                        System.out.println("vuelve a la cuna" );
                        break;
                    case "zumo":
                        System.out.println("has elegido zumo");
                        System.out.println("tienes más energía!!");

                        System.out.println("vas corriendo al cuarto de juegos?");
                        pregunta=lector.nextLine();

                        if(si.equals(pregunta)) {
                            System.out.println("la habitación esta desordenada, la arregla??" );
                            pregunta=lector.nextLine();
                            if(si.equals(pregunta)) {
                                System.out.println("la arregla, encuentra unos dados y corre al jardin con los dados" );}
                            if (!no.equals (pregunta)) {
                                System.out.println("Se cae, llora, llega mamá y la lleva a la cuna ");
                            }

                            pregunta=lector.nextLine();
                            if(si.equals(pregunta)) {
                                System.out.println("sale al jardin  " );}
                            if (!no.equals (pregunta)) {
                                System.out.println("enciende la televisión ");}

                        }
                        break;
                    case "sopa":
                        System.out.println("has elegido sopa");
                        System.out.println("tienes que ir corriendo al baño");
                        pregunta=lector.nextLine();

                        break;

                }

                System.out.println("selecciona: "  +  "  tv " + ", juego  " +  " jardin  " + cosas );
                cosas=lector.nextLine();

                switch (cosas) {
                    case "tv":
                        System.out.println(" has encendido la tv");
                        System.out.println("  pone un  peli y se duerme ") ;
                        System.out.println(" la llevan de vuelta a la cuna" );

                        break;
                    case "juego":
                        int suma;
                        do {
                            suma= suma();
                        }while (suma <=6);
                        System.out.println("has ganado el juego " );

                    case "jardin":
                        System.out.println(" juega en el jardin ? ");
                        pregunta=lector.nextLine();
                        if(si.equals(pregunta)) {
                            System.out.println(" juega en el jardin y te sigue una abeja" );
                            pregunta=lector.nextLine();
                            if(si.equals(pregunta)) {
                                System.out.println("te pica la abeja" );}
                            pregunta=lector.nextLine();
                            if(!no.equals(pregunta)) {
                                System.out.println(" corre y sube a la casa del arbol  " );}
                            pregunta=lector.nextLine();
                            if(si.equals(pregunta)) {
                                System.out.println(" encuentra una caja fuerte en la casa del arbol " );
                                System.out.println(" la abre? " );
                                System.out.println(" adivina la contraseña:" );}
                            Random aleatorio = new Random();

                            int numeroMagico = aleatorio.nextInt(50);
                            int numero;
                            System.out.println("Adivina el número entre 0 y 50:");
                            numero = lector.nextInt();

                            while (numeroMagico != numero) {
                                if (numeroMagico > numero) {
                                    System.out.println("El número es mayor, inténtalo de nuevo:");
                                } else {
                                    System.out.println("El número es menor, inténtalo de nuevo:");
                                }
                                numero = lector.nextInt();
                            }

                            System.out.println("¡Felicidades, has adivinado el número y ganado el juego!");

                            System.out.println("Quieres volver a jugar");

                            String x = lector.nextLine();

                            if(x.equalsIgnoreCase("si")) {
                                dead("maggie");
                            }

                            break;
                        }


                }
            }
    }

    //Puzzle que se usa en una parte de la historia
    static int suma() {

        System.out.println(" recuerda los dados y decide jugar ");
        System.out.print("Lanza los dos dados ");
        //Creando dos objetos Random
        Random dado1 = new Random();
        Random dado2 = new Random();
        //Generando números al azar entre el 1 al 6
        int valorDado1 = dado1.nextInt(6)+1;
        int valorDado2 = dado2.nextInt(6)+1;

        //Imprimiendo los resultados
        System.out.println("Valor del dado 1: " + valorDado1);
        System.out.println("Valor del dado 2: " + valorDado2);
        //Calculando la suma de los dos dados
        int suma = valorDado1 + valorDado2;


        System.out.println("La suma de los dados es: " + suma);

        System.out.println("");
        System.out.println("Total: " + suma);
        return suma;
    }

    //Parte de hommer realizado por Jaime González
    static void homer(){
        int num=0;
                //a partir de aquí son decisiones con if y else if que llevan a distintos caminos en los que podrás hacer unas cosas
                //u otras, y encontarte con distintos personajes icónicos de Los Simpson o Mat Groening
                System.out.println("Es por la mañana, te acabas de despertar ¿Qué haces?");
                System.out.println("  ");
                System.out.println("1. Te levantas y te vas a desayunar");
                System.out.println("2. Te quedas durmiendo en la cama");
                num=lector.nextInt();

                if(num==1) {
                    System.out.println("Llegas a la cocina y te das cuenta que hay una nota ¿Qué haces?");
                    System.out.println("  ");
                    System.out.println("1. Pasas de la nota y abres la nevera para comer unas rosquillas");
                    System.out.println("2. Lees la nota con atención");
                    num=lector.nextInt();

                    if(num==1) {
                        System.out.println(" Abres la nevera y ¡Mosquis! no hay rosquillas ¿Qué haces?");
                        System.out.println("  ");
                        System.out.println("1. Coges el coche");
                        System.out.println("2. Te da igual y te cojes una cerveza");
                        num=lector.nextInt();
                        if(num==1) {
                            System.out.println("Te metes en el coche y arrancas mientras Ned Flanders te dice: Hola holita vecinito ¿Qué haces?");
                            System.out.println("  ");
                            System.out.println("1. Grrrr Maldito Ned Flanders... como te coja... Y vas a atropellarle");
                            System.out.println("2. Pasas de él mientras pisas su jardín con el coche -Flander eres un membrillo-");
                            num=lector.nextInt();

                            if(num==1) {
                                System.out.println("Beep... Beep... Beep Bart:Ya ni conducir sabe. ");
                                System.out.println("Marge: Bart, Lisa despediros de vuestro padre ántes de que le desconecten.");
                                System.out.println("Bart: Adios culogordo");
                                System.out.println("Lisa: *solo de saxo*");
                                System.out.println("Magie: *ruidos de chupete*  ");
                                System.out.println("-HAS MUERTO-");
                                System.out.println("-FIN DE JUEGO-");
                                System.out.println(" Gracias por jugar ");
                            }
                            else if (num==2){
                                System.out.println(" A dónde vamos ¿Qué haces?");
                                System.out.println("  ");
                                System.out.println("1. No me acuerdo a donde iba mosquis... iré al bar de moe");
                                System.out.println("2. Vamos a por el desayuno para la familia");
                                num=lector.nextInt();
                                if(num==2){
                                    System.out.println(" -Adios Flanders chupate esa-, llegas a comprar al badulaque");
                                    System.out.println(" ");
                                    System.out.println("APU: Hola Señor Simpson, ¿qué desea?");
                                    System.out.println("HOMER: Hola Apu, ¿dónde tienes las rosquillas? ");
                                    System.out.println("APU: En el segundo pasillo a la derecha señor Homer ");
                                    System.out.println("HOMER: ¡Douhh! Que lejos... Ya no quiero todo lo que está más allá de 12 pasos no vale la pena ");
                                    System.out.println(" ");
                                    System.out.println("1. Traemelas tu Apu que estás más cerca.");
                                    System.out.println("2. -Adios Apu serás el culpable de la ruina de los Simpson- te marchas");
                                    num=lector.nextInt();
                                    if(num==1) {
                                        System.out.println("APU: No Homer ve tú y sino adiós.");
                                        System.out.println("HOMER: Mosquis pues me iré, maldito apu... (Y sales del badulaque)");
                                        System.out.println("???: Hola Homer... ");
                                        System.out.println("HOMER: No gracias no quiero nada ");
                                        System.out.println("Tony el Gordo: Eres tonto vengo soy yo Tony el Gordo, vengo a por mi dinero, o acaso, ¿No leiste mi nota? ");
                                        System.out.println("HOMER: Ah que era una nota la loncha de queso que ponía -Dame mi dinero. Att Tony el Gordo- Ahhhh ");
                                        System.out.println("TONY EL GORDO:Por cosas como esta me quierp volver a la mia Italia ");
                                        System.out.println("¡BANG! ¡BANG! ");
                                        System.out.println("TONY EL GORDO: Adios Homer te veo cuando llegue mi hora. ");
                                        System.out.println(" -HAS PERDIDO-");
                                        System.out.println("-FIN DE JUEGO-");
                                        System.out.println(" Gracias por jugar ");
                                    }else if(num==2) {
                                        System.out.println("HOMER: Mosquis pues me iré, maldito apu... (Y sales del badulaque)");
                                        System.out.println("???: Hola Homer... ");
                                        System.out.println("HOMER: No gracias no quiero nada ");
                                        System.out.println("Tony el Gordo: Eres tonto vengo soy yo Tony el Gordo, vengo a por mi dinero, o acaso, ¿No leiste mi nota? ");
                                        System.out.println("HOMER: Ah que era una nota la loncha de queso que ponía -Dame mi dinero. Att Tony el Gordo- Ahhhh ");
                                        System.out.println("TONY EL GORDO:Por cosas como esta me quierp volver a la mia Italia ");
                                        System.out.println("¡BANG! ¡BANG! ");
                                        System.out.println("TONY EL GORDO: Adios Homer te veo cuando llegue mi hora. ");
                                        System.out.println(" -HAS PERDIDO-");
                                        System.out.println("-FIN DE JUEGO-");
                                        System.out.println(" Gracias por jugar ");
                                    }
                                    else {
                                        System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");

                                    }

                                }else if(num==1) {
                                    System.out.println("Llegas al bar de Moe ");
                                    System.out.println("MOE: Hola Homer toma tu cerveza para animar la mañana");
                                    System.out.println("HOMER: Gracias Moe nadie quiere darle un rico rico desyuno a este gordinflon, solo tu sabes ");
                                    System.out.println("MOE: No te animes mucho Homer porque voy a cerrar por unos días ");
                                    System.out.println("HOMER: ¡Mosquis! Todo Mal ¡Qué voy a haceeer...! ");
                                    System.out.println("MOE: Pues no lo se Homer, pero es mejor que te vayas ya, no hagas esto mñas difícil");
                                    System.out.println("  ");
                                    System.out.println("1. Pues de vuelta a casa con las manos vacias ¡Dou! ");
                                    System.out.println("2. Pues me quedo en el bar escondido y hago de... ¡Barman!");
                                    num=lector.nextInt();
                                    if(num==1) {
                                        System.out.println("Vuelves a casa con el coche y ves que no hay nadie");
                                        System.out.println("Ves que tienes llamadas perdidas y llamas a Marge");
                                        System.out.println("MARGE: Homi han entrado en casa unos italianos de la mafia y nos han secuestrado por un diniero que debes");
                                        System.out.println("TONY EL GORDO: Hola Homer soy yo Tony e Gordo o me das el dinero replicaré un padrino con los tuyos bambinos");
                                        System.out.println("Pi...");
                                        System.out.println("Pi...  ");
                                        System.out.println("Ha colgado  ");
                                        System.out.println("  ");
                                        System.out.println("1. Coges todo el dinero y se lo llevas a su casa");
                                        System.out.println("2. Te armas hasta los dientes");
                                        num=lector.nextInt();
                                        if(num==1) {
                                            System.out.println("Has cogido el dinero y el coche y has marchado a la casa de la Mafia de Springfield ");
                                            System.out.println("TONY: Hola Homer te estaba esperando");
                                            System.out.println("HOMER: Aquí tienes el dinero, ahora suelta a mi familia");
                                            System.out.println("TONY: Sabes una cosa Homer... por tu cabeza en bandeja me dan más dinero");
                                            System.out.println("HOMER: Pero mi familia vivirá, ¿no es así?");
                                            System.out.println("TONY: Cinco vale más que uno asi que ya me dirás tú");
                                            System.out.println("-FIN DE JUEGO-");
                                            System.out.println("Ya sabes cómo se hicieron las galletitas de los Simpson");
                                        }else if (num==2) {
                                            System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré, pero no irá Homer, sino Homer CORLEONE...");
                                            System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                                            System.out.println("                                                     ___,------,\r\n"
                                                    + "             _,--.---.                         __,--'         /\r\n"
                                                    + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                                    + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                                    + "        ,'               \\             ,'      _,-'          ||\r\n"
                                                    + "       /                  \\         _,'     ,-'              ||\r\n"
                                                    + "      :                    .      ,'     _,'                 |:\r\n"
                                                    + "      |                    :     `.    ,'                    |:\r\n"
                                                    + "      |           _,-      |       `-,'                      ::\r\n"
                                                    + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                                    + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                                    + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                                    + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                                    + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                                    + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                                    + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                                    + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                                    + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                                    + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                                    + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                                    + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                                    + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                                    + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                                    + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                                    + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                                    + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                                    + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                                    + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                                    + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                                    + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                                    + " \\_,'                         `._                          _,-'     `\r\n"
                                                    + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                                    + "                          ,'             `---------'\r\n"
                                                    + "                        ,'\r\n"
                                                    + "\r\n");
                                            System.out.println("");
                                            System.out.println("(ya en la casa de Tony el Gordo)");
                                            System.out.println("Te decides a entrar por la puerta con el resto");
                                            System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                                            System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                                            System.out.println("HOMER: Vamos al grano Tony, ¿Dónde está mi familia?");
                                            System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                                            System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                                            System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                                            System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame");
                                            System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                                            System.out.println("empieza a acribillar el salón donde os encontrabais");
                                            System.out.println("  ");
                                            System.out.println("1. Te unes a él");
                                            System.out.println("2. Le matas para que Tony te deba su vida");
                                            num=lector.nextInt();
                                            if(num==1) {
                                                System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                                System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                                System.out.println("MARGE: Homi nos habeis salvado");
                                                System.out.println("BART: Gracias culo gordo");
                                                System.out.println("LISA: Gracias papa");
                                                System.out.println("MAGIE: -sonido de chupete-");
                                                System.out.println("HAS GANADO");
                                                System.out.println("FIN GRACIAS POR JUGAR");
                                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                        + "                 /        ` \\'\\,\r\n"
                                                        + "                /               '/|_\r\n"
                                                        + "               /                   /\r\n"
                                                        + "              /                   /\r\n"
                                                        + "             /                   ;\r\n"
                                                        + "             ;-\"\"-.  ____       ,\r\n"
                                                        + "            /      )'    `.     '\r\n"
                                                        + "           (    o |        )   ;\r\n"
                                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                        + "            ;\\___  `._____/ ,-:\r\n"
                                                        + "           ;                 @ )\r\n"
                                                        + "          /                `;-'\r\n"
                                                        + "       ,. `-.______________,|\r\n"
                                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                        + " ,`.`-   \\        '.        |\r\n"
                                                        + "  `._  ) :          )______,;\\_\r\n"
                                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                                        + "      \\     `--\\   :      /      `.\r\n"
                                                        + "       \\        \\  ;     |         \\\r\n"
                                                        + "        `-._____ ;|      |       _,'\r\n"
                                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                        + "                 /          \\      \\\r\n"
                                                );
                                            }else if(num==2) {
                                                System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                                System.out.println("HOMER: Mosquis...");
                                                System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                                System.out.println("MARGE: Homi nos habeis salvado");
                                                System.out.println("BART: Gracias culo gordo");
                                                System.out.println("LISA: Gracias papa");
                                                System.out.println("MAGIE: -sonido de chupete-");
                                                System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                                System.out.println("FIN GRACIAS POR JUGAR");
                                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                        + "                 /        ` \\'\\,\r\n"
                                                        + "                /               '/|_\r\n"
                                                        + "               /                   /\r\n"
                                                        + "              /                   /\r\n"
                                                        + "             /                   ;\r\n"
                                                        + "             ;-\"\"-.  ____       ,\r\n"
                                                        + "            /      )'    `.     '\r\n"
                                                        + "           (    o |        )   ;\r\n"
                                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                        + "            ;\\___  `._____/ ,-:\r\n"
                                                        + "           ;                 @ )\r\n"
                                                        + "          /                `;-'\r\n"
                                                        + "       ,. `-.______________,|\r\n"
                                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                        + " ,`.`-   \\        '.        |\r\n"
                                                        + "  `._  ) :          )______,;\\_\r\n"
                                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                                        + "      \\     `--\\   :      /      `.\r\n"
                                                        + "       \\        \\  ;     |         \\\r\n"
                                                        + "        `-._____ ;|      |       _,'\r\n"
                                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                        + "                 /          \\      \\\r\n"
                                                );
                                            }else {
                                                System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                            }
                                        }else {
                                            System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                        }
                                    }else if (num==2) {
                                        System.out.println("Homer te estoy viendo vete ya");
                                        System.out.println("Vuelves a casa con el coche y ves que no hay nadie");
                                        System.out.println("Ves que tienes llamadas perdidas y llamas a Marge");
                                        System.out.println("MARGE: Homi han entrado en casa unos italianos de la mafia y nos han secuestrado por un diniero que debes");
                                        System.out.println("TONY EL GORDO: Hola Homer soy yo Tony e Gordo o me das el dinero replicaré un padrino con los tuyos bambinos");
                                        System.out.println("Pi...");
                                        System.out.println("Pi...  ");
                                        System.out.println("Ha colgado  ");
                                        System.out.println("  ");
                                        System.out.println("1. Coges todo el dinero y se lo llevas a su casa");
                                        System.out.println("2. Te armas hasta los dientes");
                                        num=lector.nextInt();
                                        if (num==1) {
                                            System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré con el dinero, pero no irá Homer, sino Homer CORLEONE...");
                                            System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                                            System.out.println("                                                     ___,------,\r\n"
                                                    + "             _,--.---.                         __,--'         /\r\n"
                                                    + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                                    + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                                    + "        ,'               \\             ,'      _,-'          ||\r\n"
                                                    + "       /                  \\         _,'     ,-'              ||\r\n"
                                                    + "      :                    .      ,'     _,'                 |:\r\n"
                                                    + "      |                    :     `.    ,'                    |:\r\n"
                                                    + "      |           _,-      |       `-,'                      ::\r\n"
                                                    + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                                    + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                                    + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                                    + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                                    + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                                    + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                                    + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                                    + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                                    + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                                    + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                                    + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                                    + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                                    + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                                    + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                                    + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                                    + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                                    + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                                    + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                                    + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                                    + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                                    + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                                    + " \\_,'                         `._                          _,-'     `\r\n"
                                                    + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                                    + "                          ,'             `---------'\r\n"
                                                    + "                        ,'\r\n"
                                                    + "\r\n");
                                            System.out.println("");
                                            System.out.println("(ya en la casa de Tony el Gordo)");
                                            System.out.println("Te decides a entrar por la puerta con el resto");
                                            System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                                            System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                                            System.out.println("HOMER: Vamos al grano Tony, tengo el dinero, ¿Dónde está mi familia?");
                                            System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                                            System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                                            System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                                            System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame, ahora lárguese");
                                            System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                                            System.out.println("empieza a acribillar el salón donde os encontrabais");
                                            System.out.println("  ");
                                            System.out.println("1. Te unes a él");
                                            System.out.println("2. Le matas para que Tony te deba su vida");
                                            num=lector.nextInt();
                                            if(num==1) {
                                                System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                                System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                                System.out.println("MARGE: Homi nos habeis salvado");
                                                System.out.println("BART: Gracias culo gordo");
                                                System.out.println("LISA: Gracias papa");
                                                System.out.println("MAGIE: -sonido de chupete-");
                                                System.out.println("HAS GANADO");
                                                System.out.println("FIN GRACIAS POR JUGAR");
                                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                        + "                 /        ` \\'\\,\r\n"
                                                        + "                /               '/|_\r\n"
                                                        + "               /                   /\r\n"
                                                        + "              /                   /\r\n"
                                                        + "             /                   ;\r\n"
                                                        + "             ;-\"\"-.  ____       ,\r\n"
                                                        + "            /      )'    `.     '\r\n"
                                                        + "           (    o |        )   ;\r\n"
                                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                        + "            ;\\___  `._____/ ,-:\r\n"
                                                        + "           ;                 @ )\r\n"
                                                        + "          /                `;-'\r\n"
                                                        + "       ,. `-.______________,|\r\n"
                                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                        + " ,`.`-   \\        '.        |\r\n"
                                                        + "  `._  ) :          )______,;\\_\r\n"
                                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                                        + "      \\     `--\\   :      /      `.\r\n"
                                                        + "       \\        \\  ;     |         \\\r\n"
                                                        + "        `-._____ ;|      |       _,'\r\n"
                                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                        + "                 /          \\      \\\r\n"
                                                );
                                            }else if(num==2) {
                                                System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                                System.out.println("HOMER: Mosquis...");
                                                System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                                System.out.println("MARGE: Homi nos habeis salvado");
                                                System.out.println("BART: Gracias culo gordo");
                                                System.out.println("LISA: Gracias papa");
                                                System.out.println("MAGIE: -sonido de chupete-");
                                                System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                                System.out.println("FIN GRACIAS POR JUGAR");
                                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                        + "                 /        ` \\'\\,\r\n"
                                                        + "                /               '/|_\r\n"
                                                        + "               /                   /\r\n"
                                                        + "              /                   /\r\n"
                                                        + "             /                   ;\r\n"
                                                        + "             ;-\"\"-.  ____       ,\r\n"
                                                        + "            /      )'    `.     '\r\n"
                                                        + "           (    o |        )   ;\r\n"
                                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                        + "            ;\\___  `._____/ ,-:\r\n"
                                                        + "           ;                 @ )\r\n"
                                                        + "          /                `;-'\r\n"
                                                        + "       ,. `-.______________,|\r\n"
                                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                        + " ,`.`-   \\        '.        |\r\n"
                                                        + "  `._  ) :          )______,;\\_\r\n"
                                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                                        + "      \\     `--\\   :      /      `.\r\n"
                                                        + "       \\        \\  ;     |         \\\r\n"
                                                        + "        `-._____ ;|      |       _,'\r\n"
                                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                        + "                 /          \\      \\\r\n"
                                                );
                                            }else {
                                                System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                            }
                                        }if (num==2) {
                                            System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré, pero no irá Homer, sino Homer CORLEONE...");
                                            System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                                            System.out.println("                                                     ___,------,\r\n"
                                                    + "             _,--.---.                         __,--'         /\r\n"
                                                    + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                                    + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                                    + "        ,'               \\             ,'      _,-'          ||\r\n"
                                                    + "       /                  \\         _,'     ,-'              ||\r\n"
                                                    + "      :                    .      ,'     _,'                 |:\r\n"
                                                    + "      |                    :     `.    ,'                    |:\r\n"
                                                    + "      |           _,-      |       `-,'                      ::\r\n"
                                                    + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                                    + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                                    + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                                    + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                                    + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                                    + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                                    + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                                    + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                                    + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                                    + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                                    + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                                    + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                                    + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                                    + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                                    + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                                    + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                                    + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                                    + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                                    + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                                    + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                                    + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                                    + " \\_,'                         `._                          _,-'     `\r\n"
                                                    + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                                    + "                          ,'             `---------'\r\n"
                                                    + "                        ,'\r\n"
                                                    + "\r\n");
                                            System.out.println("");
                                            System.out.println("(ya en la casa de Tony el Gordo)");
                                            System.out.println("Te decides a entrar por la puerta con el resto");
                                            System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                                            System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                                            System.out.println("HOMER: Vamos al grano Tony, ¿Dónde está mi familia?");
                                            System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                                            System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                                            System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                                            System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame");
                                            System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                                            System.out.println("empieza a acribillar el salón donde os encontrabais");
                                            System.out.println("  ");
                                            System.out.println("1. Te unes a él");
                                            System.out.println("2. Le matas para que Tony te deba su vida");
                                            num=lector.nextInt();
                                            if(num==1) {
                                                System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                                System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                                System.out.println("MARGE: Homi nos habeis salvado");
                                                System.out.println("BART: Gracias culo gordo");
                                                System.out.println("LISA: Gracias papa");
                                                System.out.println("MAGIE: -sonido de chupete-");
                                                System.out.println("HAS GANADO");
                                                System.out.println("FIN GRACIAS POR JUGAR");
                                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                        + "                 /        ` \\'\\,\r\n"
                                                        + "                /               '/|_\r\n"
                                                        + "               /                   /\r\n"
                                                        + "              /                   /\r\n"
                                                        + "             /                   ;\r\n"
                                                        + "             ;-\"\"-.  ____       ,\r\n"
                                                        + "            /      )'    `.     '\r\n"
                                                        + "           (    o |        )   ;\r\n"
                                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                        + "            ;\\___  `._____/ ,-:\r\n"
                                                        + "           ;                 @ )\r\n"
                                                        + "          /                `;-'\r\n"
                                                        + "       ,. `-.______________,|\r\n"
                                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                        + " ,`.`-   \\        '.        |\r\n"
                                                        + "  `._  ) :          )______,;\\_\r\n"
                                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                                        + "      \\     `--\\   :      /      `.\r\n"
                                                        + "       \\        \\  ;     |         \\\r\n"
                                                        + "        `-._____ ;|      |       _,'\r\n"
                                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                        + "                 /          \\      \\\r\n"
                                                );
                                            }else if(num==2) {
                                                System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                                System.out.println("HOMER: Mosquis...");
                                                System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                                System.out.println("MARGE: Homi nos habeis salvado");
                                                System.out.println("BART: Gracias culo gordo");
                                                System.out.println("LISA: Gracias papa");
                                                System.out.println("MAGIE: -sonido de chupete-");
                                                System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                                System.out.println("FIN GRACIAS POR JUGAR");
                                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                        + "                 /        ` \\'\\,\r\n"
                                                        + "                /               '/|_\r\n"
                                                        + "               /                   /\r\n"
                                                        + "              /                   /\r\n"
                                                        + "             /                   ;\r\n"
                                                        + "             ;-\"\"-.  ____       ,\r\n"
                                                        + "            /      )'    `.     '\r\n"
                                                        + "           (    o |        )   ;\r\n"
                                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                        + "            ;\\___  `._____/ ,-:\r\n"
                                                        + "           ;                 @ )\r\n"
                                                        + "          /                `;-'\r\n"
                                                        + "       ,. `-.______________,|\r\n"
                                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                        + " ,`.`-   \\        '.        |\r\n"
                                                        + "  `._  ) :          )______,;\\_\r\n"
                                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                                        + "      \\     `--\\   :      /      `.\r\n"
                                                        + "       \\        \\  ;     |         \\\r\n"
                                                        + "        `-._____ ;|      |       _,'\r\n"
                                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                        + "                 /          \\      \\\r\n"
                                                );
                                            }else {
                                                System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                            }
                                        }

                                    }else {
                                        System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                    }

                                }else {
                                    System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                }
                            }else {
                                System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                            }



                        }else if (num==2) {
                            System.out.println("MOSQUIS No hay cerveza");
                            System.out.println(" A dónde iré ahora a por cerveza ¿Qué haces?");
                            System.out.println("  ");
                            System.out.println("1. Iré al bar de moe");
                            System.out.println("2. Vamos al Badulaqe");
                            num=lector.nextInt();
                            if(num==2){
                                System.out.println("APU: Hola Señor Simpson, ¿qué desea?");
                                System.out.println("HOMER: Hola Apu, ¿dónde tienes las Cervezas? ");
                                System.out.println("APU: En el segundo pasillo a la derecha señor Homer ");
                                System.out.println("HOMER: ¡Douhh! Que lejos... Ya no quiero todo lo que está más allá de 12 pasos no vale la pena ");
                                System.out.println(" ");
                                System.out.println("1. Traemelas tu Apu que estás más cerca.");
                                System.out.println("2. -Adios Apu serás el culpable de la ruina de los Simpson- te marchas");
                                num=lector.nextInt();
                                if(num==1) {
                                    System.out.println("APU: No Homer ve tú y sino adiós.");
                                    System.out.println("HOMER: Mosquis pues me iré, maldito apu... (Y sales del badulaque)");
                                    System.out.println("???: Hola Homer... ");
                                    System.out.println("HOMER: No gracias no quiero nada ");
                                    System.out.println("Tony el Gordo: Eres tonto vengo soy yo Tony el Gordo, vengo a por mi dinero, o acaso, ¿No leiste mi nota? ");
                                    System.out.println("HOMER: Ah que era una nota la loncha de queso que ponía -Dame mi dinero. Att Tony el Gordo- Ahhhh ");
                                    System.out.println("TONY EL GORDO:Por cosas como esta me quierp volver a la mia Italia ");
                                    System.out.println("¡BANG! ¡BANG! ");
                                    System.out.println("TONY EL GORDO: Adios Homer te veo cuando llegue mi hora. ");
                                    System.out.println(" -HAS PERDIDO-");
                                    System.out.println("-FIN DE JUEGO-");
                                    System.out.println(" Gracias por jugar ");
                                }else if(num==2) {
                                    System.out.println("HOMER: Mosquis pues me iré, maldito apu... (Y sales del badulaque)");
                                    System.out.println("???: Hola Homer... ");
                                    System.out.println("HOMER: No gracias no quiero nada ");
                                    System.out.println("Tony el Gordo: Eres tonto vengo soy yo Tony el Gordo, vengo a por mi dinero, o acaso, ¿No leiste mi nota? ");
                                    System.out.println("HOMER: Ah que era una nota la loncha de queso que ponía -Dame mi dinero. Att Tony el Gordo- Ahhhh ");
                                    System.out.println("TONY EL GORDO:Por cosas como esta me quierp volver a la mia Italia ");
                                    System.out.println("¡BANG! ¡BANG! ");
                                    System.out.println("TONY EL GORDO: Adios Homer te veo cuando llegue mi hora. ");
                                    System.out.println(" -HAS PERDIDO-");
                                    System.out.println("-FIN DE JUEGO-");
                                    System.out.println(" Gracias por jugar ");
                                }
                                else {
                                    System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");

                                }

                            }else if(num==1) {
                                System.out.println("Llegas al bar de Moe ");
                                System.out.println("MOE: Hola Homer toma tu cerveza para animar la mañana");
                                System.out.println("HOMER: Gracias Moe nadie quiere darle un rico rico desyuno a este gordinflon, solo tu sabes ");
                                System.out.println("MOE: No te animes mucho Homer porque voy a cerrar por unos días ");
                                System.out.println("HOMER: ¡Mosquis! Todo Mal ¡Qué voy a haceeer...! ");
                                System.out.println("MOE: Pues no lo se Homer, pero es mejor que te vayas ya, no hagas esto mñas difícil");
                                System.out.println("  ");
                                System.out.println("1. Pues de vuelta a casa con las manos vacias ¡Dou! ");
                                System.out.println("2. Pues me quedo en el bar escondido y hago de... ¡Barman!");
                                num=lector.nextInt();
                                if(num==1) {
                                    System.out.println("Vuelves a casa con el coche y ves que no hay nadie");
                                    System.out.println("Ves que tienes llamadas perdidas y llamas a Marge");
                                    System.out.println("MARGE: Homi han entrado en casa unos italianos de la mafia y nos han secuestrado por un diniero que debes");
                                    System.out.println("TONY EL GORDO: Hola Homer soy yo Tony e Gordo o me das el dinero replicaré un padrino con los tuyos bambinos");
                                    System.out.println("Pi...");
                                    System.out.println("Pi...  ");
                                    System.out.println("Ha colgado  ");
                                    System.out.println("  ");
                                    System.out.println("1. Coges todo el dinero y se lo llevas a su casa");
                                    System.out.println("2. Te armas hasta los dientes");
                                    num=lector.nextInt();
                                    if(num==1) {
                                        System.out.println("Has cogido el dinero y el coche y has marchado a la casa de la Mafia de Springfield ");
                                        System.out.println("TONY: Hola Homer te estaba esperando");
                                        System.out.println("HOMER: Aquí tienes el dinero, ahora suelta a mi familia");
                                        System.out.println("TONY: Sabes una cosa Homer... por tu cabeza en bandeja me dan más dinero");
                                        System.out.println("HOMER: Pero mi familia vivirá, ¿no es así?");
                                        System.out.println("TONY: Cinco vale más que uno asi que ya me dirás tú");
                                        System.out.println("-FIN DE JUEGO-");
                                        System.out.println("Ya sabes cómo se hicieron las galletitas de los Simpson");
                                    }else if (num==2) {
                                        System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré, pero no irá Homer, sino Homer CORLEONE...");
                                        System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                                        System.out.println("                                                     ___,------,\r\n"
                                                + "             _,--.---.                         __,--'         /\r\n"
                                                + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                                + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                                + "        ,'               \\             ,'      _,-'          ||\r\n"
                                                + "       /                  \\         _,'     ,-'              ||\r\n"
                                                + "      :                    .      ,'     _,'                 |:\r\n"
                                                + "      |                    :     `.    ,'                    |:\r\n"
                                                + "      |           _,-      |       `-,'                      ::\r\n"
                                                + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                                + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                                + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                                + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                                + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                                + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                                + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                                + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                                + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                                + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                                + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                                + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                                + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                                + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                                + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                                + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                                + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                                + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                                + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                                + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                                + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                                + " \\_,'                         `._                          _,-'     `\r\n"
                                                + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                                + "                          ,'             `---------'\r\n"
                                                + "                        ,'\r\n"
                                                + "\r\n");
                                        System.out.println("");
                                        System.out.println("(ya en la casa de Tony el Gordo)");
                                        System.out.println("Te decides a entrar por la puerta con el resto");
                                        System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                                        System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                                        System.out.println("HOMER: Vamos al grano Tony, ¿Dónde está mi familia?");
                                        System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                                        System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                                        System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                                        System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame");
                                        System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                                        System.out.println("empieza a acribillar el salón donde os encontrabais");
                                        System.out.println("  ");
                                        System.out.println("1. Te unes a él");
                                        System.out.println("2. Le matas para que Tony te deba su vida");
                                        num=lector.nextInt();
                                        if(num==1) {
                                            System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                            System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                            System.out.println("MARGE: Homi nos habeis salvado");
                                            System.out.println("BART: Gracias culo gordo");
                                            System.out.println("LISA: Gracias papa");
                                            System.out.println("MAGIE: -sonido de chupete-");
                                            System.out.println("HAS GANADO");
                                            System.out.println("FIN GRACIAS POR JUGAR");
                                            System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                    + "                 /        ` \\'\\,\r\n"
                                                    + "                /               '/|_\r\n"
                                                    + "               /                   /\r\n"
                                                    + "              /                   /\r\n"
                                                    + "             /                   ;\r\n"
                                                    + "             ;-\"\"-.  ____       ,\r\n"
                                                    + "            /      )'    `.     '\r\n"
                                                    + "           (    o |        )   ;\r\n"
                                                    + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                    + "            ;\\___  `._____/ ,-:\r\n"
                                                    + "           ;                 @ )\r\n"
                                                    + "          /                `;-'\r\n"
                                                    + "       ,. `-.______________,|\r\n"
                                                    + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                    + " ,`.`-   \\        '.        |\r\n"
                                                    + "  `._  ) :          )______,;\\_\r\n"
                                                    + "     \\    \\_   _,--/       ,   `.\r\n"
                                                    + "      \\     `--\\   :      /      `.\r\n"
                                                    + "       \\        \\  ;     |         \\\r\n"
                                                    + "        `-._____ ;|      |       _,'\r\n"
                                                    + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                    + "                 /          \\      \\\r\n"
                                            );
                                        }else if(num==2) {
                                            System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                            System.out.println("HOMER: Mosquis...");
                                            System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                            System.out.println("MARGE: Homi nos habeis salvado");
                                            System.out.println("BART: Gracias culo gordo");
                                            System.out.println("LISA: Gracias papa");
                                            System.out.println("MAGIE: -sonido de chupete-");
                                            System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                            System.out.println("FIN GRACIAS POR JUGAR");
                                            System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                    + "                 /        ` \\'\\,\r\n"
                                                    + "                /               '/|_\r\n"
                                                    + "               /                   /\r\n"
                                                    + "              /                   /\r\n"
                                                    + "             /                   ;\r\n"
                                                    + "             ;-\"\"-.  ____       ,\r\n"
                                                    + "            /      )'    `.     '\r\n"
                                                    + "           (    o |        )   ;\r\n"
                                                    + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                    + "            ;\\___  `._____/ ,-:\r\n"
                                                    + "           ;                 @ )\r\n"
                                                    + "          /                `;-'\r\n"
                                                    + "       ,. `-.______________,|\r\n"
                                                    + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                    + " ,`.`-   \\        '.        |\r\n"
                                                    + "  `._  ) :          )______,;\\_\r\n"
                                                    + "     \\    \\_   _,--/       ,   `.\r\n"
                                                    + "      \\     `--\\   :      /      `.\r\n"
                                                    + "       \\        \\  ;     |         \\\r\n"
                                                    + "        `-._____ ;|      |       _,'\r\n"
                                                    + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                    + "                 /          \\      \\\r\n"
                                            );
                                        }else {
                                            System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                        }
                                    }else {
                                        System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                    }
                                }else if (num==2) {
                                    System.out.println("Homer te estoy viendo vete ya");
                                    System.out.println("Vuelves a casa con el coche y ves que no hay nadie");
                                    System.out.println("Ves que tienes llamadas perdidas y llamas a Marge");
                                    System.out.println("MARGE: Homi han entrado en casa unos italianos de la mafia y nos han secuestrado por un diniero que debes");
                                    System.out.println("TONY EL GORDO: Hola Homer soy yo Tony e Gordo o me das el dinero replicaré un padrino con los tuyos bambinos");
                                    System.out.println("Pi...");
                                    System.out.println("Pi...  ");
                                    System.out.println("Ha colgado  ");
                                    System.out.println("  ");
                                    System.out.println("1. Coges todo el dinero y se lo llevas a su casa");
                                    System.out.println("2. Te armas hasta los dientes");
                                    num=lector.nextInt();
                                    if (num==1) {
                                        System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré con el dinero, pero no irá Homer, sino Homer CORLEONE...");
                                        System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                                        System.out.println("                                                     ___,------,\r\n"
                                                + "             _,--.---.                         __,--'         /\r\n"
                                                + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                                + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                                + "        ,'               \\             ,'      _,-'          ||\r\n"
                                                + "       /                  \\         _,'     ,-'              ||\r\n"
                                                + "      :                    .      ,'     _,'                 |:\r\n"
                                                + "      |                    :     `.    ,'                    |:\r\n"
                                                + "      |           _,-      |       `-,'                      ::\r\n"
                                                + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                                + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                                + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                                + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                                + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                                + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                                + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                                + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                                + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                                + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                                + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                                + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                                + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                                + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                                + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                                + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                                + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                                + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                                + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                                + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                                + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                                + " \\_,'                         `._                          _,-'     `\r\n"
                                                + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                                + "                          ,'             `---------'\r\n"
                                                + "                        ,'\r\n"
                                                + "\r\n");
                                        System.out.println("");
                                        System.out.println("(ya en la casa de Tony el Gordo)");
                                        System.out.println("Te decides a entrar por la puerta con el resto");
                                        System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                                        System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                                        System.out.println("HOMER: Vamos al grano Tony, tengo el dinero, ¿Dónde está mi familia?");
                                        System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                                        System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                                        System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                                        System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame, ahora lárguese");
                                        System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                                        System.out.println("empieza a acribillar el salón donde os encontrabais");
                                        System.out.println("  ");
                                        System.out.println("1. Te unes a él");
                                        System.out.println("2. Le matas para que Tony te deba su vida");
                                        num=lector.nextInt();
                                        if(num==1) {
                                            System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                            System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                            System.out.println("MARGE: Homi nos habeis salvado");
                                            System.out.println("BART: Gracias culo gordo");
                                            System.out.println("LISA: Gracias papa");
                                            System.out.println("MAGIE: -sonido de chupete-");
                                            System.out.println("HAS GANADO");
                                            System.out.println("FIN GRACIAS POR JUGAR");
                                            System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                    + "                 /        ` \\'\\,\r\n"
                                                    + "                /               '/|_\r\n"
                                                    + "               /                   /\r\n"
                                                    + "              /                   /\r\n"
                                                    + "             /                   ;\r\n"
                                                    + "             ;-\"\"-.  ____       ,\r\n"
                                                    + "            /      )'    `.     '\r\n"
                                                    + "           (    o |        )   ;\r\n"
                                                    + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                    + "            ;\\___  `._____/ ,-:\r\n"
                                                    + "           ;                 @ )\r\n"
                                                    + "          /                `;-'\r\n"
                                                    + "       ,. `-.______________,|\r\n"
                                                    + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                    + " ,`.`-   \\        '.        |\r\n"
                                                    + "  `._  ) :          )______,;\\_\r\n"
                                                    + "     \\    \\_   _,--/       ,   `.\r\n"
                                                    + "      \\     `--\\   :      /      `.\r\n"
                                                    + "       \\        \\  ;     |         \\\r\n"
                                                    + "        `-._____ ;|      |       _,'\r\n"
                                                    + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                    + "                 /          \\      \\\r\n"
                                            );
                                        }else if(num==2) {
                                            System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                            System.out.println("HOMER: Mosquis...");
                                            System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                            System.out.println("MARGE: Homi nos habeis salvado");
                                            System.out.println("BART: Gracias culo gordo");
                                            System.out.println("LISA: Gracias papa");
                                            System.out.println("MAGIE: -sonido de chupete-");
                                            System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                            System.out.println("FIN GRACIAS POR JUGAR");
                                            System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                    + "                 /        ` \\'\\,\r\n"
                                                    + "                /               '/|_\r\n"
                                                    + "               /                   /\r\n"
                                                    + "              /                   /\r\n"
                                                    + "             /                   ;\r\n"
                                                    + "             ;-\"\"-.  ____       ,\r\n"
                                                    + "            /      )'    `.     '\r\n"
                                                    + "           (    o |        )   ;\r\n"
                                                    + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                    + "            ;\\___  `._____/ ,-:\r\n"
                                                    + "           ;                 @ )\r\n"
                                                    + "          /                `;-'\r\n"
                                                    + "       ,. `-.______________,|\r\n"
                                                    + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                    + " ,`.`-   \\        '.        |\r\n"
                                                    + "  `._  ) :          )______,;\\_\r\n"
                                                    + "     \\    \\_   _,--/       ,   `.\r\n"
                                                    + "      \\     `--\\   :      /      `.\r\n"
                                                    + "       \\        \\  ;     |         \\\r\n"
                                                    + "        `-._____ ;|      |       _,'\r\n"
                                                    + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                    + "                 /          \\      \\\r\n"
                                            );
                                        }else {
                                            System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                        }
                                    }if (num==2) {
                                        System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré, pero no irá Homer, sino Homer CORLEONE...");
                                        System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                                        System.out.println("                                                     ___,------,\r\n"
                                                + "             _,--.---.                         __,--'         /\r\n"
                                                + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                                + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                                + "        ,'               \\             ,'      _,-'          ||\r\n"
                                                + "       /                  \\         _,'     ,-'              ||\r\n"
                                                + "      :                    .      ,'     _,'                 |:\r\n"
                                                + "      |                    :     `.    ,'                    |:\r\n"
                                                + "      |           _,-      |       `-,'                      ::\r\n"
                                                + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                                + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                                + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                                + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                                + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                                + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                                + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                                + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                                + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                                + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                                + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                                + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                                + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                                + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                                + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                                + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                                + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                                + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                                + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                                + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                                + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                                + " \\_,'                         `._                          _,-'     `\r\n"
                                                + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                                + "                          ,'             `---------'\r\n"
                                                + "                        ,'\r\n"
                                                + "\r\n");
                                        System.out.println("");
                                        System.out.println("(ya en la casa de Tony el Gordo)");
                                        System.out.println("Te decides a entrar por la puerta con el resto");
                                        System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                                        System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                                        System.out.println("HOMER: Vamos al grano Tony, ¿Dónde está mi familia?");
                                        System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                                        System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                                        System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                                        System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame");
                                        System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                                        System.out.println("empieza a acribillar el salón donde os encontrabais");
                                        System.out.println("  ");
                                        System.out.println("1. Te unes a él");
                                        System.out.println("2. Le matas para que Tony te deba su vida");
                                        num=lector.nextInt();
                                        if(num==1) {
                                            System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                            System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                            System.out.println("MARGE: Homi nos habeis salvado");
                                            System.out.println("BART: Gracias culo gordo");
                                            System.out.println("LISA: Gracias papa");
                                            System.out.println("MAGIE: -sonido de chupete-");
                                            System.out.println("HAS GANADO");
                                            System.out.println("FIN GRACIAS POR JUGAR");
                                            System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                    + "                 /        ` \\'\\,\r\n"
                                                    + "                /               '/|_\r\n"
                                                    + "               /                   /\r\n"
                                                    + "              /                   /\r\n"
                                                    + "             /                   ;\r\n"
                                                    + "             ;-\"\"-.  ____       ,\r\n"
                                                    + "            /      )'    `.     '\r\n"
                                                    + "           (    o |        )   ;\r\n"
                                                    + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                    + "            ;\\___  `._____/ ,-:\r\n"
                                                    + "           ;                 @ )\r\n"
                                                    + "          /                `;-'\r\n"
                                                    + "       ,. `-.______________,|\r\n"
                                                    + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                    + " ,`.`-   \\        '.        |\r\n"
                                                    + "  `._  ) :          )______,;\\_\r\n"
                                                    + "     \\    \\_   _,--/       ,   `.\r\n"
                                                    + "      \\     `--\\   :      /      `.\r\n"
                                                    + "       \\        \\  ;     |         \\\r\n"
                                                    + "        `-._____ ;|      |       _,'\r\n"
                                                    + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                    + "                 /          \\      \\\r\n"
                                            );
                                        }else if(num==2) {
                                            System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                            System.out.println("HOMER: Mosquis...");
                                            System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                            System.out.println("MARGE: Homi nos habeis salvado");
                                            System.out.println("BART: Gracias culo gordo");
                                            System.out.println("LISA: Gracias papa");
                                            System.out.println("MAGIE: -sonido de chupete-");
                                            System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                            System.out.println("FIN GRACIAS POR JUGAR");
                                            System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                                    + "                 /        ` \\'\\,\r\n"
                                                    + "                /               '/|_\r\n"
                                                    + "               /                   /\r\n"
                                                    + "              /                   /\r\n"
                                                    + "             /                   ;\r\n"
                                                    + "             ;-\"\"-.  ____       ,\r\n"
                                                    + "            /      )'    `.     '\r\n"
                                                    + "           (    o |        )   ;\r\n"
                                                    + "            ),'\"\"\"\\    o   ;  :\r\n"
                                                    + "            ;\\___  `._____/ ,-:\r\n"
                                                    + "           ;                 @ )\r\n"
                                                    + "          /                `;-'\r\n"
                                                    + "       ,. `-.______________,|\r\n"
                                                    + "  ,(`._||         \\__\\__\\__)|\r\n"
                                                    + " ,`.`-   \\        '.        |\r\n"
                                                    + "  `._  ) :          )______,;\\_\r\n"
                                                    + "     \\    \\_   _,--/       ,   `.\r\n"
                                                    + "      \\     `--\\   :      /      `.\r\n"
                                                    + "       \\        \\  ;     |         \\\r\n"
                                                    + "        `-._____ ;|      |       _,'\r\n"
                                                    + "    -hrr-       \\/'      `-.----' \\\r\n"
                                                    + "                 /          \\      \\\r\n"
                                            );
                                        }else {
                                            System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                        }
                                    }

                                }else {
                                    System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                                }

                            }else {
                                System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                            }
                        }else {
                            System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                        }
                    }else if (num==2) {
                        System.out.println("???: Hola Hommer esta nota es para recordarte que nos tienes que pagar hoy o iré a por tus bambinos y a por todo lo que quieres");
                        System.out.println("Mosquís quíen sera");
                        System.out.println("Pd: soy Tony el gordo");
                        System.out.println("Voy a buscar a Marge");
                        System.out.println("No hay nadie en la casa");
                        System.out.println("Hay una nota en tu cama que no habías visto");
                        System.out.println("TONY EL GORDO: Por cierto ya me llevado a la tuya familia, ven con el dinero");
                        System.out.println("  ");
                        System.out.println("1. Coges todo el dinero y se lo llevas a su casa");
                        System.out.println("2. Te armas hasta los dientes");
                        num=lector.nextInt();
                        if (num==1) {
                            System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré con el dinero, pero no irá Homer, sino Homer CORLEONE...");
                            System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                            System.out.println("                                                     ___,------,\r\n"
                                    + "             _,--.---.                         __,--'         /\r\n"
                                    + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                    + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                    + "        ,'               \\             ,'      _,-'          ||\r\n"
                                    + "       /                  \\         _,'     ,-'              ||\r\n"
                                    + "      :                    .      ,'     _,'                 |:\r\n"
                                    + "      |                    :     `.    ,'                    |:\r\n"
                                    + "      |           _,-      |       `-,'                      ::\r\n"
                                    + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                    + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                    + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                    + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                    + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                    + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                    + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                    + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                    + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                    + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                    + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                    + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                    + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                    + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                    + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                    + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                    + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                    + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                    + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                    + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                    + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                    + " \\_,'                         `._                          _,-'     `\r\n"
                                    + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                    + "                          ,'             `---------'\r\n"
                                    + "                        ,'\r\n"
                                    + "\r\n");
                            System.out.println("");
                            System.out.println("(ya en la casa de Tony el Gordo)");
                            System.out.println("Te decides a entrar por la puerta con el resto");
                            System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                            System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                            System.out.println("HOMER: Vamos al grano Tony, tengo el dinero, ¿Dónde está mi familia?");
                            System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                            System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                            System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                            System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame, ahora lárguese");
                            System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                            System.out.println("empieza a acribillar el salón donde os encontrabais");
                            System.out.println("  ");
                            System.out.println("1. Te unes a él");
                            System.out.println("2. Le matas para que Tony te deba su vida");
                            num=lector.nextInt();
                            if(num==1) {
                                System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                System.out.println("MARGE: Homi nos habeis salvado");
                                System.out.println("BART: Gracias culo gordo");
                                System.out.println("LISA: Gracias papa");
                                System.out.println("MAGIE: -sonido de chupete-");
                                System.out.println("HAS GANADO");
                                System.out.println("FIN GRACIAS POR JUGAR");
                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                        + "                 /        ` \\'\\,\r\n"
                                        + "                /               '/|_\r\n"
                                        + "               /                   /\r\n"
                                        + "              /                   /\r\n"
                                        + "             /                   ;\r\n"
                                        + "             ;-\"\"-.  ____       ,\r\n"
                                        + "            /      )'    `.     '\r\n"
                                        + "           (    o |        )   ;\r\n"
                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                        + "            ;\\___  `._____/ ,-:\r\n"
                                        + "           ;                 @ )\r\n"
                                        + "          /                `;-'\r\n"
                                        + "       ,. `-.______________,|\r\n"
                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                        + " ,`.`-   \\        '.        |\r\n"
                                        + "  `._  ) :          )______,;\\_\r\n"
                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                        + "      \\     `--\\   :      /      `.\r\n"
                                        + "       \\        \\  ;     |         \\\r\n"
                                        + "        `-._____ ;|      |       _,'\r\n"
                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                        + "                 /          \\      \\\r\n"
                                );
                            }else if(num==2) {
                                System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                System.out.println("HOMER: Mosquis...");
                                System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                System.out.println("MARGE: Homi nos habeis salvado");
                                System.out.println("BART: Gracias culo gordo");
                                System.out.println("LISA: Gracias papa");
                                System.out.println("MAGIE: -sonido de chupete-");
                                System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                System.out.println("FIN GRACIAS POR JUGAR");
                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                        + "                 /        ` \\'\\,\r\n"
                                        + "                /               '/|_\r\n"
                                        + "               /                   /\r\n"
                                        + "              /                   /\r\n"
                                        + "             /                   ;\r\n"
                                        + "             ;-\"\"-.  ____       ,\r\n"
                                        + "            /      )'    `.     '\r\n"
                                        + "           (    o |        )   ;\r\n"
                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                        + "            ;\\___  `._____/ ,-:\r\n"
                                        + "           ;                 @ )\r\n"
                                        + "          /                `;-'\r\n"
                                        + "       ,. `-.______________,|\r\n"
                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                        + " ,`.`-   \\        '.        |\r\n"
                                        + "  `._  ) :          )______,;\\_\r\n"
                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                        + "      \\     `--\\   :      /      `.\r\n"
                                        + "       \\        \\  ;     |         \\\r\n"
                                        + "        `-._____ ;|      |       _,'\r\n"
                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                        + "                 /          \\      \\\r\n"
                                );
                            }else {
                                System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                            }

                        } else if (num==2) {
                            System.out.println("Tony no sabe que estos años me he estado preparando para esto, iré, pero no irá Homer, sino Homer CORLEONE...");
                            System.out.println("Me acompañarán Moe Morello, Leny Bagarella, Carl Leggio y Barney Provenzano");
                            System.out.println("                                                     ___,------,\r\n"
                                    + "             _,--.---.                         __,--'         /\r\n"
                                    + "           ,' _,'_`._ \\                    _,-'           ___,|\r\n"
                                    + "          ;--'       `^-.                ,'        __,---'   ||\r\n"
                                    + "        ,'               \\             ,'      _,-'          ||\r\n"
                                    + "       /                  \\         _,'     ,-'              ||\r\n"
                                    + "      :                    .      ,'     _,'                 |:\r\n"
                                    + "      |                    :     `.    ,'                    |:\r\n"
                                    + "      |           _,-      |       `-,'                      ::\r\n"
                                    + "     ,'____ ,  ,-'  `.   , |,         `.                     : \\\r\n"
                                    + "     ,'    `-,'       ) / \\/ \\          \\                     : :\r\n"
                                    + "     |      _\\   o _,-'    '-.           `.                    \\ \\\r\n"
                                    + "      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :\r\n"
                                    + "       \\-\\    _,---'    `-. -'.\\  `.  /     `.                  \\  \\\r\n"
                                    + "        / `--'             `.   \\   \\:        \\                  \\,.\\\r\n"
                                    + "       (              ____,  \\  |    \\\\        \\                 :\\ \\\\\r\n"
                                    + "        )         _,-'    `   | |    | \\        \\                 \\\\_\\\\\r\n"
                                    + "       /      _,-'            | |   ,'-`._      _\\                 \\,'\r\n"
                                    + "       `-----' |`-.           ;/   (__ ,' `-. _;-'`\\           _,--'\r\n"
                                    + "     ,'        |   `._     _,' \\-._/  Y    ,-'      \\      _,-'\r\n"
                                    + "    /        _ |      `---'    :,-|   |    `     _,-'\\_,--'   \\\r\n"
                                    + "   :          `|       \\`-._   /  |   '     `.,-' `._`         \\\r\n"
                                    + "   |           _\\_    _,\\/ _,-'|                     `-._       \\\r\n"
                                    + "   :   ,-         `.-'_,--'    \\                         `       \\\r\n"
                                    + "   | ,'           ,--'      _,--\\           _,                    :\r\n"
                                    + "    )         .    \\___,---'   ) `-.____,--'                      |\r\n"
                                    + "   _\\    .     `    ||        :            \\                      ;\r\n"
                                    + " ,'  \\    `.    )--' ;        |             `-.                  /\r\n"
                                    + "|     \\     ;--^._,-'         |                `-._            _/_\\\r\n"
                                    + "\\    ,'`---'                  |                    `--._____,-'_'  \\\r\n"
                                    + " \\_,'                         `._                          _,-'     `\r\n"
                                    + "          -hrr-             ,-'  `---.___           __,---'\r\n"
                                    + "                          ,'             `---------'\r\n"
                                    + "                        ,'\r\n"
                                    + "\r\n");
                            System.out.println("");
                            System.out.println("(ya en la casa de Tony el Gordo)");
                            System.out.println("Te decides a entrar por la puerta con el resto");
                            System.out.println("...pzzz... Puerta abierta, Cierre despúes de entrar");
                            System.out.println("TONY EL GORDO: Hola Homer... veo que no vienes solo eh...");
                            System.out.println("HOMER: Vamos al grano Tony, ¿Dónde está mi familia?");
                            System.out.println("TONY EL GORDO: ¿Tu familia? Ellos están por la casa");
                            System.out.println("HOMER: Dejalos libres esto es algo entre tu y yo");
                            System.out.println("HOMBRE DE DUFF: Hola chicos, ¿Este es el cumpleaños de Lame?");
                            System.out.println("TONY EL GORDO: NO!! Aquí no vive nadie que se llame Lame");
                            System.out.println("HOMBRE DE DUFF: No me has entendido, esta es la fiesta de la metralleta...");
                            System.out.println("empieza a acribillar el salón donde os encontrabais");
                            System.out.println("  ");
                            System.out.println("1. Te unes a él");
                            System.out.println("2. Le matas para que Tony te deba su vida");
                            num=lector.nextInt();
                            if(num==1) {
                                System.out.println("HOMER: Gracias DUFFMAN nos has salvado a mi y a mi familia");
                                System.out.println("DUFFMAN: Nada Homer tu me salvaste cuando Vito Corleone raptó a la mía, estamos en paz ");
                                System.out.println("MARGE: Homi nos habeis salvado");
                                System.out.println("BART: Gracias culo gordo");
                                System.out.println("LISA: Gracias papa");
                                System.out.println("MAGIE: -sonido de chupete-");
                                System.out.println("HAS GANADO");
                                System.out.println("FIN GRACIAS POR JUGAR");
                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                        + "                 /        ` \\'\\,\r\n"
                                        + "                /               '/|_\r\n"
                                        + "               /                   /\r\n"
                                        + "              /                   /\r\n"
                                        + "             /                   ;\r\n"
                                        + "             ;-\"\"-.  ____       ,\r\n"
                                        + "            /      )'    `.     '\r\n"
                                        + "           (    o |        )   ;\r\n"
                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                        + "            ;\\___  `._____/ ,-:\r\n"
                                        + "           ;                 @ )\r\n"
                                        + "          /                `;-'\r\n"
                                        + "       ,. `-.______________,|\r\n"
                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                        + " ,`.`-   \\        '.        |\r\n"
                                        + "  `._  ) :          )______,;\\_\r\n"
                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                        + "      \\     `--\\   :      /      `.\r\n"
                                        + "       \\        \\  ;     |         \\\r\n"
                                        + "        `-._____ ;|      |       _,'\r\n"
                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                        + "                 /          \\      \\\r\n"
                                );
                            }else if(num==2) {
                                System.out.println("DUFFMAN: (Te susurra) ¿Por qué me matas Homer? Yo venía a ayudarte ");
                                System.out.println("HOMER: Mosquis...");
                                System.out.println("TONY EL GORDO: Gracias Homer supongo que la deuda está salvada, gracias a que me has salvado");
                                System.out.println("MARGE: Homi nos habeis salvado");
                                System.out.println("BART: Gracias culo gordo");
                                System.out.println("LISA: Gracias papa");
                                System.out.println("MAGIE: -sonido de chupete-");
                                System.out.println("HAS GANADO, pero... has perdido a un amigo");
                                System.out.println("FIN GRACIAS POR JUGAR");
                                System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                        + "                 /        ` \\'\\,\r\n"
                                        + "                /               '/|_\r\n"
                                        + "               /                   /\r\n"
                                        + "              /                   /\r\n"
                                        + "             /                   ;\r\n"
                                        + "             ;-\"\"-.  ____       ,\r\n"
                                        + "            /      )'    `.     '\r\n"
                                        + "           (    o |        )   ;\r\n"
                                        + "            ),'\"\"\"\\    o   ;  :\r\n"
                                        + "            ;\\___  `._____/ ,-:\r\n"
                                        + "           ;                 @ )\r\n"
                                        + "          /                `;-'\r\n"
                                        + "       ,. `-.______________,|\r\n"
                                        + "  ,(`._||         \\__\\__\\__)|\r\n"
                                        + " ,`.`-   \\        '.        |\r\n"
                                        + "  `._  ) :          )______,;\\_\r\n"
                                        + "     \\    \\_   _,--/       ,   `.\r\n"
                                        + "      \\     `--\\   :      /      `.\r\n"
                                        + "       \\        \\  ;     |         \\\r\n"
                                        + "        `-._____ ;|      |       _,'\r\n"
                                        + "    -hrr-       \\/'      `-.----' \\\r\n"
                                        + "                 /          \\      \\\r\n"
                                );
                            }else {
                                System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                            }
                        }

                    }else {
                        System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                    }
                }else if (num==2) {
                    System.out.println("ZZZzzzzz");
                    System.out.println("PUM PUM");
                    System.out.println("HOMER: Mosquis y esos disparos");
                    System.out.println("???: HOOMEER!!! MI DINEROOO");
                    System.out.println("HOMER: aaahh es Tony el Gordo");
                    System.out.println("HOMER: eehh... está abajo en el sótano");
                    System.out.println("bip bip");
                    System.out.println("???: QUITA!! Escoria humana, no te acerques a mí");
                    System.out.println("bajas al sótano");
                    System.out.println("BENDER: Quita humano asqueroso que apestas");
                    System.out.println("HOMER: Bender atrapalo que tiene a los demás");
                    System.out.println("Bender atrapa a Tony");
                    System.out.println("TONY: Sueltame o mataré a la tuya familia Homer");
                    System.out.println("BENDER: No amenaces idiota");
                    System.out.println("HOMER: Déjalo y Bender vamos a por los niños");
                    System.out.println("");
                    System.out.println("1. Va Bender a por Marge y los niños");
                    System.out.println("2. Vas con Bender");
                    num=lector.nextInt();
                    if(num==1) {
                        System.out.println("BENDER: Ya estoy aquí con los demás");
                        System.out.println("MARGE: Bender no estaba descnectado... Y esta comida??");
                        System.out.println("HOMER: Bienvenidos de vuelta a casa");
                        System.out.println("HOMER: Estaba en modo seguro si alguno estaba en peligro aparecería de nuevo");
                        System.out.println("MARGE: Homi nos habeis salvado");
                        System.out.println("BART: Gracias culo gordo");
                        System.out.println("LISA: Gracias papa");
                        System.out.println("MAGIE: -sonido de chupete-");
                        System.out.println("HAS GANADO, pero... has perdido a un amigo");
                        System.out.println("FIN GRACIAS POR JUGAR");
                        System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                + "                 /        ` \\'\\,\r\n"
                                + "                /               '/|_\r\n"
                                + "               /                   /\r\n"
                                + "              /                   /\r\n"
                                + "             /                   ;\r\n"
                                + "             ;-\"\"-.  ____       ,\r\n"
                                + "            /      )'    `.     '\r\n"
                                + "           (    o |        )   ;\r\n"
                                + "            ),'\"\"\"\\    o   ;  :\r\n"
                                + "            ;\\___  `._____/ ,-:\r\n"
                                + "           ;                 @ )\r\n"
                                + "          /                `;-'\r\n"
                                + "       ,. `-.______________,|\r\n"
                                + "  ,(`._||         \\__\\__\\__)|\r\n"
                                + " ,`.`-   \\        '.        |\r\n"
                                + "  `._  ) :          )______,;\\_\r\n"
                                + "     \\    \\_   _,--/       ,   `.\r\n"
                                + "      \\     `--\\   :      /      `.\r\n"
                                + "       \\        \\  ;     |         \\\r\n"
                                + "        `-._____ ;|      |       _,'\r\n"
                                + "    -hrr-       \\/'      `-.----' \\\r\n"
                                + "                 /          \\      \\\r\n"
                        );
                    }else if(num==2) {
                        System.out.println("llegais a la casa de Tony el gordo y rescatais a los demás");
                        System.out.println("MARGE: Homi nos habeis salvado");
                        System.out.println("BART: Gracias culo gordo");
                        System.out.println("LISA: Gracias papa");
                        System.out.println("MAGIE: -sonido de chupete-");
                        System.out.println("HAS GANADO");
                        System.out.println("FIN GRACIAS POR JUGAR");
                        System.out.println("                  /\\/\\,\\,\\ ,\r\n"
                                + "                 /        ` \\'\\,\r\n"
                                + "                /               '/|_\r\n"
                                + "               /                   /\r\n"
                                + "              /                   /\r\n"
                                + "             /                   ;\r\n"
                                + "             ;-\"\"-.  ____       ,\r\n"
                                + "            /      )'    `.     '\r\n"
                                + "           (    o |        )   ;\r\n"
                                + "            ),'\"\"\"\\    o   ;  :\r\n"
                                + "            ;\\___  `._____/ ,-:\r\n"
                                + "           ;                 @ )\r\n"
                                + "          /                `;-'\r\n"
                                + "       ,. `-.______________,|\r\n"
                                + "  ,(`._||         \\__\\__\\__)|\r\n"
                                + " ,`.`-   \\        '.        |\r\n"
                                + "  `._  ) :          )______,;\\_\r\n"
                                + "     \\    \\_   _,--/       ,   `.\r\n"
                                + "      \\     `--\\   :      /      `.\r\n"
                                + "       \\        \\  ;     |         \\\r\n"
                                + "        `-._____ ;|      |       _,'\r\n"
                                + "    -hrr-       \\/'      `-.----' \\\r\n"
                                + "                 /          \\      \\\r\n"
                        );
                    }else {
                        System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                    }
                }else {
                    System.out.println("ERROR: INTRODUCE LA OPCIÓN CORRECTA. BORRANDO MEMORIA... ");
                }
            }

    //Funcion que imprime un trozo de la historia que se accede desde diferentes sitios de la historia
    static void colegio() throws InterruptedException {
        int input = -1;
        log("Edna","Bart llegas tarde al examen","azul");
        log("Edna","Ven sientate","blanco");
        log("Bart","No me acordaba tengo que hacer algo para librarme del examen","blanco");
        input = menu(new String[]{"Ponerse malo","Ir al baño","Huir"});
        //Ponerse malo
        if (input == 0){
            log("Bart","Profe me encuentro un poco mal","blanco");
            logr("Edna","No pasa nada bart vete a casa y te hare el examen el proximo dia","azul");
            System.out.println("Bart consigue librarse del examen");
            System.out.println("Una vez en casa bart pregunta a sus compañeros por lo que les ha entrado en el examen");
            System.out.println("Dia siguiente:");
            logr("Edna","Has estudiado para el examen Bart","azul");
            log("Bart","Por supuesto profesora","blanco");
            System.out.println("Bart se pensaba que va a estar super facil");
            logr("Edna","Enserio cresite que te iba a ponerte las mismas preguntas jajjajajja","azul");
            log("Bart","Que estas diciendo profe","blanco");
            logr("Edna","HE CAMBIADO TOTRALMENTE LAS PREGUNTAS DEL EXAMEN AJAJJAJAJJJAJJA","rojo");
            log("Bart","NOOOOOOOOOOOOOOOOOOOOOOOOO","blanco");
            System.out.println("Final malo");
            System.out.println("Bart suspendio la asignatura y tuvo que irse a junio");
            System.out.println("Quieres reintentarlo?");
            input = menu(new String[]{"Si","No"});
            if (input == 0){
                dead("bart");
            }else{
                System.out.println("Gracias por jugar");
            }
            //Ir al baño
        } else if (input == 1) {
            log("Bart","Puedo ir al baño antes profe?","blanco");
            logr("Edna","Si pero date prisa que tenemos examen","azul");
            System.out.println("Bart llega al baño");
            logr("Jimbo","Bart sientate a echar un poker","verde");
            log("Bart","Mejor que ir a clase seguro que es, pero solo un rato que tengo prisa","blanco");
            System.out.println("Estan un buen rato jugando");
            log("Bart","Bueno chicos beuna partida me voy que tengo examen","blanco");
            logr("Jimbo","Por casualidad tu examen no sera de literatura","verde");
            log("Bart","Pues si justamente","blanco");
            logr("Jimbo","Pues toma chaval, suerte","verde");
            System.out.println("Le dan una chuleta a bart");
            log("Bart","Muchas gracias tio","Blanco");
            System.out.println("Final bueno");
            System.out.println("Bart aprueba la asignatura, no sabe nadie como y se divierte en verano");
            System.out.println("Quieres volver a jugar");
            input = menu(new String[]{"Si","No"});
            if (input == 0){
                dead("bart");
            }else{
                System.out.println("Gracias por jugar");
            }
            //Huir
        }else{
            System.out.println("Bart sale corriendo del centro y se topa al tio del coche que le mete en el coche");
            malechor();
        }
    }

    //Funcion para una parte de la historia porque he echo que llegues a esta parte desde diferentes sistios de la historia
    static void malechor()throws InterruptedException{
        int input;
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
        System.out.println("                                                  \n" +
                "                                                  \n" +
                "                                .....             \n" +
                "                 ^!777:        ~?7??7             \n" +
                "                ~YPP5GJ      ~J5YYY55.            \n" +
                "               !GPP55GJ      YGYYYJ5?             \n" +
                "              ^P5?5Y5B?      YPJYJJY!             \n" +
                "              ?5J^JJGGJ:     JPYJJJJ~             \n" +
                "             .Y57 7JG5YY!~^^~7??J???.             \n" +
                "             ^5P! .75YYYYYJ7??????!.              \n" +
                "             !55!   ^?JJ55Y?JJJJ?^                \n" +
                "             ?55!     ~J555?JY?Y~                 \n" +
                "            .JY5~      !Y5PJJ5YG!                 \n" +
                "            .Y5Y.      .J5GJJ55G7                 \n" +
                "             JP?       .JPGY55PB~                 \n" +
                "             !P5:      .JPB55PPJ                  \n" +
                "             .755!:    :JPB5PP5:                  \n" +
                "               .7555YYPPJPPY555^                  \n" +
                "                  .:!7YYJP5YYY57                  \n" +
                "                       ~Y5YY5YY?                  \n" +
                "                       7JYYY5YY?                  \n" +
                "                       ~?JJJJ??!                  \n" +
                "                        :::::..                   \n" +
                "                                                  \n" +
                "                                                  \n" +
                "                                                  ");
        System.out.println("                        ::^^^~!!~~~^:             \n" +
                "                    ::^~~~~!!7JJ7!!!~^            \n" +
                "                  :~~!!~!!!7?JYY7~~!!!^:          \n" +
                "                ^~!!!!!77??JJ5Y?!~!!!7!:::        \n" +
                "              ^~!!!!777??JY55Y?!~!!!777^:::       \n" +
                "            :~~!!!!7???JY55J7!!!!!!7??7^::::      \n" +
                "          :^~!!!7????JJYYJ7!777!!777?7!^^::::     \n" +
                "         ^!!77???YJJJJ??7!!777!777????!^^::::     \n" +
                "         ~77?????77777!!7??!!7?????JJ?~^:::::     \n" +
                "       ::^!7777???7777???777?JJJJJJJ?!^^:::::     \n" +
                "      :::^~!77????7??????????JJJJJ?7!~^^::::      \n" +
                "       :::^~!77??777?77???J?JJJJ?7!!~^^::::       \n" +
                "        :::^^~~!7777??????????77!~~~^^:::::       \n" +
                "                                                  \n");
        System.out.println("                .:              .                 \n" +
                "                 .:           .:.                 \n" +
                "                  .:         .:                   \n" +
                "                   .:       ::                    \n" +
                "                    ::     ^.                     \n" +
                "                     ^    ^.  .                   \n" +
                "                     :.  ^:  ^.                   \n" +
                "                :.   ^~^~^  ::                    \n" +
                "                .:..!P57GP!^^                     \n" +
                "                  ^YGG?^JGB5.                     \n" +
                "                  !GY??!??PG^                     \n" +
                "               .:~JPBP5PPGBG5~~^.                 \n" +
                "            .:~~^!GPBBBB##BPP:.:~~::.:..          \n" +
                "       ..:..:^.  ~GPB&&#&&BGG?~                   \n" +
                "       ..      ^:7PGG##&&#BGG55:                  \n" +
                "              7JJYPPG###&#GPG!Y.                  \n" +
                "             .J: 7G5GB#&#BGPG?J.                  \n" +
                "             .Y. !P5PGB##BGPPJ?                   \n" +
                "             :J. :PP55GBBBPPPP!                   \n" +
                "             ^Y.  ?GP5PGBGGG?~~                   \n" +
                "            .^^   .?PPPGGGGJ. ^.                  \n" +
                "           .:.    :~J5PGGPJ~:..^:                 \n" +
                "          ::     ... ^7!?^ ...  :.                \n" +
                "         .:                                       \n" +
                "                                                  \n");
        input = menu(new String[]{"Tirachinas","Cucaracha","Chicle"});
        //Tirachinas
        if (input == 0){
            log("Bart","Toma esto!!","blanco");
            logr("???","AY, ESO HA DOLIDO!!","morado");
            System.out.println("Apu se lanza al ataque y consigue golpear al malechor");
            System.out.println("Ambos estan encima del malechor golpeandole");
            System.out.println("La policia llega");
            log("Eddie","OYE OYE OYE, que esta pasando aqui","azul");
            agente();
        }//Cucaracha
        else if (input == 1) {
            log("Bart","Toma esto","blanco");
            System.out.println("Bart le tira la cucaracha");
            logr("???","AAAAAAAAAAAAAAA","rojo");
            logr("???","QUE ASCO ME DAN LAS CUCARACHAAAAAAS","rojo");
            log("Apu","Toma eso malechor","morado");
            System.out.println("El malechor se desmaya");
            agente();
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
            System.out.println("Bart muere");
            System.out.println("Quieres reintentarlo?");
            input = menu(new String[]{"Si","No"});
            if (input == 0){
                dead("bart");
            }else{
                System.out.println("Gracias por jugar");
            }
        }
    }

    //Este es uno de los finales al cual puedes llegar desde diferentes sitios entoces lo guardamo dentro de una funcion
    static void agente() throws InterruptedException{
        int input;
        logr("Apu","Señor agente estaban intentando secuestrar a bart y conseguimos detenerle","morado");
        logr("Bart","Eso es cierto agente","blanco");
        System.out.println("El agente se lleva detenido al malechor");
        log("Eddie","Lo siento chicos pero os teneis que venir conmigo a declarar","azul");
        System.out.println("Finale bueno");
        System.out.println("Bart sobrevive y se pierde el examen");
        System.out.println("Quieres volver a jugar");
        input = menu(new String[]{"Si","No"});
        if (input == 0){
            dead("bart");
        }else{
            System.out.println("Gracias por jugar");
        }
    }

    //Creo una region para organizar el codigo
    //region menus, nubes y validaciones

    //Funcion de muerte simplemente para hacer un reinicio de partida
    static void dead(String personaje) throws InterruptedException {
        if (personaje.equalsIgnoreCase("bart")){
            bart();
        } else if (personaje.equalsIgnoreCase("maggie")) {
            maggie();
        }else if(personaje.equalsIgnoreCase("hommer")){
            homer();
        }
    }

    static void log(String personaje, String texto, String color) throws InterruptedException {
        //6 letras maximo el personaje
        System.out.print(colores.get(color));
        System.out.println("       ︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵");
        System.out.println("      (                              )");

        //El maximo de letras antes de que el bocadillo quede feo son 26
        //Entonces si ya es 26 lo imprimos tal cual
        if (texto.length() == 26){
            System.out.println("      (  "+texto+"  )");
        }else{
            //Si no es 26 pues calculamos el numero de filas que necesitamos
            int numeroDeFilas = texto.length()/26;
            numeroDeFilas += 1 ;
            for (int i = 1; i <= numeroDeFilas; i++) {
                //Llamamos a la funcion devolucion que nos cortara o añadira espacios a las frases para que encajen perfectamente en el bocadillo
                String textoParaEscribir = devolucion(texto,(i-1)*26,i*26);
                System.out.println("      (  " + textoParaEscribir + "  )");
            }
        }

        System.out.println(returnMenu(personaje,5)+"<:                              )");
        System.out.println("       ︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶");
        //Reiniciamos color
        System.out.print(colores.get("reset"));
        //Le metemos un delay
        TimeUnit.SECONDS.sleep(espera);
    }

    //La idea en un princpio era pasar como un parametro opcional cualquier cosa y si ese parametro se cumple pues imprimir :> en vez de <: pero al parecer en java
    //No se pueden pasar parametros opcionales si no que tienes que crear la misma funcion pero con un parametro extra pues directamente creo una nueva porque
    //Solo hay una variacion de la funcion si hubiese mas de una lo suyo seria utilizar la misma funcion con parametros extra pero al solo haber una variazion creamos una nueva

    //Es la misma funcion que arriba pero cambiando <: por :> al final del bocadillo
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
        TimeUnit.SECONDS.sleep(espera);
    }

    static String devolucion(String texto, int x, int y){
        String sub = "";

        //en la ultima fila puede darse el caso que y sea mayor que el string porque le añadimos 26 siempre en el bucle
        if (y <= texto.length()) {
            sub = texto.substring(x, y);
        }else{
            sub = texto.substring(x, texto.length());
        }

        //si empieza por espacio una linea la cortamos para quitarle el espacio
        if (sub.startsWith(" ")){
            sub = sub.substring(1);
        }

        //para que la ultima linea no se vea fea le añadimos espacios al string hasta que que consiga 26
        while (sub.length() < 26){
            sub = sub + " ";
        }
        return sub;
    }

    //Funcion que imprime un menu y contiene un par de validaciones
    static int menu(String[] opciones){
        String input = "";//Lo que salga del lector lo guardamos aqui
        boolean askedOnce = false;//Para saber si ya hemos preguntado una vez y saltar el mensaje de error
        int x = -1;//Si se puede convertir a numero el input lo guardaremos aqui
        do {
            //Simplemente imprimimos el menu bonito
            if (askedOnce){
                System.out.println("Eso no es una respuesta válida");
            }
            System.out.println(".  ....................  .");
            System.out.println("."+colores.get("azul")+"    Elige una opción    "+colores.get("reset")+".");
            System.out.println(".  ....................  .");
            for (int i = 0; i < opciones.length; i++) {
                //Luego por cada string del array como parametro lo metemos en la funcion returnMenu que nos añadira espacios hasta el segundo parametro que le hemos pasado
                System.out.println(".  "+(i+1)+". "+returnMenu(opciones[i],17)+"  .");
            }
            System.out.println(".  ....................  .");

            //Una vez impreso tenemos que convertir el array a minusculas porque el indexOf es sensible a las minusuclas y masyusculas
            for (int i = 0; i < opciones.length; i++) {
               opciones[i] = opciones[i].toLowerCase();
            }

            input = lector.nextLine();
            //Si se puede convertir a numero
            if (tryParseInt(input)){
                //Lo convertimos y le restamos 1 por que por ejemplo si la opcion es la segunda en el index del array es la primera
                x = Integer.parseInt(input);
                x -= 1;
            }else{
                //Si no es numero lo convertimos a minusuclas por el indexOf
                input.toLowerCase();
            }
            //Ya hemos preguntado una vez asique a partir de aqui cada vez que preguntemos es porque el usuario no ha metido una respuesta correcta
            //y le saltamos el mensajito al principio
            askedOnce = true;
            //Si el index no existe ni como numero ni como string pues preguntamos otra vez
        }while(!Arrays.asList(opciones).contains(input)&&!indexExists(opciones,x));

        //Devolvemos su index por lo que al hacer los if hay que tener en cuenta que la primera opcion es 0 la segunda 1 y asi sucesivamente
        //Si quisiesemos que devolviese 1 en vez de 0 en la primera opcion por ejemplo pues simplemente Arrays.asList(opciones).indexOf(opciones[x])+1
        //Pero como nos da igual lo dejamos asi
        if (indexExists(opciones,x)){
            return Arrays.asList(opciones).indexOf(opciones[x]);
        }else {
            return Arrays.asList(opciones).indexOf(input);
        }
    }

    //Funcion para intentar convertir a numero el string que pasemos como parametro porque no existe el tryParseInt en java
    //Si se puede deolvemos true si no false
    public static boolean tryParseInt(String value){
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException a) {
            return false;
        }
    }

    //Funcion para comprobar si existe el index del segundo parametro dentro del array del primeer parametro
    static boolean indexExists(String[] opciones,int index){
        //Si es mayor o igual que la longitud del array o es menor que 0 es imposible que exista por lo que devolvemos false
        if (index >= opciones.length || index < 0){
            return false;
        }else{
            return true;
        }
    }

    //Funcion que retorna el texto de una manera que quede bonito en el menu
    static String returnMenu(String texto, int longitud){
        //si ya es igual de largo que el seugndo parametro lo deolvemos sin modificar
        if (texto.length() == longitud){
            return texto;
        }else if(texto.length() < longitud){
            //Si es menor que la longitud deseada le añadimos espacios hasta que lo sea para que el menu no salga raro
            while (texto.length() != longitud){
                texto = texto+" ";
            }
            return texto;
        }else{
            //Si es mas largo que la longitud deseada devolvemos mensaje
            return "Muy largo";
        }
    }
    //endregion
    //Cerramos region
}
