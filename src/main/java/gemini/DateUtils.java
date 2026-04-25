package gemini;

import java.time.LocalDate;
import java.time.Period;

public class DateUtils {

    /**
     * Calculates the difference between two dates and returns it in a format
     * suitable for displaying experience (e.g., "5 years, 2 months, 15 days").
     *
     * @param fromDate The starting date
     * @param toDate   The ending date
     * @return A formatted string representing the duration between the dates
     */
    public static String calculateExperience(LocalDate fromDate, LocalDate toDate) {
        if (fromDate == null || toDate == null) {
            return "";
        }
        
        if (fromDate.isAfter(toDate)) {
            throw new IllegalArgumentException("fromDate cannot be after toDate");
        }

        Period period = Period.between(fromDate, toDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        StringBuilder result = new StringBuilder();

        if (years > 0) {
            result.append(years).append(years == 1 ? " year" : " years");
        }
        if (months > 0) {
            if (result.length() > 0) result.append(", ");
            result.append(months).append(months == 1 ? " month" : " months");
        }
        if (days > 0) {
            if (result.length() > 0) result.append(", ");
            result.append(days).append(days == 1 ? " day" : " days");
        }

        if (result.length() == 0) {
            return "0 days";
        }

        return result.toString();
    }
}
