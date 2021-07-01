using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS7
{
    class Metals
    {
        string _metalType;
        public Metals(string type)
        {
            _metalType = type;
            Console.WriteLine("Metal:\t\t" + _metalType);
        }
    }
    class SteelConpany : Metals
    {
        string _grade;
        public SteelConpany(string grade) : base("Steel")
        {
            _grade = grade;
            Console.WriteLine("Grade:\t\t" + _grade);
        }
    }
    class Automobiles : SteelConpany
    {
        string _part;
        public Automobiles(string part):base("Cart Iron")
        {
            _part = part;
            Console.WriteLine("Part:\t\t" + _part);
        }
        static void Main(string[] args)
        {
            Automobiles objAuto = new Automobiles("Chassies");
        }
    }
}
