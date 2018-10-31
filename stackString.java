import java.util.ArrayList;

public class stackString {
	ArrayList<String> hati = new ArrayList<String> ();
	int top = -1;
	
	public void push (String value) {
		top = top+1;
		hati.add(top, value);
	}
	
	public String pop() {
		String value ="BUKAN KALENG KALENG";
		if(!hati.isEmpty()) {
			value = hati.get(top);
			hati.remove(top);
				top = top -1;
		}
		return value;
	}
	
	public void cetak () {
		System.out.println("TOP:"+top+" # HATI: "+hati.toString());
	}
}
