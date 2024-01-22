
package quiz;

public class book{
private String teacher = "mrsmolly";
private int students;
private String course;
public book(String teacher, int students, String course) {
	super();
	this.teacher = teacher;
	this.students = students;
	this.course = course;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public int getStudents() {
	return students;
}
public void setStudents(int students) {
	this.students = students;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}

public boolean isvalid  (int course) {
	if (course>1) (course<3)
	return true;
}
public boolean isvalid  (int students) {
	if (students>10) (course<300)
	return true;
}
@Override
public String toString() {
	return "book [teacher=" + teacher + ", students=" + students + ", course=" + course + "]";
}

