package by.it_academy.popko.view;

import java.util.Objects;

public class NotepadView {
	private String menu = "SELECT ACTION: " + "\n" + "1 - Add note;" + "\n" + "2 - Remove note;" + "\n"
			+ "3 - View notes;" + "\n" + "4 - Find note by date added;" + "\n" + "5 - Find note by text;" + "\n"
			+ "6 - Finish work.";

	private String exit = "[End of work]";

	public void printMenu() {
		System.out.println(menu + "\n" + "\n" + "Enter action number:" + "\n" + "> ");
	}

	public void printExit() {
		System.out.println(exit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exit, menu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotepadView other = (NotepadView) obj;
		return Objects.equals(exit, other.exit) && Objects.equals(menu, other.menu);
	}

	@Override
	public String toString() {
		return "NotepadView [menu=" + menu + ", exit=" + exit + "]";
	}

}
