// ANDI CHUSNUL IDZAH 13020210170


import java.util.Scanner;
    public class Konversi0170 {
        public static void main(String[] args) {
            Scanner pilihan  = new Scanner(System.in);
        float dolar, rupiah, isi;
            System.out.println("Dolar ke Rupiah");
                System.out.print("Berapa dolar yang ingin kamu konversikan : ");
                dolar =   pilihan.nextFloat();
                rupiah = dolar*1509480;
                System.out.print("Konversi dari $"+ dolar + "Adalah Rp."+rupiah);
 
        }
    }