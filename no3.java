package package3;

public class no3 {
    public class Queue {
        private int[] number;
        private int front;
        private int rear;
        private int nItems;
        private int maxsize;
        public Queue(int maxsize) {
            this.maxsize = maxsize;
            number = new int[maxsize];
            front = 0;
            rear = -1;
            nItems = 0;
        }
        public boolean isEmpty() {
            return nItems == 0;
        }
        public boolean isFull() {
            return nItems == maxsize;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return number[front];

        }
        public void enqueue(int value) {
            if(isFull()){
                System.out.println("Queue is full.can't enqueue element" + value);
            }
            if(rear == maxsize-1){
                rear = -1;
            }
            number[++rear] = value;
            nItems++;
        }
        public int dequeue() {
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            int value = number[front];
            if(front == maxsize){
                front = 0;
            }
            nItems--;
            return value;
        }
        public static void main(String[] args) {
            Queue queue = new Queue(5);
            queue.enqueue(11);
            queue.enqueue(22);
            queue.enqueue(33);
            queue.enqueue(44);
            queue.enqueue(55);

            queue.dequeue();
            queue.dequeue();

            System.out.println("front element is " + queue.peek());
            System.out.println("size of the queue is " + queue.nItems);

            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }
        }


    }


}
