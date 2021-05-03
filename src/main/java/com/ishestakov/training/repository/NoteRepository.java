package com.ishestakov.training.repository;

import com.ishestakov.training.entity.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}


