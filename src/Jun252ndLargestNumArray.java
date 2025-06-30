import java.util.Arrays;
public class Jun252ndLargestNumArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        for (int i=0;i<numbers.length-1;i++)
        {
            for (int j=0;j<numbers.length-1-i;j++){

                if (numbers[j] > numbers[j + 1]) {
                    // Swap elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
        }}





    }
        for (int k=0;k<numbers.length;k++){
         // System.out.println(numbers[numbers.length-2]);

        } System.out.println("Second largetst number is:::"+numbers[numbers.length-2]);

    }}
