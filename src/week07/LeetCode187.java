package week07;

import java.util.*;

public class LeetCode187 {
	public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<String>();
        boolean[] isExist = new boolean[1 << 20];
        boolean[] isAdd = new boolean[1 << 20];
        int k = (1 << 18) - 1, key = 0;
        for (int i = 0; i < s.length(); i++) {
            key <<= 2;
            key += getValue(s.charAt(i));
            if (i >= 9) {
                if (isExist[key]) {
                    if (!isAdd[key]) {
                        isAdd[key] = true;
                        list.add(s.substring(i - 9, i + 1));
                    }
                } else {
                    isExist[key] = true;
                }
                key &= k;
            }
        }
        return list;
    }
    private int getValue(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                throw new IllegalArgumentException("Illegal character");
        }
    }
}
