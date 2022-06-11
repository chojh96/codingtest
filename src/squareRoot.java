public class squareRoot {
    public long solution(long n) {
        long answer = 0;
        double tmp = Math.sqrt(n);

        if(tmp * 10 % 10 == 0) {
            answer = (long)((tmp + 1) * (tmp + 1));
        }
        else
            answer = -1;

        return answer;
    }
}
