package logical;

public class P1 {

    // 1) Print numbers from 1 to N
    static void print1ToN(int n) {
        System.out.print("1 to n mumber = ");
        for(int i=1;i<=n;i++)
            System.out.print(i + " ");
    
    }

    // 2) Print even numbers up to N
    static void printEven(int n) {
        for(int i=2;i<=n;i+=2)
        	
            System.out.print(i + " ");
        System.out.println();
    }

    // 3) Print odd numbers up to N
    static void printOdd(int n) {
        for(int i=1;i<=n;i+=2)
            System.out.print(i + " ");
        System.out.println();
    }

    // 4) Sum of first N natural numbers
    static void sumN(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println("Sum = " + sum);
    }

    // 5) Squares up to N
    static void squares(int n) {
        for(int i=1;i<=n;i++)
            System.out.print(i*i + " ");
        System.out.println("squre");
    }

    // 6) Fibonacci series
    static void fibonacci(int n) {
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }

    // 7) Factorial series
    static void factorialSeries(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            System.out.print(fact + " ");
        }
        System.out.println();
    }

    // 8) Power series x^1 x^2 x^3
    static void powerSeries(int x,int n) {
        int power=1;
        for(int i=1;i<=n;i++){
            power*=x;
            System.out.print(power + " ");
        }
        System.out.println();
    }

    // 9) Reverse N to 1
    static void reverse(int n) {
        for(int i=n;i>=1;i--)
            System.out.print(i+" ");
        System.out.println();
    }

    // 10) Sum of digits
    static void sumDigits(int n) {
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum = "+sum);
    }

    // 11) Armstrong number
    static void armstrong(int n) {
        int temp=n,sum=0;
        while(n>0){
            int r=n%10;
            sum+=r*r*r;
            n/=10;
        }
        if(sum==temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    // 12) Palindrome numbers in range
    static void palindromeRange(int n) {
        for(int i=1;i<=n;i++){
            int num=i,rev=0;
            while(num>0){
                rev=rev*10+num%10;
                num/=10;
            }
            if(rev==i)
                System.out.print(i+" ");
        }
        System.out.println();
    }

    // 13) Prime numbers up to N
    static void primes(int n) {
        for(int i=2;i<=n;i++){
            boolean prime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime)
                System.out.print(i+" ");
        }
        System.out.println();
    }

    // 14) 1,4,9,16
    static void squareSeries(int n) {
        for(int i=1;i<=n;i++)
            System.out.print(i*i+" ");
        System.out.println();
    }

    // 15) +1 -2 +3 -4
    static void alternating(int n) {
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.print(-i+" ");
            else
                System.out.print(i+" ");
        }
        System.out.println();
    }

    // 16) 1,11,111
    static void onesSeries(int n) {
        int num=0;
        for(int i=1;i<=n;i++){
            num = num*10 + 1;
            System.out.print(num+" ");
        }
        System.out.println();
    }

    // 17) 2,6,7,21,22,66
    static void customSeries(int n) {
        int a=2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            if(i%2==1)
                a=a*3;
            else
                a=a+1;
        }
        System.out.println();
    }

    // 18) Geometric progression
    static void gp(int a,int r,int n) {
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a*r;
        }
        System.out.println();
    }

    // 19) Arithmetic progression
    static void ap(int a,int d,int n) {
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+d;
        }
        System.out.println();
    }

    // 20) Missing number in series
    static void missingNumber(int arr[],int n) {
        int total=n*(n+1)/2;
        int sum=0;
        for(int x:arr)
            sum+=x;
        System.out.println("Missing = "+(total-sum));
    }

    public static void main(String[] args) {

        print1ToN(10);
        printEven(10);
        printOdd(10);
        sumN(10);
        squares(5);
        fibonacci(7);
        factorialSeries(5);
        powerSeries(2,5);
        reverse(10);
        sumDigits(1234);
        armstrong(153);
        palindromeRange(200);
        primes(50);
        squareSeries(5);
        alternating(5);
        onesSeries(5);
        customSeries(6);
        gp(2,3,5);
        ap(2,3,5);

        int arr[]={1,2,3,5,6};
        missingNumber(arr,6);
    }
}