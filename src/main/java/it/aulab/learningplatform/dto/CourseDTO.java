package it.aulab.learningplatform.dto;

import java.util.List;

import it.aulab.learningplatform.model.Lesson;
import it.aulab.learningplatform.model.Student;



public class CourseDTO {
    private Long id;
    private String name;
    private String description;
    private String teacher_firstname;
    private String teacher_lastname;
    private String date;
    private List<Lesson> lessons;
    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    private List<Student> students;
    // private List<LessonDTO> lessons;
    // private List<StudentDTO> students;

    
    public CourseDTO() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTeacher_firstname() {
        return teacher_firstname;
    }
    public void setTeacher_firstname(String teacher_firstname) {
        this.teacher_firstname = teacher_firstname;
    }
    public String getTeacher_lastname() {
        return teacher_lastname;
    }
    public void setTeacher_lastname(String teacher_lastname) {
        this.teacher_lastname = teacher_lastname;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
