package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;

public class jp_practiceset_string {
    public static void main(String[] args) {
        // 1.Convert a string to lower case.
        String name = "John Shelbey";
        name = name.toLowerCase();
        System.out.println(name);

        // 2. Convert spaces to underscore.
        String text = "This is Birmingham!";
        text = text.replace(" ","_");
        System.out.println(text);

        // 3.Write a java program to fill in a letter template which looks loke below;
        //  letter = "Dear <|name|> , Thanks a lot!"
        // Replace <|name|> with a string(some name)
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("name","Arthur");
        System.out.println(letter);

        // 4. Write a program to detect double and triple spaces in a string.
        String Mystring = "By order  of the Peaky Blinders";
        System.out.println(Mystring.indexOf("  "));
        System.out.println(Mystring.indexOf("   "));

        // 5. Write a program to format the following letter using the escape sequence characters.
        //   mail = "Dear Thomas you are a good man."
        String mail = "Dear Thomas\n you are a good man.";
        System.out.println(mail);
    }
}
