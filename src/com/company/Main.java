package com.company;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        String numeral = input.nextLine();
        Pattern pattern = Pattern.compile("(aa|aba|bcc|cc|cdc)");
        Matcher matcher = pattern.matcher(numeral);
        StringBuilder number = new StringBuilder();
        while (matcher.find()) {
            String num = matcher.group();
            switch (num) {
                case "aa":
                    number.append("0");
                    break;
                case "aba":
                    number.append("1");
                    break;
                case "bcc":
                    number.append("2");
                    break;
                case "cc":
                    number.append("3");
                    break;
                case "cdc":
                    number.append("4");
                    break;
            }
        }
        BigInteger result =new BigInteger(number.toString(),5);
        System.out.println(result.toString());
    }
}
