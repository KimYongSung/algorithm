package com.kys.algorithm.hackerrank;

public class TimeConversion {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] times = s.split(":");

        String hour = times[0];
        String minute = times[1];
        String second = times[2].substring(0,2);
        TimeClock timeClock = TimeClock.valueOf(times[2].substring(2));

        return String.format("%02d:%s:%s", timeClock.conversion(Integer.parseInt(hour)) ,minute, second);
    }

    enum TimeClock {
        AM(0) {
            @Override
            public int conversion(int hour) {
                return hour == 12 ? AM.timeClock : hour;
            }
        }
        , PM(12){
            @Override
            public int conversion(int hour) {
                return hour == 12 ? 12 : PM.timeClock + hour;
            }
        }
        ;

        private int timeClock;

        TimeClock(int timeClock) {
            this.timeClock = timeClock;
        }

        public abstract int conversion(int hour);
    }
}
