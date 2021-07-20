using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark10
{
    public class Customer
    {
        public int Id { get; set; }
        public string Name { get; set; }

        public int Star { get; set; }
        public Customer(int id,string name)
        {
            this.Id = id;
            this.Name = name;
        }
        public int getID()
        {
            return this.Id;
        }
        public string getName()
        {
            return this.Name;
        }
        public override string ToString()
        {
            return $"ID: {Id}, Name: {Name}";
        }


    }
}
