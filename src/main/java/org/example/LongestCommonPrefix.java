package org.example;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        for (int i = 0; i< strs[0].length();i++){ // проверка происходит по горизонтали
            // берется первое слово и оно по буквенно сравнивается с остальными словами
            char c = strs[0].charAt(i);
            for(int j = 0; j < strs.length;j++){
                if( i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
