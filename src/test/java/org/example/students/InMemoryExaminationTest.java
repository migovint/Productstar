package org.example.students;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class InMemoryExaminationTest {

    private Examination exam;

    @BeforeEach
    void setUp() {
        exam = new InMemoryExamination();
    }

    @Test
    void putScore() throws ItemNotFoundException {
        Score score = new Score("Fedia", "История", 4);
        exam.putScore(score);
        Score actual = exam.getScore(score.name());
        Assertions.assertEquals(score, actual);
    }

    @Test
    void getScore() {
        //  exam.getScore("Vasa");
        Assertions.assertThrows(ItemNotFoundException.class, () -> exam.getScore("Vasa"));
    }

    @Test
    void getAverageForSubject() {
        Score score1 = new Score("Pasha", "history", 5);
        Score score2 = new Score("Sasha", "history", 3);
        Score score3 = new Score("Masha", "history", 3);
        Score score4 = new Score("Dasha", "history", 4);
        Score score5 = new Score("Rasha", "history", 5);
        List<Score> namber = List.of(score1, score2, score3, score4, score5);

        double averageMark = exam.getAverageForSubject(namber);
        Assertions.assertEquals(4, averageMark);


    }

    @Test
    void multipleSubmissionsStudentNames() {
        Score score1 = new Score("Pasha", "history", 5);
        Score score2 = new Score("Pasha", "history", 3);
        Score score3 = new Score("Masha", "history", 3);
        Score score4 = new Score("Sasha", "history", 4);
        Score score5 = new Score("Dasha", "history", 5);

        List<Score> name = List.of(score1, score2, score3, score4, score5);

        exam.multipleSubmissionsStudentNames(name);

        Assertions.assertEquals("Pasha", score1.name());


    }

    @Test
    void lastFiveStudentsWithExcellentMarkOnAnySubject() {
        Score score1 = new Score("Pasha", "history", 5);
        Score score2 = new Score("Fediy", "history", 3);
        Score score3 = new Score("Masha", "history", 3);
        Score score4 = new Score("Sasha", "history", 4);
        Score score5 = new Score("Dasha", "history", 5);
        Score score6 = new Score("Lana", "history", 5);
        Score score7 = new Score("Katy", "history", 5);
        Score score8 = new Score("Boris", "history", 5);

        List<Score> stud = List.of(score1, score2, score3, score4, score5, score6, score7, score8);
        //List<String> fiveStudents1 = new ArrayList<>();
        Set<String> fiveStudents = exam.lastFiveStudentsWithExcellentMarkOnAnySubject(stud);

        Assertions.assertEquals(Set.of("Dasha", "Katy", "Boris", "Lana","Pasha"), fiveStudents);
    }

    @Test
    void getAllScores() {

        Score score1 = new Score("Pasha", "history", 5);
        Score score2 = new Score("Fediy", "history", 3);
        Score score3 = new Score("Masha", "history", 3);
        Score score4 = new Score("Sasha", "history", 4);
        Score score5 = new Score("Dasha", "history", 5);
        Score score6 = new Score("Lana", "history", 5);
        Score score7 = new Score("Katy", "history", 5);
        Score score8 = new Score("Boris", "history", 5);

        List<Score> stud = List.of(score1, score2, score3, score4, score5,score6, score7, score8);

        exam.getAllScores(stud);

        Assertions.assertEquals(8, stud.size());
    }
}