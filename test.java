import java.util.Scanner;

class test
{
    public static void main(String[] args)
    {
        int number1,number2, result;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the First Number:=");
        number1 = sc.nextInt();
        System.out.println("Enter the Second Number:=");
        number2 = sc.nextInt();
        char operator;
        System.out.println("Please Enter the valid opretaor:=");
        operator = sc.next().charAt(0);
        //1char[] JavaCharArray = {'a', 'b', 'c', 'd', 'e'}; 
        //charc chq[] = new charc[5];
        switch(operator)
        {
            case '+':
                result = number1 + number2;
                System.out.println("The Sum of the two number is:="+ result);
                break;
            case '-':
                result = number1-number2;
                System.out.println("The Minus of the two number is:="+ result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("The Multiplication of the two number is:="+ result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("The Division of the two number is:="+ result);
                break;
            case '%':
                result = number1 %number2;
                System.out.println("The Module of the two number is:="+ result);
                break;
        }
        
        sc.close();
    }
}
