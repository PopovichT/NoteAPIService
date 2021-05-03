package com.ishestakov.training.repository;

import com.ishestakov.training.entity.NoteComment;
import org.springframework.data.repository.CrudRepository;

public interface NoteCommentRepository extends CrudRepository<NoteComment, Long> {
}


