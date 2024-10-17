package Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class arraylistString {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList a=new ArrayList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a.add(sc.next());
		}
		System.out.println(a);
		for(char i1='A';i1<='Z';i1++)
		{
			a.add(String.valueOf(i1));
			
		}
		Iterator<String> i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ArrayList<String> f=new ArrayList<>();
		for(int k=0;k<n;k++)
		{
			f.add(sc.next());
		}
		Iterator<String>l=f.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		a.addAll(f);
		System.out.println(a);
		
	}
}
