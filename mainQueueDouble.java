
public class mainQueueDouble {

	public static void main(String[] args) {
		QueueDouble angka = new QueueDouble();
		angka.cetak();
		
		angka.insert(97.4);
		angka.cetak();
		
		angka.insert(77.8);
		angka.cetak();
		
		angka.insert(94.6);
		angka.cetak(); 
		
		Double o1 = angka.get();
		System.out.println(o1);
		angka.cetak();
		
		Double o2 = angka.get();
		System.out.println(o2);
		angka.cetak();
		
		Double o3 = angka.get();
		System.out.println(o3);
		angka.cetak();
		
		Double o4 = angka.get();
		System.out.println(o4);
		angka.cetak();
	}

}
