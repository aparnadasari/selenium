import java.util.HashMap;

public class TestMap {
public static void main(String[] args) {
	HashMap<String,String> abc=new HashMap<String,String>();
	abc.put("name", "aparna");
	abc.put("city", "bangalore");
	abc.put("state", "karnataka");
	abc.put("city", "hyd");
	System.out.println(abc.get("city"));
}
}
