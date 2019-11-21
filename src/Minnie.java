import java.util.Random;

public class Minnie {

    public static QueueADT<Integer> queue1 = new LinkedListQueue<>();
    public static QueueADT<Integer> queue2 = new LinkedListQueue<>();
    public static QueueADT<Integer> queue3 = new LinkedListQueue<>();
    public static QueueADT<Integer> queue4 = new LinkedListQueue<>();
    static long start = System.nanoTime();
    //public static QueueADT<Integer> queue = new ArrayQueue<>();

    public static void main(String[] args) {


        //4 entries
        start = System.nanoTime();
        System.out.println(queue1.isEmpty());            //true
        for (int i = 0; i < 4; i++) {
            queue1.enqueue(i);
        }
        System.out.println("Size: " + queue1.size());
        System.out.println(queue1.dequeue());
        System.out.println("Peek: " + queue1.peek());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.isEmpty());
        System.out.println("The algorithm with 4 entries took: " + (System.nanoTime() - start) + " ns to run");


        //40 entries
        start = System.nanoTime();
        System.out.println(queue2.isEmpty());            //true
        for (int i = 0; i < 40; i++) {
            queue2.enqueue(i);
        }
        System.out.println("Size: " + queue2.size());
        System.out.println(queue2.dequeue());
        System.out.println("Peek: " + queue2.peek());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.isEmpty());
        System.out.println("The algorithm with 40 entries took: " + (System.nanoTime() - start) + " ns to run");

        //400 entries
        start = System.nanoTime();
        System.out.println(queue3.isEmpty());            //true
        for (int i = 0; i < 400; i++) {
            queue3.enqueue(i);
        }
        System.out.println("Size: " + queue3.size());
        System.out.println(queue3.dequeue());
        System.out.println("Peek: " + queue3.peek());
        System.out.println(queue3.dequeue());
        System.out.println(queue3.isEmpty());
        System.out.println("The algorithm with 400 entries took: " + (System.nanoTime() - start) + " ns to run");


        //4000 entries
        start = System.nanoTime();
        System.out.println(queue4.isEmpty());            //true
        for (int i = 0; i < 4000; i++) {
            queue4.enqueue(i);
        }
        System.out.println("Size: " + queue4.size());
        System.out.println(queue4.dequeue());
        System.out.println("Peek: " + queue4.peek());
        System.out.println(queue4.dequeue());
        System.out.println(queue4.isEmpty());
        System.out.println("The algorithm with 4000 entries took: " + (System.nanoTime() - start) + " ns to run");
    }

}
