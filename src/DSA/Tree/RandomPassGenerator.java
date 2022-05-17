package Tree;

public class RandomPassGenerator {

    public static void main(String[] args) {

        int characters = 0;
        String ourPassword = "";
        int chose;
        boolean capA = true;
        boolean smlA = true;
        boolean sChars = true;
        boolean digits = true;

        while (characters <= 4 && ourPassword.length() <= 8) {

            int n = (int) (Math.random() * 5);
            switch (n) {

                case 1:
                    chose = (int)(Math.random()*26);
                    ourPassword += (char)(chose+'A');
                    if (capA)characters++;
                    capA = false;
                    break;
                case 2:
                    chose = (int)(Math.random()*10);
                    ourPassword += (char)(chose+'0');
                    if (digits)characters++;
                    digits = false;
                    break;
                case 3:
                    chose = (int)(Math.random()*26);
                    ourPassword += (char)(chose+'a');
                    if (smlA)characters++;
                    smlA = false;
                    break;
                case 4:
                    chose = (int)(Math.random()*5);
                    ourPassword += (char)(chose+'<');
                    if (sChars)characters++;
                    sChars = false;
                    break;
            }
        }

        System.out.println(ourPassword);
    }
}
