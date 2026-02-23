import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NewClass {

    // variables
    private String eyes;
    private String nose;
    private String lips;
    private String skin;
    private String eyeColor;
    private String extras;
    private String extra2; 

    // lists
    private List<String> eyes1 = Arrays.asList("downward", "sharp", "round", "wide", "narrow", "sleepy", "angry", "soft", "big", "small");
    private List<String> nose1 = Arrays.asList("choped","button", "pointy", "flat", "wide", "small","basic");
    private List<String> lips1 = Arrays.asList("line","plumpy","thin","full","round","wide","bigger top","bigger bottom");
    private List<String> skin1 = Arrays.asList("pale", "tan", "dark", "olive", "orange","charcoal","green","rainbow(light)","spotted-ish","red","blue","purple","grey");
    private List<String> eyeColor1 = Arrays.asList("no/empty","green", "gray", "black", "pink", "orange","golden","blue","red","purple","gradiante");
    private List<String> extrasList = Arrays.asList("freckles", "scar", "mole", "piercing(ssssssssssssssssssssssssssssssssssssssssssssssssss)", "nOnEeeeeeeee");

    // constructor
    public NewClass() {}

    // random generator
    public void generateRandom() {
        Random r = new Random();
        eyes = eyes1.get(r.nextInt(eyes1.size()));
        nose = nose1.get(r.nextInt(nose1.size()));
        lips = lips1.get(r.nextInt(lips1.size()));
        skin = skin1.get(r.nextInt(skin1.size()));
        eyeColor = eyeColor1.get(r.nextInt(eyeColor1.size()));
        extras = extrasList.get(r.nextInt(extrasList.size()));
        extra2 = extrasList.get(r.nextInt(extrasList.size()));
    }

    // choose methods
    public void chooseEyes(int index){ eyes = eyes1.get(index); }
    public void chooseSkin(int index){ skin = skin1.get(index); }
    public void chooseLips(int index){ lips = lips1.get(index); }
    public void chooseNose(int index){ nose = nose1.get(index); }
    public void chooseExtra1(int index){ extras = extrasList.get(index); }
    public void chooseExtra2(int index){ extra2 = extrasList.get(index); }

    // toString
    @Override
    public String toString() {
        return "\nWELCOME\nTHIS IS OC GENERATOR 1.0\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
               "The Eyes: " + eyes + " (colored " + eyeColor + ")\n" +
               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
               "The Nose: " + nose + "\n" +
               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
               "The Lips: " + lips + "\n" +
               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
               "Skin color: " + skin + "\n" +
               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
               "EEeeXtraAas (1): " + extras + "\n" +
               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
               "eeEExTRAaAS (2): " + extra2 + "\n" +
               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    }

    // MAIN METHOD 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NewClass oc = new NewClass();

        System.out.println("\nWELCOME\nTHIS IS OC GENERATOR 1.0\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Choose your method of creation/inspiration:");
        System.out.println("1 = randomized");
        System.out.println("2 = numerical input based");
        System.out.print("Your choice, candy~ ::> ");

        int userChoice = input.nextInt();

        if (userChoice == 1) {
            oc.generateRandom();
            System.out.println("Oh-kay... Random OC is being generated...");
        }
        else if (userChoice == 2) {
            System.out.println("This way it's harder-ish... enter indexes:");

            System.out.print("Eyes (0-9): ");
            oc.chooseEyes(input.nextInt());

            System.out.print("Nose (0-6): ");
            oc.chooseNose(input.nextInt());

            System.out.print("Lips (0-7): ");
            oc.chooseLips(input.nextInt());

            System.out.print("Skin (0-12): ");
            oc.chooseSkin(input.nextInt());

            System.out.println("(note: extras list is same for both)");
            System.out.print("Extras (1) (0-4): ");
            oc.chooseExtra1(input.nextInt());

            System.out.print("Extras (2) (0-4): ");
            oc.chooseExtra2(input.nextInt());
        }
        else {
            System.out.println("SORRRRY-R-yy-y\nERROR\nThat was invalid... ~_*");
        }

        System.out.println(oc.toString());
    }
}
