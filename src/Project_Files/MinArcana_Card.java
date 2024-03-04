package Project_Files;


public class MinArcana_Card extends Card{

    //ENUM VALEURS 
    private enum Value{
        ACE("Ace",1), DEUCE("Deuce",2), THREE("Three",3),
        FOUR("Four",4), FIVE("Five",5), SIX("Six",6),
        SEVEN("Seven",7), EIGHT("Eight",8), NINE("Nine",9),
        TEN("Ten",10), PAGE("Page",11), KNIGHT("Knight",12),
        QUEEN("Queen",13), KING("King",14);


        private int PointVal;
        private String ValName;
        private Value(String ValName, int PointVal){
            this.PointVal = PointVal;
            this.ValName = ValName;
        }

        public String getName(){
            return ValName;
        }

        public int getVal(){
            return PointVal;
        }
    }


    //ENUMS SUITES
    private enum Suit{
        SWORD("Sword"), CUPS("Cups"), PENTACLES("Pentacles"), WANDS("Wands");

        private String SuitName;
        private Suit(String SuitName){
            this.SuitName = SuitName;
        }

        public String getSuit(){
            return SuitName;
        }

    }

    //CONSTRUCTOR MINOR

    private Suit suit;
    private Value value;
    private String ValueString ;

    public MinArcana_Card(Suit suit,Value value){
        super((value.ValName + " of "+ suit.SuitName), false);
        this.suit = suit;
        this.value = value;
        this.ValueString =value.ValName + " of "+ suit.SuitName;
    };

    public String getCardValue(){
        return ValueString;
    }
}
