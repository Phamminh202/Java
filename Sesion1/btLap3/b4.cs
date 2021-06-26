using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace btLap3
{
    class b4
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter n: ");
            int n = Convert.ToInt32(Console.ReadLine());
            for (int i = 1; i < 10; i++)
            {
                int a = n * i;
                Console.WriteLine(n + " x " + i + " = " + a);
            }
            Console.WriteLine("Press any key to continue....");
            Console.ReadKey();
        }
    }
}
