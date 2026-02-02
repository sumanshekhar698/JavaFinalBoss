package dev.codecounty.dsa.strings;

class RomanToInt {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue; // Subtractive case (e.g., the 'I' in 'IV')
            } else {
                total += currentValue; // Additive case
            }
            prevValue = currentValue;
        }
        return total;
    }

    private int getValue(char c) {
/*        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }*/

        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}