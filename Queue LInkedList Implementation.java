package Collections;
import java.util.Queue;
import java.util.LinkedList;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> a=new LinkedList<>();
		a.add("siva");
		a.add("Paru");
		a.add("GM");

		System.out.println(a);
		while(!a.isEmpty())
		{
			System.out.println("Deleted Data "+a.poll());
		}
		
		//System.out.println(a);
		System.out.println(a.peek());
		if(a.isEmpty())
		{
			System.out.println("Empty....");
		}
		else
		{
			System.out.println("Not Empty");
		}

	}

}
