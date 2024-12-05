package collection.linked_list;

class Main {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.addFirst("Apple");
//        list.addFirst("Banana");
//        list.addFirst("Cherry");
//        System.out.println(list.findWhere((String data) -> data.equals("Banana")));
//        System.out.println("Size: " + list.getSize());
//        System.out.println("Add After " + list.delete("Banana"));
//        list.addLast("Elderberry1");
//        list.addLast("Elderberry2");
//        list.addLast("Elderberry3");
//        System.out.println("Size: " + list.getSize());

        StudentMS studentMS = new StudentMS();
        studentMS.addStudent(new Student("MS1","John", 24 , 9.8f));
        studentMS.addStudent(new Student("MS2","Doe", 25 , 9.7f));
        studentMS.addStudent(new Student("MS3","Jane", 26 , 9.6f));
        studentMS.printList();
        System.out.println(studentMS.updateStudent(new Student("MS1","Doe", 999 , 9.7f)));
        System.out.println("======================");
        System.out.println(studentMS.countStudents("Doe"));
    }
}
