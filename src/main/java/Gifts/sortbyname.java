package Gifts;

import Sweets.Sweet;

import java.util.Comparator;

public class sortbyname implements Comparator<Sweet> {

    public int compare(Sweet sweet1,Sweet sweet2)
    {
      return sweet1.getSweetname().compareTo(sweet2.getSweetname());
    }
}
