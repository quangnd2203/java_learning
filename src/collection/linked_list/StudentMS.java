package collection.linked_list;

public class StudentMS {
    private final LinkedList<Student> list;

    StudentMS() {
        this.list = new LinkedList<Student>();
    }

    public void addStudent(Student student) {
        this.list.addLast(student);
    }

    public void printList() {
        this.list.traverse();
    }

    public Student findStudent(Student student) {
        return this.list.find(student);
    }

    public boolean updateStudent(Student student) {
        final Student foundStudent = this.list.findWhere((Student s) -> s.getId().equals(student.getId()));
        if (foundStudent != null) {
            foundStudent.setName(student.getName());
            foundStudent.setAge(student.getAge());
            foundStudent.setGpa(student.getGpa());
            return true;
        }
        return false;
    }

    public boolean deleteStudent(Student student) {
        return this.list.delete(student);
    }

    public int countStudents(String fullName) {
        final int[] count = {0};
        this.list.forEach((Student s) -> {
            if(s.getName().equals(fullName)) {
                count[0]++;
            }
            return null;
        });
        return count[0];
    }
}
