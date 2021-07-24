package ru.avd;

public class GoldCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new GoldCard();
    }
}
