public class RecursionBasics {

//Recursive Function to calculate power of a given number
    static int CalcPower(int num,int pow)
    {
        //Base Case
        if(pow==0)
        {
            return 1;
        }

        //small problem
        return num*CalcPower(num, pow-1);//Recurrence Relation

    }

//Recursive Function to count digit in a number
    static int digitCount(int n)
    {
        //Base Case
        if(n==0)
        {
            return 0;
        }
        //Small problem
        return 1+digitCount(n/10);
    }


//Recursive Function to count the no of zeros in a given number
    static int CountZero(int num)
    {
        //Base case
        if(num==0)
        {
            return 0;
        }
        //Processing Logic
        if(num%10==0)
        {
            return 1+CountZero(num/10);
        }
        //Small Problem
        return CountZero(num/10);
    }

//Recursive Function To check the armstrong no
    static boolean CheckArmstrong(int num,int temp,int sum)
    {
        //Base Case
        if(temp==0)
        {
            
            if(num==sum)
            {
                return true;
            }
            return false;

        }
        //Small Problem + Processing Logic
        return CheckArmstrong(num,temp/10,sum+((temp%10)*(temp%10)*(temp%10)));

    }

//Recursive Function to check the prime no
    static boolean CheckPrime(int num,int i)
    {
        //Base Case + Processing Logic
        if(i<=num/2)
        {
            if(num%i==0)
            {
                return false;
            }
            return true;
        }
        //Small Problem
        return CheckPrime(num,i+1);
    }

//try-reverse of a num,palindrome

//Recursive Function To reverse a number
    static int ReverseNum(int num,int rev)
    {
        //Base Condition
        if(num==0){
            return rev;
        }
        //Small Problem+Processing Logic
        return ReverseNum(num/10,rev*10+(num%10));
    }    

//Recursive Function to check Palindrme Number
    static boolean CheckPalindrome(int num,int temp,int rev)
    {
        //Base Condition+Processing logic
        if(num==0)
        {
            if(rev==temp)
            {
                return true;
            }
            return false;
        }
        //Small Problem
        return CheckPalindrome(num/10, temp, rev*10+(num%10));
    }

    public static void main(String[] args) {
        //System.out.println(CalcPower(2, 06));
        //System.out.println(digitCount(123456));
        //System.out.println(CountZero(1023001));
        // System.out.println(CheckArmstrong(153, 153, 0));
        // System.out.println(CheckPrime(64, 2));
        // System.out.println(ReverseNum(87392,0));
        System.out.println(CheckPalindrome(16758, 12321, 0));
    }
    
}
