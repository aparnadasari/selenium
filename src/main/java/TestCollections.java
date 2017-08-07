import java.util.ArrayList;

public class TestCollections {
	public static void main(String[] args) {
		ArrayList<String> aparna = new ArrayList<String>();
		aparna.add("sandhya");
		aparna.add("siva");
		aparna.add("vasmitha");
		aparna.add("srinivas");
		aparna.add("aparnad");

//		for (int i = 0; i < aparna.size(); i++) {
//			System.out.println(aparna.get(i));
//		}
		for(String s:aparna){
			System.out.println(s);
		}
	}
}
