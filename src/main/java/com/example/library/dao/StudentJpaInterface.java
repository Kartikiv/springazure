package com.example.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.LibraryEntity;
import com.example.library.entity.Students;

public interface StudentJpaInterface extends JpaRepository<Students,Long>{

}
