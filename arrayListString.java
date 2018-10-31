import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("Dandi Dahri");
		arls.add("Wira Prayana");
		arls.add("zulin");
		System.out.println(arls);
		//menghapus
		arls.remove("Dandi Dahri");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("ALIAH");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("hampakah:" + arls.isEmpty());
		if (arls.contains("Dandi Dahri"))
			System.out.println(" ada Dandi Dahri");
		else{
			System.out.println("tak ada Dandi Dahri");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
