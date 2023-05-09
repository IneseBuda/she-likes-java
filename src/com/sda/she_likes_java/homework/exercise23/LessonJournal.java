package com.sda.she_likes_java.homework.exercise23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LessonJournal {
    /*
    Exercise 23:
Create a lesson journal:
- it should provide 3 methods
- provide a list of pupils
- provide a list of subjects
- provide the pupil’s grades in the subject.
Think about what classes you will need.
What structures will you use to store the data: list, map, set.
     */

    private List<Pupil> pupils;
    public LessonJournal(){this.pupils = new ArrayList<>();
        this.subjects = new ArrayList<>();}

    public void displayPupilList(){
        System.out.println("Here are pupils list" + pupils);
    }

    private List<Subject> subjects;
   //public LessonJournalSubject(){this.subjects = new ArrayList<>();}
   public void addPupiltoList(Pupil pupilList) {
       pupils.add(pupilList);
   }
    public void addSubjectList(Subject subjectList){
        subjects.add(subjectList);
    }
    public void displaySubjectsList(){
        System.out.println("Here are subjects list" + subjects);
    }
    public static void pupilGradeInSubject(Map<String, Subject> subjectMap){
        System.out.println("Here is pupil grade in subject" + subjectMap.get("Here are grades"));
   for(Map.Entry<String,Subject> grade : subjectMap.entrySet()){
       System.out.println("Pupil" + grade.getKey());
       System.out.println("Subject" + grade.getValue());
   }
    }


}
