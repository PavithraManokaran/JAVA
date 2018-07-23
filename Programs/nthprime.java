import java.util.Scanner;
 
class Main {
 
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter nth prime number to find: ");
 
    int nth = sc.nextInt();
 
    int num, count, i;
    num=1;
    count=0;
 
    while (count < nth){
      num=num+1;
      for (i = 2; i <= num; i++){
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){
        count = count+1;
      }
    }
    System.out.println("Value of nth prime: " + num);
  }
}
