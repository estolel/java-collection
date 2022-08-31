package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, (accumulator, currentNumber)->(
                            currentNumber%2==0?accumulator:currentNumber
                        )
                );
    }

    public String getLongest(List<String> words) {
        return  words.stream().reduce()
    }

    public int getTotalLength(List<String> words) {
        return 0;
    }
}
