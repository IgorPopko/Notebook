package by.it_academy.popko.bean;

import java.time.LocalDate;
import java.util.Objects;

public class Note {

	private String note;
	private LocalDate dateOfNote;

	public Note() {
	}

	public Note(String note, LocalDate dateOfNote) {
		this.note = note;
		this.dateOfNote = dateOfNote;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LocalDate getDateOfNote() {
		return dateOfNote;
	}

	public void setDateOfNote(LocalDate dateOfNote) {
		this.dateOfNote = dateOfNote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfNote, note);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(dateOfNote, other.dateOfNote) && Objects.equals(note, other.note);
	}

	@Override
	public String toString() {
		return note + " (" + dateOfNote + ")";
	}

}
