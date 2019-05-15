package testParameter;

import java.util.HashMap;

class Dog {
	String color;

	Dog(String c) {
		color = c;
	}

	public String toString() {
		return color + " dog";
	}
}

public class TestHashMap {
	public HashMap<String, Integer> abcc() {
		HashMap<String, Integer> singleMap = new HashMap<String, Integer>();
		singleMap.put("key1", 15);
		singleMap.put("key1", 15);
		singleMap.put("key2", 15);
		singleMap.put("key3", 15);
		singleMap.put("key4", 1);
		singleMap.put("key4", 2);
		return singleMap;
	}

	public static void main(String[] args) {
		new TestHashMap().abcc();
		// HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
		// Dog d1 = new Dog("red red red");
		// Dog d2 = new Dog("black black black");
		// Dog d3 = new Dog("white white");
		// Dog d4 = new Dog("white white");
//		hashMap.put(d1, 10);
//		hashMap.put(d2, 15);
//		hashMap.put(d3, 25);
//		hashMap.put(d4, 20);
		// print size
		// System.out.println("hash map size: " + hashMap.size());
		// loop HashMap
		// for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
		// System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		// }

		// HashMap<String, Integer> singleMap = new HashMap<String, Integer>();

		// System.out.println(singleMap.entrySet().toString());// [key1=15, key2=15,
		// key3=15, key4=2]
		// for (Entry<String, Integer> newEntry : singleMap.entrySet()) {
		// System.out.println(newEntry.getKey().toString() + " " + newEntry.getValue());
		// }
		System.out.println();
	}
}
