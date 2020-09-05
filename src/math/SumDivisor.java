package math;

public class SumDivisor {
    public int getSumDivisor(int n){
        int answer = 0;
        int factor = 2;

        while(factor<=n/2){
            if(n%factor == 0){
                answer += factor;
            }
            factor++;
        }
        return answer;
    }
}
