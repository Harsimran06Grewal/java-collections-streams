package AdvancedTesting;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
    }

    public static String formatDate(String inputDate) throws ParseException {
        // Define input and output date formats
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Convert input string to Date object
        Date date = inputFormat.parse(inputDate);

        // Format the Date object to desired output format
        return outputFormat.format(date);
    }
}
