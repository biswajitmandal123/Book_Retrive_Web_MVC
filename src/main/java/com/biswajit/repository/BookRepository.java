package com.biswajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswajit.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

}
