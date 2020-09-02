package com.eomcs.algorithm.data_structure.queue;

public class MyQueueTest2 {
  public static void main(String[] args) throws Exception{
    MyQueue queue = new MyQueue();
    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    System.out.println("==> " + queue.peek()); // aaa
    queue.offer("ddd");
    queue.offer("eee");
    print(queue);


    MyQueue queue2 = queue.clone();
    print(queue2);
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }

  static void print(MyQueue queue) {
    for (int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + ",");
    }
    System.out.println();
  }
}
