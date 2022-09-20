package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil: pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            rsl.add(new Label(pupil.name(), sum / pupil.subjects().size()));
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                Integer score = temp.get(subject.name());
                if (score != null) {
                    score += subject.score();
                } else {
                    score = subject.score();
                }
                temp.put(subject.name(), score);
            }
        }
        List<Label> rsl = new ArrayList<>();
        for (Map.Entry<String, Integer> e : temp.entrySet()) {
             rsl.add(new Label(e.getKey(), e.getValue() / pupils.size()));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            rsl.add(new Label(pupil.name(), sum));
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl.get(rsl.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                Integer score = temp.get(subject.name());
                if (score != null) {
                   score += subject.score();
                } else {
                   score = subject.score();
                }
            temp.put(subject.name(), score);
            }
        }
        List<Label> rsl = new ArrayList<>();
        for (Map.Entry<String, Integer> e : temp.entrySet()) {
            rsl.add(new Label(e.getKey(), e.getValue()));
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl.get(rsl.size() - 1);
    }
}
