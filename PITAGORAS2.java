import java.util.Scanner;
class PITAGORAS2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("PITAGORAS");
        System.out.println("1. Mencari sisi miring segitiga siku-siku / Nilai c");
        System.out.println("2. Mencari tinggi segitiga siku-siku / Nilai a");
        System.out.println("3. Mencari alas segitiga siku-siku / Nilai b");
        System.out.println("Pilih nomer berapa = ");
        int pilih = input.nextInt();
        main Soal;
        Soal = new main();
        if (pilih==1){Soal.pitagoras1();}
        if (pilih==2){Soal.pitagoras2();}
        if (pilih==3){Soal.pitagoras3();} 
        }
    }