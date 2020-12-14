public class Tester {
  public static void main (String[] args) {
    NoNullArrayList<String> ah = new NoNullArrayList<String>();
    System.out.println("\nNoNullArrayList\n");
    head("add, add(index, e)");
    print(ah.add("hello"), true);
    ah.add(0, "no");
    print("" + ah, "[no, hello]");
    print(ah.set(1, "yes"), "yes");
    print("" + ah, "[no, yes]");

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
