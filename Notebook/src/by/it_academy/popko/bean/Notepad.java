package by.it_academy.popko.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Notepad {

	private ArrayList<Note> notes = new ArrayList<>();

	public Notepad() {
	}

	public Notepad(ArrayList<Note> notes) {
		this.notes = notes;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> note) {
		this.notes = note;
	}

	@Override
	public int hashCode() {
		return Objects.hash(notes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notepad other = (Notepad) obj;
		return Objects.equals(notes, other.notes);
	}

	@Override
	public String toString() {
		return "Notepad: " + "\n" + notes;
	}
}
