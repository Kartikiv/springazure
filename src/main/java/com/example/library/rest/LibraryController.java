package com.example.library.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.dao.LibraryDao;
import com.example.library.entity.LibraryEntity;

import jakarta.persistence.GeneratedValue;

@RestController
@RequestMapping("/library")
public class LibraryController {
	@Autowired
	LibraryDao libraryDao;
	
	@PostMapping("/save")
	public LibraryEntity save(@RequestBody LibraryEntity entity) {
		return libraryDao.add(entity);
	}
	@GetMapping("/getall")
	public List<LibraryEntity>getAll(){
		return libraryDao.showAll();
	}
	@GetMapping("/sample")
	public LibraryEntity sample() {
		return new LibraryEntity();
	}
	@PostMapping("/returnbook")
	public Boolean returnBook(@RequestParam Long bookId,@RequestParam Long studentId) {
		return libraryDao.returnBook(bookId, studentId);
	}
	@PostMapping("/borrowbook")
	public Boolean borrowBook(@RequestParam Long bookId,@RequestParam Long studentId) {
		return libraryDao.borrowBook(bookId, studentId);
	}

}
