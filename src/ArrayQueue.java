import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements QueueADT {

    private List<E> queue;

    public ArrayQueue(){
        queue = new ArrayList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(E element) {
        queue.add(element);
    }


    @Override
    public Object dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    @Override
    public Object peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
