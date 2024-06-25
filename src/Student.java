public class Student {
    private int rollno;
    private String name;

    private StudentInfo studentInfo;

    public void setStudentGrades(StudentGrades studentGrades) {
        this.studentGrades = studentGrades;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", studentInfo=" + studentInfo +
                ", studentGrades=" + studentGrades +
                '}';
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    private StudentGrades studentGrades;

   public int getRollno(){
       return rollno;
   }
   public void setRollno(int rollno){
     this.rollno=rollno;
   }

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }

   public StudentGrades getStudentGrades(){
       return studentGrades;
   }



}


