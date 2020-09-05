public class Squared {

    long getSquared(long n){
        long answer = -1;
        int num = 0;

        while(num < (n/2)){
            if(num*num == n){
                answer = (num+1) * (num+1);
                break;
            }

            if(num*num > n){
                break;
            }
            num++;
        }
        return answer;
    }
}
