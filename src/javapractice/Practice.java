package javapractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Practice {

    public static void main(String args[]) {
        boolean isValidDate = new Practice().isValidFormat("2021-99-11");
    }

    private boolean isValidFormat(String date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try{
//            sdf.parse(date);
//            return true;
//        }catch (ParseException ex){
//            System.out.println("Exception while validateExpiryDate {} " +  ex.getMessage());
//        }
//        return false;

        String str = "15.89";

        Integer val = (int) Double.parseDouble(str);
        System.out.println("Value " + val);

        return true;
    }

}