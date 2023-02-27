import java.util.Random;

public class BoxingGame {
    // Random number generator
    private static final Random rand = new Random();

    // Maximum values for health and hit damage
    private static final int MAX_HEALTH = 100;
    private static final int MAX_HIT_DAMAGE = 20;

    // Boxer class
    private static class Boxer {
        String name;
        int weight;
        int health;
        int hitDamage;

        public Boxer(String name, int weight) {
            this.name = name;
            this.weight = weight;
            this.health = MAX_HEALTH;
            this.hitDamage = rand.nextInt(MAX_HIT_DAMAGE + 1);
        }

        // Method to hit another boxer
        public void hit(Boxer target) {
            target.health -= hitDamage;
        }
    }

    // Ring class
    private static class Ring {
        Boxer player1;
        Boxer player2;

        public Ring(Boxer player1, Boxer player2) {
            this.player1 = player1;
            this.player2 = player2;
        }

        // Method to start the match
        public void startMatch() {
            while (player1.health > 0 && player2.health > 0) {
                double randomNumber = Math.random();

                if (randomNumber < 0.5) {
                    player1.hit(player2);
                } else {
                    player2.hit(player1);
                }
            }

            // Determine the winner
            String winner = (player1.health > 0) ? player1.name : player2.name;
            System.out.println("The winner is: " + winner);
        }
    }

    public static void main(String[] args) {
        Boxer player1 = new Boxer("Player 1", 150);
        Boxer player2 = new Boxer("Player 2", 160);
        Ring ring = new Ring(player1, player2);

        ring.startMatch();
    }
}

