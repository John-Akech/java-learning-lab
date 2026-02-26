class Students {
    int rollNum;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rollNum = 1;
        s1.name = "John";
        s1.marks = 97;

        Students s2 = new Students();
        s2.rollNum = 2;
        s2.name = "Akech";
        s2.marks = 88;

        Students s3 = new Students();
        s3.rollNum = 3;
        s3.name = "Aroma";
        s3.marks = 79;

        Students students[] = new Students[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i ++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
