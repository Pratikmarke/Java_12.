/// for the inverted values

//public class pattern {
 //   public static void main(String[] args) {
    //    for (int i = 5; i >=1; i--) {
    //        for (int j = 1; j <= i; j++) {
     //           System.out.print("*");
       //     }
  //          System.out.println();
   //     }
//    }
//}

/// for the actual values // right angled triangle
//public class pattern {
//    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

///Number pyramid
public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}