package Collections;
import java.util.Queue;
import java.util.LinkedList;
public class QueueUsing LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> a=new LinkedList<>();
		a.add("siva");
		a.add("Paru");
		a.add("GM");if(a.isEmpty())
		{
			System.out.println("Empty....");
		}
		else
		{
			System.out.println("Not Empty");
		}

		System.out.println(a);
		a.poll();
		
		System.out.println(a);
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
