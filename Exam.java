interface Exam {
    void methodExam();
}

interface Student {
    void methodStudent();
}

class Result implements Exam, Student {
    public void methodExam() {
        System.out.println("Method Exam implemented");
    }

    public void methodStudent() {
        System.out.println("Method Student implemented");
    }

    public static void main(String[] args) {
        Result obj = new Result();
        obj.methodExam();
        obj.methodStudent();
    }
}