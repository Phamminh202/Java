using System;
class vd8
{
    static void Main(string[] args)
    {
        string path = "C:\\Windows\\MyFile.txt";
        bool found = true;
        if (found)
        {
            Console.WriteLine("File path: \'" +path + "\'");
        }
        else
        {
            Console.WriteLine("File Not Found!\a");
        }
    }
}