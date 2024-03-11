package Wrappers;

import java.util.Calendar;

public class WrappersPractice {
    public static void main(String[] args) {
        int i = 0;

        Integer j = i;

        Integer k = Integer.valueOf(50);
        Integer l = 60;

        System.out.println(j.getClass() +" " + k);
        Calendar ne = Calendar.getInstance();

        boolean b =true;
        Boolean n = b;
        Integer wn = (Integer) k;
    }
}
