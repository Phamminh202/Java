using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark2
{
    class vd2
    {
        private int _empId;
        private String _empName;
        private int _age;
        private double _salary;
        vd2(int id, String name, int age, double sal)
        {
            Console.WriteLine("Constructor for Employee called");
            _empId = id;
            _empName = name;
            _age = age;
            _salary = sal;
        }
        ~vd2()
        {
            Console.WriteLine("Destructor for Employee called");
            Console.Read();
        }
        static void Main(string[] arg)
        {
            vd2 emp = new vd2(1, "Minh", 45, 35000);
            Console.WriteLine("Id: " + emp._empId);
            Console.WriteLine("Name: " + emp._empName);
            Console.WriteLine("Age: " + emp._age);
            Console.WriteLine("Salary: " + emp._salary);
        }
    }

}
