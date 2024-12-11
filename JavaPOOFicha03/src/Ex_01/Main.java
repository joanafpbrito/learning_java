package Ex_01;

public class Main {
    public static void main(String[] args) {

        Music theFirst = new Music("The Scientist", "Alternative Rock", "Coldplay", 3700);
        Music theSecond = new Music ("Bohemian Rapsody", "Rock", "Queen", 7000);
        Music theThird = new Music ("Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);
        Music theFourth = new Music ("Overflow", "Nu Metal", "Linkin Park", 211);
        Music theFifth = new Music ("Lose Yourself", "Rap", "Eminem", 321);
        Music theSixth = new Music("Dialectos de Ternura", "Rap", "Da Weasel", 246);
        Music theSeventh = new Music("Eu levo no Pacote", "Heavy Metal", "Rosinha", 389);

        MusicPlayer mprock = new MusicPlayer();
        MusicPlayer mprap = new MusicPlayer();
        MusicPlayer mpPimba = new MusicPlayer();

        mprock.addMusic(theFirst);
        mprock.addMusic(theSecond);
        mprock.addMusic(theFourth);

        mprap.addMusic(theFifth);
        mprap.addMusic(theSixth);

        mpPimba.addMusic(theThird);
        mpPimba.addMusic(theSeventh);

        System.out.println(" ");
        System.out.println( "_______________________________");
        mprap.printDetails();
        System.out.println( "-------changing-------");
        mprap.changeMusic3(theSixth, theFifth);
        mprap.printDetails();
        System.out.println(" ");
        mprap.calculate();
        System.out.println(" ");
        System.out.println( "_______________________________");
        System.out.println(" ");

        mprock.printDetails();
        System.out.println( "-------changing-------");
        mprock.changeMusic2(0,1);
        mprock.printDetails();
        System.out.println(" ");
        mprock.calculate();
        System.out.println(" ");
        System.out.println( "_______________________________");
        System.out.println(" ");

        mpPimba.printDetails();
        System.out.println( "-------changing-------");
        mpPimba.changeMusic(0, theSeventh);
        mpPimba.printDetails();
        System.out.println(" ");
        mpPimba.calculate();
        System.out.println(" ");
        System.out.println( "_______________________________");

    }
}
