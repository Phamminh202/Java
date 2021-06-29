using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark2
{
    class testVd1
    {
        static void Main1(string[] args)
        {
            var stock = new { Name = "Pham Minh", Code = 1301, Price = 35065.75 };
            Console.WriteLine("Stock Name: " + stock.Name);
            Console.WriteLine("Stock Code: " + stock.Code);
            Console.WriteLine("Stock Price: " + stock.Price);
            Console.Read();
        }
        public static void Main(string[] args)
        {
            vd1 david = new vd1();
            david.DisplayDetails(new { FirstName = "David", LastName = "Blanke", Age = 30 });
            Console.Read();
        }
    }
}
