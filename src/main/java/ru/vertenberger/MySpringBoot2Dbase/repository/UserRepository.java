package ru.vertenberger.MySpringBoot2Dbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vertenberger.MySpringBoot2Dbase.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
