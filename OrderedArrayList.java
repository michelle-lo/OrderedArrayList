import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    if (super.size() == 0) {
      super.add(element);
      return true;
    }


    return false;
  }

}


/*
0  1   2
aa cccc +bbb

aa bbb
0 1
*/
