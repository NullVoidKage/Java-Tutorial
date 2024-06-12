package Stream;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Stream {
    public static void main(String[] args) {

    }

    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext()) {
            int num = it.next();
            if(num>10) {
                sum += num;
            }
        }
        return sum;
    }

    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

    private static void stream() {
        java.util.stream.Stream<Integer> stream = java.util.stream.Stream.of(1, 2, 3, 4);
        System.out.println(stream + " STREAM");

        java.util.stream.Stream<Integer> streamOf = java.util.stream.Stream.of(new Integer[]{1, 2, 3, 4});
        System.out.println(streamOf + " STREAM of");

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<1000; i++) myList.add(i);
        System.out.println(myList + " My List");

        java.util.stream.Stream<Integer> sequentialStream = myList.stream();
        System.out.println(sequentialStream + " Sequential Stream");

        java.util.stream.Stream<Integer> parallelStream = myList.parallelStream();
        System.out.println(parallelStream + " Parallel Stream");

        java.util.stream.Stream<String> generate = java.util.stream.Stream.generate(() -> "abc");
        System.out.println(generate + " Generate");

        java.util.stream.Stream<String> iterate = java.util.stream.Stream.iterate("abc", (i) -> i);
        System.out.println(iterate + " Iterate");

        LongStream longStream = Arrays.stream(new long[]{1,2,3,4});
        System.out.println(longStream + " Long Stream");

        IntStream intStream = "abc".chars();
        System.out.println(intStream + " Int Stream");

    }

    private static void convertStreamToCollection() {
        java.util.stream.Stream<Integer> integerStream = java.util.stream.Stream.of(1, 2, 3, 4);
        List<Integer> integerList = integerStream.toList();
        System.out.println(integerList);
    }

    private static void convertStreamToArray() {
        java.util.stream.Stream<Integer> integerStream = java.util.stream.Stream.of(1, 2, 3, 4);
        Integer[] intArray = integerStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));
    }

    /**
     * Use this when you want to filter
     */
    private static void streamFilter() {
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100;i++) myList.add(i);
        java.util.stream.Stream<Integer> sequentialStream = myList.stream();

        java.util.stream.Stream<Integer> highNums = sequentialStream.filter(p -> p > 90);
        highNums.forEach(p -> System.out.println(p + " "));
    }

    /**
     * Use this when you want to Map
     */
    private static void streamMap() {
        java.util.stream.Stream<String> names = java.util.stream.Stream.of("aBc", "d", "ef");
        System.out.println(names.map(String::toUpperCase).collect(Collectors.toList()));
    }

    /**
     * Use this when you want to sort
     */
    private static void streamSorted() {
        java.util.stream.Stream<String> stream = java.util.stream.Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = (List<String>) stream.sorted(Comparator.reverseOrder());

        java.util.stream.Stream<String> stream2 = java.util.stream.Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = stream2.sorted().toList();

    }

    /**
     * Use this when you want to use flatmap
     */
    public static void streamFlatMap() {
        java.util.stream.Stream<List<String>> namesOriginalList = java.util.stream.Stream.of(
                List.of("Pankaj"),
                Arrays.asList("David", "Lisa"),
                List.of("Amit"));
        java.util.stream.Stream<String> flatStream = namesOriginalList.flatMap(
                Collection::stream
        );
        flatStream.forEach(System.out::println);
    }


    public static List<Integer> processList() {
        List<List<Integer>> list = List.of(List.of(2, 3), List.of(4, 5), List.of(6, 7));

        return list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

    }

    //Map applies a given function to each item of an iterable (like a list or set) and returns a list of the results
    //Filter construct a list from elements of an iterable for which a function returns true


}
