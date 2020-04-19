package com.curiousoft.sample.util;

import org.hibernate.validator.internal.constraintvalidators.hv.LuhnCheckValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SampleUtils {


    public static boolean isSAIdNumber(String id) {
        String idNumberRegex =
                "(((\\d{2}((0[13578]|1[02])(0[1-9]|[12]\\d|3[01])|(0[13456789]|1[012])(0[1-9]|[12]\\d|30)|02(0[1-9]|1\\d|2[0-8])))|([02468][048]|[13579][26])0229))(( |-)(\\d{4})( |-)(\\d{3})|(\\d{7}))";

        if(Objects.isNull(id) || !id.matches(idNumberRegex)) {
            return false;
        }

        final List<Integer> digits = new ArrayList<>();
        id.chars().forEachOrdered(item -> digits.add(Integer.parseInt(""+ (char)item)) );
        char checkSome = id.charAt(id.length() -1);
        digits.remove(id.length() -1);
        LuhnCheckValidator luhnCheckValidator = new LuhnCheckValidator();
        return luhnCheckValidator.isCheckDigitValid(digits, checkSome);
    }
}
