package test_code_in_java;

import java.util.Scanner;

public class Test_code {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("LMao!!");
    System.out.printf("Hello %d %s", 18, "World!");
    System.out.println();
    String s = "Tran Van Bang";
    String t = "Tran Van Bang";
    boolean check = false;
    if (s.equals(t)) {
      check = true;
    }
    System.out.println(check);
    int a = scan.nextInt();
    String s1 = scan.next();
    String s2 = scan.nextLine();
    // nextLine nhập chuỗi trên 1 dòng còn next thì không (tức là nó sẽ nhập chuỗi có chứa khoảng trắng)
    
  }
}
