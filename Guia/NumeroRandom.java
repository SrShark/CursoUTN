
public class NumeroRandom {
    public static void main(String[] args) {
        System.out.println(NumeroRandom(3, 10));
    }

// System.out.println((int)(Math.random()*6 + 1));

    public static int NumeroRandom (int min, int max) {
        int random = ((int)(Math.random() * (max - min) + min));
        return random;
    }
}
