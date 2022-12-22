package Homework_4;

     
class QNode {
    int key;
    QNode next;
 
    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}
 

class Queue {
    QNode front, rear;
 
    public Queue() { this.front = this.rear = null; }
    void enqueue(int key)
    {
        QNode temp = new QNode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
 
    void dequeue()
    {
    
        if (this.front == null)
            return;
        QNode temp = this.front;
        this.front = this.front.next;
 
        if (this.front == null)
            this.rear = null;
    }
    void first(){
        System.out.println("First:" + front.key);
    }
}

public class Task_2 {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(15);
        q.enqueue(45);
        q.enqueue(30);
        q.first();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}

