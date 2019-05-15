package testParameter;

import model.Object;
import java.util.ArrayList;

public class constructor {

	public static void main(String[] args) {
		// abc();
		// String xxx = "[id=1,name=name1,value=2]";
		// Object ob = Object.toObject(xxx);
		// System.out.println(ob.getId());
		// System.out.println(ob.getName());
		TestHashMap xxx = new TestHashMap();
		System.out.println(xxx.abcc().entrySet().toString());// in hasmap
		System.out.println(xxx.abcc().get("key1").toString());// lay gia tri theo key

	}

	static void abc() {
		ArrayList<Object> o1 = new ArrayList<Object>();
		o1.add(new model.Object(1, "name1", 2));
		o1.add(new model.Object(1, "name2", 4));
		o1.add(new model.Object(1, "name5", 3));
		o1.add(new model.Object(1, "name0", 1));
		String o1s = o1.toString();
		System.out.println(o1s);
	}
}
