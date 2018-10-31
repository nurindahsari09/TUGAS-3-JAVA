import java.util.ArrayList;


public class arrayListDouble {

		public static void main(String[] args) {
			ArrayList<Double> arlf= new ArrayList<Double>();
			// menambahkan
			arlf.add(97.5);
			arlf.add(55.7);
			arlf.add(99.7);
			System.out.println(arlf);
			//menghapus
			arlf.remove("Dandi Dahri");
			System.out.println(arlf);
			
					ArrayList<Double> arlF= (ArrayList<Double>)arlf.clone();
					arlF.add(2.36790d);
					System.out.println("arlf" +arlf);
					System.out.println("arlF" +arlF);
					
			System.out.println("hampa:" + arlf.isEmpty());
			if (arlf.contains(3.545588d))
				System.out.println(" ada 3.5");
			else{
				System.out.println("tak ada angka 3.5");
					}
					System.out.println("arlf" +arlf);
					System.out.println("arlF" +arlF);
		}

}
