package ru.vertenberger.MySpringBoot2Dbase.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vertenberger.MySpringBoot2Dbase.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}