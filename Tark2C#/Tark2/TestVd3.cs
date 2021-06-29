using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark2
{
    class TestVd3
    {
        static void Main(string[] args)
        {
            string country = "Great Britain";
            Console.WriteLine(country.Viethoachudau());

            List<string> cities = new List<string>();
            cities.Add("Seoul");
            cities.Add("Paris");
            cities.Add("Thai Binh");
            cities.Add("Ha Noi");
            List<string> result = cities.RemoveDuplicate();
            foreach (string city in result)
                Console.WriteLine(city);
        }
    }
}
