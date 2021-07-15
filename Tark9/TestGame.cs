using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tark9
{
    class TestGame
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***** Welcome to my favorite games list *****\n");
            ListGame();

            Console.ReadLine();
        }
        static void ListGame()
        {
            GameCollection myGame = new GameCollection();
            myGame.AddGame(new Game("Genshin Imparct",1));
            myGame.AddGame(new Game("Mobile",5));
            myGame.AddGame(new Game("Lengend",11));
            myGame.AddGame(new Game("Dragon",7));

            foreach (Game g in myGame)
                Console.WriteLine(g);
        }
        
    }
}
