package ru.masta.springboot.business.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.masta.springboot.business.entity.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
