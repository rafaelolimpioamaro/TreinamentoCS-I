import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,8,5,3,5,8,2};
        int[] resultante = {1,1,1,1,1,1,1,1,1};

        for (int i = 0; i < resultante.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j)
                    resultante[i] *= nums[j];
            }
        }

        System.out.println(Arrays.toString(resultante));
    }
}
