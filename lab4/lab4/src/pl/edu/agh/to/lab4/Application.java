package pl.edu.agh.to.lab4;

public class Application {

    public static void main(String[] args) {
        Finder suspects = new Finder(new PersonDatabase(), new PrisonersDatabase());
        suspects.displayAllSuspectsWithName("Janusz");
    }
}