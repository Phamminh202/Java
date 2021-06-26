using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace btLap3
{
    class b3
    {
        static void Main(string[] args)
        {
            string[] weekday = new string[6] { "Mon", "Tue", "Wed", "Thu", "fri", "Sat" };
            int a;
            do
            {
                Console.WriteLine("Enter number: (1-7)");
                a = Convert.ToInt32(Console.ReadLine());
            } while (a < 1 || a > 7);
            
            Console.WriteLine(weekday[a - 1]);
            Console.ReadKey();
        }
    }
}
