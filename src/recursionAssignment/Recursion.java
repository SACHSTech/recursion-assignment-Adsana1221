package recursionAssignment;

public class Recursion{

  /**
  * Program that counts how many '7' is in a number
  * @param n, the number we are checking the digits '7' for
  * @return how many times 7 occurs
  */
public static int count7(int n){
  
  // base case
  // if the number is less than 7, there won't be a count for the number 7
  if (n < 7){
    return 0;
  }
    // Recursive Step
    // if the right most number is 7, return a count of 1
    // if not 7, take the last digits out and try again with the remaining digits
    else if (n % 10 == 7){
      return 1 + count7(n / 10);
    }

     else{
      return count7(n / 10);
     }
}

  /**
  * Program that converts pi to 3.14
  * @param strWord, the word we are using to check for pi
  * @return how 3.14 instead of pi
  */
public static String changePi(String strWord){
  // Base Case
  if (strWord.equals("")){
    
    return("");
    
    // Recursive Step
    // if two substrings beside each other is pi, then 3.14 and the rest of that word will be returned
    }else if (strWord.substring(0,1).equals("p") &&      strWord.substring(1,2).equals("i")){

      return (3.14) + changePi(strWord.substring(2));

    }else{

      return strWord.substring(0,1) + strWord.substring(1,2) + changePi(strWord.substring(2));
    }
    }


 /**
  * Program that changes same adjacent characters into one character
  * @param strWord, the word we are using to check for pi
  * @return how 3.14 instead of pi
  */
public static String stringClean(String strWord){
  // Base Code
  if (strWord.equals("")){
    
    return("");
  }

  if (strWord.length() == 1){
    return strWord;
  
  // Recursive Step
  // If one char and the char beside it are the same, print only one of them and the rest of the word 
  }else if (strWord.charAt(0) == strWord.charAt(1)){
    return stringClean(strWord.substring(1));

  }else{
    return strWord.charAt(0) + stringClean(strWord.substring(1));
  }
   
}

}




