import java.util.*;
public class Tester {
  public static void main (String[] args) {
    NoNullArrayList<String> ah = new NoNullArrayList<String>();
    System.out.println("\nNoNullArrayList\n");
    head("add, add(index, e), set");
    print(ah.add("hello"), true);
    ah.add(0, "no");
    print("" + ah, "[no, hello]");
    print(ah.set(1, "yes"), "hello");
    print("" + ah, "[no, yes]");

    head("add, add(index, e), set -- with nulls");
    try {
      ah.add(2, null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- nulls are not accepted");
    }
    try {
      ah.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- nulls are not accepted");
    }
    try {
      ah.set(2, null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- nulls are not accepted");
    }
    print("" + ah, "[no, yes]");

    System.out.println("\nOrderedArrayList\n");
    System.out.println("intList");
    NoNullArrayList<Integer> intList = new OrderedArrayList<Integer>();
    head("add");
    //first addition
    print(intList.add(1), true);
    print("" + intList, "[1]");
    //other cases
    print(intList.add(2), true);
    System.out.println(intList);
    print(intList.add(3), true);
    System.out.println(intList);
    print(intList.add(1), true);
    System.out.println(intList);
    print(intList.add(0), true);
    System.out.println(intList);
    head("set");
    print(intList.set(2, -5), 1);
    System.out.println(intList);



    System.out.println("strList");
    NoNullArrayList<String> strList = new OrderedArrayList<String>();
    head("add");
    //first addition
    print(strList.add("aa"), true);
    print("" + strList, "[aa]");
    //other cases
    print(strList.add("a"), true);
    print("" + strList, "[a, aa]");
    print(strList.add("bird"), true);
    print("" + strList, "[a, aa, bird]");
    try {
      strList.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- nulls are not accepted");
    }
    head("set");
    print(strList.set(1, "BIRD"), "aa");
    System.out.println(strList);
    try {
      strList.set(1, null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- nulls are not accepted");
    }


    //ba.add(3);
    //print(ba.add(2), true);
    //print("" + ba, "[1, 2, 3]");



    System.out.println("all good!");

  }


  public static void print (Object actual, Object expected) {
    String str = "";
    str += "Actual: " + actual + "\n";
    str += "Expected: " + expected + "\n";
    if (actual.equals(expected)) {
      str += "Success! :)\n";
    } else {
      str += "Fail! :(\n";
    }
    System.out.println(str);
  }

  public static void head (String heading) {
    String str = "";
    str+= "~~~\n" + heading + "\n~~~";
    System.out.println(str);
  }

}
