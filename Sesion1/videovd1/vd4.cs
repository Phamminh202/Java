using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace videovd
{
    class testA
    {
        public String name;
    }
    class vd4
    {
        static void Main(String[] args)
        {
            int z = 10;
            String str = "Hello world!";
            Console.WriteLine("****Test value type:");
            Console.WriteLine("The value of z before: " + z);
            changeValue(z);
            Console.WriteLine("The value of z after: " + z);

            Console.WriteLine("****Test value type:");
            testA a = new testA();
            a.name = "not changed!";
            Console.WriteLine("The value of str before: " + a);
            changeValue2(a);
            Console.WriteLine("The value of str after: " + a);
        }
        public static void changeValue(int k)
        {
            k = 100;
        }
        public static void changeValue2(testA v)
        {
            v.name = "change it";
        }
    }
}
