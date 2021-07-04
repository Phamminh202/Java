using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    interface ISet
    {
        void AcceptDetails(int valOne, string valTwo);
    }
    interface IGet
    {
        void Display();
    }
    class Employee : ISet
    {
        int _empID;
        string _empName;
        public void AcceptDetails(int valOne,string valTwo)
        {
            _empID = valOne;
            _empName = valTwo;
        }
        static void Main(string[] args)
        {
            Employee employee = new Employee();
            employee.AcceptDetails(10, "Jack");
            IGet get = employee as IGet;
            if (get != null)
            {
                get.Display();
            }
            else
            {
                Console.WriteLine("Invaid casting occurred");
            }
        }
    }
}
