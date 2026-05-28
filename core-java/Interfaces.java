interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar chords!");
    }
}
class Piano implements Playable {
    public void play() {
        System.out.println("Playing a classical melody on the piano!");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        Piano myPiano = new Piano();
        myGuitar.play();
        myPiano.play();
    }
}
