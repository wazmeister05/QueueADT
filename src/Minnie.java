public class Minnie {

    public static QueueADT<Integer> queue = new ArrayQueue<>();

    public static void main(String[] args) {
        queue.enqueue(2);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
    }

}
