package string;

public class RemoveCharecter {
    public static void main(String[] args) {
        remove("geeksforgeeks","mask");
    }

    private static void remove(String str1,String str2){
        int[] count = new int[26];
        for(int i = 0; i < str2.length() ; i++){
            count[str2.charAt(i) - 'a'] ++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str1.length() ; i++){
            if(count[str1.charAt(i) - 'a'] == 0){
                sb.append(str1.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
