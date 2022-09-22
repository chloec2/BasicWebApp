package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "hi"; // change
        }
        if (query.toLowerCase().contains("chair")) {
            return "a thing to sit on";
        }
        if (query.toLowerCase().contains("what is 9 plus 12")) {
            return "21";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest:")) {
            String[] parts = query.toLowerCase().split(" ");
            String currmax = "";
            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
                try {
                    int curr;
                    if (parts[i].substring(parts[i].length() - 1) == ",") {
                        curr = Integer.parseInt(parts[i].substring(0, parts[i].length() - 1));
                    } else {
                        curr = Integer.parseInt(parts[i]);
                    }
                    if ((currmax == "") | (curr > Integer.parseInt(currmax))) {
                        currmax = parts[i];
                        System.out.println(currmax);
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Something went wrong.");
                }
            }
            
        }

        
        
        return "";
    }
}
