import java.util.Scanner;

class danceFloor{
    public static void main(String args[]){
        Boolean dinner = false;
        Scanner in = new Scanner(System.in);

        //Introduction
        System.out.println("Welcome to the Dance Floor Choose Your Own Adventure! When Prompted with choices, always reply with the number of the choice.");
        System.out.println("What would you like to do first? \n 1. Eat Dinner then go to the dance floor \n 2. Go to the dance floor without eating dinner ");
        String choice = in.nextLine();
        System.out.print(choice);

        //Dinner
        if(choice.equalsIgnoreCase("1")){
            dinner = true;
            System.out.println("You eat dinner, and you feel quite full. ");
        }



        System.out.println("You head to the dance floor. " );

        //Dances
        System.out.println("You remember that you only can do 2 dances, the robot and salsa. Which dance do you you do? \n1. Robot \n2. Salsa ");
        choice = in.nextLine(); 
        if(choice.equalsIgnoreCase("1")){
            System.out.println("People think you are an actual robot, so people give you weird looks. ");
        }
        if(choice.equalsIgnoreCase("2")){
            System.out.println("You did the salsa to a song that really wasn't the right song for it.  ");
        }

        //DJ
        System.out.println("The DJ got bored of playing music. You could either become the DJ, or let people dance without music. \n1. Become the DJ \n 2. Let People Dance Without Music");
        choice = in.nextLine();
        if(choice.equalsIgnoreCase("1")){
            dj(dinner);
        }
        else{
            noMusic();
        }

        in.close();
    }

//Call Manager for DJ
    public static void manager(){
        Scanner in = new Scanner(System.in);
        String choice = " ";
        System.out.println("You go and call the manager. The manager kicks the horrible DJ off of the DJ, and they find a new person. However, you are getting a bad feeling from this new person. What do you do? You could either ignore it, or frisk the person");
        System.out.println("1. Ignore \n 2. Frisk");
        choice = in.nextLine();
        if(choice.equalsIgnoreCase("1")){
            System.out.println("You ignore it and you enjoy the night as a normal person. You are really happy with your night. ");
            end();
        }
        else{
            System.out.println("You frisk the person. In their pocket, you find a picture of you and your sister. ");
            System.out.println("You get really confused, and you realise that this man is the man that your mom divorced from when you were a baby. You didn't ever recognize him.");
            System.out.println("You have a happy ending with your new dad. ");
            end(); 
        }
    }
//Punching DJ
    public static void punch(){
        Scanner in = new Scanner(System.in);
        String choice = " ";
        System.out.println("You go to punch the person, but they see you and they punch back. You are really hurt, but you continue the night. What do you do now? You act like nothing happened, however people were giving you a hard time, wanting you to leave.");
        System.out.println("You don't want to end the night that early. You could either fight everyone that gets in our way or sneak in to get some drinks. ");
        System.out.println("1. Fight \n 2. Drinks");
        choice = in.nextLine();
        if(choice.equalsIgnoreCase("1")){
            System.out.println("You fight everyone that gets in your way, of course it doesn't work and you get kicked out. You ended the night early.");
            end();
        }
        else{
            drinks();
        }
    
        
    }

//Didn't want to become DJ
    public static void noMusic(){
        Scanner in = new Scanner(System.in);
        String choice = " ";
        System.out.println("The people start to get very bored, including you. The people nominate someone to become the DJ. They become the DJ, and they play horrible music. What do you do? You could punch the person for playing horrible music, or you could call the manager");
        System.out.println("1. Punch the newly nominated DJ \n 2. Call the manager");
        choice = in.nextLine();
        if(choice.equalsIgnoreCase("1")){
            punch();
        }
        else{
            manager();
        }
        
    }

//Drinks
    public static void drinks(){
        Scanner in = new Scanner(System.in);
        String choice = "";
        System.out.println("You have a little too many drinks, and you start to lose your motor skills. You start to talk really weirdly. What do you do next? You could either continue drinking, or mosh. ");
        System.out.println("1. Drink \n 2. Mosh");
        choice = in.nextLine();
        if(choice.equalsIgnoreCase("1")){
            System.out.println("You start to have more drinks, but you lose consiousness. You end up waking up in the hospital, barely remembering last night. ");
            end();
        }
        else{
            System.out.println("You go to mosh, however the effect of the drinks is starting to affect you a lot. You collapse, and end up in the hospital. ");
            end(); 
        }
    }



//Control the entire Dance Floor
    public static void control(){
        Scanner in = new Scanner(System.in);
        String choice = ""; 
        System.out.println("You start to control the entire dance floor. You create a nice environment for everyone, with flashing lights and great music. The manager of the dance floor wants to hire you. Do you accept the job? ");
        System.out.println("1. Yes \n 2. No");
        choice = in.nextLine();
        if(choice.equalsIgnoreCase("1")){
            System.out.println("You accepted the job! You now have a job with decent pay, and free access to the dance floor whenever you want. However, you get assigned a different boss other than the manager, and your boss is... your Sister.");
            end();
        }
        else{
            System.out.println("You decline the job, for some reason. You always wanted to be a hacker at MLH, so that might be the reason.");
            end();
        }
    }


//Getting back in with a 40% Chance
    public static void backIn(Boolean x){
        Scanner in = new Scanner(System.in);
        String choice = "";
        System.out.println("You make it back in. People give you weird looks with your weirdly artificial moustache.");
        System.out.println("You want to get back onto the DJ. Do you go for the DJ, or mosh? \n 1. DJ \n 2. Mosh");
        choice = in.nextLine();
        if(choice.equalsIgnoreCase("1")){
            System.out.println("People notice you trying to go for the DJ, they don't want another person to play horrible songs so they don't let you go on the DJ. You go to mosh instead");
        }
        if(x){
            System.out.println("You go to Mosh. However, a weird sensation appears in your stomach. You think nothing of it, until you see vomit on the floor, looking like the dinner you had before you came.");
            System.out.println("You get kicked out, and you end the night with an upset stomach and angry people with your vomit on them.");
            end();
        }
        else{
            System.out.println("You mosh and had a great time! For once in this entire saga you enjoyed yourself. Nothing bad happened. You end the night with some new friends and a very hungry stomach.");
            end();
        }

    }


//Getting Fired from your "DJ"
    public static void fired(Boolean x){
        Scanner in = new Scanner(System.in);
        String choice = "";
        System.out.println("You got kicked off of the DJ. You really wanted to stay on the DJ, so you punched the person who tried to kick you off. People started chanting 'FIGHT,' but one person saw that punch, and kicked you out of the dance floor.");
        System.out.println("You are tempted to go back in with a disguise. Do you go back in, with a disguise or no? There is about a 40% Chance you succeed and get back in. \n 1. Yes \n2. No");
        choice = in.nextLine();

        if(choice.equalsIgnoreCase("1")){
        if(Math.floor((Math.random() * 100) + 1) < 41){
            backIn(x);
        }
        else{
            System.out.println("You randomly wake up in the hospital. The doctors tell you that you got punched, fell down and got a concussion. Safe to say that is the end of the night");
            end();
        }
    }
        
    }


//Becoming DJ
    public static void dj(Boolean x){
        Scanner in = new Scanner(System.in);
        System.out.println("You become the DJ");
        System.out.println("What song do you play? \n 1. Good Time by Owl City ft. Carly Rae Jepsen \n 2. Cotton Eye Joe by Rednex");
        String choice = in.nextLine(); 
        if(choice.equalsIgnoreCase("1")){
            System.out.println("The crowd starting creating a Mosh Pit with your great song choice. ");
            System.out.println("What do you do next? You could either control the entire Dance Floor, meaning you could control the colors of the Dance Floor and stuff, or you could go have some drinks");
            System.out.println("1. Control the entire Dance Floor \n 2. Have Some Drinks");
            choice = in.nextLine();
            if(choice.equalsIgnoreCase("1")){
                
                control();
            }
            else{

                drinks();
            }
        }
        else{
            fired(x);
        }
        
    }


    //Ending 
    public static void end(){
        System.out.println("Thank you so much for playing the Dance Floor Choose Your Own Adventure!");

    }

}
