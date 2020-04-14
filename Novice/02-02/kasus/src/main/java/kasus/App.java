/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kasus;
import java.util.Scanner;
import kasus.ClassesAndObject.nestedclasses.*;
import kasus.ClassesAndObject.BicycleMain;
import kasus.ClassesAndObject.ShadowTest;
import kasus.ClassesAndObject.card.*;

public class App {

    public Integer tambah(Integer a, Integer b){
        return a+b;
    }
    public static void mainMenu(){
        int pilihan;
        int exit = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("---------------");
            System.out.println("latihan 2 minggu kedua hari ke 2");
            System.out.println("---------------");
            System.out.println("Silhakan pilih program yang akan dijalankan");
            System.out.println("[1] Classes and Object(Bicycle)");
            System.out.println("[2] Classes and Object(card)");
            System.out.println("[3] Nested Classes(Shadow Test)");
            System.out.println("[4] Nested classes(Data Structure)");
            pilihan = scan.nextInt();
                if(pilihan < 1 | pilihan > 4){
                    System.out.println("Tolong masukkan angka yang sesuai");
                }else{
                    switch(pilihan){
                    case 1:
                            BicycleMain o1 = new BicycleMain();
                            o1.menu();
                            exit = 1;
                        break;
                    case 2:
                            DisplayDeck o2 =new DisplayDeck();
                            o2.menu();
                            exit = 1;
                        break;
                    case 3:
                            ShadowTest o3 =new ShadowTest();
                            o3.menu();
                            exit = 1;
                        break;
                    case 4:
                            System.out.println("Nested Classes");
                            exit = 1;
                    default:
                            System.out.println("Angka yang Anda masukkan tidak valid");
                            mainMenu();
                    break;
                    }
                }
            }while(exit == 0);
        }
    
    


    public static void main(String[] args) {
        App.mainMenu();
    }
}
