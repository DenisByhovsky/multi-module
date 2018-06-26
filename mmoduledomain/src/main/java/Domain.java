import java.util.ArrayList;
import java.util.List;

public class Domain {

    List<Account> accountList = new ArrayList<Account>();


    public List<Account> addAccount(Account account) {
        account.setFirstName(account.getFirstName());
        account.setLastName(account.getLastName());
        account.setId(account.getId());
        accountList.add(account);
        return accountList;
    }
}
