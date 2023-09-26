public class Wspolbierznosc extends Thread {
    public static void main(String[] args) {
        Wspolbierznosc t = new Wspolbierznosc();

    }
    public void run(){
        for (int i = 1; i < 3 ; ++i) {
            System.out.print(i + " .");
        }
    }
}
