using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark9
{
    public class Game
    {
        private string Name { get; set; }
        private int Year { get; set; }

        public Game() { }
        public Game(string name,int year)
        {
            this.Name = name;
            this.Year = year;
        }

        public override string ToString()
        {
            return $"Name: {Name},Year: {Year}";
        }
    }
}
