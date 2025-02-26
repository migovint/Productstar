package org.example.students;

import java.util.TreeSet;
import java.util.*;
import java.util.stream.Collectors;

public class ResultsBoard {

    TreeSet<Record> studentSet = new TreeSet<>();


    public static void main(String[] args) {
        ResultsBoard board = new ResultsBoard();
        board.addStudent("Vasia", 4.3);
        board.addStudent("Sania", 5.5);
        board.addStudent("Mila", 4.7);
        board.addStudent("Dasha", 5.1);
        board.addStudent("Boris", 2.2);
        board.addStudent("Kostia", 5.6);
        board.addStudent("Lana", 1.4);


        System.out.println(board.top3(5));


    }

    public ResultsBoard() {

    }


    void addStudent(String name, Double score) {

        Record record = new Record();
        record.name = name;
        record.score = score;
        studentSet.add(record);
    }


    List<Record> top3(double estimation) {
        Record o = new Record();
        o.score = estimation;

        NavigableSet<Record> topSet = studentSet.tailSet(o, true);
        List<Record> result = new ArrayList<>(3);
        double k = Math.max(topSet.size() - 3, 0);
        //  for (int i = topSet.size(); i > Math.max(topSet.size() - 3, 0); i--) {
        for (int i = 0; i < 3; i++) {

                if (!topSet.isEmpty()) {
                    result.add(topSet.pollFirst());
                }

            }

            return result.reversed();
        }

    }

    class Record implements Comparable<Record> {
        String name;
        Double score;

        @Override
        public int compareTo(Record o) {


            return this.score.compareTo(o.score);
        }

        @Override
        public String toString() {
            return "Имя - " + name + ", Средний бал = " + score + "] " + "\n";
        }
    }