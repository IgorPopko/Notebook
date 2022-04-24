package by.it_academy.popko.main;

import java.io.IOException;

import java.util.List;
import java.util.Scanner;

import by.it_academy.popko.bean.Note;
import by.it_academy.popko.logic.NotepadLogic;
import by.it_academy.popko.view.NotepadView;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		NotepadView view = new NotepadView();
		NotepadLogic logic = new NotepadLogic();
				
		boolean exit = false;
		while (!exit) {
			view.printMenu();
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				Note note = logic.addNote();
				logic.saveNote(note);
				break;
			}

			case 2: {
				List<String> listNotes = logic.removeNote();
				logic.saveNotepad(listNotes);
				break;
			}

			case 3: {
				logic.viewNotes();
				break;
			}

			case 4: {
				logic.findNoteByDateAdded();
				break;
			}

			case 5: {
				logic.findNoteByText();
				break;
			}
			
			case 6: {
				exit = true;
				view.printExit(); 
				break;
			}
			}
		}
	}

}
