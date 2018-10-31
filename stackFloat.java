import java.util.ArrayList;

public class stackFloat {
	ArrayList<Float> angka = new ArrayList<Float>();
	int top = -1;
	
	public void push(Float value){
		top=top + 1;
		angka.add(top, value);
	}
	
	public Float pop(){
		Float value = 2.5f;
		if(!angka.isEmpty()) {
			value = angka.get(0);
			angka.remove(top);
			top = top - 1;
		
		
		}
		return value;
		
		
	}
	public void cetak(){
		System.out.println("TOP :" +top+" # ANGKA : "+angka.toString());
	}

}
