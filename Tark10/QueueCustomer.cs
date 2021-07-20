using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark10
{
    public class QueueCustomer
    {
        private int Id { get; set; }
        private string Name { get; set; }
        Queue<Customer> customers = new Queue<Customer>();
        public void AddQueueCustomer(Customer c)
        {
            customers.Enqueue(c);
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
            return $"Id: {Id} ,Name: {Name}";
        }

    }
}
