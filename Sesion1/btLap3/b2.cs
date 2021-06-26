using system;
using system.collections.generic;
using system.linq;
using system.text;
using system.threading.tasks;

namespace btlap3
{
    class b2
    {
        static void main(string[] args)
        {
            console.writeline("enter three number: ");
            int[] number = new int[3];
            for (int i = 0; i < 3; i++)
            {
                number[i] = convert.toint32(console.readline());
            }
            int a = 0;
            for (int i = 0; i < 3; i++)
            {
                a = number[i];
                if (a < number[i])
                {
                    a = number[i];
                }
            }

            console.writeline("max integer: " + a);
        }
    }
}
