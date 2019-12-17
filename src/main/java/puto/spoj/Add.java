package puto.spoj;

public class Add {

    public static String add(String a, String b) {
        byte[] aa = a.getBytes();
        for(int i=0; i<aa.length; i++){
            aa[i]-=((byte)'0');
        }

        byte[] bb = b.getBytes();
        for(int i=0; i<bb.length; i++){
            bb[i]-=((byte)'0');
        }

        int n = aa.length;
        int m = bb.length;
        byte[] cc;
        byte[] dd;
        if (n > m) {
            cc = new byte[n];
            System.arraycopy(bb, 0, cc, n - m, m);
            dd = aa;
        } else {
            cc = new byte[m];
            System.arraycopy(aa, 0, cc, m - n, n);
            dd = bb;
        }

        StringBuilder builder = new StringBuilder();

        int i = 1;
        int length = cc.length;
        while (i <= length) {
            int sum =cc[length - i] + dd[length - i];

            if (sum >= 10 && i<length) {
                builder.append(sum % 10);
                cc[length - i - 1] = (byte) (cc[length - i - 1]+ 1);
            } else {
                builder.append(sum);
            }
            i++;
        }
        return builder.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(add("3658", "4851254"));
    }
}
