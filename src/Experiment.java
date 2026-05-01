public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\nArray size: " + size);

            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = randomArray.clone();
            sorter.advancedSort(sortedArray);

            System.out.println("Random array:");
            System.out.println("Bubble: " + measureSortTime(randomArray, "basic") + " ns");
            System.out.println("Merge: " + measureSortTime(randomArray, "advanced") + " ns");

            System.out.println("Sorted array:");
            System.out.println("Bubble: " + measureSortTime(sortedArray, "basic") + " ns");
            System.out.println("Merge: " + measureSortTime(sortedArray, "advanced") + " ns");

            int target = sortedArray[size / 2];

            System.out.println("Search (Binary): " +
                    measureSearchTime(sortedArray, target) + " ns");
        }
    }
}