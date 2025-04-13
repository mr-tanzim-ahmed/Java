public class Whistle {
    /* 

Then create the method public void sound() that prints the whistle's sound. */

    private String sound;

    public Whistle(String whistleSound){

        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }

}