import java.util.*;
public class isogram {
    public static boolean  isIsogram(String str) {
      List<String> reList = new ArrayList();
      
      str = str.toUpperCase();
      
      for(String s: str.split("")){
        for(String i: reList){
          if(i.equals(s)){
            return false;
          }
        }
        reList.add(s);
      }
      return true;
    } 
}