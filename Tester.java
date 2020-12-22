
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
    System.out.println(strList);


    NoNullArrayList<Integer> retry = new OrderedArrayList<Integer>();
    Random rnd = new Random(100);
    for (int i = 0; i < 10; i++) {
      int x = rnd.nextInt() / 10000000;
      retry.add(x);
    }
    System.out.println("actual: " + retry);
    System.out.println("expected: [-163, -142, -127, -122, -119, -113, -95, 11, 83, 130]");

    NoNullArrayList<Integer> retry1 = new OrderedArrayList<Integer>();
    int[] ppp = {6, 10, 21, 7, 26, 19, 29, 32, 1, 32, 33, 35, 44, 1, 47, 45, 49, 44, 51, 52, 50, 52, 58, 51, 64, 62, 75, 23, 77, 52, 78, 9, 79, 85, 83, 89, 52, 92, 79, 96};
    for (int i = 0; i < ppp.length; i++) {
      retry1.add(ppp[i]);
    }
    System.out.println("actual: " + retry1);
    Arrays.sort(ppp);
    System.out.println("expected: " + Arrays.toString(ppp));
    print("" + retry1, Arrays.toString(ppp));

    NoNullArrayList<Integer> retry2 = new OrderedArrayList<Integer>();
    int[] qqq = {14, 19, 20, 3, 20, 11, 22, 20, 22, 23, 16, 36, 24, 38, 31, 44, 5, 45, 17, 45, 21, 50, 46, 52, 53, 4, 57, 71, 68, 78, 76, 84, 48, 85, 76, 90, 77, 91, 97, 99};
    for (int i = 0; i < qqq.length; i++) {
      retry2.add(qqq[i]);
    }
    retry2.add(100);
    int[] zzz = {14, 19, 20, 3, 20, 11, 22, 20, 22, 23, 16, 36, 24, 38, 31, 44, 5, 45, 17, 45, 21, 50, 46, 52, 53, 4, 57, 71, 68, 78, 76, 84, 48, 85, 76, 90, 77, 91, 97, 99, 100};
    Arrays.sort(zzz);
    print("" + retry2, Arrays.toString(zzz));

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
