package CoderByteAlgorithms;

import java.util.Scanner;
import java.util.*;
import java.io.*;

class CodelandUsernameValidation {

    public static String CodeLandUsernameValidation(String str) {
        String validation = "false";
        if ((str.length() >= 4) && (str.length() <= 25)) {
            if (Character.isLetter(str.charAt(0))) {
                if (!str.endsWith("_")) {
                    for (int n = 0; n < str.length(); n++) {
                        if (Character.isDigit((str.charAt(n))) || Character.isLetter((str.charAt(n))) || str.charAt(n) == '_') {
                            validation = "true";
                        } else {
                            validation = "false";
                            break;
                        }
                    }
                }
            }
        }
        return validation;
    }

    public static void main(String[] args) {
        //Scanner s = Scanner(System.in);
        System.out.print(CodeLandUsernameValidation("usernamehello123"));
    }
}
