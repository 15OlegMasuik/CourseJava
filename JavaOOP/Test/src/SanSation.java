import java.util.Calendar;


public class SanSation {
    private String organizatorname;

    public SanSation(String organizatorname) {
        this.organizatorname = organizatorname;
    }

    public SanSation() {
    }

    public String getOrganizatorname() {
        return organizatorname;
    }

    public void setOrganizatorname(String organizatorname) {
        this.organizatorname = organizatorname;
    }

    public void check(SanitarStation s) {
        if (s.getExpiryDate() < Calendar.getInstance().get(Calendar.YEAR)) {
            System.out.println("Expiry date of your product has expired");
        } else {
            System.out.println("Your goods pass");
        }
    }
}
