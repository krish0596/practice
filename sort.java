import java.util.*;

public class sort {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 2, 8, 3, 1, 1, 1, 6, 6, 6};
        frequencySort(arr);
    }

    public static void frequencySort(int[] arr) {
        // Create a frequency map using HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of array elements and sort it based on frequency
        List<Integer> elements = new ArrayList<>();
        for (int num : arr) {
            elements.add(num);
        }
        elements.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b) - frequencyMap.get(a);
            if (freqCompare == 0) {
                return arr.indexOf(a) - arr.indexOf(b);
            }
            return freqCompare;
        });

        // Print the sorted elements
        for (int num : elements) {
            System.out.print(num + " ");
        }
    }
}
