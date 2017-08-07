import java.util.HashSet;

public class TestSet {
public static void main(String[] args) {
	HashSet<String> abc=new HashSet<String>();
	abc.add("aparna");
	abc.add("bc");
	abc.add("aparna");
	for(String a:abc){
		System.out.println(a);
	}
}
}
