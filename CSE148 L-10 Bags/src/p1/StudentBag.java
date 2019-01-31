package p1;

public class StudentBag {
	private Student[] studentArray;
	private int index = 0;

	public StudentBag(int maxsize) {
		studentArray = new Student[maxsize];
	}

	// method header
	public Student findByName(String name) {
		for (int i = 0; i < index; i++) {
			if (studentArray[i].getName().equals(name)) {
				return studentArray[i];
			}
		}
		return null;

	}

	public Student removeById(String id) {
		int i;
		for (i = 0; i < index; i++) {
			if (studentArray[i].getId().equals(id)) {
				break;
			}
		}

		if (i == index) {
			return null;
		} else {
			Student temp = studentArray[i];
			for (int j = i; j < index; j++) {
				studentArray[j] = studentArray[j + 1];
			}
			index--;
			return temp;
		}

	}

	public void insert(Student student) {
		studentArray[index] = student;
		index++;
	}

	public void display() {
		for (int i = 0; i < index; i++) {
			System.out.println(studentArray[i]);

		}
	}

}
