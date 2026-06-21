class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = new char[27];
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i) - 97] +=1;
        }
        for(int i = 0;i<t.length();i++){
            arr[t.charAt(i) - 97] -=1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;

    }
}
