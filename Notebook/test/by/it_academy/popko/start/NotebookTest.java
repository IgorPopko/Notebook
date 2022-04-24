package by.it_academy.popko.start;

import java.io.File;

import org.junit.Test;

import by.it_academy.popko.logic.NotepadLogic;
import junit.framework.Assert;

public class NotebookTest {

	@Test
	public void testGetFile() {
		
		File expected = NotepadLogic.getFile();

        File real = new File("E:\\Workspace\\Notebook\\notepadFile.txt");

        Assert.assertEquals(expected, real);
		
	}

}
