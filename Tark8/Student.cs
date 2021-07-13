using System;

namespace Mod3
{
    internal class Student
    {
        private string first;
        private string last;
        private string birthday;

        public Student()
        {
        }

        public Student(string first, string last, string birthday)
        {
            this.first = first;
            this.last = last;
            this.birthday = birthday;
        }

        public static implicit operator string(Student v)
        {
            throw new NotImplementedException();
        }
    }
}