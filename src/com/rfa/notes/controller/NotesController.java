package com.rfa.notes.controller;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import com.rfa.notes.dao.NoteDAOImpl;
import com.rfa.notes.model.Note;

@ManagedBean
@ApplicationScoped
public class NotesController {
	
	private NoteDAOImpl notes;
	
	private Note newNote;
	
	public NotesController() {
		this.newNote = new Note();
		notes = new NoteDAOImpl();
	}
	
	public List<Note> getAllNotes() {
		System.out.println(this.notes.getAllNotes());
		return this.notes.getAllNotes();
	}

	public String insereNota() {
		notes.addNote(newNote);
		this.newNote = new Note();
		return null;
	}
	
	public Note getNewNote() {
		return this.newNote;
	}
}
