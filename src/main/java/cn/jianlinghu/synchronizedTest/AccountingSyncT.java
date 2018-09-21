package cn.jianlinghu.synchronizedTest;

public class AccountingSyncT implements Runnable {

  static AccountingSyncT instance = new AccountingSyncT();
  static int i = 0;

  public void run() {
    //省略其他耗时操作
    //使用同步代码块对变量i进行操作,锁对象为instance
    synchronized (instance) {
      for (int j = 0; j < 10000; j++) {
        i++;
      }


    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(AccountingSyncT.instance);
    Thread t2 = new Thread(AccountingSyncT.instance);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(i);
  }


}
