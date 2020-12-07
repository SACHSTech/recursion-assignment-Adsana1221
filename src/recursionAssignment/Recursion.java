package recursionAssignment;

public class Recursion{


public static int count7(int n){
  
  // base case
  // if the number is less than 7, there won't be a count for the number 7
  if (n < 7){
    return 0;
  }
    // if the right most number is 7, return a count of 1
    // if not 7, take the last digits out and try again with the remaining digits
    else if (n % 10 == 7){
      return 1 + count7(n / 10);
    }

     else{
      return count7(n / 10);
     }
}

public static String changePi(String strWord){
  if (strWord.equals("")){
    
    return("");

    }else if (strWord.substring(0,1).equals("p") && strWord.substring(1,2).equals("i")){

      return (3.14) + changePi(strWord.substring(2));

    }else{

      return strWord.substring(0,1) + strWord.substring(1,2) + changePi(strWord.substring(2));
    }
    }


}




