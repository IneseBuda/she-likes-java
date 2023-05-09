package com.sda.she_likes_java.homework.exercise23;

import java.util.HashMap;
import java.util.Map;

import static com.sda.she_likes_java.homework.exercise23.LessonJournal.pupilGradeInSubject;

public class Main {
    public static void main(String[] args) {
        LessonJournal pupilList = new LessonJournal();
        Pupil pupil1 = new Pupil("Ilze", "Bule");
        Pupil pupil2 = new Pupil("Anna", "Zirne");

        pupilList.addPupiltoList(pupil1);
        pupilList.addPupiltoList(pupil2);

        pupilList.displayPupilList();
        LessonJournal subjectsList = new LessonJournal();
        Subject subject1 = new Subject("Math", 8);
        Subject subject2 = new Subject("Art", 8);

        subjectsList.addSubjectList(subject1);
        subjectsList.addSubjectList(subject2);

        subjectsList.displaySubjectsList();



        Map<Pupil,Subject> pupilGradeInSubject = new HashMap<>();
        pupilGradeInSubject.put(new Pupil("Ilze","Bule"), new Subject("Math",8));
        pupilGradeInSubject.put(new Pupil("Anna","Zirne"),new Subject("Math", 9));
        pupilGradeInSubject.put(new Pupil("Ilze","Bule"), new Subject("Art",10));
        pupilGradeInSubject.put(new Pupil("Anna","Zirne"),new Subject("Art", 7));
       System.out.println("grades" + pupilGradeInSubject.get("Ilze"));

    }
}
