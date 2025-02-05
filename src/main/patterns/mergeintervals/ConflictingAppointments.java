package main.patterns.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;

public class ConflictingAppointments {

    // Time: O(N * LogN) - Due to main.sorting
    // Space: O(N) - Due to use of Arrays.Sort()... Timsort Implementation?
    public static boolean findConflicts(Interval[] appointments) {

        if (appointments.length < 2) {
            return true;
        }

        Arrays.sort(appointments, Comparator.comparingInt(a -> a.start));
        Interval currentAppointment = appointments[0];
        int i = 0;
        while (i < appointments.length - 1) {
            Interval nextAppoint = appointments[i + 1];
            if (currentAppointment.end > nextAppoint.start) {
                return false;
            }
            else {
                currentAppointment = nextAppoint;
                i++;
            }
        }
        return true;
    }


}
