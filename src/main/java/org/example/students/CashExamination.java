package org.example.students;

import java.io.Serializable;
import java.util.List;

public class CashExamination implements Cash {

    @Override
    public double getAverageForSubject(List<Score> subject) {
        int sumScore = 0;
        for (Score score : subject) {
            sumScore = sumScore + score.score();
        }
        return (double) sumScore / subject.size();

    }
}
