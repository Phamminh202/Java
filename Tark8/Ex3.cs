using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mod3
{
    class Ex3
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter first name: ");
            string first = Console.ReadLine();
            Console.WriteLine("Enter last name: ");
            string last = Console.ReadLine();
            Console.WriteLine("Enter your birthday: ");
            string birthday = Console.ReadLine();

            Student(first,last,birthday);

            Console.WriteLine("Enter first name: ");
            string first2 = Console.ReadLine();
            Console.WriteLine("Enter last name: ");
            string last2  = Console.ReadLine();
            Console.WriteLine("Enter your birthday: ");
            string birthday2 = Console.ReadLine();

            Teacher(first2, last2, birthday2);

        }

        static void Student(string first, string last, string birthday)
        {
            Console.WriteLine("{0} {1} was born on: {2}", first, last, birthday);
        }
        static void Teacher(string first, string last,string birthday)
        {
            Console.WriteLine("{0} {1} was born on: {2}", first, last, birthday);
        }

    }
}
