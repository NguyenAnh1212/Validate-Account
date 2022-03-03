import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private Pattern pattern;
    private Matcher matcher;

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public boolean validate(String inputAccount){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(inputAccount);
        return matcher.matches();
    }
}
