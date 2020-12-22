import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {

    if (element == null) {
      throw new IllegalArgumentException("Error! You cannot add a null");
    }

    if (super.size() == 0) {
      super.add(element);
      return true;
    }

    if (element.compareTo(super.get(0)) <= 0) {
      super.add(0, element);
      return true;
    }

    for (int i = 0; i < super.size() - 1; i++) {
      if ((element.compareTo(super.get(i)) >= 0) && (element.compareTo(super.get(i + 1)) <= 0)) {
        super.add(i + 1, element);

         return true;
      }
    }

    if (element.compareTo(super.get(super.size() - 1)) >= 0) { //at the end
      super.add(element);
    }

    return true;
  }

  public void add(int index, T element) {
    add(element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Error! -- You cannot add a null");
    }
    T temp = super.get(index);
    super.remove(index);
    add(element);
    return temp;
  }

}
