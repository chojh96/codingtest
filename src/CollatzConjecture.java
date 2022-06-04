public class CollatzConjecture {
    public int solution(int num) {
        int answer = 0;
        double number = num;

        while(number != 1 && answer < 500){
            if(number % 2 == 0){
                number = number / 2;
            }
            else{
                number = number * 3 + 1;
            }
            answer += 1;

        }

        if(answer >= 500){
            answer = -1;
        }

        return answer;
    }
}
