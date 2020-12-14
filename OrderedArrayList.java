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
      throw new IllegalArgumentException("You cannot add a null");
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
        super.add(i, element);
         return true;
      }
    }

    if (element.compareTo(super.get(super.size() - 1)) >= 0) { //at the end
      super.add(element);
    }

    return false;
  }

}


/*
0  1  2
1      +2
1  2   +3




0  1   2
aa cccc +bbb

*/

//System.out.println("size: " + super.size());
//System.out.println("element: " + element);
//System.out.println("" + element + " after " + super.get(i) + "?: " + (element.compareTo(super.get(i)) >= 0));
//System.out.println("" + element + " before " + super.get(i + 1) + "?: " + (element.compareTo(super.get(i + 1)) <= 0));
