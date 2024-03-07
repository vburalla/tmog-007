package org.tfoc;

import java.util.Arrays;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public boolean isAnagram(String s, String t) {

        boolean response = false;
        if (s.length() == t.length()) {
            char[] tArray = t.toCharArray();
            Arrays.sort(tArray);
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);

            response = Arrays.equals(sArray,tArray);
        }
        return response;
    }

}
