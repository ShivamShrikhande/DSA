
class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char ch = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == ch) {
                count++;
                read++;
            }

            chars[write++] = ch;

            if (count > 1) {
                String num = String.valueOf(count);

                for (int i = 0; i < num.length(); i++) {
                    chars[write++] = num.charAt(i);
                }
            }
        }

        return write;
    }
}
