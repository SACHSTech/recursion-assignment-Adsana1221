package recursionAssignment;

public class Recursion{


public static int count7(int n){

  // base case
  // if the number is less than 7 =, there won't be an count for the number 7
  if (n < 7){
    return 0;
  }
    //else if (n % 10 == 7){
    //  return 1;
    
    // }else{ 
       return 0 + count7(n / 10);

}
}
//}
