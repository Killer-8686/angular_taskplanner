package ru.masta.springboot.business.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.masta.springboot.business.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
