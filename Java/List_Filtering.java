import java.util.*;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    List<Object> result=new ArrayList<>();
    for(Object i: list){
      if(i instanceof Integer){
        result.add(i);
      }
    }
    return result;
  }
}
