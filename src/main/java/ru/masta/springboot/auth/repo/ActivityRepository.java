package ru.masta.springboot.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.masta.springboot.auth.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
