package programmers;

public class Compare {
    boolean compareCp(String s) {
        boolean answer = true;
        int cntP = 0;
        int cntY = 0;

        for(int i=0;i<s.length();i++){
            String str = (String.valueOf(s.charAt(i))).toLowerCase();

            if(str.equals("p")){
                cntP++;
            } else if((String.valueOf(s.charAt(i))).toLowerCase().equals("y")){
                cntY++;
            }
        }

        if(cntP != cntY){
            answer = false;
        }

        return answer;
    }

}
