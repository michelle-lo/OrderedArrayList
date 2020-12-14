import java.util.*;
public class Tester {
  public static void main (String[] args) {
    NoNullArrayList<String> ah = new NoNullArrayList<String>();
    System.out.println("\nNoNullArrayList\n");
    head("add, add(index, e), set");
    print(ah.add("hello"), true);
    ah.add(0, "no");
    print("" + ah, "[no, hello]");
    print(ah.set(1, "yes"), "yes");
    print("" + ah, "[no, yes]");

    head("add, add(index, e), set -- with nulls");
    try {
      ah.add(2, null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- null added");
    }
    try {
      ah.add(null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- null added");
    }
    try {
      ah.set(2, null);
    } catch (IllegalArgumentException e) {
      System.out.println("error! -- null added");
    }
    print("" + ah, "[no, yes]");

    System.out.println("\nOrderedArrayList\n");
    System.out.println("intList");
    NoNullArrayList<Integer> intList = new OrderedArrayList<Integer>();
    head("add");
    //first addition
    print(intList.add(1), true);
    print("" + intList, "[1]");

    System.out.println("strList");
    NoNullArrayList<String> strList = new OrderedArrayList<String>();
    head("add");
    //first addition
    print(strList.add("a"), true);
    print("" + strList, "[a]");

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
