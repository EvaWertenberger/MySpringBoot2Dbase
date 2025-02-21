package ru.vertenberger.MySpringBoot2Dbase.dao;

import org.springframework.stereotype.Repository;
import ru.vertenberger.MySpringBoot2Dbase.entity.Course;
import java.util.List;
@Repository
public interface CourseDAO {
    List<Course> getAllCourses();

    Course saveCourse(Course course);

    Course getCourse(int id);

    void deleteCourse(int id);
}
