public class harshadnumber {
    public boolean solution(int x) {
        boolean answer = false;

        int sumOfx = 0;
        int tmpx = x;

        for (int i = 0; i < 5; i++) {
            sumOfx += x % 10;
            x = (int) (x / 10);
        }

        if (tmpx % sumOfx == 0) {
            answer = true;
        }

        return answer;
    }
}
