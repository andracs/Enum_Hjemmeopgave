package com.company; // Husk at bruge dit eget package navn fra nu af

public class Main {

    public static void main(String[] args) {

        // 1. Deklarerer variabler af typen Kort
        Kort highCard, faceCard, card1, card2;

        //2. Assigner værdi til mine variabler.
        highCard = Kort.ACE;
        faceCard = Kort.KING;
        card1 = Kort.TWO;
        card2 = Kort.TEN;

        //3. Lav en sout ved brug af highCard og faceCard
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        System.out.println(" ");

        //4. Deklarer 2 variabler ved navn card1Val og card2Val af typne int og assign dem til card1 og card2
        int card1Val, card2Val;
        card1Val = card1.ordinal() + 1;
        card2Val = card2.ordinal() + 1;


        //5. Print 2 sout ved brug af card1 og card2 der viser hvilken hånd og hvilken totale værdi de kort har.
        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1Val + card2Val));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");



        // Ekstra

        Kort card3, card4, card5, card6, card7, card8, card9;

        card3 = Kort.THREE;
        card4 = Kort.FOUR;
        card5 = Kort.FIVE;
        card6 = Kort.SIX;
        card7 = Kort.SEVEN;
        card8 = Kort.EIGHT;
        card9 = Kort.NINE;

        int card3Val, card4Val, card5Val, card6Val, card7Val, card8Val, card9Val;
        card3Val = card3.ordinal() + 1;
        card4Val = card4.ordinal() + 1;
        card5Val = card5.ordinal() + 1;
        card6Val = card6.ordinal() + 1;
        card7Val = card7.ordinal() + 1;
        card8Val = card8.ordinal() + 1;
        card9Val = card9.ordinal() + 1;

        int cardTotal, cardUlige, cardLige;
        cardLige = card1Val + card2Val + card4Val + card6Val + card8Val;
        cardUlige = card3Val + card5Val + card7Val + card9Val;
        cardTotal = cardLige + cardUlige;


        System.out.println("Total værdi af alle ulige kort er: " + cardUlige);
        System.out.println("Total værdi af alle lige kort er: " + cardLige);
        System.out.println("Total værdi af alle lige og ulige kort er: " + cardTotal);


    }
}
