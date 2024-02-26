package com.bdh.springbootbdhapp.dao;

import com.bdh.springbootbdhapp.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/books")
public interface BookRepository extends JpaRepository<Book, Long> {
    Page<Book> findByTitleContaining(@RequestParam("title") String title,  Pageable pageable);

    Page<Book> findByCategoryContaining(@RequestParam("category") String category, Pageable pageable);
}