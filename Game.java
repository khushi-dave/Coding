package com.quizapplication;

public class Game {

    Question[] questions=new Question[5];
    Player player=new Player();

    public void initGame(){

     //creating 5 objects
    for(int i=0;i<5;i++){
        questions[i]=new Question();
    }

    //applying values to the variables of the object

    questions[0].question="Which is the most consumed ice-cream flavour in the world?";
    questions[0].option1="Chocolate";
    questions[0].option2="Mango";
    questions[0].option3="Vanila";
    questions[0].option4="ButterScotch";
    questions[0].correctAnswer=3;

    questions[1].question="Which cartoon gets more fame than any other?";
    questions[1].option1="Tom & Jerry";
    questions[1].option2="Mr. Bean";
    questions[1].option3="Power Rangers";
    questions[1].option4="Bob The Builder";
    questions[1].correctAnswer=2;

    questions[2].question="Which car company has created one of its car in such a way that it can rotate its wheel to 180 degree to take turns?";
    questions[2].option1="BMW";
    questions[2].option2="Honda";
    questions[2].option3="Ford Motor";
    questions[2].option4="Mercedes";
    questions[2].correctAnswer=4;

    questions[3].question="Which award is given to people for their useless inventions?";
    questions[3].option1="IG Nobel Awards";
    questions[3].option2="Nobel Awards";
    questions[3].option3="Waste Time Awards";
    questions[3].option4="Think Beyond Awards";
    questions[3].correctAnswer=1;

    questions[4].question="How much amazon prime cost you n monthly basis?";
    questions[4].option1="$149";
    questions[4].option2="$99";
    questions[4].option3="$249";
    questions[4].option4="$129";
    questions[4].correctAnswer=4;

    }

    public void play(){

        player.getDetails();
        for(int i=0;i<5;i++)
        {
           boolean status=questions[i].askQuestion();

           if(status==true){
               System.out.println("Sahi javab...Well Played!!");
               player.score++;
           }
           else{
               System.out.println("Sorry...Wrong answer.\n We trust you...You can do much better than this. Better luck next time. Thankyou for your presious time.");
           }
        }
        System.out.println(player.name+" your score is "+player.score);
    }

}
