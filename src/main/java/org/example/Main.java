package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class Main {

    public static List<String> ConvertToUpper(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }
    @FunctionalInterface
    interface Summator {
        Integer sum(Integer a, Integer b);
    }
    public static void main(String[] args) {

        // #1

        /*
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer age = scanner.nextInt();
        Person p = new Person(name, age);
        p.Introduce();
        */

        // #2

        /*
        Scanner scanner = new Scanner(System.in);
        Integer width = scanner.nextInt();
        Integer height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.calculateArea());

        width = scanner.nextInt();
        height = scanner.nextInt();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        System.out.println(rectangle.calculateArea());
        */

        // #3

        /*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        evenNumbers.forEach(System.out::println);
         */

        // #4

        /*
        Summator summator = (x, y) -> x + y;
        System.out.println(summator.sum(3, 4));
        */

        // #5

        /*
        List<String> languages = Arrays.asList("java", "c++", "python", "html", "javascript", "php");

        for (String s : ConvertToUpper(languages)) {
            System.out.println(s);
        }
        */
    }
}