using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS7
{
    class Animal2
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats something.");
        }
        public void DoSomething()
        {
            Console.WriteLine("Every animal does something.");
        }
    }
    class Cat : Animal2
    {
        static void Main(string[] args)
        {
            Cat objCat = new Cat();
            objCat.Eat();
            objCat.DoSomething();
        }
    }
}
