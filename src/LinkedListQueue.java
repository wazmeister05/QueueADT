import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements QueueADT {

    private LinkedList<E> queue;

    public LinkedListQueue(){
        queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(java.lang.Object element) {
        queue.add((E) element);
    }

    @Override
    public Object dequeue() {
        if(queue.isEmpty()){
            throw new NoSuchElementException("Queue empty");
        }
        return queue.pop();     //or queue.removeFirst();
    }

    @Override
    public Object peek() {
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
