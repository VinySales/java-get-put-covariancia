package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		
		List<? extends Number> numberList = intList;
		
		Number x = numberList.get(0);
		// numberList.add(3); //Erro de compilação
		
		System.out.println(x);
	}

}
