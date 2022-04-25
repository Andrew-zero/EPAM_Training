package by.epam.introduction_to_java.basic.modul05.Task05.view;

import by.epam.introduction_to_java.basic.modul05.Task05.model.type.BouquetType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    public boolean validateOne(String s) {
        Pattern pattern = Pattern.compile("\\p{Alpha}+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);

        return matcher.find();
    }

    public boolean validateTwo(String s) {
        for (BouquetType t : BouquetType.values()) {
            if (s.equalsIgnoreCase(t.name())) {
                return true;
            }
        }

        return false;
    }
}
