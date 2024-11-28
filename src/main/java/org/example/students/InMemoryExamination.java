package org.example.students;

import java.util.*;

public class InMemoryExamination implements Examination {

    private final Map<String, Score> items = new HashMap<>();


    @Override
    public void putScore(Score score) {
        items.put(score.name(), score);
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
        for (Score score : subject) {
            sumScore = sumScore + score.score();
        }
        return (double) sumScore / subject.size();


    }

    @Override
    public Set<String> multipleSubmissionsStudentNames(List<Score> name1) {
        String name = "";
        Set<Score> once = new HashSet<>();
        for (Score score : name1) {
            if (!once.add(score)) {
                name = score.name();
            }
        }
        return Collections.singleton(name);


    }

    @Override
    public Set<String> lastFiveStudentsWithExcellentMarkOnAnySubject(List<Score> stud) {
        Set<String> fiveStudents = new HashSet<>();
        for (Score items : stud) {
            if (items.score() == 5) {
                fiveStudents.add(items.name());
            }
        }
        return (Set<String>) fiveStudents;
    }

    @Override
    public void getAllScores(List<Score> stud) {
        for (Score score : stud) {
            System.out.println(score);
        }
    }

    @Override
    public void putAllItems(List<Score> score) {

    }
}
