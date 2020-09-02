package com.eomcs.algorithm.data_structure.queue;

public class MyQueueTest3 {
  public static void main(String[] args) throws Exception{
    MyQueue<String> queue = new MyQueue<>();
    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    System.out.println("==> " + queue.peek()); // aaa
    queue.offer("ddd");
    queue.offer("eee");
    // queue.offer(new integer(100)); 컴파일 오류
    print(queue);


    MyQueue<String> queue2 = queue.clone();
    print(queue2);
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }

  static void print(MyQueue<?> queue) { // <?>  <== 조회용도로만 사용하는게 정석 컴파일러가 오류거름
    for (int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + ",");
    }
    System.out.println();
  }
}
