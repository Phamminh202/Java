using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS7
{
    class Animal5
    {
        public virtual void Eat()
        {
            Console.WriteLine("Every animal eats something");
        }
        protected void DoSomething()
        {
            Console.WriteLine("Every animal does something");
        }
    }
    class Cat3 : Animal
    {
        //Class Cat overrides Eat() method of class Animal
        public override void Eat()
        {
            Console.WriteLine("Cat loves to eat the mouse");
        }
        static void Main(String[] args)
        {
            Cat objCat = new Cat();
            objCat.Eat();
        }
    }
}
