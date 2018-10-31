
public class mainQueueFloat {

	public static void main(String[] args) {
		QueueFloat angka = new QueueFloat();
		angka.cetak();
		
		angka.insert(88.6f);
		angka.cetak();
		
		angka.insert(94.6f);
		angka.cetak();
		
		angka.insert(99.3f);
		angka.cetak(); 
		
		Float o1 = angka.get();
		System.out.println(o1);
		angka.cetak();
		
		Float o2 = angka.get();
		System.out.println(o2);
		angka.cetak();
		
		Float o3 = angka.get();
		System.out.println(o3);
		angka.cetak();
		
		Float o4 = angka.get();
		System.out.println(o4);
		angka.cetak();
	}

}
