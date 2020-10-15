/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAJ1_06992;
import java.util.Scanner;
/**
 *
 * @author alan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    static int x,y;
    static Mahasiswa [] mahasiswa;  //array 1 dimensi
    static Nilai [][] nilai; //array 2 dimensi
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilih;
        do{
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.println("3. Cari");
            System.out.println("0. Exit");
            System.out.print("pilih = ");
            pilih = input.nextInt();
            if (pilih == 1){
                input();
            }else if(pilih == 2){
                view();
            }else if(pilih == 3){
                cari();
            }
        }while(pilih!=0);
    }
    static void input(){
        System.out.print("Jumlah Mahasiswa = ");
        x = input.nextInt();
        System.out.print("Jumlah Matkul = ");
        y = input.nextInt();
        mahasiswa = new Mahasiswa[x];
        nilai = new Nilai[x][y];
        for(int i= 0; i<x; i++){
            System.out.println("Data Mahasiswa "+(i+1));
            System.out.print("Npm = ");
            String npm = input.next();
            System.out.print("Nama = ");
            String nama = input.next();
            mahasiswa[i]= new Mahasiswa(npm,nama);
            for(int j=0;j<y;j++){
                System.out.println("Matkul "+(j+1));
                System.out.print("UTS = ");
                double uts = input.nextInt();
                System.out.print("UAS = ");
                double uas = input.nextInt();
                nilai[i][j] = new Nilai(uts,uas);
            }
        }
    }
    static double hitung_rata(double uts,double uas){
        double rata=0;
        for(int i= 0; i<x; i++){
            for(int j=0;j<y;j++){
                rata = (uts+uas)/2;
            }
        }
        return rata;
    }
    static void view(){
        double nilai_rata;
        for(int i= 0; i<x; i++){
            System.out.println("================"+"data mahasiswa "+(i+1)+"==================");
            System.out.println("Nama = "+mahasiswa[i].getNama());
            System.out.println("Npm = "+mahasiswa[i].getNpm());
            System.out.println("==================================================");
            System.out.println("\t\tUTS\tUAS\tRATA");
            for(int j=0;j<y;j++){
                nilai_rata = hitung_rata(nilai[i][j].getUts(),nilai[i][j].getUas());
                System.out.println("matkul "+(j+1)+"\t"+nilai[i][j].getUts()+"\t"+
                        nilai[i][j].getUas()+"\t"+nilai_rata);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    static void cari(){
        double nilai_rata;
        System.out.print("Npm = ");
        String npm = input.next();
        System.out.print("Nama = ");
        String nama = input.next();
        for(int i= 0; i<x; i++){
            if(nama.equals(mahasiswa[i].getNama()) && npm.equals(mahasiswa[i].getNpm())){
                System.out.println("================"+"data mahasiswa "+(i+1)+"==================");
                System.out.println("nama = "+mahasiswa[i].getNama());
                System.out.println("Npm = "+mahasiswa[i].getNpm());
                System.out.println("==================================================");
                System.out.println("\t\tUTS\tUAS\tRATA");
                for(int j=0;j<y;j++){
                    nilai_rata = hitung_rata(nilai[i][j].getUts(),nilai[i][j].getUas());
                    System.out.println("matkul "+(j+1)+"\t"+nilai[i][j].getUts()+"\t"+
                    nilai[i][j].getUas()+"\t"+nilai_rata);
                }
            }
        }
    }
}
