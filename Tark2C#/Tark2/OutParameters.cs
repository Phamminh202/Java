using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark2
{
    class OutParameters
    {
        static void Depreciation(out int val)
        {
            val = 20000;
            int dep = val * 5 / 100;
            int amt = val - dep;
            Console.WriteLine("Deperciation Amount: " + dep);
            Console.WriteLine("Reduced value after depreciation: " + amt);
        }
        static void Main(string[] args)
        {
            int value;
            Depreciation(out value);
        }
    }
}
