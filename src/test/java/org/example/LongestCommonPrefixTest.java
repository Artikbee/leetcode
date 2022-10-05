package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix1(){
        String res = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});
        assertEquals("fl",res);
    }

}