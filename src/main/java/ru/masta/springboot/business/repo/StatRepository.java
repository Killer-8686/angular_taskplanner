package ru.masta.springboot.business.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.masta.springboot.business.entity.Stat;

@Repository
public interface StatRepository extends JpaRepository<Stat, Long> {
}
