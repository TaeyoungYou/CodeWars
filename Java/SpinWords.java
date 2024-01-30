public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String result="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>4){
                result += new StringBuffer(words[i]).reverse().toString();
            }else{
                result+=words[i];
            }
            if(i!=words.length-1){
                result+=" ";
            }
        }
        return result;
    }
}
