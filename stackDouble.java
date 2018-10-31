import java.util.ArrayList;

public class stackDouble {
	ArrayList<Double> hati = new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value){
		top=top + 1;
		hati.add(top, value);
	}
	
	public Double pop(){
		Double value = 2.5d;
		if(!hati.isEmpty()) {
			value = hati.get(0);
			hati.remove(top);
			top = top - 1;
		
		
		}
		return value;
		
		
	}
	public void cetak(){
		System.out.println("TOP :" +top+" # HATI : "+hati.toString());
	}

}
