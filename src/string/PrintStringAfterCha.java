package string;

/*
* https://www.geeksforgeeks.org/print-string-specified-character-occurred-given-no-times/
*
* */
public class PrintStringAfterCha {
    public static void main(String[] args) {
        remove("geeksforgeeks",'e',2);
    }
    private static void remove(String str,char ch,int count){
        int x = 0;
        for(int i =0; i < str.length() ; i++){
            if(str.charAt(i) == ch){
                x++;
            }
            if(x == count){
                System.out.println(str.substring(i+1,str.length()));
                break;
            }
        }
        if(x != count){
            System.out.println("No possible combination");
        }
    }
}
