package by.it_academy.popko.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDate;

import java.util.List;
import java.util.Scanner;

import by.it_academy.popko.bean.Note;

public class NotepadLogic {

	private static File file = new File("notepadFile.txt");
	Scanner sc = new Scanner(System.in);

	public Note addNote() {
		LocalDate date = LocalDate.now();

		System.out.println("ADD YOUR NOTE: ");
		String str = sc.nextLine();
		Note note = new Note(str, date);
		return note;
	}

	public List<String> removeNote() throws IOException {
		Path input = Paths.get(String.valueOf(file));
		List<String> listNotes = Files.readAllLines(input);

		System.out.println("YOUR NOTES:");

		int i = 0;
		for (String str : listNotes) {
			System.out.println(i + ") " + str);
			i++;
		}
		System.out.println("\nSELECT THE NOTE NUMBER TO DELETE: ");
		int index = sc.nextInt();
		listNotes.remove(index);
		return listNotes;

	}

	public void viewNotes() throws FileNotFoundException {
		Scanner scanner = new Scanner(file);

		System.out.println("YOUR NOTES:\n");
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

		System.out.println();
	}

	public void findNoteByDateAdded() throws FileNotFoundException {
		Scanner scanner = new Scanner(file);

		System.out.println("ENTER YEAR IN FORMAT YYYY: ");
		int year = sc.nextInt();
		System.out.println("ENTER MONTH IN FORMAT MM: ");
		int month = sc.nextInt();
		System.out.println("ENTER DAY IN FORMAT DD: ");
		int day = sc.nextInt();
		LocalDate date = LocalDate.of(year, month, day);

		int count = 0;
		while (scanner.hasNextLine()) {
			String noteFromFile = scanner.nextLine();

			if (noteFromFile.contains(date.toString())) {
				System.out.println(noteFromFile);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("NOTES NOT FOUND.");
		}
		System.out.println();
	}

	public void findNoteByText() throws FileNotFoundException {
		Scanner scanner = new Scanner(file);

		System.out.println("ENTER TEXT TO SEARCH: ");
		String textToSearch = sc.nextLine();

		int count = 0;
		while (scanner.hasNextLine()) {
			String noteFromFile = scanner.nextLine();
			if (noteFromFile.contains(textToSearch)) {
				System.out.println(noteFromFile);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("NOTES NOT FOUND.");
		}
		System.out.println();
	}

	public void saveNote(Note myNote) throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter(file, true));
		pw.println(myNote);
		pw.close();
	}

	public void saveNotepad(List<String> listNotes) throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter(file));
		for (String str : listNotes) {
			pw.println(str);
		}
		pw.close();

	}

	public static File getFile() {

		return file;
	}

}
