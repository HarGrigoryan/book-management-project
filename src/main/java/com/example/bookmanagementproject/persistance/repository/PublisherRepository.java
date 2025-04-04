package com.example.bookmanagementproject.persistance.repository;

import com.example.bookmanagementproject.persistance.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
