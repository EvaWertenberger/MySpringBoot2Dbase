package ru.vertenberger.MySpringBoot2Dbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vertenberger.MySpringBoot2Dbase.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
