using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mod3
{
    class Ex2
    {
        static void Main(string[] args)
        {
            int first = 9;
            int second = 0;
            Console.WriteLine("Enter your first number: ");
            first = System.Int32.Parse(Console.ReadLine());
            Console.WriteLine("Enter your first number: ");
            second = System.Int32.Parse(Console.ReadLine());
            int result = Divide(first, second);
            Console.WriteLine($"The result of dividing {first} by {second} is {result}");
        }
        static int Divide(int first,int second)
        {
            int result = 0;
            try
            {
                result = first / second;
            }
            catch
            {
                Console.WriteLine("Cannot divide by zero,please provide a non-rezo value your second value");
            }
            return result;
        }
    }
}
