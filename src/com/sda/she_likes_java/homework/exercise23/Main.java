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


        Map<Pupil, Grade> gradesInSubjectArt = new HashMap<>();
        gradesInSubjectArt.put(new Pupil("Ilze", " Bule"), new Grade(9));
        gradesInSubjectArt.put(new Pupil("Anna", " Zirne"), new Grade(7));
       // System.out.println("Here are pupils grade in art" + gradesInSubjectArt);
        System.out.println("Grades in Art: ");
        pupilGradeInSubject(gradesInSubjectArt);


        Map<Pupil, Grade> gradesInSubjectMath = new HashMap<>();
        gradesInSubjectMath.put(new Pupil("Ilze", " Bule"), new Grade(10));
        gradesInSubjectMath.put(new Pupil("Anna", " Zirne"), new Grade(6));
       // System.out.println("Here are pupils grade in art" + gradesInSubjectMath);
        System.out.println("Grades in Math: ");
        pupilGradeInSubject(gradesInSubjectMath);
    }
}

