using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SachSS8
{
    class IntelliSenseDemo :TimeZone
    {
        public override string DaylightName => throw new NotImplementedException("The method or operation is not implemented");
        public override System.Globalization.DaylightTime GetDaylightChanges(int year)
        {
            throw new Exception("The method or operation is mot implemented.");
        }
        public override TimeSpan GetUtcOffset(DateTime time)
        {
            throw new NotImplementedException("The method or operation is mot implemented.");
        }
        public override string StandardName => throw new NotImplementedException("The method or operation is mot implemented.");
    }

}
