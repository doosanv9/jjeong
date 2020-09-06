package math;

public class Alarusse {
    public int multiple(int n, int m){
        int q = 0;
        if(n%2 == 1){
            q = m;
        }

        while(n != 1){
            n/=2;
            m*=2;
            if(n%2 == 1){
                q += m;
            }
        }
        return q;
    }
}
