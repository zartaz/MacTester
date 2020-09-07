import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFG {
    public static boolean isValidMacAddress(String str){
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})|([0-9a-fA-F]{4}\\.[0-9a-fA-F]{4}\\.[0-9a-fA-F]{4})$";
        Pattern p = Pattern.compile(regex);
        if (str == null)
            return false;
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public static void main(String[] args) {
        Scanner myMac = new Scanner(System.in);
        System.out.println("Vale tin mac pou theleis na testareis ...");
        String isMac = myMac.nextLine();
        if (isValidMacAddress(isMac))
            System.out.println("einai swsti mac filaraki!");
        else
            System.out.println("den einai swsti mac vre mpoufo");
    }
}
