package Week12;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

//Write a method that can return the minimum value from ta map (DO NOT use sort method)
public class mapMinValue {


    public  static  int  minValue( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }
}
