
public class mainStackDouble {

	public static void main(String[] args) {
		stackDouble sd = new stackDouble();
		sd.cetak();
		
		sd.push(100.9);
		sd.cetak();
	
		sd.push(70.1);
		sd.cetak();
		
		sd.push(92.9);
		sd.cetak();
	
		
		Double out1 = sd.pop();
		System.out.println(out1);
		sd.cetak();
		
		Double out2 = sd.pop();
		System.out.println(out2);
		sd.cetak();
		
		Double out3 = sd.pop();
		System.out.println(out3);
		sd.cetak();
		
		Double out4 = sd.pop();
		System.out.println(out4);
		sd.cetak();
	
	}

}
