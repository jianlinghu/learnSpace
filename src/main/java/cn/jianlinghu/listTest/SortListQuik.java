package cn.jianlinghu.listTest;

import java.util.Arrays;
import java.util.List;

public class SortListQuik {


  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 4);

    // 1
   /* Set<Integer> set = new HashSet<Integer>();

    set.addAll(list);

    System.out.println(list.size() == set.size() ? "没有重复" : "有重复");*/

    System.out.println(list.stream().distinct().count() == list.size()?"没有重复" : "有重复");


  }

}
