import java.util.Stack;

public class QueueWithStack<E> {

    private Stack<E> stack;

    public QueueWithStack() {
        stack = new Stack<>();
    }

    public void add(E obj) {
        stack.add(obj);
    }

    public E poll() {
        if(stack.size() == 0) return null;
        if(stack.size() == 1) return stack.pop();
        else {
            E obj = stack.pop();
            E r = poll();
            stack.add(obj);
            return r;
        }
    }

    public static void main(String[] args) {
        QueueWithStack<Integer> queue = new QueueWithStack<>();
        queue.add(2);
        queue.add(4);
        queue.add(40);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}