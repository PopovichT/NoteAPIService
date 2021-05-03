package com.ishestakov.training.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class NoteComment {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "note_id")
    private Long note_id;

    @Column(name = "comment")
    private String comment;

    public NoteComment(Long note_id, String comment) {
        this.note_id = note_id;
        this.comment = comment;
    }
}
