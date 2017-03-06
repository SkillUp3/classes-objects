/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

import java.util.Scanner;

/**
 *
 * @author ian
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Car porsche = new Car(4, "carrera", "manual", "red");
//        System.out.println(porsche.getmWheels());
//        System.out.println(porsche.getmModel());
//        System.out.println(porsche.getmTransmission());
//        
//        Car toyota = new Car(4, "vios");
//        toyota.setmTransmission("manual");
//                System.out.println(toyota.getmTransmission());

//        int randomNumber = (int) (Math.random() * 10);
//        do {
//
//            System.out.println(randomNumber);
//            randomNumber = (int) (Math.random() * 10);
//        } while (randomNumber != 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entter your name");
        String name = scanner.nextLine();
        int value = scanner.nextInt();
        System.out.println("Hi "+ name);

    }

}
