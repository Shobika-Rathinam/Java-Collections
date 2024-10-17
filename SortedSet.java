package Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Iterator;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet<Integer>s=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s.add(sc.nextInt());
			
		}
		System.out.println(s);
		Iterator<Integer>k=s.iterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		       
	}

}
