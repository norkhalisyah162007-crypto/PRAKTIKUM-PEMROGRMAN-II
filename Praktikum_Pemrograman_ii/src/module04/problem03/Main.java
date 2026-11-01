package module04.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int option = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = input.nextLine();

        System.out.print("Ras: ");
        String breed = input.nextLine();

        if(option == 1){
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();
            System.out.println(" ");
            Cat cat = new Cat(name, breed, furColor);
            cat.displayCatDetails();
        }else if(option == 2){
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            System.out.print("Kemampuan: ");
            String[] abilities = input.nextLine().split(",");
            System.out.println(" ");
            Dog dog = new Dog(name, breed, furColor, abilities);
            dog.displayDogDetails();
        }else{
            return;
        }
    }
}