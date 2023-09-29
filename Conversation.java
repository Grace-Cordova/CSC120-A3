import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Conversation {
    public static void main(String[] args) {
        // You will start the conversation here.
        int num_rounds = -1;


        String[] transcript = new String[2 * num_rounds + 2];

        String[] p_response = {
            "mm-hmm",
            "ok!",
            "yup!",
        };
        String[] i_response = {
            "I like that!",
            "I'm not sure",
            "I don't do that"
        };
        String[] u_response = {
            "You think so?",
            "You're funny!",
            "Anyways..."
        };
        String[] q_response = {
            "Good question! I'll have to think about that",
            "Hmmm... I'm not too sure",
            "Huh?"
        };

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.println("How many rounds of conversation would you like to have?");
        num_rounds = input.nextInt();
        input.nextLine();
        System.out.println("Hi, there! What's on your mind today?");

        for (int round = 0; round < num_rounds; round++) {
            String response = input.nextLine().toLowerCase();
            String[] split_list = response.split(" ");
            int i = r.nextInt(2);
            for (String element: split_list) {
                if (element.equals("you")) {
                    System.out.println(i_response[i]);
                } else if (element.equals(" i ")) {
                    System.out.println(u_response[i]);
                } else if (element.equals("who")) {
                    System.out.println(q_response[i]);
                } else if (element.equals("what")) {
                    System.out.println(q_response[i]);
                } else if (element.equals("where")) {
                    System.out.println(q_response[i]);
                } else if (element.equals("when")) {
                    System.out.println(q_response[i]);
                } else if (element.equals("why")) {
                    System.out.println(q_response[i]);
                } else if (element.equals("how")) {
                    System.out.println(q_response[i]);
                } else {
                    System.out.println(p_response[i]);
                }

            }
        }
    }
}