package com.example.library.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.library.entity.LibraryEntity;
import com.example.library.entity.Students;

@Component
public class LibraryDao {
	@Autowired
	LibraryJpaInterface libraryJpaInterface;
	@Autowired
	StudentJpaInterface studentJpaInterface;

	public LibraryEntity add(LibraryEntity entity) {
		return libraryJpaInterface.save(entity);
	}

	public List<LibraryEntity> showAll() {
		return libraryJpaInterface.findAll();

	}

	public Boolean returnBook(Long bookId, Long studentId) {
		Optional<LibraryEntity> optional = libraryJpaInterface.findById(bookId);
		if (optional.isPresent()) {
			LibraryEntity entity = optional.get();
			Set<Students> studentSet = entity.getStudents();
			Optional<Students> optionalStudents = studentJpaInterface.findById(studentId);
			if (!optionalStudents.isPresent() || !studentSet.contains(optionalStudents.get())) {
				return false;
			}

			studentSet.remove(optionalStudents.get());
			entity.setStudents(studentSet);
			entity.setStockAvailable(entity.getStockAvailable() + 1);
			libraryJpaInterface.save(entity);
			return true;
		}

		return false;

	}

	public Boolean borrowBook(Long bookId, Long studentId) {
		Optional<LibraryEntity> optional = libraryJpaInterface.findById(bookId);
		if (optional.isPresent()) {
			LibraryEntity entity = optional.get();
			Set<Students> studentSet = entity.getStudents();
			Optional<Students> optionalStudents = studentJpaInterface.findById(studentId);
			if (!optionalStudents.isPresent() || studentSet.contains(optionalStudents.get())
					|| entity.getStockAvailable()==null||entity.getStockAvailable() <= 0 ) {
				return false;
			}

			studentSet.add(optionalStudents.get());
			entity.setStudents(studentSet);
			entity.setStockAvailable(entity.getStockAvailable() - 1);
			libraryJpaInterface.save(entity);
			return true;
		}

		return false;

	}

}
