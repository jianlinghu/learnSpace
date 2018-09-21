package cn.jianlinghu.listTest;


import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class listTest {

  public static void main(String[] args) {
//    String[] times = {"20180910000000-20180910000000", "20180910000000-20180910000000"};
//    Object b = "";
//    String c = "";
    List list = new ArrayList<String>();
    list.add("20180910000000-20180910000000");
    list.add("20180910000000-20180910000000");
    list.add("20180910000000-20180910000000");
    System.out.println("集合list=" + list);

    String li = list.toString();
    li="[\"20180910000000-20180910000000\",\"20180910000000-20180910000000\",\"20180910000000-20180910000000\"]";
    System.out.println("集合转string=" + li);

//    JSONArray a = new JSONArray(list);
//    System.out.println("JSONArray a = " + a);
    try {
      JSONArray d = new JSONArray(li);
      System.out.println("d = " + d);

      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < d.length(); i++) {
        String[] time = d.getString(i).split("-");
        sb.append(time[0]).append(":").append(time[1]).append("\r\n");
      }
      System.out.println(sb);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
