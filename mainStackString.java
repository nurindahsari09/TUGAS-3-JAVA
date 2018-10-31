
public class mainStackString {

	public static void main(String[] args) {
		stackString st = new stackString();
		st.cetak();
		
		st.push("Dandi Dahri");
		st.cetak();
		
		st.push("Wira");
		st.cetak();
		
		st.push("Hasbi");
		st.cetak();
		
		String d1 = st.pop();
		System.out.println(d1);
		st.cetak();
		
		String d2 = st.pop();
		System.out.println(d2);
		st.cetak();
		
		String d3 = st.pop();
		System.out.println(d3);
		st.cetak();
		
		String d51 = st.pop();
		System.out.println(d51);
		st.cetak();
		
		
	}

}
