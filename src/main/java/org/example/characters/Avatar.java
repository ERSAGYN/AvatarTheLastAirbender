package org.example.characters;

public class Avatar extends Character{
    private static Avatar instance;

    private Avatar() {
    }

    public static Avatar getInstance() {
        if (instance == null) {
            instance = new Avatar();
        }
        return instance;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print(" Avatar");
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("test")) this.setBendingPower("air", this.getBendingPower("air") + 10);
    }
}
