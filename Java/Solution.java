public class Solution {
    public static boolean validatePin(String pin){
        try{
            Integer.parseInt(pin);
            Integer.parseInt(pin.charAt(0)+"");
        }catch(NumberFormatException e){
            return false;
        }
        if((pin.length()==4 || pin.length()==6)){
            return true;
        }
        return false;
    }
}
