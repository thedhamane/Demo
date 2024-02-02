import java.util.Scanner;

public class Main {
    public static void Grading(String studentName,int marks) {
        if (marks > 80) {
            System.out.println(studentName + " Got First Class");
        } else if (marks < 80 && marks >= 60) {
            System.out.println(studentName+" Got Second Class");
        } else if (marks < 60 && marks >= 35) {
            System.out.println(studentName + " Got Passed");
        } else {
            System.out.println(studentName + " Got Fail");
        }
    }
    public static void main(String[] args) {

//            StudentGrades student1 = new StudentGrades(78,"Aniruddha");
//            StudentGrades student2= new StudentGrades(81,"Ajay");
//            StudentGrades student3= new StudentGrades(59,"Parag");
//            StudentGrades student4= new StudentGrades(56,"Sumit");
//            StudentGrades student5= new StudentGrades(34,"Dhiraj");
              StudentGrades[] arr= new StudentGrades[5];

//                  arr[0]=student1;
//                  arr[1]=student2;
//                  arr[2]=student3;
//                  arr[3]=student4;
//                  arr[4]=student5;
                  for(int i=0;i<5;i++){
                      Scanner sc=new Scanner(System.in);
                      System.out.println("Enter marks & name for index "+i);
                      int num=sc.nextInt();
                      String name=sc.next();
                      StudentGrades s = new StudentGrades(num,name);
                      arr[i]=s;

                  }

                 for(int i=0;i< arr.length;i++) {           //4,2,0
                     Grading(arr[i].studentName,arr[i].marks);  //arr[4],arr[2],arr[0]
                 }







//           if(marks>80){
//               System.out.println(student+" Got First Class");
//           }
//           else if (marks<80 && marks>=60) {
//               System.out.println(student+" Got Second Class");
//           } else if (marks < 60 && marks>=35) {
//               System.out.println(student+" Got Passed");
//           }
//           else{
//               System.out.println(student+" Got Fail");
           }
    }
