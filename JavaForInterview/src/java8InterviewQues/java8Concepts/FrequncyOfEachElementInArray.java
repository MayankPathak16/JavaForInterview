package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequncyOfEachElementInArray {
    public static void main(String[] args) {
        List<String> stationaryList = Arrays.asList("Pen", "Eraser", "NoteBook", "Pen", "Pencil", "Stapler", "NoteBook", "Pencil");
        //Here We need to count like how many times one elements is repeating
        //Function - Accept one argument and produces a result
        Map<String, Long> stationaryCountMap = stationaryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationaryCountMap);

    }
}
