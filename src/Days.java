public class Days {
    public String cntDays(int a, int b) {
        String answer = "";
        int days = 0;

        for(int i=1;i<a;i++){
            if(i ==1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                days += 31;
            } else if(i == 2) {
                days += 29;
            } else {
                days +=30;
            }
        }

        days += b;
        days = days % 7;

        switch(days){
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break;
        }

        return answer;
    }
}
