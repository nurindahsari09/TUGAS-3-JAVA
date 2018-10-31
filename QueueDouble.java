import java.util.ArrayList;


public class QueueDouble {
	ArrayList<Double> angka = new ArrayList<Double>();
	int akhir = -1;
	
	public void insert(Double value){
		akhir++; //=akhir + 1;
		angka.add(akhir, value);
	}
	
	public Double get(){
		Double value = 0.0d;
		if(!angka.isEmpty()){
		value = angka.get(0);
		angka.remove(0);
		akhir--;
		}
		return value;
		
	}
	public void cetak1(){
		System.out.println("Akhir :" +akhir+" angka : "+angka.toString());
}

	public void cetak() {
		
	}}