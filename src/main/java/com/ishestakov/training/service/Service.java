package com.ishestakov.training.service;

import com.ishestakov.training.repository.NoteCommentRepository;
import com.ishestakov.training.entity.Note;
import com.ishestakov.training.entity.NoteComment;
import com.ishestakov.training.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    private NoteRepository noterepository;
    private NoteCommentRepository notecommentrepository;

    @Autowired
    public Service(NoteRepository noterepository, NoteCommentRepository notecommentrepository) {

        this.noterepository = noterepository;
        this.notecommentrepository = notecommentrepository;

    }


    public Note createNote(String name, String text) {
        var note = new Note(name, text);
        noterepository.save(note);
        return note;

    }

    public NoteComment createNoteComment(Long note_id, String comment) {
        var notecomment = new NoteComment(note_id, comment);
        notecommentrepository.save(notecomment);
        return notecomment;
    }
}
