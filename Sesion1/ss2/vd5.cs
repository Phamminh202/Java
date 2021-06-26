using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/// <summary>
/// The program demonstrates the use of XML comments.
///
/// Employee class uses constructors to initialize the ID and
/// name of the employee and displays them.
/// </summary>
/// <remarks>
/// This program uses both parameterized and
/// non-parameterized constructors.
/// </remarks>

namespace ss2
{
    class vd5
    {
        /// <summary>
        /// Integer field to store employee ID.
        /// </summary>
        private int _id;
        /// <summary>
        /// String field to store employee name.
        /// </summary>
        private string _name;
        /// <summary>
        /// This constructor initializes the id and name to -1 and null.
        /// </summary>
        /// <remarks>
        /// <seealsocref=”Employee(int,string)”>Employee(int,string)</ seealso>
        /// </remarks>
        public vd5()
        {
            _id = -1;
            _name = null;
        }
        /// <summary>
        /// This constructor initializes the id and name.
        /// (<paramref name=”id”/>,<paramref name=”name”/>).
        /// </summary>
        /// <param name=”id”>Employee ID</param>
        /// <param name=”name”>Employee Name</param>
        public vd5(int id, string name)
        {
            this._id = id;
            this._name = name;
        }
        /// <summary>
        /// The entry point for the application.
        /// <param name=”args”>A list of command line arguments</param>
        /// </summary>
        /// 


        static void main(string[] args)
        {
            // Creating an object of Employee class and displaying the
            // id and name of the employee
            vd5 objEmp = new vd5(101, "David Smith");
            Console.WriteLine("Employee ID: { 0} \nEmployee Name : { 1}",
objEmp._name);
        }
    }
}
