package com.rfa.notes.dao;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.rfa.notes.model.Note;

@ManagedBean
@ApplicationScoped
public class NoteDAOImpl implements NoteDAO {

	private List<Note> notes_database = null;
	
	public NoteDAOImpl() {
		this.notes_database = new ArrayList<Note>();
	}	
	
	@Override
	public List<Note> getAllNotes() {
		return this.notes_database;
	}

	@Override 
	public boolean addNote(Note n) {
		
		n.setId(this.notes_database.size());
		
		return this.notes_database.add(n);
	}
}
