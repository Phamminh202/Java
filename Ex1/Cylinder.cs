using System;

namespace Ex1
{
    class Cylinder
    {
        private double Radius { get; set; }
        private double Height { get; set; }

        public Cylinder(double radius, double height)
        {
            this.Radius = radius;
            this.Height = height;
        }
       
        static void Process(double Radius, double Height)
        {
            double baseArea = Radius * Radius * Math.PI;
            double LateralArea = 2 * Math.PI * Radius * Height;
            double TotalArea = 2 * Math.PI * Radius * (Height + Radius);
            double Volume = Radius * Radius * Math.PI * Height;
            Console.WriteLine($"Base: {baseArea} | Later: {LateralArea} | Total: {TotalArea} | Volume: {Volume}");
        }

        static void Result(double Radius,double Height)
        {
            
            Console.WriteLine("\n");
            Console.WriteLine("cylinder characteristics\n");
            Console.WriteLine("Radius: " + Radius + ", Height:  " + Height);
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Enter the dimenstions of the cylinder");
            Console.Write("Radius: ");
            double Radius = Console.Read();
            Console.Write("Height: ");
            double Height = Console.Read();
            Result(Radius,Height);
            Process(Radius, Height);
            Console.WriteLine();
            Console.ReadKey();
        }
    }
}
