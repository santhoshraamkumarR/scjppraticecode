package quizover;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		List ids = new ArrayList();
		ids.add(129);
		ids.add(250);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Test",ids.get(0));
		map.put("Test1",ids.get(1));

		int x = (int) map.get("Test");
		
	}

}
