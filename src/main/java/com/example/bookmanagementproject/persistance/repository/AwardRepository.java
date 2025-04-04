package com.example.bookmanagementproject.persistance.repository;

import com.example.bookmanagementproject.persistance.entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwardRepository extends JpaRepository<Award, Long> {

    Award findByNameAndYear(String name, Integer year);
}
