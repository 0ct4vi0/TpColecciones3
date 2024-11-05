package org.example;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        menu();

    }

    public static  void  menu() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Long> Agenda = new HashMap<String, Long>();
        System.out.println("---------MENU-----------");
        System.out.println("Que desea realiza:" + "\n"
                + "1)Cargar Datos en la Agenda." + "\n"
                + "2)Buscar Telefono por Nombre." + "\n"
                + "3)Lista Agenda.");

        int opcion = sc.nextInt();
        sc.nextLine();
//        if (opcion != 1 || opcion != 2 || opcion != 3) {
//            System.out.println("tiene que ingresar una de las opciones");
         switch (opcion){
             case 1:
                System.out.println("-------------------------------");
                System.out.println("ingrese  su nombre completo: ");
                String nombre = sc.nextLine();
                sc.nextLine();
                System.out.println("ingrese su numero telefonico");
                long numTel = sc.nextLong();
                Agenda.put(nombre, numTel);

             case 2:
                 break;
             case 3:
                 break;
             default:
                 System.out.println("datos ingresados invalidos, ingrese una de esas opciones");
                 menu();
                 System.out.println();
        }
    }
}

