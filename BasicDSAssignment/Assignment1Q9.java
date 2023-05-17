package BasicDSAssignment;

import java.util.Scanner;

class Student{
    private int subjectA, subjectB, subjectC;
    public Student(){

    }
    public Student(int subjectA, int subjectB, int subjectC){
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }
    public int studentsAverageMarksInAllSubjects(Student[] students){
        int avgMarks = 0;
        for(Student st : students){
            avgMarks += st.subjectA + st.subjectB + st.subjectC;
        }
        return avgMarks / 3;
    }

    public int[] subjectWiseMarks(Student[] students){
        int[] marksArr = new int[3];
        int marksInA = 0;
        int marksInB = 0;
        int marksInC = 0;
        for(Student st : students){
            marksInA += st.subjectA;
            marksInB += st.subjectB;
            marksInC += st.subjectC;
        }
        marksArr[0] = marksInA;
        marksArr[1] = marksInB;
        marksArr[2] = marksInC;
        return marksArr;
    }
    public int subjectATotalByStudents(int[] marks) {
        return marks[0];
    }
    public int subjectBTotalByStudents(int[] marks) {
        return marks[1];
    }
    public int subjectCTotalByStudents(int[] marks) {
        return marks[2];
    }

    public int subjectTotalByStudents(int[] marks){
        return marks[0] + marks[1] + marks[2];
    }

    public double subjectAAverageByStudents(int[] marks) {
        return (marks[0] / 3);
    }
    public double subjectBAverageByStudents(int[] marks) {
        return marks[1] / 3;
    }
    public double subjectCAverageByStudents(int[] marks) {
        return marks[2] / 3;
    }
}
public class Assignment1Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student studentObj;
        Student[] studentArr = new Student[3];
        for(int i = 1; i <= 3; i++){
            System.out.println("marks of Student " + i + " in subjects A,B,C");
            int marksInA = sc.nextInt();
            int marksInB = sc.nextInt();
            int marksInC = sc.nextInt();
            studentObj = new Student(marksInA, marksInB, marksInC);
            studentArr[i - 1] = studentObj;
        }
        studentObj = new Student();
        int[] marks = studentObj.subjectWiseMarks(studentArr);
        System.out.println(studentObj.subjectTotalByStudents(marks));
        System.out.println(studentObj.studentsAverageMarksInAllSubjects(studentArr));

        System.out.println(studentObj.subjectATotalByStudents(marks));
        System.out.println(studentObj.subjectAAverageByStudents(marks));

        System.out.println(studentObj.subjectBTotalByStudents(marks));
        System.out.println(studentObj.subjectBAverageByStudents(marks));

        System.out.println(studentObj.subjectCTotalByStudents(marks));
        System.out.println(studentObj.subjectCAverageByStudents(marks));

    }
}
