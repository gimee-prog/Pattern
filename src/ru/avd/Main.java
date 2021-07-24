package ru.avd;

public class Main {

    public static void main(String[] args) {
	Card classicCard = createCard("Classic");
	Card goldCard = createCard("Gold");
	Card platinumCard = createCard("Platinum");
	classicCard.writeInfoCard();
	goldCard.writeInfoCard();
	platinumCard.writeInfoCard();
    }

    public static Card createCard(String name){
        if (name.equalsIgnoreCase("Classic")){
            ClassicCardFactory classicCardFactory = new ClassicCardFactory();
            return classicCardFactory.createCard();
        } else if (name.equalsIgnoreCase("Gold")){
            GoldCardFactory goldCardFactory = new GoldCardFactory();
            return goldCardFactory.createCard();
        } else if (name.equalsIgnoreCase("Platinum")){
            PlatinumCardFactory platinumCardFactory = new PlatinumCardFactory();
            return platinumCardFactory.createCard();
        } else {
            throw new RuntimeException("wrong type card");
        }
    }
}
