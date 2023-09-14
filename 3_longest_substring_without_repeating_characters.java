import java.util.*;

class LongestSubString{
   public int lengthOfLongestSubstring(String s) {
        int start_index = 0;
        int end_index = 0;
        int substring_length = 0;
        List<Character> string_list = new ArrayList<Character>();

        while(end_index<s.length()){
            if(!string_list.contains(s.charAt(end_index))){
                string_list.add(s.charAt(end_index));
                end_index++;
                substring_length = Math.max(substring_length, string_list.size());
            }else{
                string_list.remove(Character.valueOf(s.charAt(start_index)));
                start_index++;
            }
        }
        return substring_length;
    }
}
