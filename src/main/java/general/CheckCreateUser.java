package general;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CheckCreateUser {

    public boolean passwordCheck(String password){

        if (password.length() > 6){
            char [] chars =password.toCharArray();
            for (char c:chars){
                if(Character.isUpperCase(c)){
                    if (password.contains("0") ||password.contains("1") ||password.contains("2")
                            ||password.contains("3") ||password.contains("4") ||password.contains("5")
                            ||password.contains("6") ||password.contains("7") ||password.contains("8")
                            ||password.contains("9")){

                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean emailCheck(String email){

            if (email.contains("@")){
                return true;
            } else return false;
    }

    public TimeZone getTimeZone(){
        Calendar calendar = new GregorianCalendar();

        return calendar.getTimeZone();
    }

    public String getTimeCreate(){

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();

       return df.format(date.getDate());
    }
}
