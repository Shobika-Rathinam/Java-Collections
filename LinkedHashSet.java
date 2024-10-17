 package Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>h=new LinkedHashSet<>();
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			h.add(sc.next());
		}/*
		h.add("siva");
		h.add("siva");
		h.add("paru");
		h.add("krishna");*/
		System.out.println(h);
		
		for(String j:h)
		{
			System.out.println(j+" ");
		}

	}

}
