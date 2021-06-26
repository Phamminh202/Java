using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ss2
{
    class vd12
    {
        static void Main(string[] args)
        {
            string userName;
            int age;
            double salary;
            Console.Write("Enter your name: ");
            userName = Console.ReadLine();
            Console.Write("Enter your age: ");
            age = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the salary: ");
            salary = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Name: { 0}, Age: { 1}, Salary: { 2} ", userName, age, salary);
        }
    }
}
