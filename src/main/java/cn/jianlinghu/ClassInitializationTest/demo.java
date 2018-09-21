package cn.jianlinghu.ClassInitializationTest;

import java.util.Random;

class Initable {

  //编译器静态常量,在编译阶段被放入常量池
  static final int staticFinal = 47;
  static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

  static {
    System.out.println("Initializing Initable");
  }
}

class Initable2 {

  //静态成员变量
  static final int staticNonFinal = 147;

  static {
    System.out.println("Initializing Initable2");
  }


}
class Initable3 {

  //静态成员变量
  static final int staticNonFinal = 88;

  static {
    System.out.println("Initializing Initable3");
  }


}

class ClassInitialization {

  public static Random rand = new Random(47);

  public static void main(String[] args) throws Exception {
    //字面常量获取方式获取Class对象没有触发初始化
    Class initable = Initable.class;
    System.out.println("After creating Initable ref");
    //不触发类初始化
    System.out.println(Initable.staticFinal);
    //会触发类初始化
    System.out.println(Initable.staticFinal2);
    //会触发类初始化
    System.out.println(Initable2.staticNonFinal);
    //forName方法获取Class对象
    Class initable3 = Class.forName("Initable3");
    System.out.println("After creating Initable3 ref");
    System.out.println(Initable3.staticNonFinal);
  }
}


