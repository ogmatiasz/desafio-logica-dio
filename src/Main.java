import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner expierence = new Scanner(System.in);

        String heroiJava = "Java-man";
        System.out.println("Digite o XP adquirido no momento:");
        int xp = 1000;
        int xpe = expierence.nextInt();

        switch (xp){

            case 1 :
                if (xp <= 1000){
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);
                }
                else {
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp + "e é bronze");

                };
                break;
            case 2 :
                if (xp <= 1001){
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);
                }
                else {
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);

                }
                break;
            case 3 :
                if (xp <= 3000){
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);
                }
                else {
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);

                }
                break;
            case 4 :
                if (xp <= 4000){
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);
                }
                else {
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);

                }
                break;
            case 5 :
                if (xp <= 5000){
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);
                }
                else {
                    System.out.println("O herói" + heroiJava + "tem um xp de" + xp);

                }
                break;
            default:



        }

        System.out.println("Digite o Xp adquirido no momento");






        }
    }
