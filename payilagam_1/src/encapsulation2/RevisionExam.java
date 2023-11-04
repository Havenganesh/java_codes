package encapsulation2;

import encapsulation1.Exam;

 class RevisionExam extends Exam {
	public static void main(String[] args) {
		Exam e1 = new Exam();
		e1.name = "revision exam";
	}
	void markAndDuration() {
		System.out.println(mark);
		System.out.println(duration);
	}

}
