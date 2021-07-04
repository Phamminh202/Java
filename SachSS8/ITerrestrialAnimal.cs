using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    interface ITerrestrialAnimal
    {

        void Eat();
    }
    interface IMarineAnimal
    {
        void Swim();
    }
    class Crocodile : ITerrestrialAnimal, IMarineAnimal
    {
        public void Eat()
        {
            Console.WriteLine("The Crocodile eats fllesh");
        }
        public void Swim()
        {
            Console.WriteLine("The Crocodile can swim four times faster than an Olympic swimmer");
        }
        static void Main(string[] args)
        {
            Crocodile crocodile = new Crocodile();
            crocodile.Eat();
            crocodile.Swim();
        }
    }
}
