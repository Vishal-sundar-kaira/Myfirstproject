package Stacks;
import java.util.*;

public class Sortstack {

	public static void sort(Stack <Integer>s,int x){
		if(s.isEmpty()||x>s.peek()){
			s.push(x);
			return;
		}
		int top=s.pop();
		sort(s,x);
		s.push(top);
	}
	public static void stacksort(Stack<Integer> stack) {
		if(!stack.isEmpty()){
		int top=stack.pop();
		stacksort(stack);
		sort(stack,top);
		}

	}

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(3);

        System.out.println("Original Stack:");
        System.out.println(stack);

        System.out.println("Sorted Stack:");
        stacksort(stack);
    }
}
