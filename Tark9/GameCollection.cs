using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Tark9
{
    class GameCollection:IEnumerable
    {
        private ArrayList arGame = new ArrayList();

        public Game GetGame(int pos) => (Game)arGame[pos];

        public void AddGame(Game p)
        {
            arGame.Add(p);
        }

        public void ClearGame()
        {
            arGame.Clear();
        }
        public int Count => arGame.Count;

        IEnumerator IEnumerable.GetEnumerator() => arGame.GetEnumerator();
    }
}
