import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int [] seats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

     String[] names = new String[15];
      Scanner scan = new Scanner(System.in);

      for (int i = 0; i < names.length; i++)
      {
        System.out.println("Type your name here ");
        names [i] = scan.next();
      }
      
     int count = 0;
     while (count <= 14)
     {
       System.out.println(names [count] + " sits in seat " + seats [count]);
        count++;
     }





  }
}