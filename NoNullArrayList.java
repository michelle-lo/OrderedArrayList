import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList (int startingCapacity) {

    super(startingCapacity);
  }

  public boolean add(T element) {
    if (element == null) {
      //throw new IllegalArgumentException("You cannot add a null");
      return false;
    }
    super.add(element);
    return true;
  }

  public void add(int index, T element) {
    super.add(index, element);
  }

  public T set (int index, T element) {
    super.set(index, element);
    return element;
  }

}


/*
1. Override set and both add methods
a) Check the method signatures of add() add(index) and set(index,value) so you override correctly. The return types are important!
b) They should all throw an IllegalArgumentException when null is added, otherwise call the old add method.
2. Write 2 constructors:
default + startingCapacity.
*/
