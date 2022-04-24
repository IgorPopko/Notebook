package by.it_academy.popko.start;

import java.io.File;

import org.junit.Test;

import by.it_academy.popko.bean.Note;
import by.it_academy.popko.logic.NotepadLogic;
import junit.framework.Assert;

public class NotebookTest {

	@Test
	public void testGetFile() {
		
		File expected = NotepadLogic.getFile();
		
        File real = new File("notepadFile.txt");

        Assert.assertEquals(expected, real);
		
	}
	
	@Test
	public void testAddNote() {
		
		NotepadLogic logic = new NotepadLogic();
		
		Note note = logic.addNote();
		
		String expected = "Test string";
		
        String real = note.getNote();

        Assert.assertEquals(expected, real);
		
	}

}
