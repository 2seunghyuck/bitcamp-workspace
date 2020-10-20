package com.eomcs.util;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {

  boolean stopping = false;

  List<Worker> workers = new ArrayList<>();
  class Worker extends Thread {

    Runnable task;
    public void setTask(Runnable task) {
      this.task = task;
      synchronized (this) {
        this.notify();
      }
    }

    @Override
    public void run() {
      synchronized (this) {
        while (true) {
          try {
            this.wait();
            System.out.println("thread wait");
            if (ThreadPool.this.stopping) {
              break;
            }
          } catch (Exception e) {
            System.out.println("스레드 작업 시작");
            break;
          }
          try {
            task.run();
            System.out.println("thread end");
          } catch (Exception e) {
            System.out.println(e.getMessage());
          } finally {
            workers.add(this);
          }
        }
      }
    }
  }

  public void Execute(Runnable task) {
    if (stopping) {
      throw new RuntimeException("스레드풀이 종료 상태입니다!");
    }
    Worker t;
    if (workers.size() == 0) {
      t = new Worker();
      t.start();
      try {
        Thread.sleep(200);
      } catch (Exception e) {}
    } else {
      t = workers.remove(0);
    }
    t.setTask(task);
  }
  //
  //  public void shutdown() {
  //    try {
  //      this.stopping = true;
  //
  //      while (!workers.isEmpty()) {
  //        Worker worker = workers.remove(0);
  //        synchronized (worker) {
  //          worker.notify(); // 스레드를 깨운다.
  //        }
  //      }
  //      Thread.sleep(2000);
  //
  //      // 다시 한 번 대기하고 있는 스레드를 종료해 보자!
  //      while (!workers.isEmpty()) { // 스레드풀에 대기 중인 스레드가 있다면,
  //        Worker worker = workers.remove(0); // 맨 앞에 있는 스레드를 꺼내서
  //        synchronized (worker) {
  //          worker.notify(); // 스레드를 깨운다.
  //          // 스레드는 깨어나면 stopping 상태에 따라 종료 여부를 결정하도록 프로그래밍 되어 있다.
  //          // => Worker 스레드를 코드를 보라!
  //        }
  //      }
  //
  //    } catch (Exception e) {
  //      System.out.println("스레드풀을 종료하는 중에 예외 발생!");
  //      e.printStackTrace();
  //    }
  //  }
}