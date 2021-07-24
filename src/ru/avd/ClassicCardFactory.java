package ru.avd;

public class ClassicCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new ClassicCard();
    }
}
