using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark2
{
    class TestHouse
    {
        static void Main(string[] args)
        {
            House londonHouse = new House { HouseName = "London Street", Members = 3 };
            Console.WriteLine("HouseName: {0},Member: {1}", londonHouse.HouseName, londonHouse.Members);
        }
    }
}
