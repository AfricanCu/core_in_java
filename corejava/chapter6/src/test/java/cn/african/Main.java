package cn.african;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		lambdaLoopList(list);
	}

	private static void lambdaLoopList(List<String> list) {
		list.forEach(item -> System.out.println());
		list.forEach(System.out::print);
	}

}
