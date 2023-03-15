import java.util.ArrayList;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        int[] numbers = { 5, 3, 2, 0 };

        Arrays.sort(numbers);
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }

        String[] names = { "Sharp", "Samsung", "Tidal", "Spotify", "St.Lukes", "JP.Morgan" };

        Arrays.sort(names);
        System.out.println();

        for (int j = 0; j < names.length; j++) {
            System.out.print(names[j] + " ");
        }
        System.out.println();

        // ArraysList Example
        ArrayList<String> myFamily = new ArrayList<>(Arrays.asList("Abraham", "Maria", "Irma", "Yvonne", "Kevin"));
        System.out.println(myFamily);
    }
}