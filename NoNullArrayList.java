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
      throw new IllegalArgumentException("You cannot add a null");
    }
    super.add(element);
    return true;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("You cannot add a null");
    }
    super.add(index, element);
  }

  public T set (int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("You cannot add a null");
    }
    super.set(index, element);
    return element;
  }

}
