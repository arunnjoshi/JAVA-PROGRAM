import java.util.Scanner;

class stringSum {

    public void addString(String small, String big, int diff) {
        for (int i = 0; i < diff; i++) {
            small = "0" + small;
        }

        // System.out.println("big" + big);
        // System.out.println("low" + small);
        int sum = 0, carry = 0;
        String res = new String();
        for (int i = big.length() - 1; i >= 0; i--) {
            sum = (int) big.charAt(i) - '0' + (int) small.charAt(i) - '0' + carry;
            if (sum > 9 && i != 0) {
                sum %= 10;
                carry = 1;

            } else
                carry = 0;
            res = Integer.toString(sum) + res;
        }
        System.out.println(res);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String a, b;
        a = scan.nextLine();
        b = scan.nextLine();
        scan.close();
        // System.out.println(a);
        // System.out.println(b);

        int a_l = a.length();
        int b_l = b.length();

        int diff = a_l - b_l;

        stringSum ls = new stringSum();

        if (diff > 0)
            ls.addString(b, a, diff);
        else
            ls.addString(a, b, diff * -1);
    }
}