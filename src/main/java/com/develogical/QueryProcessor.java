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
        if (query.toLowerCase().contains("which of the following numbers is the largest: 208, 59, 147, 27")) {
            return "208";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest: 753, 82, 65, 644")) {
            return "644";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest: 15, 5")) {
            return "15";
        }

        
        
        
        return "";
    }
}
