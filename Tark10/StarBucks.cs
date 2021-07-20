using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark10
{
    class StarBucks
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Chon chuc vu cua ban: (1-khach hang, 2-nhan vien)");
            int chucvu =Convert.ToInt32(Console.ReadLine());
            if (chucvu == 1)
            {
                KhachHang();
            }
            else if (chucvu == 2){
                NhanVien();
            }
            else
            {
                Console.WriteLine("Sai cu phap!");
            }
        }
        
        public class Randoms
        {
            private readonly Random random = new Random();
            public int RandomNumber(int min,int max)
            {
                 return random.Next(min, max);
            }
            
        }
        static void KhachHang()
        {
            Console.WriteLine("Vui long xep hang!");
            Console.ReadKey();
            var number = new Randoms();
            int num = number.RandomNumber(10, 100);
            Console.WriteLine("Id cua ban la: "+num);
            Console.WriteLine("Enter your name: ");
            string name = Console.ReadLine();
            Customer customer = new Customer(num, name);
            Console.WriteLine(customer.ToString());
            QueueCustomer queueCustomer = new QueueCustomer();
            queueCustomer.AddQueueCustomer(customer);
            
        }
        static void NhanVien()
        {
            Queue<Customer> customer1=new Queue<Customer>();
            customer1.Enqueue(new Customer(1, "Number One"));
            customer1.Enqueue(new Customer(2, "Number Two"));
            customer1.Enqueue(new Customer(3, "Number Three"));

            customer1.Enqueue(new Customer(4, "Number Four"));
            int n=0;
            while(n<customer1.Count())
            {
                Console.WriteLine($"Xin moi vi khach {customer1.Dequeue()} den quay");
                Console.ReadLine();
            }

           
            UseDrink();
            
        }
        static void UseDrink()
        {
            Drink drinks = new Drink();

        }
        

    }
}
