public interface QueueADT<E> {

    int size();                 //return size of queue
    void enqueue(E element);    //add element to back of queue
    E dequeue();                //return element at front of queue
    E peek();                   //look but don't remove from front
    boolean isEmpty();          //tells us if the queue is empty

}
