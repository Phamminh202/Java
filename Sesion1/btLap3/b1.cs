using System;

namespace btLap3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your name: ");
            string name = Console.ReadLine();
            Console.WriteLine("Enter your address: ");
            string address = Console.ReadLine();
            Console.WriteLine("Enter your phone: ");
            string phone = Console.ReadLine();

            Console.WriteLine("Name: " + name);
            Console.WriteLine("\nAddress: " + address);
            Console.WriteLine("\nPhone: " + phone);
        }
    }
}
