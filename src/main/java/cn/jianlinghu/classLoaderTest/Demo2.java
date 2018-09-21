package cn.jianlinghu.classLoaderTest;

class Candy {

  static {
    System.out.println("Loading Candy");
  }
}

class Gum {

  static {
    System.out.println("Loading Gum");
  }
}

class Cookie {

  static {
    System.out.println("Loading Cookie");
  }
}

class SweetShop {

  public static void print(Object obj) {
    System.out.println(obj);
  }

  public static void main(String[] args) {
    print("inside main");
    //初始化Candy
    new Candy();
    print("After creating Candy");
    try {
      //获取Gum对象
      Class.forName("cn.jianlinghu.classLoaderTest.Gum");
    } catch (ClassNotFoundException e) {
      print("Couldn't find Gum");
    }
    print("After Class.forName(\"cn.jianlinghu.classLoaderTest.Gum\")");
    new Cookie();
    print("After creating Cookie");
  }
}