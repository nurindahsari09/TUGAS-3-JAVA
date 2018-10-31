import java.util.ArrayList;

public class QueueString {
	ArrayList<String> ruang = new ArrayList<String>();
	int ecor = -1;
	
	public void insert(String value){
		ecor++; //=ecor + 1;
		ruang.add(ecor, value);
	}
	
	public String get(){
		String value = "CLASS GAGAP";
		if(!ruang.isEmpty()) {
		value = ruang.get(0);
		ruang.remove(0);
		ecor--;
		}
		return "";
		
		
	}
	public void cetak(){
		System.out.println("ECOR :" +ecor+" # CONTAINER : "+ruang.toString());
	}

}
