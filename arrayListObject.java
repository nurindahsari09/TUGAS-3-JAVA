import java.util.ArrayList;
import java.util.Scanner;


public class arrayListObject {
    public static void main(String[]args){
        ArrayList<Object> OBJ = new ArrayList<Object>();
        System.out.print("MASUKKAN NIM MAHASISWA :  ");
        OBJ.add(new Scanner(System.in).nextLine());
        System.out.print("MASUKKAN NAMA MAHASISWA :  ");
        OBJ.add(new Scanner(System.in).nextLine());
        System.out.print("MASUKKAN KELAS MAHASISWA :  ");
        OBJ.add(new Scanner(System.in).nextLine());
        System.out.print("MASUKKAN ALAMAT MAHASISWA :  ");
        OBJ.add(new Scanner(System.in).nextLine());
       
        System.out.println("HASIL : ");
        System.out.println(OBJ.toString());
    }
}