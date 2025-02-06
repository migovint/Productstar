package org.example.students;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class InMemoryExamination implements Examination {

    private final Map<String, Score> items = new HashMap<>();



    @Override
    public void putScore(Score score) {

      //  items.put(score.name(), score);
        if (!items.containsKey(score.name())) {
            items.put(score.name(), score);
        } else {
            System.out.println("Такой студент уже есть: " + score.name());

        }

    }

    @Override
    public Score getScore(String name) throws ItemNotFoundException {
        Score score = items.get(name);
        if (score == null) {
            throw new ItemNotFoundException(name);
        }
        return score;
    }


    @Override
    public double getAverageForSubject(List<Score> subject) {

        int sumScore = 0;
        if (subject.isEmpty()) {
            System.out.println("Список пустой");
        } else {
            for (Score score : subject) {
                sumScore = sumScore + score.score();
            }
        }
        return (double) sumScore / subject.size();

    }


    @Override
    public List<String> lastFiveStudentsWithExcellentMarkOnAnySubject(List<Score> stud) {
        List<String> fiveStudents = new LinkedList<>();
        if (stud.isEmpty()) {
            System.out.println("Нет отличников");
        }
        for (Score items : stud) {
            if (fiveStudents.size() == 5) {
                break;
            } else {

                if (items.score() == 5) {
                    fiveStudents.add(items.name());
                }
            }
        }
        if (fiveStudents.size() < 5) {
            System.out.println("Студентов отличников меньше 5 человек. Их всего - " + fiveStudents.size() + " человек.");
        }
        return fiveStudents;
    }

    @Override
    public void getAllScores(List<Score> stud) {


        Set<String> subjects = new HashSet<>();

        for (Score result : stud) {
            subjects.add(result.subject());
        }
       // return subjects;


    }
}
