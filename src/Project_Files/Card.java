package Project_Files;

public class Card {
    private String Value;
    private boolean isMajorArcana;

    public Card(String Value, boolean isMajorArcana){
        this.Value = Value;
        this.isMajorArcana = isMajorArcana;
        if(isMajorArcana){
            //Code to set MajorArcana
        }
        else{
            //Code to Set MinorArcana
        }

    }

    public string getCardValue(){
        return Value;
    }

}


//CHATGPT : I have 2 enums called MajArcana_Cards and MinArcana_Cards in the same package how do i gather them inside the card class ? 