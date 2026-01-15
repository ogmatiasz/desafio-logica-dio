import java.util.Scanner;

    public class Main2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome do herói: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a quantidade de XP do herói: ");
            int xp = scanner.nextInt();

            String nivel;
            String level;
            int levelup = 0;

            // Convertendo XP em uma experiencia
            if (xp < 1000) level = "ferro";
            else if (xp <= 1001) level = "ferro";
            else if (xp <= 2001) level = "bronze";
            else if (xp <= 5001) level = "prata";
            else if (xp <= 7001) level = "ouro";
            else if (xp <= 9001) level = "platina";
            else if (xp <= 10000)level = "ascendente";
            else level = "radiante";

            // Usando switch com base no level
            switch (levelup) {
                case 0:
                    nivel = "Ferro";
                    break;
                case 1:
                    nivel = "Bronze";
                    break;
                case 2:
                    nivel = "Prata";
                    break;
                case 3:
                    nivel = "Ouro";
                    break;
                case 4:
                    nivel = "Platina";
                    break;
                case 5:
                    nivel = "Ascendente";
                    break;
                case 6:
                    nivel = "Imortal";
                    break;
                case 7:
                    nivel = "Radiante";
                    break;
                default:
                    nivel = "Desconhecido";
            }

            System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

        }
    }
