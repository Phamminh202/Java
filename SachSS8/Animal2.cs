using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    abstract class Animal2
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats food in order to survive");
        }
        public abstract void AnimalSound();

    }
    class Lion : Animal2
    {
        public override void AnimalSound()
        {
            Console.WriteLine("Lion roars");
        }
        static void Main(string[] args)
        {
            Lion objLion = new Lion();
            objLion.AnimalSound();
            objLion.Eat();
        }
    }

}
