import java.util.Arrays;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        Collections.shuffle(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
    }
}


   
