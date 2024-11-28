package org.example.students;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    private Cash cash;


    @BeforeEach
    void setUp() {
        cash = (Cash) new CashExamination();

    }

    @Test
    void getAverageForSubject() {
        Score score = new Score("Peta", "math", 4);
        Score score1 = new Score("Feta", "math", 5);
        Score score2 = new Score("Reta", "math", 4);
        Score score3 = new Score("Keta", "math", 3);

        List<Score> list = (List.of(score, score1, score2, score3));

        double ocenka = cash.getAverageForSubject(list);
        Assertions.assertEquals(4, ocenka);


    }
}