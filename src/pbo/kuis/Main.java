// Muhammad Raehan Parikesit (123200149)
//Kuis

package pbo.kuis;
import pbo.kuis.AndroDev;
import pbo.kuis.WebDev;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
         try{
        int pilih;
        String nama,nik;
        Scanner input = new Scanner(System.in);
        Scanner inputPil = new Scanner(System.in);
        
        System.out.println("+---------------------------------+");
        System.out.println("|   FORM PENDAFTARAN PT.UDIN      |");
        System.out.println("+---------------------------------+");
        System.out.println("1. Android Devolopment");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis form: ");
        pilih = inputPil.nextInt();
        
        System.out.println("--- FORM PENDAFTARAN ---");
        System.out.print("Input NIK: ");
        nik = input.nextLine();
        System.out.print("Input Nama: ");
        nama = input.nextLine();
        
        System.out.println("\n---Penilaian---");
        if(pilih == 1){
            System.out.print("\nNilai Tes Tulis : ");
            double nilai1= input.nextDouble();
            System.out.print("\nNilai Tes Coding : ");
            double nilai2= input.nextDouble();
            System.out.print("\nNilai Tes Wawancara : ");
            double nilai3 = input.nextDouble();
           AndroDev calon = new AndroDev(nama,nilai1, nilai2, nilai3);
                do {
                 System.out.println("\n --- MENU ---");
                 System.out.println("1. Edit");
                 System.out.println("2. Tampil");
                 System.out.println("3. Exit");
                 System.out.print(" Pilih : ");
                 pilih = inputPil.nextInt();
               if (pilih == 1){
                    System.out.println("\n --- Form Edit ---");
                    System.out.print("\nNilai Tes Tulis : ");
                    calon.setNilai1(input.nextDouble());
                    System.out.print("\nNilai Tes Coding : ");
                    calon.setNilai2(input.nextDouble());
                    System.out.print("\nNilai Tes Wawancara : ");
                    calon.setNilai3(input.nextDouble());
                }
                else if (pilih == 2){
                    System.out.println("Nilai Akhir : " + calon.hitungNilaiAkhir());
                    System.out.println("KETERANGAN  : " + calon.keterangan());
                }                  
                else if (pilih==3) {
                     System.out.println("Terima Kasih!");
                    System.exit(0);
                }else {
                System.out.println("--- Input SALAH ---");
                System.out.println("(Mohon Input Ulang)");
                }
            }while(true);   
        } else if(pilih == 2){
            System.out.print("\nNilai Tes Tulis : ");
            double nilai1= input.nextDouble();
            System.out.print("\nNilai Tes Coding : ");
            double nilai2= input.nextDouble();
            System.out.print("\nNilai Tes Wawancara : ");
            double nilai3 = input.nextDouble();
            WebDev calon = new WebDev(nama, nilai1, nilai2, nilai3);
                do {
                 System.out.println("\n --- MENU ---");
                 System.out.println("1. Edit");
                 System.out.println("2. Tampil");          
                 System.out.println("3. Exit");
                 System.out.print(" Pilih : ");
                 pilih = inputPil.nextInt();
               if (pilih == 1){
                    System.out.println("\n --- Form Edit ---");
                    System.out.print("\nNilai Tes Tulis : ");
                    calon.setNilai1(input.nextDouble());
                    System.out.print("\nNilai Tes Coding : ");
                    calon.setNilai2(input.nextDouble());
                    System.out.print("\nNilai Tes Wawancara : ");
                    calon.setNilai3(input.nextDouble());
                }
                else if (pilih == 2){
                 System.out.println("Nilai Akhir : " + calon.hitungNilaiAkhir());
                 System.out.println("KETERANGAN  : " + calon.keterangan());   
                }                   
                else if (pilih==3) {
                     System.out.println("Terima Kasih!");
                    System.exit(0);
                }else {
                System.out.println("--- Input SALAH ---");
                System.out.println("(Mohon Input Ulang)");
                }
            }while(true); 
        }  
        else{
            System.out.println("--- Input SALAH ---");
            System.out.println("(Mohon Input Ulang)");
        }while(true);
     }
        catch(Exception error){
            System.out.println("Error " + error.getMessage());
        }
     }
}