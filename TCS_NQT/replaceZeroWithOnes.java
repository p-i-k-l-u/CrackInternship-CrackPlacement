package TCS_NQT;

public class replaceZeroWithOnes {

    public static int replaceWithzeroandone(int num) {
        if (num == 0) {
            return 1;
        }

        int ans = 0, temp = 1;
        while (num > 0) {
            int d = num % 10;
            if (d == 0) {
                d = 1;
            }
            ans = d * temp + ans;
            num = num / 10;
            temp = temp * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 20036005;
        int res = replaceWithzeroandone(n);
        System.out.println("After replacing zeros with ones " + n + " becomes " + res);
    }
}
