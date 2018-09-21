package cn.jianlinghu.ClassInitializationTest;

import java.util.Random;

class Initable {

  static final int staticFinal = 47;
  static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

  static {
    System.out.println("Initializing Initable");
  }
}

class ClassInitialization {

  public static Random rand = new Random(47);

  public static void main(String[] args) {
    //字面常量获取方式获取Class对象
    Class initable = Initable.class;
    System.out.println("After creating Initable ref");
    //不触发类初始化
    System.out.println(Initable.staticFinal);
    //会触发类初始化
    System.out.println(Initable.staticFinal2);
  }
}

class Initable2 {
  //静态成员变量

  static final int staticFinal = 147;
  static {
    System.out.println("Initializing Initable2");
  }

}

class Initable3 {
  //静态成员变量

  static final int staticFinal = 88;
  static {
    System.out.println("Initializing Initable3");
  }

}



