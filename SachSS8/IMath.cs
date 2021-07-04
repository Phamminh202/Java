using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    interface IMath
    {
        void Area();
    }
    class Circle : IMath
    {
        public const float PI = 3.14F;
        protected float Radius;
        protected double AreaOfCircle;
        public virtual void Area()
        {
            AreaOfCircle = (PI * Radius * Radius);
        }
    }
    class Sphere : Circle
    {
        double _areaOfSphere;
        public override void Area()
        {
            base.Area();
            _areaOfSphere = (AreaOfCircle * 4);
        }
        static void Main(string[] args)
        {
            Sphere sphere = new Sphere();
            sphere.Radius = 7;
            sphere.Area();
            Console.WriteLine("Area of sphere: {0:F2}", sphere._areaOfSphere);
        }
    }
}
