package com.example.bookmanagementproject.persistance.repository;

import com.example.bookmanagementproject.persistance.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
