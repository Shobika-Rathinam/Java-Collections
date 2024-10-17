package Collections;
import java.util.Stack;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> a=new Stack<>();
		a.push(1);
		a.push(2);
		a.push(3);
		System.out.println(a);
		a.pop();
		System.out.println(a);
		System.out.println(a.peek());

	}

}
