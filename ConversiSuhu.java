
package conversisuhu;

import java.util.Scanner;
/**
 *
 * @author Kristina 20103239
 */
public class ConversiSuhu {
    static double SuhuAwal;
    
    public static void main(String[] args) {
        String k ="Program Konversi Suhu[y/n]:";
        Celcius fromCelcius = new Celcius();
        Farenheit fromFarenheit = new Farenheit();
        Reamur fromReamur = new Reamur();
        Kelvin fromKelvin = new Kelvin();
        
        double Farenheit,Celcius,Kelvin,Reamur;
        boolean valid=false;
        
    Scanner input = new Scanner(System.in);
    System.out.println("SELAMAT DATANG DI PROGRAM KONVERSI SUHU  ");
    System.out.println("----------------------------------------");
    System.out.print("\n");
    System.out.print(k);
    
    String ans= input.next();
    while(ans.equals("y"))
    {
        System.out.print("\n");
        System.out.println("Suhu yang dipilih akan dikonversi menjadi 3 suhu lainnya");
        System.out.print("\n");
        System.out.println("Pilih Jenis Suhu Saat Ini Untuk di Konversi");
        System.out.println("[1]. Celcius [2]. Fahrenheit  [3]. Kelvin  [4]. Reamur");
        System.out.println("\n");
        
        int suhu = input.nextInt();
        System.out.print("Masukkan nilai suhu awal :");
        SuhuAwal=input.nextDouble();
        switch(suhu){
            case 1:
                Farenheit = fromCelcius.toFarenheit();
                Reamur = fromCelcius.toReamur();
                Kelvin = fromCelcius.toKelvin();
                System.out.println("Suhu awal ="+SuhuAwal+" Celcius\n\nHasil:");
                System.out.println("Farenheit : "+Farenheit);
                System.out.println ("Reamur : "+Reamur);
                System.out.println("Kelvin :"+Kelvin);
                valid=true;
                break;
            case 2:
                Celcius = fromFarenheit.toCelcius();
                Reamur = fromFarenheit.toReamur();
                Kelvin = fromFarenheit.toKelvin();
                System.out.println("Suhu awal ="+SuhuAwal+" Farenheit\n\nHasil:");
                System.out.println("Celcius : "+Celcius);
                System.out.println("Reamur :"+Reamur);
                System.out.println("Kelvin :"+Kelvin);
                valid=true;
                break;
            case 3:
                Celcius = fromKelvin.toCelcius();
                Reamur = fromKelvin.toReamur();
                Farenheit = fromKelvin.toFahrenheit();
                System.out.println("Suhu awal ="+SuhuAwal+" Kelvin\n\nHasil:");
                System.out.println("Celcius : "+Celcius);
                System.out.println("Fahrenheit : "+Farenheit);
                System.out.println("Reamur : "+Reamur);
                valid=true;
                break;
            case 4:
                  Celcius = fromReamur.toCelcius();
                  Farenheit = fromReamur.toFahrenheit();
                  Kelvin = fromReamur.toKelvin();
                  System.out.println("Suhu awal ="+SuhuAwal+" Reamur\n\nHasil:");
                  System.out.println("Celcius : "+Celcius);
                  System.out.println("Fahrenheit : "+Farenheit);
                  System.out.println("Kelvin : "+Kelvin);
                  valid=true;   
            default :
                System.out.println("\n");
                System.out.println("Pilih Suhu yang akan dikonversi dengan benar");
                }
            System.out.print("\n");
            System.out.print("Ingin Lanjut?\t"+k);
            ans = input.next();
            } 
        if(ans.equals("n")){
        System.out.println("\nProgram Selesai");
        }
    }   
}
