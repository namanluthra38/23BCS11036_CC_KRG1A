import java.util.Arrays;
import java.util.Comparator;

public class ProblemOne {
    public static void main(String[] args) {
        int[][] tasks = {{1, 2}, {2, 4}, {10, 11}, {10, 12}, {8, 9}};
        Arrays.sort(tasks, Comparator.comparingInt(a -> -(a[1] - a[0])));
        int ans = 0;
        for(int i = 0; i < tasks.length; i++){
            ans += tasks[i][0];
        }

        int remaining = ans;

        for(int i = 0; i < tasks.length; i++){
            if(tasks[i][1] > remaining){
                ans += tasks[i][1] - remaining;
            }
            remaining -= tasks[i][0];
        }

        System.out.println(ans);

    }
}