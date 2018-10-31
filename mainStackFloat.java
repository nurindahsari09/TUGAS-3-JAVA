
public class mainStackFloat {

	public static void main(String[] args) {
		stackFloat sf = new stackFloat();
		sf.cetak();
		
		sf.push((float) 65.0);
		sf.cetak();
		
		sf.push((float) 44.9);
		sf.cetak();
		
		sf.push((float) 68.1);
		sf.cetak();
		
		Float out = sf.pop();
		System.out.println(out);
		sf.cetak();
		
		Float out1 = sf.pop();
		System.out.println(out1);
		sf.cetak();
		
		Float out2 = sf.pop();
		System.out.println(out2);
		sf.cetak();
		
		Float out3 = sf.pop();
		System.out.println(out3);
		sf.cetak();
		
		
	}

}
