using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    interface ICalculate
    {
        double Area();
    }
    class Rectangle : ICalculate
    {
        float _length;
        float _breasdth;
        public Rectangle(float valOne,float valTwo)
        {
            _length = valOne;
            _breasdth = valTwo;
        }
        public double Area()
        {
            return _length * _breasdth;
        }
        static void Main(string[] args)
        {
            Rectangle rectangle = new Rectangle(10.2F, 20.3F);
            if(rectangle is ICalculate)
            {
                Console.WriteLine("Area of rectangle: {0:F2}", rectangle.Area());
            }
            else
            {
                Console.WriteLine("Interface method not implemented");
            }
        }
    }
}
