package puto.spoj;

public class Add {

    public static String add(String a, String b) {
        String shorter;
        String longer;
        if (a.length() > b.length()) {
            shorter = b;
            longer = a;
        } else {
            shorter = a;
            longer = b;
        }

        byte[] longerDigits = asDigits(longer);
        byte[] shorterDigits = expand(asDigits(shorter), longerDigits.length);
        int length = shorterDigits.length;

        StringBuilder builder = new StringBuilder();

        int i = 1;
        while (i <= length) {
            int sum = shorterDigits[length - i] + longerDigits[length - i];

            if (sum >= 10 && i < length) {
                builder.append(sum % 10);
                shorterDigits[length - i - 1] = (byte) (shorterDigits[length - i - 1] + 1);
            } else {
                String reversedSum = new StringBuilder("" + sum).reverse().toString();
                builder.append(reversedSum);
            }
            i++;
        }
        return builder.reverse().toString();
    }

    private static byte[] expand(byte[] shorterDigits, int newSize) {
        byte[] expanded = new byte[newSize];
        System.arraycopy(shorterDigits, 0, expanded, newSize - shorterDigits.length, shorterDigits.length);
        return expanded;
    }

    private static byte[] asDigits(String str) {
        byte[] digits = str.getBytes();
        for (int i = 0; i < digits.length; i++) {
            digits[i] -= ((byte) '0');
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(add("3658", "4851254"));
    }
}
