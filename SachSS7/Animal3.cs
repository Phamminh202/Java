using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS7
{
    class Animal3
    {
        protected string Food;
        protected string Activity;
    }
    class Cat2 : Animal3
    {
        static void Main(string[] args)
        {
            Cat2 objCat = new Cat2();
            objCat.Food = "Mouse";
            objCat.Activity = "laze around";
            Console.WriteLine("The Cat loves to eat " +objCat.Food + ".");
            Console.WriteLine("The Cat loves to " +objCat.Activity + ".");
        }
    }
}
