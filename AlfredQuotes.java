import java.util.Date;

public class AlfredQuotes {
    


    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    


    // public String guestGreeting(String name) {
    // YOUR CODE HERE
    // return String.format("Hello, %s. Lovely to see you.", name);
    // }

        // return "place holder for guest greeting return string";
    // }
    


    // Ninja Bonus:
    // return greeting with day period (morning, afternoon, or evening)
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }



    public String dateAnnouncement() {
    // YOUR CODE HERE
        return String.format("It is currently %s", new Date());
    }

    // return "place holder for date announcement return string";
    // }
    


    public String respondBeforeAlexis(String conversation) {
    // YOUR CODE HERE
    // The -1 is just a way to verify Alexis or Alfred was called - per the given solution
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }

        return "Right. And with that I shall retire.";
    }

    // return "for snarky response return string";
    // }



	// Sensei Version of greeting:
    // Instead of a string for the day period, write the overloaded method with no parameters, and use a Date object to determine the day period.



    // Sensei Bonus:
    // Write your own AlfredQuote method using any of the String methods you have learned! For example maybe he sometimes yells when he's angry..

}   




// PROVIDED SOLUTION

import java.util.Date;

public class AlfredQuotes {

    //  Note: These greetings are not printed to the console, 
    //        but returned as a String for use in the testing file.

    // Inputs: None
    // Return Type: String
    // Output: Returns some basic generic greeting that Alfred might say to anyone.
    public String basicGreeting() {
        return "Hello, lovely to see you. Isn't it nice out today?";
    }

    // Inputs: String name, String - assume "morning", "afternoon" or "evening".
    // Return Type: String
    // Output: Returns a greeting alfred might say, 
    //         that includes the person's name in the greeting.
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    // Inputs: None
    // Return Type: String
    // Output: Returns an announcement of the current date, 
    //         in a polite manner.
    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }
    
    // Inputs: String (Any phrase)
    // Return Type: String
    // Output: A response (String)
    public String answeringBeforeAlexis(String phrase) {

        if(phrase.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "At your service, naturally.";
        }

        return "Right. And with that I shall retire.";
    }

// BONUSES:
// Product Back Log (PBL) ~ 

// Ninja Bonuses:
// Guest Greeting (Ninja Bonus Version!)
// Description: Use method overloading to write another guestGreeting method that returns a greeting including the person's name as well as the day period. Note: It must have the same method name, but will have a different method signature.
// Inputs: String name, String dayPeriod  ("morning", "afternoon" or "evening")
// Return Type: String
// Example Output: "Good evening, Beth Kane. Lovely to see you."

// SENSEI VERSION: 
// Instead of a string for the day period, write the overloaded method with no parameters, and use a Date object to determine the day period.
// Hint: Use your google-kung-fu! You can use the  SimpleDateFormat class and the Format class to help. Both are part of the java.text library. To the bat-documentation!

// Sensei Bonus:
// Write your own AlfredQuote method using any of the String methods you have learned! For example maybe he sometimes yells when he's angry..

