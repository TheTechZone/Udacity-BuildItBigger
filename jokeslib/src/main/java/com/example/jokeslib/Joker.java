package com.example.jokeslib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {
    private List<String> jokes;

    public Joker(){
        List<String> jokes = new ArrayList<>();
        jokes.add(" How many programmers does it take to screw in a light bulb?\n" +
                "\n" +
                "A: None. It's a hardware problem.");
        jokes.add("The state of development in 2017: “Please don’t apply if you don’t have the core concepts of programming, " +
                "and you depend upon copying and pasting the code from StackOverflow/saved file.");
        jokes.add("Software developers like to solve problems. If there are no problems available, " +
                "they will create their own problems. It’s an addiction.");
        jokes.add("I’d like to make the world a better place. But they won’t give me the source code…");
        jokes.add("Java and C were telling jokes. It was C's turn, so he writes something on the wall, points to it and " +
                "says \"Do you get the reference?\" But Java didn't.");
        jokes.add("Q. How did the programmer die in the shower?\n" +
                "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.");
        jokes.add("“Knock, knock.”\n" +
                "“Who’s there?”\n" +
                "very long pause….\n" +
                "“Java.”");
        jokes.add("Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.");
        jokes.add("Whats the most cutting edge language?\n" +
                "A: C#");
        jokes.add("Programming is like sex:\n" +
                "One mistake and you have to support it for the rest of your life.");
        jokes.add("There are three kinds of lies: Lies, damned lies, and benchmarks.");
        jokes.add("The generation of random numbers is too important to be left to chance.");
        jokes.add("All programmers are playwrights, and all computers are lousy actors.");
        jokes.add("Debugging: Removing the needles from the haystack.");
        jokes.add("\"It should be noted that no ethically-trained software engineer would ever consent to write a DestroyBaghdad procedure. " +
                "Basic professional ethics would instead require him to write a DestroyCity procedure, " +
                "to which Baghdad could be given as a parameter.\" - Nathaniel Borenstein");
        jokes.add("The best part about TCP jokes?\n" +
                "\n" +
                "A: I get to keep telling them until you get them.");
        jokes.add("Whats the object-oriented way to become wealthy?\n" +
                "\n" +
                "A: Inheritance");
        jokes.add("Why C gets all the chicks and Java doesn't? Because C doesn't treat them like objects.");
        jokes.add("The problem with UDP jokes: I don’t get half of them.");
        jokes.add("My surgeon used to be a C programmer -- he ends all his procedures with a semi-colonoscopy.");
        jokes.add("I thought I didn't have enough sheep to eat my lawn -- but it turns out I needed more ram.");
        this.jokes = jokes;
    }

    public String tellJoke(){
        Random rng = new Random();
        return jokes.get(rng.nextInt(jokes.size()));
    }
}