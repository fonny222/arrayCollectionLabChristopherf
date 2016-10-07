package com.example;

public class vGames {
        public static void main(String[] args){


            String[] nesGames = {"Super Mario Bros.","Super Mario Bros. 2","Super Mario Bros. 3","The Legend of Zelda",
                    "The Legend of Zelda: Adventures of Link","Rampage","Battle Toads", "Double Dragon","Ninja Gaiden",
                    "Megaman 2","Anticipation","Top Gun","Robin Hood Prince of Theives","The Simpsons: Bartman Meets Radioactive Man",
                    "Teenage Mutant Ninja Turtles","Teenage Mutant Ninja Turtles II","Baseball","Golf","Double Dragon 2",
                    "Skate or Die","Legend of the Wizard","Mike Tysons Punch-Out!!","Festers Quest","Metroid","Castlevania",
                    "Stealth","Contra","Dragon Warrior","Dr. Mario","Galaga","Excitebike","Dejavu"};

            String[] snesGames = {"Super Mario RPG The Legend of the Seven Stars","StarFox","Mega Man X",
                    "Super Mario World 2: Yoshis' Island", "Street Fighter II Turbo","Donkey Kong Country 2 Diddy Kongs Quest",
                    "Mortal Kombat II","Super Bomberman","Mario Paint","Donkey Kong Country","Final Fantasy III",
                    "The legend of Zelda A link to the Past","Madden NFL 94","Madden NFL 95","Castlevania IV","Super Mario World",
                    "Sim Earth","Super Play Action Football","Super Mario Kart","Super Mario All Stars",
                    "Super Mario All Stars Super Mario World"};

            String[] atariGames = {"Air Sea Battle","Asteroids","Barnstorming","Bowling","Breakout","Centipede","Circus Atari",
                    "Combat","Cosmic Ark","Donkey Kong","The Empire Strikes Back","E.T. The Extraterrestrial",
                    "Frogger","Haunted House","Ice Hockey","Kaboom!","Maze Craze","Missile Command","Ms. Pac-Man",
                    "Pac-Man","PitFall!","Pole Position","Raider's of the Lost Ark","River Raid","Space Invaders",
                    "Spiderman","Stampede","StarMaster","Star Raiders","Star Trek","Zippy The Porcupine",
                    "Super Breakout","Towering Inferno","Vanguard","Video Pinball","Warlords",
                    "Yars' Revenge","Sword Quest Fire World","Joust","Berzerk"};


            String tempNES;
            String tempSNES;
            String tempAtari;

            int counterNES = nesGames.length;
            int counterSNES = snesGames.length;
            int counterAtari = atariGames.length;


            // sort the nes games

            for(int i = 0; i < counterNES -1; i++){
                for(int j = 0; j < counterNES -1; j++){
                    if(nesGames[j].compareTo (nesGames[j+1])>0){
                        tempNES = nesGames[j];
                        nesGames[j] = nesGames[j+1];
                        nesGames[j+1] = tempNES;
                    }
                }
            }

            // sort SNES games
           for(int i = 0; i < counterSNES -1; i++) {
               for (int j = 0; j < counterSNES - 1; j++) {
                   if (snesGames[j].compareTo(snesGames[j + 1]) > 0) {
                       tempSNES = snesGames[j];
                       snesGames[j] = snesGames[j + 1];
                       snesGames[j + 1] = tempSNES;
                   }
               }
           }

            // sort atari games
            for(int i = 0; i < counterAtari -1; i++){
                for(int j = 0; j < counterAtari -1; j++){
                    if(atariGames[j].compareTo (atariGames[j+1])>0){
                        tempAtari = atariGames[j];
                        atariGames[j] = atariGames[j+1];
                        atariGames[j+1] = tempAtari;
                    }
                }
            }

            // Display the Atari collection
            System.out.println();
            System.out.println("My Atari Collection");
            System.out.println();
            for(int i = 0; i < counterAtari; i++){
                System.out.println(atariGames[i]);
            }
            // Display the NES Collection
            System.out.println();
            System.out.println("My NES Collection");
            System.out.println();
            for(int i = 0; i < counterNES; i++){
                System.out.println(nesGames[i]);
            }

            // Display the SNES Collection
            System.out.println();
            System.out.println("My Super Nintendo Collection");
            System.out.println();
            for(int i = 0; i < counterSNES; i++){
                System.out.println(snesGames[i]);
            }


        }
    }
