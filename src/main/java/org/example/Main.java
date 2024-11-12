package org.example;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<>();
        menu(agenda);
    }

//Metodo menu de opciones------------------------------
    public static  void  menu(HashMap<String, Long> agenda) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------MENU-----------");
        System.out.println("""
                        Que desea realiza:
                        1)Cargar Datos en la Agenda.
                        2)Buscar Telefono por Nombre.
                        3)Lista Agenda.
                        4) Salir.""");

        int opcion = sc.nextInt();
        sc.nextLine();

         switch (opcion){
             case 1://cargamos los datos
                 System.out.println("----------------------");
                 System.out.println("ingrese la cantidad de personas ingresar sus datos: ");
                 int cantidad = sc.nextInt();
                 sc.nextLine();
                 for (int i = 0; i < cantidad; i++) {

                     System.out.println("-------------------------------");
                     System.out.println("ingrese  su nombre completo: ");
                     String nombre = sc.nextLine();

                     System.out.println("ingrese su numero telefonico");
                     long numTel = sc.nextLong();
                     sc.nextLine();

                     // envio a validar los datos
                     validarDtos(agenda, nombre, numTel);
                 }
                 System.out.println("---------------------");
                 System.out.println("Volviendo al menu principal");
                 menu(agenda);
             case 2:
                 System.out.println("ingrese el nombre de la persona que desea buscar");
                 String nombre= sc.nextLine();



                 buscarTelefono(agenda);
             case 3: //mostramos la agenda
                 mostrarAgenda(agenda);
                 menu(agenda);
             case 4:
                 System.out.println("--------------------------------");
                 break;
             default:
                 System.out.println("datos ingresados invalidos, ingrese una de esas opciones");
                 menu(agenda);
        }
    }

//metodo de validacion de datos------------------------------
    public static void  validarDtos(HashMap<String, Long> agenda, String nombre, long numTel){
        if (agenda.containsKey(nombre)){
            System.out.println("El nombre "+ nombre+" ya esta registrado");
        } else if (agenda.containsValue(numTel)) {
            System.out.println("El telefono "+ numTel+" ya esta registrado al nombre de : "+nombre );
        }else{
            System.out.println("se registro correctamente");
            agenda.put(nombre, numTel);
        }
    }

    public static void buscarTelefono(HashMap<String, Long> agenda){

    }

//-------Metodo para mostrar la agenda-------------------------
    public static void mostrarAgenda(HashMap<String, Long> agenda) {

//        for (String i : agenda.keySet()) {
//            System.out.println(i);
//        }
//        for (long i : agenda.values()) {
//            System.out.println(i);
//        }

        //Mostramos la agenda
        for (String i : agenda.keySet()) {
            System.out.println("Nombre: " + i + " Telefono: " + agenda.get(i));
        }
    }
}

