import java.util.ArrayList;
public class arrayListInteger {
	public static void main(String[] args){
		ArrayList<Integer> arl1= new ArrayList<Integer>();
		// menambahkan
		arl1.add(50);
		arl1.add(30);
		arl1.add(10);
		arl1.add(05);
		System.out.println(arl1);
		//menghapus
		arl1.remove(3);
		System.out.println(arl1);
		
		ArrayList<Integer> arl2= (ArrayList<Integer>)arl1.clone();
		arl2.add(24);
		System.out.println("arl1" +arl1);
		System.out.println("arl2" +arl2);
		
		System.out.println("kosongkah:" + arl1.isEmpty());
		if (arl1.contains(45))
			System.out.println(" ada angka 30");
		else{
			System.out.println("tak ada angka 30");
		}
		System.out.println("arl1" +arl1);
		System.out.println("arl2" +arl2);
			
		
	}

}
