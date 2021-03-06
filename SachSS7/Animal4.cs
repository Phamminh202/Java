using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS7
{
    class Animal4
    {
        public Animal4()
        {
            Console.WriteLine("Animal constructor without parameters");
        }
        public Animal4(String name)
        {
            Console.WriteLine("Animal constructor with a string parameter");
        }
    }
    class Canine : Animal4
    {
        public Canine() : base("Lion")
        {
            Console.WriteLine("Derived Canine");
        }
    }
    class Details
    {
        static void Main(String[] args)
        {
            Canine objCanine = new Canine();
        }
    }
}
