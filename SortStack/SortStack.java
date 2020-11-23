import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.isEmpty()) {
            int tmp = stack.pop();
            while(!temp.isEmpty() && temp.peek() < tmp) {
                stack.push(temp.pop());
            }
            temp.add(tmp);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 50; i++)
            stack.add((int) (Math.random() * 50));
        stack = sort(stack);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
