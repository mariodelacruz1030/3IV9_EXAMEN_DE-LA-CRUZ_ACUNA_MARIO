import java.util.*;

public class pokemon{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        double vida1 = 30, vida2 = 30, vida3 = 30;
        int energia1 = 15, energia2 = 12, energia3 = 15;
        int num1 = 0, num2 = 0;
        int bat1 = 0, bat2 = 0;
        int turno=0;
        //ATRIBUTOS SEGUN EL NUMERO ID
        int fuerza1 = 6, defensa1 = 4;
        int fuerza2 = 3, defensa2 = 7;
        int fuerza3 = 5, defensa3 = 3;
        //ATRIBUTOS SEGUN EL NUMERO ID
        boolean s1 = false, s2 = false, s3 = false, s4 = false;
        String texto = "";

        System.out.println("============================");
        System.out.println("BIENVENIDO A POKEMON");
        System.out.println("============================");
        System.out.println();
        System.out.println("=====================================");
        System.out.println(" 3IV9  DE LA CRUZ ACUÑA MARIO RICARDO");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("EXISTEN TRES POKEMONES");
        System.out.println("1.- CHARMANDER");
        System.out.println("2.- BULBASOR");
        System.out.println("3.- SQUARTL");
        System.out.println("**RECUERDA BIEN SUS NUMEROS**");
        System.out.println("CON ELLOS IDENTIFICARAS AL POKEMON");
        System.out.println();

        do{
            System.out.println("Dime que deseas hacer: ");
            System.out.println("1. Mirar pokedex");
            System.out.println("2. BATALLA!!!");
            System.out.println("3. CERRAR");
            System.out.println();
            num1 = sc.nextInt();
            System.out.println();

            switch (num1) {
                case 1:
                //POKEDEX
                System.out.println("============================");
                System.out.println("BIENVENIDO A LA POKEDEX");
                System.out.println("============================");

                do{
                    System.out.println();
                    System.out.println("¿A que pokemon deseas consultar?");
                    System.out.println("1.- CHARMANDER");
                    System.out.println("2.- BULBASOR");
                    System.out.println("3.- SQUARTL");
                    System.out.println("4. MENU PRINCIPAL");
                    System.out.println("5. CERRAR");
                    System.out.println();
                    num2 = sc.nextInt();
                    System.out.println();
                    System.out.println();

                    switch (num2){

                    case 1:
                    
                        System.out.println("============================");
                        System.out.println("CHARMANDER");
                        System.out.println("============================");
                        System.out.println();
                        System.out.println("ID:  1");
                        System.out.println("ENERGIA:  15");
                        energia1 = 15;
                        System.out.println("FUERZA:  6");
                        fuerza1 = 6;
                        System.out.println("DEFENSA: 4");
                        defensa1 = 4;
                        System.out.println("VIDA:  30");
                        vida1 = 20;
                        System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 1 (CADA 3 TURNOS)");
                        System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                        System.out.println();
                        System.out.println("ESCRIBE 'P' PARA CONSULTAR OTRO POKEMON");
                        System.out.println("ESCRIBE 'M' PARA VOLVER AL MENU PRINCIPAL");
                        System.out.println("ESCRIBE 'C' PARA CERRAR EL PROGRAMA");
                        System.out.println();
                        do{
                        texto = sc1.nextLine();
                        System.out.println();

                        if(texto.equalsIgnoreCase("M") || texto.equalsIgnoreCase("m")){
                            s2 = true;
                            s1 = false;
                            s3= true;
                        }else{
                            if(texto.equalsIgnoreCase("P") || texto.equalsIgnoreCase("p")){
                                s2= false;
                                s1= false;
                                s3=true;
                            }else{
                                if(texto.equalsIgnoreCase("C") || texto.equalsIgnoreCase("c")){
                                        s2= true;
                                        s1 = true;
                                        s3=true;
                                        
                                        System.out.println();
                                        System.out.println("============================");
                                        System.out.println("PROGRAMA FINALIZADO");
                                        System.out.println("============================");
                                        System.out.println();
                                }else{
                                    System.out.println();
                                    System.out.println("Esa opcion no existe ingresala de nuevo");
                                    System.out.println();
                                    s3=false;
                                }
                            }
                        }
                    }while(s3 == false);

                    break;

                    case 2:
                    System.out.println("============================");
                    System.out.println("BULBASOR");
                    System.out.println("============================");
                    System.out.println();
                    System.out.println("ID:  2");
                    System.out.println("ENERGIA:  12");
                    energia2 = 12;
                    System.out.println("FUERZA:  3");
                    fuerza2 = 3;
                    System.out.println("DEFENSA: 7");
                    defensa2 = 7;
                    System.out.println("VIDA:  30");
                    vida2 = 20;
                    System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 3 (CADA 3 TURNOS)");
                    System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                    System.out.println();
                    System.out.println("ESCRIBE 'P' PARA CONSULTAR OTRO POKEMON");
                    System.out.println("ESCRIBE 'M' PARA VOLVER AL MENU PRINCIPAL");
                    System.out.println("ESCRIBE 'C' PARA CERRAR EL PROGRAMA");
                    System.out.println();
                    do{
                    texto = sc1.nextLine();
                    System.out.println();

                        if(texto.equalsIgnoreCase("M") || texto.equalsIgnoreCase("m")){
                            s2 = true;
                            s1 = false;
                            s3= true;
                        }else{
                            if(texto.equalsIgnoreCase("P") || texto.equalsIgnoreCase("p")){
                                s2= false;
                                s1= false;
                                s3=true;
                            }else{
                                if(texto.equalsIgnoreCase("C") || texto.equalsIgnoreCase("c")){
                                        s2= true;
                                        s1 = true;
                                        s3=true;
                                        
                                        System.out.println();
                                        System.out.println("============================");
                                        System.out.println("PROGRAMA FINALIZADO");
                                        System.out.println("============================");
                                        System.out.println();
                                }else{
                                    System.out.println();
                                    System.out.println("Esa opcion no existe ingresala de nuevo");
                                    System.out.println();
                                    s3=false;
                                }
                            }
                        }
                    }while(s3 == false);

                    break;

                    case 3:
                    System.out.println("============================");
                    System.out.println("SQUARTLE");
                    System.out.println("============================");
                    System.out.println();
                    System.out.println("ID:  3");
                    System.out.println("ENERGIA:  15");
                    energia3 = 15;
                    System.out.println("FUERZA:  5");
                    fuerza3 = 5;
                    System.out.println("DEFENSA: 3");
                    defensa3 = 3;
                    System.out.println("VIDA:  30");
                    vida3 = 20;
                    System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 3 (CADA 3 TURNOS)");
                    System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                    System.out.println();
                    System.out.println("ESCRIBE 'P' PARA CONSULTAR OTRO POKEMON");
                    System.out.println("ESCRIBE 'M' PARA VOLVER AL MENU PRINCIPAL");
                    System.out.println("ESCRIBE 'C' PARA CERRAR EL PROGRAMA");
                    System.out.println();
                    do{
                    texto = sc1.nextLine();
                    System.out.println();

                        if(texto.equalsIgnoreCase("M") || texto.equalsIgnoreCase("m")){
                            s2 = true;
                            s1 = false;
                            s3= true;
                        }else{
                            if(texto.equalsIgnoreCase("P") || texto.equalsIgnoreCase("p")){
                                s2= false;
                                s1= false;
                                s3=true;
                            }else{
                                if(texto.equalsIgnoreCase("C") || texto.equalsIgnoreCase("c")){
                                        s2= true;
                                        s1 = true;
                                        s3=true;
                                        
                                        System.out.println();
                                        System.out.println("============================");
                                        System.out.println("PROGRAMA FINALIZADO");
                                        System.out.println("============================");
                                        System.out.println();
                                }else{
                                    System.out.println();
                                    System.out.println("Esa opcion no existe ingresala de nuevo");
                                    System.out.println();
                                    s3=false;
                                }
                            }
                        }
                    }while(s3 == false);

                    break;

                    case 4:
                        s2=true;
                        s1=false;
                    break;

                    case 5:
                        s1=true;
                        s2=true;
                        System.out.println();
                        System.out.println("============================");
                        System.out.println("PROGRAMA FINALIZADO");
                        System.out.println("============================");
                        System.out.println();
                    break;

                    default:
                    System.out.println();
                    System.out.println("Esa opcion no existe ingresala de nuevo");
                    System.out.println();
                        s2=false;
                    break;

                }
                }while(s2 == false);
                
    
                    break;

                case 2:
                //BATALLA

                
                        System.out.println("************************");
                        System.out.println("!!!!    BATALLA     !!!!");
                        System.out.println("************************");
                    do{
                        do{
                        System.out.println();
                        System.out.println();
                        System.out.println("Elige a tu primer pokemon");
                                System.out.println("1.- CHARMANDER");
                                System.out.println("2.- BULBASOR");
                                System.out.println("3.- SQUARTL");
                                System.out.println();

                            bat1 = sc.nextInt();

                            if(bat1 == 1 || bat1 == 2 || bat1 == 3){
                                s3 = true;
                            }else{
                                System.out.println();
                                System.out.println("Esa opcion no existe ingresala de nuevo");
                                System.out.println();
                                s3=false;
                            }
                        }while(s3 == false);
                        s3=true;
                        do{
                            System.out.println();
                            System.out.println("Elige a tu segundo pokemon");
                                    System.out.println("1.- CHARMANDER");
                                    System.out.println("2.- BULBASOR");
                                    System.out.println("3.- SQUARTL");
                                    System.out.println();
    
                                bat2 = sc.nextInt();
    
                                if(bat1 == bat2){
                                    System.out.println("No pueden pelear entre pokemones iguales, ingresa otra opcion");
                                    System.out.println();

                                    s3=false;
                                }else{
                                        if(bat2 == 1 || bat2 == 2 || bat2 == 3){
                                            s3 = true;
                                        }else{
                                            System.out.println();
                                            System.out.println("Esa opcion no existe ingresala de nuevo");
                                            System.out.println();
                                            s3=false;
                                        }
                                }
                            }while(s3 == false);

                            System.out.println();
                            System.out.println("************************************");
                            System.out.println(" EL POKEMON 1 SIEMPRE ATACA PRIMERO");
                            System.out.println("************************************");
                            System.out.println();
                            System.out.println();

                            pokemones:

                            System.out.println("***********************************");
                            System.out.println("LOS POKEMONES QUE VAN A PELEAR SON:");
                            System.out.println("***********************************");
                            System.out.println();
                            System.out.println();

                                System.out.println("=========");
                                System.out.println("POKEMON 1");
                                System.out.println("=========");
                                if(bat1 == 1){
                                    System.out.println("CHARMANDER");
                                    System.out.println("ENERGIA:  15");
                                    System.out.println("FUERZA:  6");
                                    System.out.println("DEFENSA: 4");
                                    System.out.println("VIDA:  30");
                                    System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 1 (CADA 3 TURNOS)");
                                    System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                                } else{
                                    if(bat1 == 2){
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  12");
                                        System.out.println("FUERZA:  3");
                                        System.out.println("DEFENSA: 7");
                                        System.out.println("VIDA:  30");
                                        System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 3 (CADA 3 TURNOS)");
                                        System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                                    }else{
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  15");
                                        System.out.println("FUERZA:  5");
                                        System.out.println("DEFENSA: 3");
                                        System.out.println("VIDA:  30");
                                        System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 3 (CADA 3 TURNOS)");
                                        System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                                    }
                                }

                                System.out.println("=========");
                                System.out.println("POKEMON 2");
                                System.out.println("=========");
                                if(bat2 == 1){
                                    System.out.println("CHARMANDER");
                                    System.out.println("ENERGIA:  15");
                                    System.out.println("FUERZA:  6");
                                    System.out.println("DEFENSA: 4");
                                    System.out.println("VIDA:  30");
                                    System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 1 (CADA 3 TURNOS)");
                                    System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                                } else{
                                    if(bat2 == 2){
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  12");
                                        System.out.println("FUERZA:  3");
                                        System.out.println("DEFENSA: 7");
                                        System.out.println("VIDA:  30");
                                        System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 3 (CADA 3 TURNOS)");
                                        System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                                    }else{
                                        
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  15");
                                        System.out.println("FUERZA:  5");
                                        System.out.println("DEFENSA: 3");
                                        System.out.println("VIDA:  30");
                                        System.out.println("ATAQUE PRINCIPAL:  VALOR DE FUERZA + 3 (CADA 3 TURNOS)");
                                        System.out.println("ATAQUE SECUNDARIO:  VALOR DE FUERZA");
                                    }
                                }
                                //AQUI IGUALO LA SALIDA 3 CON FALSO PARA  EVITAR ERRORES
                                s3=false;
                                System.out.println();
                                System.out.println();


                            if(bat1 == 1 && bat2 == 2){

                                System.out.println("====================");
                                System.out.println("CHARMANDER ATACA !!!");
                                System.out.println("====================");
                                System.out.println();

                                energia1--;
                                vida2 = vida2 - ((fuerza1*defensa2)/3);
                                turno++;
                                System.out.println("BULBASOR");
                                System.out.println("ENERGIA:  "+energia2);
                                System.out.println("FUERZA:  "+fuerza2);
                                System.out.println("DEFENSA: "+defensa2);
                                System.out.println("VIDA:  "+vida2);
                                System.out.println();
                                System.out.println("====================");
                                System.out.println("  BULBASOR ATACA !!!");
                                System.out.println("====================");
                                System.out.println();


                                energia2--;
                                vida1 = vida1 - ((fuerza2*defensa1)/3);
                                turno++;
                                System.out.println("CHARMANDER");
                                System.out.println("ENERGIA:  "+energia1);
                                System.out.println("FUERZA:  "+fuerza1);
                                System.out.println("DEFENSA: "+defensa1);
                                System.out.println("VIDA:  "+vida1);
                                System.out.println();

                                //ENTRA UN CICLO DESPUES DE LOS PRIMEROS GOLPES HASTA QUE UNO GANE
                                do{

                                    //CUANDO SEA EL TERCER TURNO HARA UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia1--;
                                        vida2 = vida2 - (((fuerza1+1)*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);
                                        System.out.println();

                                    }else{
                                        energia1--;
                                        vida2 = vida2 - ((fuerza1*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);
                                        System.out.println();

                                    }
                                    //SI EL TURNO LLEGA A 3 HACE UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia2--;
                                        vida1 = vida1 - (((fuerza2+3)*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);

                                        System.out.println();

                                    }else{
                                        energia2--;
                                        vida1 = vida1 - ((fuerza2*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);
                                        System.out.println();

                                    }
                                    //CUANDO UNO DE LOS DOS SE QUEDE SIN VIDA SALDRA ESTO
                                    if(vida1<=0 || vida2<=0){
                                        if(vida1<=0){
                                            System.out.println("=========================");
                                            System.out.println("CHARMANDER ESTA CANSADO!!");
                                            System.out.println("=========================");
                                            System.out.println("    BULBASOR GANA   !!!!!");
                                            System.out.println("=========================");
                                            s3=true;
                                        }else{ 
                                            if(vida2<=0){
                                            System.out.println("=======================");
                                            System.out.println("BULBASOR ESTA CANSADO!!");
                                            System.out.println("=======================");
                                            System.out.println("   CHARMANDER GANA !!!!");
                                            System.out.println("=======================");
                                            s3=true;
                                            }
                                        }
                                    }

                                }while(s3 == false);
                            }
                            //Se reinician las vidas para poder luchar de nuevo
                            vida1=30;
                            vida2=30;
                            vida3=30;
                            energia1=15;
                            energia2=12;
                            energia3=15;
                            turno=0;
                            s3=false;
                            if(bat1 == 1 && bat2 == 3){

                                System.out.println("====================");
                                System.out.println("CHARMANDER ATACA !!!");
                                System.out.println("====================");
                                System.out.println();

                                energia1--;
                                vida3 = vida3 - ((fuerza1*defensa3)/3);
                                turno++;
                                System.out.println("SQUARTL");
                                System.out.println("ENERGIA:  "+energia3);
                                System.out.println("FUERZA:  "+fuerza3);
                                System.out.println("DEFENSA: "+defensa3);
                                System.out.println("VIDA:  "+vida3);
                                System.out.println();
                                System.out.println("====================");
                                System.out.println("   SQUARTL ATACA !!!");
                                System.out.println("====================");
                                System.out.println();


                                energia3--;
                                vida1 = vida1 - ((fuerza3*defensa1)/3);
                                turno++;
                                System.out.println("CHARMANDER");
                                System.out.println("ENERGIA:  "+energia1);
                                System.out.println("FUERZA:  "+fuerza1);
                                System.out.println("DEFENSA: "+defensa1);
                                System.out.println("VIDA:  "+vida1);
                                System.out.println();

                                //ENTRA UN CICLO DESPUES DE LOS PRIMEROS GOLPES HASTA QUE UNO GANE
                                do{

                                    //CUANDO SEA EL TERCER TURNO HARA UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia1--;
                                        vida3 = vida3 - (((fuerza1+1)*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);
                                        System.out.println();

                                    }else{
                                        energia1--;
                                        vida3 = vida3 - ((fuerza1*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);
                                        System.out.println();

                                    }
                                    //SI EL TURNO LLEGA A 3 HACE UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia3--;
                                        vida1 = vida1 - (((fuerza3+3)*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);

                                        System.out.println();

                                    }else{
                                        energia3--;
                                        vida1 = vida1 - ((fuerza3*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);
                                        System.out.println();

                                    }
                                    //CUANDO UNO DE LOS DOS SE QUEDE SIN VIDA SALDRA ESTO
                                    if(vida1<=0 || vida3<=0){
                                        if(vida1<=0){
                                            System.out.println("=========================");
                                            System.out.println("CHARMANDER ESTA CANSADO!!");
                                            System.out.println("=========================");
                                            System.out.println("    SQUARTLE GANA   !!!!!");
                                            System.out.println("=========================");
                                            s3=true;
                                        }else{ 
                                            if(vida3<=0){
                                            System.out.println("=======================");
                                            System.out.println(" SQUARTL ESTA CANSADO!!");
                                            System.out.println("=======================");
                                            System.out.println("   CHARMANDER GANA !!!!");
                                            System.out.println("=======================");
                                            s3=true;
                                            }
                                        }
                                    }

                                }while(s3 == false);
                            }
                            //Se reinician las vidas para poder luchar de nuevo
                            vida1=30;
                            vida2=30;
                            vida3=30;
                            energia1=15;
                            energia2=12;
                            energia3=15;
                            turno=0;
                            s3=false;
                            if(bat1 == 2 && bat2 == 1){

                                System.out.println("====================");
                                System.out.println("  BULBASOR ATACA !!!");
                                System.out.println("====================");
                                System.out.println();

                                energia2--;
                                vida1 = vida1 - ((fuerza2*defensa1)/3);
                                turno++;
                                System.out.println("CHARMANDER");
                                System.out.println("ENERGIA:  "+energia1);
                                System.out.println("FUERZA:  "+fuerza1);
                                System.out.println("DEFENSA: "+defensa1);
                                System.out.println("VIDA:  "+vida1);
                                System.out.println();
                                System.out.println("====================");
                                System.out.println("CHARMANDER ATACA !!!");
                                System.out.println("====================");
                                System.out.println();


                                energia1--;
                                vida2 = vida2 - ((fuerza1*defensa2)/3);
                                turno++;
                                System.out.println("BULBASOR");
                                System.out.println("ENERGIA:  "+energia2);
                                System.out.println("FUERZA:  "+fuerza2);
                                System.out.println("DEFENSA: "+defensa2);
                                System.out.println("VIDA:  "+vida2);
                                System.out.println();

                                //ENTRA UN CICLO DESPUES DE LOS PRIMEROS GOLPES HASTA QUE UNO GANE
                                do{

                                    //CUANDO SEA EL TERCER TURNO HARA UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia2--;
                                        vida1 = vida1 - (((fuerza2+3)*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);
                                        System.out.println();

                                    }else{
                                        energia2--;
                                        vida1 = vida1 - ((fuerza2*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);
                                        System.out.println();

                                    }
                                    //SI EL TURNO LLEGA A 3 HACE UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia1--;
                                        vida2 = vida2 - (((fuerza1+1)*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);

                                        System.out.println();

                                    }else{
                                        energia1--;
                                        vida2 = vida2 - ((fuerza1*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);
                                        System.out.println();

                                    }
                                    //CUANDO UNO DE LOS DOS SE QUEDE SIN VIDA SALDRA ESTO
                                    if(vida2<=0 || vida1<=0){
                                        if(vida2<=0){
                                            System.out.println("=========================");
                                            System.out.println("  BULBASOR ESTA CANSADO!!");
                                            System.out.println("=========================");
                                            System.out.println("    CHARMANDER GANA   !!!!!");
                                            System.out.println("=========================");
                                            s3=true;
                                        }else{ 
                                            if(vida1<=0){
                                            System.out.println("========================");
                                            System.out.println("CHARMANDER ESTA CANSADO!!");
                                            System.out.println("========================");
                                            System.out.println("     BULBASOR GANA  !!!!");
                                            System.out.println("========================");
                                            s3=true;
                                            }
                                        }
                                    }

                                }while(s3 == false);
                            }
                            //Se reinician las vidas para poder luchar de nuevo
                            vida1=30;
                            vida2=30;
                            vida3=30;
                            energia1=15;
                            energia2=12;
                            energia3=15;
                            turno=0;
                            s3=false;
                            if(bat1 == 2 && bat2 == 3){
                           
                                System.out.println("====================");
                                System.out.println("  BULBASOR ATACA !!!");
                                System.out.println("====================");
                                System.out.println();

                                energia2--;
                                vida3 = vida3 - ((fuerza2*defensa3)/3);
                                turno++;
                                System.out.println("SQUARTL");
                                System.out.println("ENERGIA:  "+energia3);
                                System.out.println("FUERZA:  "+fuerza3);
                                System.out.println("DEFENSA: "+defensa3);
                                System.out.println("VIDA:  "+vida3);
                                System.out.println();
                                System.out.println("====================");
                                System.out.println("   SQUARTL ATACA !!!");
                                System.out.println("====================");
                                System.out.println();


                                energia3--;
                                vida2 = vida2 - ((fuerza3*defensa2)/3);
                                turno++;
                                System.out.println("BULBASOR");
                                System.out.println("ENERGIA:  "+energia2);
                                System.out.println("FUERZA:  "+fuerza2);
                                System.out.println("DEFENSA: "+defensa2);
                                System.out.println("VIDA:  "+vida2);
                                System.out.println();

                                //ENTRA UN CICLO DESPUES DE LOS PRIMEROS GOLPES HASTA QUE UNO GANE
                                do{

                                    //CUANDO SEA EL TERCER TURNO HARA UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia2--;
                                        vida3 = vida3 - (((fuerza2+3)*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);
                                        System.out.println();

                                    }else{
                                        energia2--;
                                        vida3 = vida3 - ((fuerza2*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);
                                        System.out.println();

                                    }
                                    //SI EL TURNO LLEGA A 3 HACE UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia3--;
                                        vida2 = vida2 - (((fuerza3+3)*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);

                                        System.out.println();

                                    }else{
                                        energia3--;
                                        vida2 = vida2 - ((fuerza3*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);
                                        System.out.println();

                                    }
                                    //CUANDO UNO DE LOS DOS SE QUEDE SIN VIDA SALDRA ESTO
                                    if(vida2<=0 || vida3<=0){
                                        if(vida2<=0){
                                            System.out.println("=========================");
                                            System.out.println("  BULBASOR ESTA CANSADO!!");
                                            System.out.println("=========================");
                                            System.out.println("     SQUARTL GANA   !!!!!");
                                            System.out.println("=========================");
                                            s3=true;
                                        }else{ 
                                            if(vida3<=0){
                                            System.out.println("========================");
                                            System.out.println("  SQUARTL ESTA CANSADO!!");
                                            System.out.println("========================");
                                            System.out.println("     BULBASOR GANA  !!!!");
                                            System.out.println("========================");
                                            s3=true;
                                            }
                                        }
                                    }

                                }while(s3 == false);
                            }
                            //Se reinician las vidas para poder luchar de nuevo
                            vida1=30;
                            vida2=30;
                            vida3=30;
                            energia1=15;
                            energia2=12;
                            energia3=15;
                            turno=0;
                            s3=false;
                            if(bat1 == 3 && bat2 == 1){
                           
                                System.out.println("====================");
                                System.out.println("   SQUARTL ATACA !!!");
                                System.out.println("====================");
                                System.out.println();

                                energia3--;
                                vida1 = vida1 - ((fuerza3*defensa1)/3);
                                turno++;
                                System.out.println("CHARMANDER");
                                System.out.println("ENERGIA:  "+energia1);
                                System.out.println("FUERZA:  "+fuerza1);
                                System.out.println("DEFENSA: "+defensa1);
                                System.out.println("VIDA:  "+vida1);
                                System.out.println();
                                System.out.println("====================");
                                System.out.println("CHARMANDER ATACA !!!");
                                System.out.println("====================");
                                System.out.println();


                                energia1--;
                                vida3 = vida3 - ((fuerza1*defensa3)/3);
                                turno++;
                                System.out.println("SQUARTL");
                                System.out.println("ENERGIA:  "+energia3);
                                System.out.println("FUERZA:  "+fuerza3);
                                System.out.println("DEFENSA: "+defensa3);
                                System.out.println("VIDA:  "+vida3);
                                System.out.println();

                                //ENTRA UN CICLO DESPUES DE LOS PRIMEROS GOLPES HASTA QUE UNO GANE
                                do{

                                    //CUANDO SEA EL TERCER TURNO HARA UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia3--;
                                        vida1 = vida1 - (((fuerza3+3)*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);
                                        System.out.println();

                                    }else{
                                        energia3--;
                                        vida1 = vida1 - ((fuerza3*defensa1)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("CHARMANDER");
                                        System.out.println("ENERGIA:  "+energia1);
                                        System.out.println("FUERZA:  "+fuerza1);
                                        System.out.println("DEFENSA: "+defensa1);
                                        System.out.println("VIDA:  "+vida1);
                                        System.out.println();

                                    }
                                    //SI EL TURNO LLEGA A 3 HACE UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia1--;
                                        vida3 = vida3 - (((fuerza1+1)*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);

                                        System.out.println();

                                    }else{
                                        energia1--;
                                        vida3 = vida3 - ((fuerza1*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("CHARMANDER ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);
                                        System.out.println();

                                    }
                                    //CUANDO UNO DE LOS DOS SE QUEDE SIN VIDA SALDRA ESTO
                                    if(vida3<=0 || vida1<=0){
                                        if(vida3<=0){
                                            System.out.println("=========================");
                                            System.out.println("   SQUARTL ESTA CANSADO!!");
                                            System.out.println("=========================");
                                            System.out.println("    CHARMANDER GANA   !!!!!");
                                            System.out.println("=========================");
                                            s3=true;
                                        }else{ 
                                            if(vida1<=0){
                                            System.out.println("=========================");
                                            System.out.println("CHARMANDER ESTA CANSADO!!");
                                            System.out.println("=========================");
                                            System.out.println("      SQUARTL GANA  !!!!");
                                            System.out.println("=========================");
                                            s3=true;
                                            }
                                        }
                                    }

                                }while(s3 == false);
                            }
                            //Se reinician las vidas para poder luchar de nuevo
                            vida1=30;
                            vida2=30;
                            vida3=30;
                            energia1=15;
                            energia2=12;
                            energia3=15;
                            turno=0;
                            s3=false;
                            if(bat1 == 3 && bat2 == 2){
                           
                                System.out.println("====================");
                                System.out.println("   SQUARTL ATACA !!!");
                                System.out.println("====================");
                                System.out.println();

                                energia3--;
                                vida2 = vida2 - ((fuerza3*defensa2)/3);
                                turno++;
                                System.out.println("BULBASOR");
                                System.out.println("ENERGIA:  "+energia2);
                                System.out.println("FUERZA:  "+fuerza2);
                                System.out.println("DEFENSA: "+defensa2);
                                System.out.println("VIDA:  "+vida2);
                                System.out.println();
                                System.out.println("====================");
                                System.out.println("  BULBASOR ATACA !!!");
                                System.out.println("====================");
                                System.out.println();


                                energia2--;
                                vida3 = vida3 - ((fuerza2*defensa3)/3);
                                turno++;
                                System.out.println("SQUARTL");
                                System.out.println("ENERGIA:  "+energia3);
                                System.out.println("FUERZA:  "+fuerza3);
                                System.out.println("DEFENSA: "+defensa3);
                                System.out.println("VIDA:  "+vida3);
                                System.out.println();

                                //ENTRA UN CICLO DESPUES DE LOS PRIMEROS GOLPES HASTA QUE UNO GANE
                                do{

                                    //CUANDO SEA EL TERCER TURNO HARA UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia3--;
                                        vida2 = vida2 - (((fuerza3+3)*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);
                                        System.out.println();

                                    }else{
                                        energia3--;
                                        vida2 = vida2 - ((fuerza3*defensa2)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("   SQUARTL ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("BULBASOR");
                                        System.out.println("ENERGIA:  "+energia2);
                                        System.out.println("FUERZA:  "+fuerza2);
                                        System.out.println("DEFENSA: "+defensa2);
                                        System.out.println("VIDA:  "+vida2);
                                        System.out.println();

                                    }
                                    //SI EL TURNO LLEGA A 3 HACE UN ATAQUE ESPECIAL
                                    if(turno==3){
                                        energia2--;
                                        vida3 = vida3 - (((fuerza2+3)*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("//////////////////");
                                        System.out.println("ATAQUE ESPECIAL!!!");
                                        System.out.println("//////////////////");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);

                                        System.out.println();

                                    }else{
                                        energia2--;
                                        vida3 = vida3 - ((fuerza2*defensa3)/3);
                                        turno++;
                                        System.out.println("====================");
                                        System.out.println("  BULBASOR ATACA !!!");
                                        System.out.println("====================");
                                        System.out.println();
                                        System.out.println("SQUARTL");
                                        System.out.println("ENERGIA:  "+energia3);
                                        System.out.println("FUERZA:  "+fuerza3);
                                        System.out.println("DEFENSA: "+defensa3);
                                        System.out.println("VIDA:  "+vida3);
                                        System.out.println();

                                    }
                                    //CUANDO UNO DE LOS DOS SE QUEDE SIN VIDA SALDRA ESTO
                                    if(vida2<=0 || vida3<=0){
                                        if(vida2<=0){
                                            System.out.println("=========================");
                                            System.out.println("  BULBASOR ESTA CANSADO!!");
                                            System.out.println("=========================");
                                            System.out.println("     SQUARTL GANA   !!!!!");
                                            System.out.println("=========================");
                                            s3=true;
                                        }else{ 
                                            if(vida3<=0){
                                            System.out.println("========================");
                                            System.out.println("  SQUARTL ESTA CANSADO!!");
                                            System.out.println("========================");
                                            System.out.println("     BULBASOR GANA  !!!!");
                                            System.out.println("========================");
                                            s3=true;
                                            }
                                        }
                                    }

                                }while(s3 == false);
                            }
                            //Se reinician las vidas para poder luchar de nuevo
                            vida1=30;
                            vida2=30;
                            vida3=30;
                            energia1=15;
                            energia2=12;
                            energia3=15;
                            turno=0;
                            s3=false;






                            System.out.println();
                            System.out.println();
                            do{
                            System.out.println();
                            System.out.println("ESCRIBE 'B' PARA OTRA BATALLA");
                            System.out.println("ESCRIBE 'M' PARA VOLVER AL MENU PRINCIPAL");
                            System.out.println("ESCRIBE 'C' PARA CERRAR EL PROGRAMA");
                            System.out.println();

                            texto = sc1.nextLine();
    
                            if(texto.equalsIgnoreCase("M") || texto.equalsIgnoreCase("m")){
                                s2 = true;
                                s1 = false;
                                s3 = true;
                            }else{
                                if(texto.equalsIgnoreCase("B") || texto.equalsIgnoreCase("b")){
                                    s2= false;
                                    s1= false;
                                    s3 = true;
                                }else{
                                    if(texto.equalsIgnoreCase("C") || texto.equalsIgnoreCase("c")){
                                            s2= true;
                                            s1 = true;
                                            s3 = true;
                                            
                                            System.out.println();
                                            System.out.println("============================");
                                            System.out.println("PROGRAMA FINALIZADO");
                                            System.out.println("============================");
                                            System.out.println();
                                    }else{
                                        System.out.println();
                                        System.out.println("Esa opcion no existe ingresala de nuevo");
                                        System.out.println();
                                        s2=false;
                                        s1=false;
                                        s3 = false;
                                    }
                                }
                            }
                          }while(s3 == false);

                        }while(s2 == false);

                break;

                case 3:
                //CERRAR
                s1=true;
                System.out.println();                        
                System.out.println("============================");
                System.out.println("PROGRAMA FINALIZADO");
                System.out.println("============================");
                System.out.println();


                break;
            
                default:
                System.out.println();
                System.out.println("Esa opcion no existe ingresala de nuevo");
                System.out.println();
                s1=false;
                break;

                }
        }while(s1 == false);
    }
}