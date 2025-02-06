package org.example.students;

public record Score(String name, String subject, int score) {
    public void add(int score) {
    }
}
