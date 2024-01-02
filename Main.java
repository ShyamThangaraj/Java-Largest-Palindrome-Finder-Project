import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int CurrentInt = 0;
    int CurrentNum = 0;
    String Left = "";
    String Right = "";
    int HighestPalindrome = 0;
    int Largest = 0;
    for (int ProductNum=100; ProductNum<= 999; ProductNum++){     
      for (int ProductNum2=100; ProductNum2<= 999; ProductNum2++){
        int CurrentNumStand = ProductNum * ProductNum2;
        CurrentNum = ProductNum * ProductNum2;
        
        int length = String.valueOf(CurrentNum).length();
        int[] Array = new int[length];
        int[] ArrayReg = new int[length];
        for (int i=0; i<length; i++){
          CurrentInt = CurrentNum % 10;
          CurrentNum = CurrentNum/10;
          Array[i] = CurrentInt;
        }
        for (int i=length-1, j=0; i>=0 && j<length; i--, j++){
            ArrayReg[j]=(Array[i]); 

        }

        if (Arrays.equals(ArrayReg, Array)){
          if (CurrentNumStand > Largest){
            Largest = CurrentNumStand;
          }
          }  
        }
      }
    System.out.println("Largest palindrome from product of 2 3 digit numbers: " + Largest);  
  
  }
  }