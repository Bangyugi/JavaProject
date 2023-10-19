package buoi_1;

import java.util.Scanner;

public class Hello_world_in_java {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("LMao!!");
    System.out.printf("Hello %d %s", 18, "World!");
    System.out.println();

    /*
    int a = scan.nextInt();
    // Nhập dữ liệu trong java
    String s1 = scan.next();
    scan.nextLine(); // giống vói cin.ignore() trong c++
    String s2 = scan.nextLine();
    // nextLine nhập chuỗi trên 1 dòng còn next thì không (tức là nó sẽ nhập chuỗi có chứa khoảng trắng)
    System.out.println(s1);
    System.out.println(s2);
    */

    // Học về câu lệnh if else (khá là giống với cú pháp trong c++)
    String s = "Tran Van Bang";
    String t = "Tran Van Bang";
    boolean check = false;
    if (s.equals(t)) {
      // Nên dùng s.equals thay vì toán tử "=="
      check = true;
    }
    System.out.println(check);

    // Học về vòng lặp (cũng không khác c++ là mấy)
    for (int i = 1; i <= 10; i++) {
      System.out.println("Hello " + i);
    }
    scan.close();
  }
}
