//********************************************************************************
// PantherID:  6159224
// CLASS: COP 2210 – 2021
// ASSIGNMENT # 2
// DATE: 11/29/2021
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

//PLEASE NOTE THAT I AM USING NETBEANS VERSION 12.5
package HauntedHouse;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.Scanner;
import java.lang.Math;

public class Rooms{
    
    
    int choice;
    String item;
    String playerName = JOptionPane.showInputDialog("Welcome to the Shrieking Shack! \n Introduce yourself... stranger"); // establishing player’s name through input
    String bookBag = ""; // establishing string container for book bag allowing ‘holding’ of items
    
    
    public void Elevator() {
        ImageIcon elevator = new ImageIcon("Elevator.jpg");

        String [] elevatorOptions = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}; // options for elevator buttons

// The accessible choices after picking an option in the elevator, asks player what room to go in.
    choice = JOptionPane.showOptionDialog(null,"Where would you like to go next, " + playerName + "? \n \n 0 - Basement/Storage Room  \n 1 - Front Door  \n 2 - Dining Room  \n 3 - Living Room  \n 4 - Bathroom  \n 5 - Kitchen  \n 6 - Pantry" +
"               \n 7 - Dingy Bedroom   \n 8 - Ghostly Bedroom  \n 9 - Bathroom Two \n 10 - Master Bedroom \n 11 - Attic\n","",0,JOptionPane.INFORMATION_MESSAGE, elevator, elevatorOptions, elevatorOptions[0]);
    
// Outcomes for the options. Expands upon different dialogue based on options.
        if (choice == 0) {
            groundFloor();
        } else if (choice == 1) {
            frontDoor();
        } else if (choice == 2) {
            diningRoom();
        } else if (choice == 3) {
            livingRoom();
        } else if (choice == 4) {
            bathRoomOne();
        } else if (choice == 5) {
            Kitchen();
        } else if (choice == 6) {
            Pantry();
        } else if (choice == 7) {
            bedroomOne();
        } else if (choice == 8) {
            bedroomTwo();
        } else if (choice == 9) {
            bathroomTwo();
        } else if (choice == 10) {
            masterBedroom();
        } else if (choice == 11) {
            masterBathroom();
        } else if (choice == 12) {
            Attic();
        }
    }

    //All below option dialogues are based on choices above. These establish what option panes are available after initial selections.

    public void groundFloor() {
        ImageIcon groundFloor = new ImageIcon("groundFloor.jpg");

        String [] groundFloorOptions = {"Boiler Room", "Storage Room", "Go back to Elevator"};

// If player is at ground floor.
    choice = JOptionPane.showOptionDialog(null,"You feel the cold whoosh of air down your neck as the elevator descends into darkness.  \n You arrive with a ding. What room would you like to explore next, " + playerName + "?","",0,JOptionPane.INFORMATION_MESSAGE, groundFloor, groundFloorOptions, groundFloorOptions[0]);


        if (choice == 0) {
            boilerRoom();
        } else if (choice == 1) {
            storageRoom();
        } else if (choice == 2) {
            Elevator();
        }
    }
    
    public void boilerRoom() {
        ImageIcon boilerRoom = new ImageIcon("boilerRoom.jpg");

        String [] boilerRoomOptions = {"Storage Room", "Elevator"};

    choice = JOptionPane.showOptionDialog(null,"Steam gently comes out of the boiler. Nothing interesting to see here though. \n What room would you like to explore next, " + playerName + "?","",0,JOptionPane.INFORMATION_MESSAGE, boilerRoom, boilerRoomOptions, boilerRoomOptions[0]);

        if (choice == 0) {
            storageRoom();
        } else if (choice == 1) {
            Elevator();
        }
    }
    
    
    public void storageRoom() {
        ImageIcon storageRoom = new ImageIcon("storageRoom.jpg");
        ImageIcon Chest = new ImageIcon("Chest.jpg");

        String [] storageRoomOptions = {"Explore Chest", "Boiler Room", "Elevator"};

    choice = JOptionPane.showOptionDialog(null,"Steam gently comes out of the boiler. \n What room would you like to explore next, " + playerName + "?","",0,JOptionPane.INFORMATION_MESSAGE, storageRoom, storageRoomOptions, storageRoomOptions[0]);

//If player picks up an item; item container established.
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You spot a dusty box in the corner and lift the edges of the lid", item, choice, Chest);
            JOptionPane.showMessageDialog(null, "You acquire a rusty key and stuff it into your bookbag. \nIt might come in handy later.");
            bookBag = bookBag.concat(" Rusty Key ");
            storageRoom();
        } else if (choice == 1) {
            boilerRoom();
        } else if (choice == 2) {
            Elevator();
        }
    }
    //If player is at front door.
    public void frontDoor() {
        ImageIcon frontDoor = new ImageIcon("frontDoor.jpg");

        String [] frontDoorOptions = {"Elevator", "Exit Tower"};

    choice = JOptionPane.showOptionDialog(null,"You've reached the front door! \n A grand entrance for a grand adventure \n What room would you like to explore next, " + playerName + "? \nStep into the elevator to get started...","",0,JOptionPane.INFORMATION_MESSAGE, frontDoor, frontDoorOptions, frontDoorOptions[0]);


        if (choice == 0) {
            Elevator();
        } else if (choice == 1) {
            while (!bookBag.contains(" Master Key ")){
           JOptionPane.showMessageDialog(null, "Not so fast " + playerName + "!\n The door has locked itself behind you when you entered.\n Probably need to explore a bit more first.");
           frontDoor();
       }
            
       JOptionPane.showMessageDialog(null, "Congratulations " + playerName + " ! You have made it out of the Tower of Terror\n"
                       + "While you were exploring, you managed to collect: \n"+ bookBag);
               System.exit(0);
        }
     }
// If player is at dining room
    public void diningRoom() {
        ImageIcon diningRoom = new ImageIcon("diningRoom.jpg");
        ImageIcon Candelabra = new ImageIcon("Candelabra.jpg");

        String [] diningRoomOptions = {"Living Room", "Bathroom", "Elevator"};

    choice = JOptionPane.showOptionDialog(null,"Welcome to the grand dining room " + playerName + "! \nLooks like someone didn't get to finish their dinner. \nThe place is dimly lit but with the finest silverware and porcelain ","",0,JOptionPane.INFORMATION_MESSAGE, diningRoom, diningRoomOptions, diningRoomOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "The candelabra lights up by itself and you see a death shadow", item, choice, Candelabra);
            diningRoom();
        } else if (choice == 1) {
            bathRoomOne();
        } else if (choice == 2) {
            Elevator();
        }
    }
    //If player is at living room.
    public void livingRoom() {
        ImageIcon livingRoom = new ImageIcon("livingRoom.jpg");
        ImageIcon Chest = new ImageIcon("Chest.jpg");
        ImageIcon Ghost = new ImageIcon("Ghost.jpg");

        String [] livingRoomOptions = {"Chest", "Elevator"};

    choice = JOptionPane.showOptionDialog(null, playerName + " approaches the living room with a dusty cough. \nA drab painting seems to be watching you as you enter the living room","",0,JOptionPane.INFORMATION_MESSAGE, livingRoom, livingRoomOptions, livingRoomOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You spot a dusty box in the corner and lift the edges of the lid", item, choice, Chest);
            JOptionPane.showMessageDialog(null, "A ghost escapes and scares you to death!", item, choice, Ghost);
            livingRoom();
        } else if (choice == 1) {
            Elevator();

    }
    }
    // If player is in bathroom one.
    public void bathRoomOne() {
        ImageIcon bathRoomOne = new ImageIcon("Bathroom.jpg");
        ImageIcon Mirror = new ImageIcon("Mirror.jpg");
        ImageIcon Shower = new ImageIcon("Shower.jpg");

        String [] bathRoomOneOptions = {"Mirror", "Shower", "Elevator"};

    choice = JOptionPane.showOptionDialog(null,"A dingy bathroom with an unsettling atmosphere. \nA glance at the mirror and it feels like its pulling you into another dimension.","",0,JOptionPane.INFORMATION_MESSAGE, bathRoomOne, bathRoomOneOptions, bathRoomOneOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You glimpse at the mirror and see a bloody face looking back at you.", item, choice, Mirror);
            bathRoomOne();
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "Room suddenly steams up and you feel fingers touching the back of your neck.", item, choice, Shower);
            JOptionPane.showMessageDialog(null, "Twap! Twap! Twap! Heavy dripping can be felt traveling across your face. \n\n"
          + "Above you, you see the ceiling with numbers carved by burgundy paste...\n\n"
          + "It's blood!!! \n\n" 
          );
            
            
  int random = 1 + (int) (Math.random() * 10);
       int Numbers = 0;
       int Numberz = 0;

  for (int i = 0; i < 20; i++)
   {


        if (random % 2 ==0)
               {
                  Numbers++;
               }
            else
                Numberz++;

    }


          JOptionPane.showMessageDialog(null, Numbers);
          JOptionPane.showMessageDialog(null, Numberz );
            bathRoomOne();
        } else if (choice == 2) {
            Elevator();
        }
    }
    
    public void Kitchen() {
        ImageIcon Kitchen = new ImageIcon("Kitchen.jpg");
        

        String [] KitchenOptions = {"Pantry", "Elevator"};

    choice = JOptionPane.showOptionDialog(null,"A single light for the kitchen, you spot a pantry. \nMaybe something wortwhile is inside?","",0,JOptionPane.INFORMATION_MESSAGE, Kitchen, KitchenOptions, KitchenOptions[0]);


        if (choice == 0) {
            Pantry();
        } else if (choice == 1) {
            Elevator();
        }
    }

    public void Pantry() {
        ImageIcon Pantry = new ImageIcon("Pantry.jpg");
        ImageIcon RecipeBox = new ImageIcon("RecipeBox.jpg");
        ImageIcon Broom = new ImageIcon("Broom.jpg");

        String [] PantryOptions = {"Dusty recipe box", "Broom", "Elevator"};

    choice = JOptionPane.showOptionDialog(null,"Covered in cobwebs, a rat scurries away into a hole in the wall. \nDusty antique bottles of wine and a couple of spices line the wall.","",0,JOptionPane.INFORMATION_MESSAGE, Pantry, PantryOptions, PantryOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You open it up and a recipe for chocolate \ndevils food cake appears our of no where", item, choice, RecipeBox);
            JOptionPane.showMessageDialog(null, "You stuff the recipe into your backpack, eager to bake it some time.");
            bookBag = bookBag.concat(" Dusty recipe box ");
            Pantry();
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "You spot a dusty broom in the corner, \nbut it flies up in the air as soon as you touch it", item, choice, Broom);
            Pantry();
        } else if (choice == 2) {
            Elevator();
        }
    }
    
    public void bedroomOne() {
        ImageIcon bedroomOne = new ImageIcon("bedroomOne.jpg");
        ImageIcon Chair = new ImageIcon("Chair.jpg");
        ImageIcon Window = new ImageIcon("Window.jpg");

        String [] bedroomOneOptions = {"Rocking Chair", "Window"};

    choice = JOptionPane.showOptionDialog(null,"The bedroom almost looks cozy... if it wasn't for the setting","",0,JOptionPane.INFORMATION_MESSAGE, bedroomOne, bedroomOneOptions, bedroomOneOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "Chair starts rocking by itself with no one in it", item, choice, Chair);
            bedroomOne();
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "See a child outside on a swing who suddenly disappears", item, choice, Window);
            bedroomOne();
        } else if (choice == 2) {
            Elevator();
        }
    }
    
    public void bathroomTwo() {
        ImageIcon bathRoomTwo = new ImageIcon("bathRoomTwo.jpg");
        ImageIcon Mirror = new ImageIcon("Mirror.jpg");
        ImageIcon Shower = new ImageIcon("Shower.jpg");

        String [] bathRoomTwoOptions = {"Mirror","Shower","Elevator"};

    choice = JOptionPane.showOptionDialog(null,"The bathroom has a faint chlorine smell to it, and a \nbit moldy too it too. You'd rather not think about it","",0,JOptionPane.INFORMATION_MESSAGE, bathRoomTwo, bathRoomTwoOptions, bathRoomTwoOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "A bloody face looks back at you", item, choice, Mirror);
            bathroomTwo();
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "The room suddenly steams up and you feel fingers touching the back of your neck", item, choice, Shower);
            bathroomTwo();
        } else if (choice == 1) {
            Elevator();
        }
    }
    
    public void bedroomTwo() {
        ImageIcon bedRoomTwo = new ImageIcon("bedRoomTwo.jpg");
        ImageIcon Doll = new ImageIcon("Doll.jpg");
        ImageIcon Dresser = new ImageIcon("Dresser.jpg");

        String [] bedRoomTwoOptions = {"Doll House","Dresser","Elevator"};

    choice = JOptionPane.showOptionDialog(null,"The bedroom looks almost cozy... if it wasn't for the setting","",0,JOptionPane.INFORMATION_MESSAGE, bedRoomTwo, bedRoomTwoOptions, bedRoomTwoOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "The dolls start dancing on their own", item, choice, Doll);
            bedroomTwo();
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "A ghost flies out of the dresser as soon as you open it and goes right though your body", item, choice, Dresser);
            bedroomTwo();
        } else if (choice == 1) {
            Elevator();
        }
    }
    
    public void masterBedroom() {
        ImageIcon masterBedroom = new ImageIcon("masterBedroom.jpg");
        ImageIcon Jewelry = new ImageIcon("Jewelry.jpg");

        String [] masterBedroomOptions = {"Shower", "Jewelry Box", "Elevator"};

    choice = JOptionPane.showOptionDialog(null,"The bedroom looks almost cozy... if it wasn't for the setting","",0,JOptionPane.INFORMATION_MESSAGE, masterBedroom, masterBedroomOptions, masterBedroomOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You find the cursed Hope Diamond and feel your doom", item, choice, Jewelry);
            JOptionPane.showMessageDialog(null, "You stuff the diamond into your backpack and decide what to do next...");
            bookBag = bookBag.concat(" Hope Diamond ");
            masterBedroom();
        } else if (choice == 1) {
            Elevator();
        }
        
        
    }
    
    public void masterBathroom() {
        ImageIcon masterBathroom = new ImageIcon("masterBathroom.jpg");
        ImageIcon OilLamp = new ImageIcon("OilLamp.jpg");

        String [] masterBathroomOptions = {"Intricate Oil Lamp", "Shower", "Elevator"};

// If player is at ground floor.
    choice = JOptionPane.showOptionDialog(null,"You feel the cold whoosh of air down your neck as the elevator descends into darkness.  \n You arrive with a ding. What room would you like to explore next, " + playerName + "?","",0,JOptionPane.INFORMATION_MESSAGE, masterBathroom, masterBathroomOptions, masterBathroomOptions[0]);


        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You rub the lamp and a genie pops out, telling you if you guess \nright in three tries, he'll give you a hint", item, choice, OilLamp);
            int randomN = (int) (Math.random() * 10) + 1;

        Scanner input = new Scanner(System.in);
        int guess;
        int attempts = 0;
        JOptionPane.showMessageDialog(null,"Guess a number between 1 and 10.");

        do {
            guess = Integer.parseInt(JOptionPane.showInputDialog("You have " + (3 - attempts) + " attempts left to get a \n to get a hint out of me"));
            attempts++;
            
            if (guess == randomN) {
                JOptionPane.showMessageDialog(null, "You won! The hint is: Visit the storage room and visit the attic to escape");
                masterBedroom();
            } else if (guess > randomN) {
                JOptionPane.showMessageDialog(null, "Too high");
            } else if (guess < randomN) {
                JOptionPane.showMessageDialog(null, "Too low");
            } 
        }while(guess != randomN && attempts < 3);
        if (guess != randomN){
                JOptionPane.showMessageDialog(null, "You lose! And with a loud pop sound the genie disappears");
                masterBedroom();
            }
            masterBedroom();
        } else if (choice == 1) {
            storageRoom();
        } else if (choice == 2) {
            masterBathroom();
        }
    }
    
    public void Attic(){
       while (!bookBag.contains(" Rusty Key ")){
           JOptionPane.showMessageDialog(null, "The attic door does not budge.\n"
                   + playerName + " probably needs a key to unlock the door.");
           Elevator();
       }
       
       ImageIcon Attic = new ImageIcon("Attic.jpg");
       ImageIcon Chest = new ImageIcon ("Chest.jpg");
       
       String [] atticOptions = {"Chest", "Elevator"};
       
       choice = JOptionPane.showOptionDialog(null, "You unlock the door with the rusty key and it creaks open\n"
               + "Dust billows up and you cough\n"
               + "Over there! Another wooden crate. There must be something inside...", "",0, JOptionPane.INFORMATION_MESSAGE, Attic, atticOptions, atticOptions);
       
           if (choice == 0) {
               JOptionPane.showMessageDialog(null, "Inside the chest you find a large, golden key\n"
                       + "It looks eerily similar to the golden keyhold on the entrance..."
                       + "\nMaybe " + playerName + " could escape now?", item, choice, Chest);
               bookBag = bookBag.concat(" Master Key ");
               Attic();
       }
       else if (choice == 1){
               Elevator();
       }
   
   }

}


