package b1_ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = input.nextInt();
       int hundreds = (int) (Math.floor(number/100));
       int tens = (int) (Math.floor((number%100)/10));
       int units = (int) (Math.floor((number%100)%10));
       String hundred = "", ten = "", unit = "";
       switch (hundreds){
           case 0:
               hundred = "";
               break;
           case 1:
               hundred = "One hundred";
               break;
           case 2:
               hundred = "Two hundred";
               break;
           case 3:
               hundred = "Three hundred";
               break;
           case 4:
               hundred = "Four hundred";
               break;
           case 5:
               hundred = "Five hundred";
               break;
           case 6:
               hundred = "Six hundred";
               break;
           case 7:
               hundred = "Seven hundred";
               break;
           case 8:
               hundred = "Eight hundred";
               break;
           case 9:
               hundred = "Nine hundred";
               break;
       }
       switch (tens){
           case 0:
               ten = "";
               break;
           case 1:
               ten = "";
               switch (units){
                   case 0:
                       unit = "Ten";
                       break;
                   case 1:
                       unit = "Eleven";
                       break;
                   case 2:
                       unit = "Twelve";
                       break;
                   case 3:
                       unit = "Thirteen";
                       break;
                   case 4:
                       unit = "Fourteen";
                       break;
                   case 5:
                       unit = "Fifteen";
                       break;
                   case 6:
                       unit = "Sixteen";
                       break;
                   case 7:
                       unit = "Seventeen";
                       break;
                   case 8:
                       unit = "Eighteen";
                       break;
                   case 9:
                       unit = "Nineteen";
                       break;
               }
               break;
           case 2:
               ten = "Twenty";
               break;
           case 3:
               ten = "Thirty";
               break;
           case 4:
               ten = "Forty";
               break;
           case 5:
               ten = "Fifty";
               break;
           case 6:
               ten = "Sixty";
               break;
           case 7:
               ten = "Seventy";
               break;
           case 8:
               ten = "Eighty";
               break;
           case 9:
               ten = "Ninety";
               break;
       }
       if(tens!=1){
           switch (units){
               case 0:
                   unit = "";
                   break;
               case 1:
                   unit = "One";
                   break;
               case 2:
                   unit = "Two";
                   break;
               case 3:
                   unit = "Three";
                   break;
               case 4:
                   unit = "Four";
                   break;
               case 5:
                   unit = "Five";
                   break;
               case 6:
                   unit = "Six";
                   break;
               case 7:
                   unit = "Seven";
                   break;
               case 8:
                   unit = "Eight";
                   break;
               case 9:
                   unit = "Nine";
                   break;
           }
       }
       if(hundred.equals("")){
           if(ten.equals("")) {
               System.out.println(unit);
               if (unit.equals("")) {
                   System.out.println("Zero");
               }
           }else{
               System.out.println(ten+" "+unit);
           }
       }else{
           if(ten.equals("")){
               if(unit.equals("")){
                   System.out.println(hundred);
               }else{
                   System.out.println(hundred+" and "+unit);
               }
           }else{
               System.out.println(hundred+" and "+ten+" "+unit);
           }
       }
    }
}
