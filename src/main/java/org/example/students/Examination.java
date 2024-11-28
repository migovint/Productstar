package org.example.students;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Examination {
    void putScore(Score score); //добавить счет

    Score getScore(String name) throws ItemNotFoundException; //получите баллы

    double getAverageForSubject(List<Score> subject);//получите Среднее Значение По Предмету

    Set<String> multipleSubmissionsStudentNames(List<Score> name); //несколько отправленных имен учащихся

    Set<String> lastFiveStudentsWithExcellentMarkOnAnySubject(List<Score> stud); //последние Пять Учеников С Отличными Оценками По Любому Предмету

    void getAllScores(List<Score> stud); //Получите все баллы

    void putAllItems(List<Score> score);

}
