using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Tark10
{
    public class ListDrink
    {
        private int Id { get; set; }
        private string Name { get; set; }
        private int Money { get; set; }
        private string Size { get; set; }

        private  ListDrink(int id,string name,int money,string size)
        {
            this.Id = id;
            this.Name = name;
            this.Money = money;
            this.Size = size;
        }
        public override string ToString()
        {
            return $"ID: {Id}\tName: {Name}\tMoney: {Money}\tSize: {Size}";
        }

    }
    
}
