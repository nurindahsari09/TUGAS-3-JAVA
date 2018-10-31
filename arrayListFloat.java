import java.util.ArrayList;
import java.util.Scanner;


public class arrayListFloat {
     public static void main(String[] args) {
       ArrayList<Float> FLT = new ArrayList<Float>();
        System.out.println("MASUKKAN 3 ANGKA TIPE Float:");
        FLT.add(new Scanner(System.in).nextFloat());
        FLT.add(new Scanner(System.in).nextFloat());
        FLT.add(new Scanner(System.in).nextFloat());
        System.out.println("HASIL Float :");
        System.out.println(FLT.toString());
}
}