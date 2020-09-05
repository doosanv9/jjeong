package programmers;

public class Gcd {
    int[] getGcd(int n, int m) {
        int[] arr = new int[2];
        if(n > 10000 || m > 10000){
            return arr;
        }

        int factor = 1;
        int remainder = 0;
        int gcd = 1;
        int lcm = 0;


        while (factor <= n && factor <= m) {
            if (n % factor == 0 && m % factor == 0) {
                gcd = gcd * factor;
                n = n / factor;
                m = m / factor;
            }
            factor++;
        }

        arr[0] = gcd;
        arr[1] = gcd * n * m;

        return arr;
    }
}
