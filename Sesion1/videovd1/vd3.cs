using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace videovd
{
    class vd3
    {
        static void Main(String[] args)
        {
            Console.WriteLine("Currency formatting - {0:C} {1:C4}", 88.8, 888.8);
            Console.WriteLine("Integer formatting - {0:D5}", 88);

            DateTime dt = DateTime.Now; // obtain current time
            Console.WriteLine("d format: {0:d}", dt);
            Console.WriteLine("D format: {0:D}", dt);

            Console.ReadLine();
        }
    }
}
