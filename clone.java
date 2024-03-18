class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    public Organization clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            
            throw new InternalError(e);
        }
    }
}

public class Organization {
    public static void main(String[] args) {
        Organization originalOrganization = new Organization(1, "ABC Corp", "123 Main St");
        Organization clonedOrganization = originalOrganization.clone();
        System.out.println("Original Organization:");
        originalOrganization.printDetails();

        System.out.println("\nCloned Organization:");
        clonedOrganization.printDetails();
    }
}


