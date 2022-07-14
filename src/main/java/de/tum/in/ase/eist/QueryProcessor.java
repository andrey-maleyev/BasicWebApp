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
        } else if (query.contains("multiplied")) {
            int index_a = query.indexOf("is%20", 0) + 1;
            int index_b = query.indexOf("by%20", 0) + 1;
            int a = Integer.parseInt(query.substring(index_a, index_a + 1));
            int b = Integer.parseInt(query.substring(index_b, index_b + 1));
            int c = a * b;
            return String.valueOf(c);
        } else { // TODO extend the programm here
            return "";
        }
    }
}
