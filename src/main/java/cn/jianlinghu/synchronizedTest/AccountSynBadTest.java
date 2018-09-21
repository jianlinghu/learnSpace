package cn.jianlinghu.synchronizedTest;

public class AccountSynBadTest implements Runnable {

  static int i = 0;

  /**
   * 作用于静态方法,锁是当前class对象,也就是AccountingSyncClass类对应的class对象
   */
//  public synchronized void increase() {
  public static synchronized void increase(){
    i++;
  }

  /**
   * 锁对象是实例对象
   */
  public synchronized void increase2(){
    i++;
  }

  public void run() {
    for (int j = 0; j < 100000; j++) {
      increase();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new AccountSynBadTest());
    Thread t2 = new Thread(new AccountSynBadTest());

    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println(i);
  }
}
