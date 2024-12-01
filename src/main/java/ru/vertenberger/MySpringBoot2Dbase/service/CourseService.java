package ru.vertenberger.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.vertenberger.MySpringBoot2Dbase.entity.Course;
import java.util.List;

@Service
public interface CourseService {
    List<Course> getAllCourses();

    Course getCourse(int id);

    Course saveCourse(Course course);

    void deleteCourse(int id);
}
