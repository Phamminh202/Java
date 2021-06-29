using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark2
{
    public partial class Shape
    {
        partial void Create()
        {
            Console.WriteLine("Createing Shape");
        }
        public void Test()
        {
            Create();
        }
    }
}
