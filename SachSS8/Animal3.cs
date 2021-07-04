using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    interface Animal3
    {
        void Drink();
    }
    interface ICarnivorous
    {
        void Eat();
    }
    interface IReptile : IAnimal, ICarnivorous
    {
        void Habitat();
    }
    
    class Crocodile3 : IReptile
    {
        public void Drink()
        {
            Console.WriteLine("Drinks fresh water");
        }
        public void Habitat()
        {
            Console.WriteLine("Can stay in Water and Land");
        }
        public void Eat()
        {
            Console.WriteLine("Eats Flesh");
        }
        static void Main(string[] args)
        {
            Crocodile3 crocodile3 = new Crocodile3();
            Console.WriteLine(crocodile3.GetType().Name);
            crocodile3.Habitat();
            crocodile3.Eat();
            crocodile3.Drink();
        }
    }
}
