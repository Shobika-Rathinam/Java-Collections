package Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> s=new ArrayList<>();
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		s.set(1,6);
		System.out.println(s);
		s.remove(2);
	
		System.out.println(s);
	
		System.out.println(s.get(1));
		System.out.println(s.size());
		s.clear();
		System.out.println(s);
		System.out.println(s.size());
		s.add(1);

		System.out.println(s.add(2));
		System.out.println(s.remove(1));//prints value to be removed.
		for(int i=0;i<5;i++)
		{
			s.add(i);
		//	sc.nextInt());
		}
		System.out.println(s);
		Iterator<Integer>iter=s.iterator();
	
		while(iter.hasNext());
		{
			System.out.print(iter.next()+" " );
		}
		
	
	}

}
