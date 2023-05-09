package com.sda.she_likes_java.homework.exercise23;

public class Main {
    public static void main(String[] args) {
        LessonJournal pupilList = new LessonJournal();
        Pupil pupil1 = new Pupil("Ilze", "Bule");
        Pupil pupil2 = new Pupil("Anna", "Zirne");

        pupilList.addPupiltoList(pupil1);
        pupilList.addPupiltoList(pupil2);

        pupilList.displayPupilList();
        LessonJournal subjectsList = new LessonJournal();
        Subject subject1 = new Subject("Math");
        Subject subject2 = new Subject("Art");

        subjectsList.addSubjectList(subject1);
        subjectsList.addSubjectList(subject2);

        subjectsList.displaySubjectsList();
    }
}
