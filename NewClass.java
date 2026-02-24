import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NewClass {

    // OC traits
    private String eyes;
    private String nose;
    private String lips;
    private String skin;
    private String eyeColor;
    private String extras;
    private String extra2;

    // ASCII art
    private String asciiArt;

    // COMMON ASCII (simple faces)
    private List<String> asciiCommon = Arrays.asList(
        "  .-\"\"-.\n ( 0  0 )\n  |  ∇  |\n  '-----'",
        " /\\_/\\\n( o.o )\n > ^ <",
        " (•‿•)\n( >🍪 )",
        " (ᵔᴥᵔ)\n  /| |\\",
        " (◕‿◕)\n  /   \\"
    );

    // RARE ASCII (bigger heads)
    private List<String> asciiRare = Arrays.asList(
        "   _____\n  /     \\\n |  0 0  |\n |   ∇   |\n  \\_____/",
        "  _______\n /       \\\n|  >   <  |\n|    ^    |\n \\_______/",
        "   .-----.\n  / 0   0 \\\n |    ∇    |\n  \\  ---  /\n   '-----'"
    );

    // LEGENDARY ASCII (full-body creatures)
    private List<String> asciiLegendary = Arrays.asList(
        "      /\\_/\\\n" +
        "  ____( o.o )____\n" +
        " (____   V   ____)\n" +
        "      |     |\n" +
        "      |     |",

        "     .-.\n" +
        "   _(°_°)_\n" +
        "  /  > <  \\\n" +
        " /  -----  \\\n" +
        "|  |     |  |\n" +
        " \\ |     | /\n" +
        "  \\|_____|/",

        "     /\\    /\\\n" +
        "    {  `---'  }\n" +
        "    {  O   O  }\n" +
        "    ~~>  V  <~~\n" +
        "     \\  \\|/  /\n" +
        "      `-----`"
    );

    // Lists for traits
    private List<String> eyes1 = Arrays.asList("downward", "sharp", "round", "wide", "narrow", "sleepy", "angry", "soft", "big", "small");
    private List<String> nose1 = Arrays.asList("choped","button", "pointy", "flat", "wide", "small","basic");
    private List<String> lips1 = Arrays.asList("line","plumpy","thin","full","round","wide","bigger top","bigger bottom");
    private List<String> skin1 = Arrays.asList("pale", "tan", "dark", "olive", "orange","charcoal","green","rainbow(light)","spotted-ish","red","blue","purple","grey");
    private List<String> eyeColor1 = Arrays.asList("no/empty","green", "gray", "black", "pink", "orange","golden","blue","red","purple","gradiante");
    private List<String> extrasList = Arrays.asList("freckles", "scar", "mole", "piercing(ssssssssssssssssssssssssssssssssssssssssssssssssss)", "nOnEeeeeeeee");

    public NewClass() {}

    // RANDOM GENERATOR
    public void generateRandom() {
        Random r = new Random();

        eyes = eyes1.get(r.nextInt(eyes1.size()));
        nose = nose1.get(r.nextInt(nose1.size()));
        lips = lips1.get(r.nextInt(lips1.size()));
        skin = skin1.get(r.nextInt(skin1.size()));
        eyeColor = eyeColor1.get(r.nextInt(eyeColor1.size()));
        extras = extrasList.get(r.nextInt(extrasList.size()));
        extra2 = extrasList.get(r.nextInt(extrasList.size()));

        // RARITY SELECTION
        int roll = r.nextInt(100);
        if (roll < 70) {
            asciiArt = asciiCommon.get(r.nextInt(asciiCommon.size()));
        } else if (roll < 95) {
            asciiArt = asciiRare.get(r.nextInt(asciiRare.size()));
        } else {
            asciiArt = asciiLegendary.get(r.nextInt(asciiLegendary.size()));
        }
    }

    // MANUAL CHOICES
    public void chooseEyes(int index){ eyes = eyes1.get(index); }
    public void chooseSkin(int index){ skin = skin1.get(index); }
    public void chooseLips(int index){ lips = lips1.get(index); }
    public void chooseNose(int index){ nose = nose1.get(index); }
    public void chooseExtra1(int index){ extras = extrasList.get(index); }
    public void chooseExtra2(int index){ extra2 = extrasList.get(index); }

    public void chooseAscii(int rarity, int index){
        if (rarity == 0) asciiArt = asciiCommon.get(index);
        else if (rarity == 1) asciiArt = asciiRare.get(index);
        else asciiArt = asciiLegendary.get(index);
    }

    @Override
    public String toString() {
        return "\nYOUR OC MATERIALIZES...\n====================\n" +
               asciiArt + "\n" +
               "====================\n" +
               "Eyes: " + eyes + " (colored " + eyeColor + ")\n" +
               "Nose: " + nose + "\n" +
               "Lips: " + lips + "\n" +
               "Skin: " + skin + "\n" +
               "Extra 1: " + extras + "\n" +
               "Extra 2: " + extra2 + "\n" +
               "====================\n";
    }

    // MAIN PROGRAM
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NewClass oc = new NewClass();

        System.out.println("\nWELCOME TO OC GENERATOR 2.0");
        System.out.println("Choose creation method:");
        System.out.println("1 = Random");
        System.out.println("2 = Manual");
        System.out.print("Your choice, candy~ ::> ");

        int choice = input.nextInt();

        if (choice == 1) {
            oc.generateRandom();
            System.out.println("Generating random OC...");
        }
        else if (choice == 2) {
            System.out.println("Manual mode activated...");

            System.out.print("Eyes (0–9): ");
            oc.chooseEyes(input.nextInt());

            System.out.print("Nose (0–6): ");
            oc.chooseNose(input.nextInt());

            System.out.print("Lips (0–7): ");
            oc.chooseLips(input.nextInt());

            System.out.print("Skin (0–12): ");
            oc.chooseSkin(input.nextInt());

            System.out.print("Extra 1 (0–4): ");
            oc.chooseExtra1(input.nextInt());

            System.out.print("Extra 2 (0–4): ");
            oc.chooseExtra2(input.nextInt());

            System.out.println("ASCII rarity: 0=common, 1=rare, 2=legendary");
            int rarity = input.nextInt();

            System.out.println("Choose ASCII index:");
            int idx = input.nextInt();

            oc.chooseAscii(rarity, idx);
        }
        else {
            System.out.println("Invalid choice, candy~");
            return;
        }

        System.out.println(oc.toString());
    }
}
