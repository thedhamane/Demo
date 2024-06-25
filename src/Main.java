import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<Student> studentsList = getStudents(100);

        List<Student> passList =new ArrayList<>();
        List<Student> failList =new ArrayList<>();
        for(Student s :studentsList) {

            Map<String, Integer> currentMarks = s.getStudentGrades().getResultCard();

            Set<String> keySet = currentMarks.keySet();
            int totalMarks = 0;
            for (String key : keySet) {
                int marks = currentMarks.get(key);
                totalMarks = totalMarks + marks;
            }
            if(totalMarks<=150){
                s.getStudentGrades().setPass(false);
                failList.add(s);
            }
            else{
               s.getStudentGrades().setPass(true);
               passList.add(s);
            }

        }
        System.out.println("Passlist- "+passList.size());
        System.out.println("Faillist- "+failList.size());

    }


    public static List<Student> getStudents(int num){
        List<Student> studentList =new ArrayList<>();

        for(int i=1;i<=num;i++){
            Student s1= new Student();
            s1.setName("Student-"+i);
            s1.setRollno(i);
            StudentGrades studentGrades= new StudentGrades();
            Map<String,Integer> resultCard= new HashMap<>();
            resultCard.put("English",(int)(Math.random()*100) );
            resultCard.put("Hindi",(int)(Math.random()*100));
            resultCard.put("Marathi",(int)(Math.random()*100));
            StudentInfo studentInfo= new StudentInfo();
            studentInfo.setAddress("SAROLA"+i);
            studentInfo.seteMail("aniruddha@gmail");
            studentInfo.setPhoneNo("88888888");
            s1.setStudentInfo(studentInfo);

            studentGrades.setResultCard(resultCard);
            s1.setStudentGrades(studentGrades);
            studentList.add(s1);
        }

      return studentList;
    }
}