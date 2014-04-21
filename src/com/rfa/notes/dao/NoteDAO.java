package com.rfa.notes.dao;

import java.util.List;
import com.rfa.notes.model.Note;

public interface NoteDAO {
	List<Note> getAllNotes();
	boolean addNote(Note n);
}
