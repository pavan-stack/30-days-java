public class Day4 {
  public static void main(String[] args) {

    //Arithamatic operator
    float a = 8;
    float b = 3;
    float c= a/b;
    float d = a%b;

    System.out.println(c);
    System.out.println(d);

    //unary

    int a1= 8; 
    int b1=2;

    // int c1 = --a1+b1; // pre=9
    // System.out.println(c1);

    //post = 10
    int c2 = (a1--) +b1;
    System.out.println(c2);


    //Assignment   +=,-=,/=,%=
    int a2=10;
    int b2=2;
    a2 += b2;//no int req
    System.out.println(a2);

    //Relatinal >,<,=,<=,>=,==,!=
    
    int a3=8;
    int b3=2;
    System.out.println(a>=b);

    //logical or(||) ,and(&&), not(!)

    int a4=3;
    int b4=5;
    System.out.println(!(a!=b));

    //ternary

    int a5=9;
    int b5=5;
    int max = (a5>b5)?a5:b5;
    System.out.println("the max value is"+max);

    //bitwise
    
    int a6=3;
    int b6=5;
    System.out.println(a6<<b6);//2^3, 2^2, 2^1, 2^0 &,|, >>,<<                      a<<b= a*2^b,          a>>b= a/2^b
    

  }
  
}
