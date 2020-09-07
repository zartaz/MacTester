import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFG {
    public static boolean isValidMacAddress(String str) {
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})|([0-9a-fA-F]{4}\\.[0-9a-fA-F]{4}\\.[0-9a-fA-F]{4})$";
        Pattern p = Pattern.compile(regex);
        if (str == null)
            return false;
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        String isMac = "";
        while (!isMac.equals("stop")) {
            Scanner myMac = new Scanner(System.in);
            System.out.println("\nVale tin mac pou theleis na testareis, i \"stop\" gia na vgeis\n");
            isMac = myMac.nextLine();
            if (isValidMacAddress(isMac))
                System.out.println("\neinai swsti mac filaraki!\n");
            else
                System.out.println("\nden einai swsti mac vre mpoufo\n");
        }
    }
}
