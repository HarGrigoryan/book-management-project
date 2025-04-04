package com.example.bookmanagementproject.persistance.repository;

import com.example.bookmanagementproject.persistance.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
