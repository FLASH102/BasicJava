
public class Student {
	String name;
	int grade;

	Student(String name, int grade) {

	}

	void writeEssay(String essayTopic) {
		researchTopic(essayTopic);
		writePaper(essayTopic);
		turnInPaper(essayTopic);

	}

	private void researchTopic(String essayTopic) {
		System.out.println("I have looked at many websites and taken notes about " + essayTopic);
	}

	private void writePaper(String essayTopic) {
		System.out.println("I have written an intro, 3-4 body paragraphs, and a summary about " + essayTopic);
	}

	private void turnInPaper(String essayTopic) {
		System.out.println("I have turned my paper about " + essayTopic);
	}
}
