package Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List l1 =new ArrayList();
		System.out.println(""+l1.isEmpty());
		
		l1.add("hello");
		l1.add(234);
		l1.add(45.23);
		l1.add('H');
		l1.add(100);
		
		System.out.println(""+l1.isEmpty());
		System.out.println(l1);
		
		//Generic is collections
		
		List<Integer> l2 =new ArrayList<Integer>();
		l2.add(100);
		l2.add(777);
		l2.add(50);
		l2.add(450);
		System.out.println(l2);
		
		
	}

}
