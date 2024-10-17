package Collections;
import java.util.HashMap;
import java.util.Scanner;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String>h=new HashMap<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			h.put(sc.nextInt(),sc.next());
		}
		System.out.println(h);
		System.out.println(h.get(3));
	}
	

}
