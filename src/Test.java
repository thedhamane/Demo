class calculator{
    int a;

    public int add(int num1,int num2){
       int r = num1+num2;

        return r;
    }
    public int add3(int n1,int n2,int n3){

        return n1+n2+n3;
    }
}

public class Test {
    public static void main(String[] args) {
        int num1=4;
        int num2=6;
        calculator calc =new calculator();

       int result= calc.add3(3,5,4);

    //    int result =num1+num2;

      System.out.println(result);
    }
}
