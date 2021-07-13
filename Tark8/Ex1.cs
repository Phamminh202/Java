using System;

namespace Mod3
{
    class Ex1
    {
        static void Main(string[] args)
        {
            int result=Sum(20, 40);
            Console.WriteLine($"The sum of two arguments is: {result}");

            int result2 = Sum(10, 50, 80);
            Console.WriteLine($"The sum of three arguments is: {result}");

            double result3 = Sum(20.5,30.6);
            Console.WriteLine($"The sum of double arguments is: {result}");

        }
        static int Sum(int first,int second)
        {
            int sum = first + second;
            return sum;
        }
        static int Sum(int first, int second,int third)
        {
            int sum = first + second + third;
            return sum;
        }
        static double Sum(double first,double second)
        {
            double result = first + second;
            return result;
        }
    }
}
