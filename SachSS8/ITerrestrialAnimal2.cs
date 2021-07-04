using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    interface ITerrestrialAnimal2
    {
        string Eat();
    }
    interface IMarineAnimal2
    {
        string Eat();
    }
    class Crocodile2 : ITerrestrialAnimal2, IMarineAnimal2
    {
        string IMarineAnimal2.Eat()
        {
            string terCroc = "Crocodile eats other animals";
            return terCroc;
        }
        string IMarineAnimal2.Eat()
        {
            string marCroc = "Crocodile eats fish and marine animals";
            return marCroc;
        }
        public string EatTerrestrial()
        {
            ITerrestrialAnimal2 terrestrialAnimal2;
            terrestrialAnimal2 = this;
            return terrestrialAnimal2.Eat();
        }
        public string EatMarine()
        {
            IMarineAnimal2 marineAnimal2;
            marineAnimal2 = this;
            return marineAnimal2.Eat();
        }
        public static void Main(string[] args)
        {
            Crocodile2 crocodile2 = new Crocodile2();
            string terCroc = crocodile2.EatTerrestrial();
            Console.WriteLine(terCroc);
            string marCroc = crocodile2.EatMarine();
            Console.WriteLine(marCroc);
        }
    }
}
