package string;
/*
* https://www.geeksforgeeks.org/check-if-frequency-of-all-characters-can-become-same-by-one-removal/
* */
public class IsRemovableDuplicate {
    public static void main(String[] args) {
        System.out.println(isDuplicateRemovable("xxxxyyzz"));
    }

    private static boolean isDuplicateRemovable(String str){
        int[] count = new int[26];
        for(int i = 0; i < str.length() ; i++){
            count[str.charAt(i) - 'a']++;
        }
        if(isSameFre(count)){
            return true;
        }
        for(int i = 0; i < str.length() ; i++){
            count[str.charAt(i) - 'a']--;
            if(isSameFre(count)){
                return true;
            }
            count[str.charAt(i) - 'a']++;
        }
        return false;
    }

    private static boolean isSameFre(int[] count){
        int same = 0;
        int i = 0;
        for(i = 0; i < count.length ; i++){
            if(count[i] > 0){
                same = count[i];
                break;
            }
        }
        for(int x = i +1 ;x < count.length ; x++){
            if(count[x] > 0 && same != count[x]){
                return false;
            }
        }
        return true;
    }
}
