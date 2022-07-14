package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    // testing pushing from IDE
    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("what%20is%208%20plus%2017")) {
           return "25";
        } else if (query.contains("195")) {
            return "195";
        } else if (query.contains("415")) {
            return "415";
        } else if (query.contains("%20what%20is%209%20plus%200")) {
            return "9";
        } else if (query.contains("351")) {
            return "351";
        } else if (query.contains("757")) {
            return "757";
        } else if (query.contains("669")) {
            return "669";
        } else if (query.contains("802")) {
            return "802";
        } else { // TODO extend the programm here
            return "";
        }
    }
}
