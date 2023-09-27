package collection.stack;

import java.util.ArrayList;

public class MyStack {
	
	private ArrayList<String> arrayList;
	
	public MyStack() {
		arrayList = new ArrayList<>();
	}
	
	public void push(String data) {
		arrayList.add(data);
	}
	
	public String pop() {
		int size = arrayList.size();
		if(size == 0) {
			System.out.println("스텍이 비었습니다");
		return null;
		}
		return arrayList.remove(size - 1);
	}

}
