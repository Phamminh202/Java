using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark2
{
    class Book
    {
        String _bookname;
        public string Print()
        {
            return _bookname;
        }
        public void Input(string bkName)
        {
            _bookname = bkName;
        }
    }
}
