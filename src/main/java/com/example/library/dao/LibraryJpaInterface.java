package com.example.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.LibraryEntity;

public interface LibraryJpaInterface extends JpaRepository<LibraryEntity,Long> {

}
