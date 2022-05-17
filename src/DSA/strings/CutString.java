package strings;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class CutString {

    public static void main(String  args [] ) {

        StringBuffer sb = new StringBuffer("4+45-23");
        char operator = '\0';
        String a = "";
        String b = "";
        int i = 0;
        int j = 0;
        long result = 0;
        StringBuffer st = new StringBuffer("");
        boolean stringEnd = false;

        while (j <= sb.length()) {

            j = i;

            while (sb.charAt(j) >= '0' && sb.charAt(j) <= '9') {

                j++;
                if (j == sb.length()) {
                    stringEnd = true;
                    break;
                }
            }

            if (stringEnd) break;

            a = sb.substring(i , j);
            operator = sb.charAt(j);

            j++;
            i = j;
            while (sb.charAt(j) >= '0' && sb.charAt(j) <= '9') {

                j++;
                if (j == sb.length()) break;
            }

            b = sb.substring(i , j);

            switch (operator) {

                case '+':
                    result = Long.parseLong(a) + Long.parseLong(b);
                    sb = sb.delete(0 , j);
                    sb = st.append(result).append(sb);
                    break;

                case '-':
                    result = Long.parseLong(a) - Long.parseLong(b);
                    sb = sb.delete(0 , j);
                    sb = st.append(result).append(sb);
                    break;

                case '*':
                    result = Long.parseLong(a) * Long.parseLong(b);
                    sb = sb.delete(0 , j);
                    sb = st.append(result).append(sb);
                    break;

                case '/':
                    result = Long.parseLong(a) / Long.parseLong(b);
                    sb = sb.delete(0 , j);
                    sb = st.append(result).append(sb);
                    break;
            }

            i = 0;
        }

       System.out.println(sb);
    }
}
