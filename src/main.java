// import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
// Scanner scanner = new Scanner(System.in);
// System.out.println("enter your name ");
//   String name = scanner.next();

//  System.out.println("enter your age ");
//    int age = scanner.nextInt();


// System.out.println("what is your preferences in ");

//       byte age = 5;
//        if (age>=18){
//            System.out.println("you are an audult");
//        }
//        else {
//            System.out.println("you are child");
// }

//        System.out.println(Math.PI);
//        System.out.println(Math.E);


//        double result;
//result = Math.pow(2,8);
//        result= Math.abs(-5);
//        result = Math.sqrt(2);
//        result = Math.round(2.3);
//        result = Math.ceil(3.14);
//        result = Math.floor(6);
//        result = Math.max(20,10);
//        result = Math.min(2,8);
//        System.out.println(result);

//
//        int x = 5;
//        if (x>10 || x<20) {
//            System.out.println("hello");
//        }
//        else {
//            System.out.println("bye");
//        }


//        int x = 5;
//        int y = 10;
//        int a = 7;
//        int b = 7;
//
//        boolean result = x>y && a<b ;
//        System.out.println(result);

//               Scanner scanner=new Scanner(System.in);
//        System.out.println("what is your age in 2005");
//        String name = scanner.nextLine();
//
//        System.out.println("what is current year of BE ?");
//        String BE = scanner.nextLine();
//   int age = 40;
//   int year= 2027;
//   int week= 5;
//   int quantity= 1;
//
//   double price = 4.56;
//   double gpa = 4.9;
//   double temp = 35.5;
//
//   char grade = 'A';
//   char symbol = '#';
//   char currency = '$';
//
//   boolean isstudent = false;
//   boolean forsale = false;
//   boolean isonline = true;
//
//   String name = "salesforce developer";
//   String colour = " red";
//   String car = " BMW M4";
// if (isstudent){
//     System.out.println("there is " + car + " car with a  "  + grade + " grade." );
// }
//   else {
//     System.out.println(car + " is  not for sale .");
// }


///telsuko


// if else
//        int x = 4;
//        int y = 5;
//        int r = 2;
//
//        if (x>y && x>r)
//            System.out.println("i am cororpati");
//         else if (y>x && y>r)
//            System.out.println("i am roadpati");
//            else
//                System.out.println("bhikari");


// loop
//        int i = 1;
//
//        while (i<=4) {
//            System.out.println("pado pawan");
//         i++   ;
//        }
// nested loop


//        int i = 1;
//
//        while (i<=4)
//        {
//            System.out.println("pado pawan");
//            int j= 1;
//            while ( j<=3){
//                System.out.println(" ruko");
//               j++ ;
//            }
//
//
//             i++ ;
//        }

// do while --- even if the input is wrong you will get atleast one ans
// in the given case when i put the input as 1 then it will give
//normal ans but when i gave it input 5 which is wrong.even if the ans is wrong it will give at lest one ans to me.

//        public class main{
//            public static void main(String[] args){
//                int i = 5;
//
//                do
//                {
//                    System.out.println("pado pawan");
//
//                    i++ ;
//                }while (i<=4);
//            }
//}

// for loop -- you are gonna put all the thigs next to "for"
//EXAMPLE NO 1
//        for (int i=4;i>=1;i--) {
//            System.out.println("ghano pawan ghano " + i);
//        }
// EXAMPLE NO 2
//for ( int i=1; i<=5; i++)
//       {
//          System.out.println("Day  " + i);
//          for (int j=1;j<=9;j++)
//                System.out.println("  " +  (j+8) +"--"+ (j+9));
//        }
//      class calculator {
//     int a,b;
//            public int add(int a, int b)
//            {
//             int r = a + b;
//             return r;
//
//            }
//        }
// public class Main {
//    public static void main(String[] args){
//        int a = 4;
//        int b = 5;
//
//     calculator calc = new calculator();
//      int result = calc.add(4,5);

//        System.out.println(result);

//  class Computer {
//      public void playmusic() {
//          System.out.println(" pado dance music ");
//      }
//
//      public String getmepen(int cost) {
//
//          if (cost >= 10)
//              return "pen";
//          else
//              return " return nothiong ";
//      }
//
//  }
//
//        public class Main {
//            public static void main(String[] args){
//                Computer obj = new Computer();
//                obj.playmusic();
//              String str =  obj.getmepen(10);
//                System.out.println(str);

// lets understand the overloading in java
// when  same methods uses different parameters then it is called as overloading
// in the above example "add" is method and int a,b,c are the variables or parameters

//class Calculator {
//    public int add(int n1, int n2, int n3) {
//
//        int result = n1 + n2 + n3;
//        return result;
//    }
//
//    public int add(int n1, int n2) {
//
//        int result = n1 + n2;
//        return result;
//    }
//
//    public double add(double n1, int n2) {
//
//        double result = n1 + n2;
//        return result;
//    }
//}
//class main {
//    public static void main(String[] args){
//        Calculator calc = new Calculator();
//        int result  =calc.add(4,5);
//        System.out.println(result);
//    }
//}


// lets undrstand how JVM works inside
// we are just using the num varible here ....we are not declaring it on the other side n1 & n2 we are declaring them for method named "add".
//class Calculator {
//    int num = 5;
//    public int add(int n1, int n2) {
//        System.out.println(num);
//        int result = n1 + n2 ;
//        return result;
//    }
//
//}
//class main {
//    public static void main(String[] args){
//        Calculator calc = new Calculator();
//        int result  =calc.add(4,5);
//        System.out.println(result);
//    }
//}

// ARRAY
// why we use array ?
// EX  int num = 4;
//      int num = 5;
//      int num = 6;
// we can store this values using curly bracket with min space
// example is given below

// public class main {
//    public static void main(String[] args){
//        int num []= {4,5,6}; // jar mala second value chage karayachi asel tar mi khali dileli tech vaparel
//        num [1]= 8;
//        System.out.println(num[1]);
//    }
//}

//public class main {
//  public static void main(String[] args){
//      int num[] = new int[5];
//      num[0]=1;
//      num[1]=1;
//      num[3]=1;
//      num[4]=1;
//      // if you want to fetch all the values you can use for loop
//      for (int i=0;i<=3;i++){
//          System.out.println(num[i]);
//      }
//
//    }
//}

// MULTIDIMENSIONAL ARRAY
// it can be represented by int num [][] = new int [3][4];
// 3 & 4 means there are 3 arrays and each array contains 4 element
// to use multidimensional array we have to use nested loop to define variables named i & j

//public class main {
//    public static void main(String[] args) {
//        int nums[][] = new int[3][4];
//
//        for ( int i = 0; i <3;i ++ )
//        {
//            for (int j = 0; j<4; j++){
//               nums [i][j]= (int)(Math.random()*10);
//
//            }
//        }
//        for ( int i = 0; i <3;i ++ )
//        {
//            for (int j = 0; j<4; j++){
//                System.out.print(nums [i][j] + "  ");
//                {
//                    System.out.println();
//                }
//            }
//        }
        // enhanced array
//        for (int n[] :nums ){
//            for (int m: n) // hare m is taking values from n array
//            {
//                System.out.print(m + "");
//                {
//                    System.out.println();
//                }
//            }
//        }

  //  }
//}

// jaggad array
// an array which does not define its values or elements
//  public class main {
//      public static void main(String[] args) {
//          int nums[][] = new int[3][];  // jaggad array
//          nums [0]= new int [1];
//          nums [1]= new int [2];
//          nums [2]= new int [3];
//
//
//          for ( int i = 0; i <nums.length;i ++ )
//          {
//              for (int j = 0; j<nums[i].length; j++){
//                  nums [i][j]= (int)(Math.random()*10);
//
//              }
//          }

          // enhanced array
//          for (int n[] : nums) {
//              for (int m : n) {
//                  System.out.print(m + " ");
//              }
//              System.out.println();   // ✅ runs once per row, after inner loop finishes
//          }
//          }
//
//      }


//Exception errors
// the sie of the array is 7, and we put the 4 elements in front of the array then it will give us an exceptional erroe warning
// to avoid this exceptional error we use property of // length // Lets understand it with EX

//public class main {
//    public static void main(String[] args) {
//        int nums[] = new int[6];  // EXCEPTION ERROR
//        nums[0] = 4;
//        nums[1] = 5;
//        nums[2] = 6;
//        nums[3] = 7;
//
//
//        for (int i = 0; i <6; i++) {
//
//            System.out.println(nums);
//
//            }
//        }
//
//    }

    //// Exceptional error is resolved here
//    public class main {
//        public static void main(String[] args) {
//            int nums[] = new int[6];  // EXCEPTION ERROR
//            nums[0] = 4;
//            nums[1] = 5;
//            nums[2] = 6;
//            nums[3] = 7;
//
//
//            for (int i = 0; i <nums.length; i++) //here we used property
//            {
//
//                System.out.println(nums [i]);
//
//            }
//        }
//
//    }

////some use case of  array by using student object
//class student {
//
//
//    int rollno;
//    String name;
//    int marks;
//}

//public class main {
//    public static void main(String[] args) {
//
//        student s1 = new student();
//        s1.rollno = 1;
//        s1.name = "varad ";
//        s1.marks = 69;
//
//        student s2 = new student();
//        s2.rollno = 2;
//        s2.name = "bhavesh ";
//        s2.marks = 80;
//
//        student s3 = new student();
//        s3.rollno = 3;
//        s3.name = "pratik ";
//        s3.marks = 72;
//
//        student students[] = new student[3];
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].name + " :" + students[i].marks + " :" + students[i].rollno);
//        }
//    }
//}

    //// there is special type  of loop which is only used in the array that we already used in our previous ex
//// it is also called as forest loop


//    public class main {
//        public static void main(String[] args) {
//            int nums[] = new int[4];
//            nums[0] = 4;
//            nums[1] = 5;
//            nums[2] = 6;
//            nums[3] = 7;
//
//
//            for (int n : nums)
//            {
//
//                System.out.println(n);
//
//            }
//       }
//
//    }

//// same student example using forst loop

//class student {
//
//
//    int rollno;
//    String name;
//    int marks;
//}
//
//public class main {
//    public static void main(String[] args) {
//
//        student s1 = new student();
//        s1.rollno = 1;
//        s1.name = "varad ";
//        s1.marks = 69;
//
//        student s2 = new student();
//        s2.rollno = 2;
//        s2.name = "bhavesh ";
//        s2.marks = 80;
//
//        student s3 = new student();
//        s3.rollno = 3;
//        s3.name = "pratik ";
//        s3.marks = 72;
//
//        student students[] = new student[3];
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//
//// forest loop or enahaced for loop
//        for (student stud : students) {
//            System.out.println(stud.name + " :" + stud.marks + " :" + stud.rollno);
//        }
//    }
//}

//// STRING .....it is used to save the combination of char
//
//public class main {
//    public static void main(String []arg){
//
//        String name = " navin";
//        name = name + " reddy";
//
//        String s1 = " Navin";
//        String s2 = " Navin";
//        System.out.println(s1 ==s2);
//    }
//}


// string is not mutable means we cannot change it to solve this problrm we use stringbuffer
//   stringbuffer
//public class main {
//    public static void main(String []arg){
//
//        StringBuffer sb = new StringBuffer("navin");
//        sb.append("reddy");
//        System.out.println(sb);
//    }
//}
// diff between Stringbuffer and Stringbilder is stringbuilder is thread safe .

/// STATIC VARIABLE

//static variable is used by all objects like it will be not for particular object but for all the objects
//class Mobile {
//    String brand;
//    int price;
//   static String name;
//
//
//
//
//    void show() {
//        System.out.println(brand + " " + name + " " + price);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.name = "Smartphone";
//        obj1.price = 1500;
//
//        Mobile obj2 = new Mobile();
//        obj2.brand = "Realme";
//        obj2.name = "Smartphone";
//        obj2.price = 500;
//
//        obj1.name= "phone ";
//        obj1.show(); // Apple Smartphone 1500
//        obj2.show(); // Realme Smartphone 500
//    }
//}

/// let's understand more about static  ///error in the code

//class Mobile {
//    String brand;
//    int price;
//    static String name;

    //now we know that price and brand are instance variable and name is static variable
    // to instantiate the instance variable ......we can use constructor
//
//    static {
//        name = "phone";
//        System.out.println("in the static block");
//    }
//
//    public Mobile (){
//        brand= "";
//        price= 200;
//        System.out.println("in the constructor");
////        name = "pnone";
//    }
// as we can see we have to initialize them everytime but this not applies for name what we will do for name then ?   let's see
//    }


//class Main {
//    public static void main(String[] args) {
//
//        Class.forName(classname:"mobile ") // if there are no objects, and we want to load class  or static we use this
//        };
//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.name = "Smartphone";
//        obj1.price = 1500;
//
//        Mobile obj2 = new Mobile();
//
//    }
//}


/// encapsulation

//we are already know some info about encsp
// lets just understand it with the help of my info if i want to give my info to anyone they should ask me first or get may permission fist
// that's why we use encapsulation


/// only getters ex
//class human{
//   private int age = 10;
//   private String name = "marke ";
//
//
//   public int getAge(){
//       return age;
//   }
//
//    public String getname(){
//       return name ;
//    }
//    }
//
//
//
//
//public class main {
//    public static void main (String[] args){
//
//        human obj1 = new human();
////        obj1.age=21;
////        obj1.name="pratik";
//        System.out.println(obj1.getAge() + ":" + obj1.getname());
//    }
//}


//yes also i have to explain each and everything to lead like last time he asked what is service is for


///both setters and getters ex
//class human{
//    private int age ;
//    private String name ;
//
//
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public String getname(){
//        return name ;
//    }
//    public void setname(String name ){
//       this.name = name ;
//    }
//}
//
//
//
//
//public class main {
//    public static void main (String[] args){
//
//        human obj1 = new human();
//        obj1.setAge(10);
//     obj1.setname("pratik");
//        System.out.println(obj1.getAge() + ":" + obj1.getname());
//    }
//}


///  Constructors
/// constructors have same class as object and they do not have return type

//class human{
//    private int age ;
//    private String name ;
//
//
//    public human (){                 ///default constructor
//        age = 18;
//        name =" pratik ";
//    }
//
//    public human(int a, String n){               ///  parametrize constructor
//        name = n;
//        age = a;
//    }
//
//
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public String getname(){
//        return name ;
//    }
//    public void setname(String name ){
//        this.name = name ;
//    }
//}
//
//
//
//
//public class main {
//    public static void main (String[] args){
//
//        human obj = new human();
//        human obj1 = new human(18,"pawan");
////        obj1.setAge(10);
////        obj1.setname("pratik");
//        System.out.println(obj1.getAge() + ":" + obj1.getname());
//    }
//}


/// super
/// if you want to parse the parametric the constructor then you will have to mention the super which is already present in the java ;

//class A{
//public A (){
//
//    System.out.println("in the A ");     //default constructor
//}
//public A(int n){
//
//    System.out.println("A in int ");    ///  parametrize constructor
//}
//}
//
//class B extends A{
//
//    public B(){
//
//        System.out.println("in the B");
//    }
//    public B(int n){               ///  parametrize constructor
//        super(n);     /// to get the values from the parametric constructor
//
//        System.out.println("B in int ");
//    }
//}


//public class main {
//
//    public static void main (String[] args){
//        B obj = new B(5);
//    }
//}

/// naming conventions
/// camel casing

// class and interface = Calc, Readable .
// variables & methods = marks, show().
// constants = PIE,BRAND
// showMyMarks
//MyData
// age , DATA ,  Human()


// oops
// inheretece


//public class main {
//
//    public static void main(String[] args) {
//
//        advcalc obj = new advcalc();
//
//        int r1 = obj.add(4, 5);
//        int r2 = obj.sub(4, 5);
//        int r3 = obj.multi(4, 5);
//        int r4 = obj.div(4, 5);
//
//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(r3);
//        System.out.println(r4);
//    }
//}

//overrinding

//class A {
//    public void show (){
//        System.out.println(" void in A ");
//    }
//    public void config(){
//        System.out.println(" co0nfig in A ");
//    }
//}
//class B extends A{
//
//    public void show() {
//    }
//}
//public class main {
//
//   public static void main(String[] args) {
//         B obj1= new B();
//         obj1.show();
//         obj1.config();
//
//   }
//}

// another example for the overriding

//class calculator {
//    public int add(int n1, int n2) {
//        return n1 + n2;
//    }
//}
//
//class advcalculator extends calculator {
//
//   @Override
//   public int add(int n1, int n2) {
//       return n1 + n2 + 1;
//   }
//}

//public class main {
//
//    public static void main(String[] args) {
//
//        advcalculator obj1 = new advcalculator();
//
//        int result = obj1.add(44, 66);
//
//        System.out.println(result);
//    }
// }


/// Final - variable,method,class

// when we use final the varible becomes constant means
// once values decided the value cannot change later on

    // for variable
//public class main {
//
//    public static void main(String[] args) {
//
//       final int num = 9;
//    //    num = 9;
//
//        System.out.println(num);
//    }}


// final word is front of the calss and method that mean the class and method cannot be extended or override
//  final  class calca {
//        public final  void show(){
//            System.out.println(" in the calc ");
//        }
//
//        class advcalca extends calca{
//        }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//      calca obj1 = new calca();
//         obj1.show();
//
//
//    }}

/// introduction to collection
///object
///
//  class laptop {
//    String model;
//    int price;
//
//    public String toString() {
//        return model + ":" + price;
//    }
//
//    public boolean equals(laptop that) {
//        if (this.model == that.model && this.price == that.price)
//            return true;
//        else
//            return false;
//
//
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//      laptop obj1 = new laptop();
//      obj1.model = " mac book ";
//      obj1.price = 1000;
//
//            laptop obj2 = new laptop();
//            obj2.model = " mac book ";
//            obj2.price = 1000;
//
//    boolean result = obj1.equals(obj2);
//        System.out.println(result);     // we got a to string method which returns a something called string
//    }
//  }

  /// typecasting & upcasting


//public class main {
//
//    public static void main(String[] args) {
//    double d = 4.5;
//     int i = (int) d;           // here we change the value for the particular way called typecast
//        System.out.println(i);
//    }
//}

//  class A {
//      public void show1() {
//          System.out.println("in the class A");
//      }
//  }
//
//class B extends A{
//    public void show2() {
//        System.out.println(" in the class B");
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//        A obj = new B();    // this is what we called up casting
//        obj.show1();
//    }
//}

// abstract method
      // you cannot create the type of abstract class as we can see we have to use the name of TATA
    // abstract method should have abstract class not vise versa
  abstract class Car {
      public abstract void drive(); // no body — subclasses MUST implement this

      public void playMusic() {     // has a body — subclasses inherit this as-is
          System.out.println("play music");
      }
  }

class Tata extends Car {
    @Override
    public void drive() {
        System.out.println("driving a Tata");
    }
}

public class main {
    public static void main(String[] args) {
        Car obj = new Tata();   // works: obj is typed as Car, but holds a Tata object
        obj.drive();
        obj.playMusic();
    }
}











