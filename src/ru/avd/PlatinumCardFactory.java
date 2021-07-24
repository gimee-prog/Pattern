package ru.avd;

public class PlatinumCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new PlatinumCard();
    }
}
