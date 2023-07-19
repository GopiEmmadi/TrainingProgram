package Day4.Problem3;
public class FakeAvatar {
    private String id;
    private String firstName;
    private String lastName;
    private String DateOfBirth;
    private String PhoneNumber;
    private String address;

    public FakeAvatar(String id, String firstname, String lastName, String DateOfBirth, String PhoneNumber, String address) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastName;
        this.DateOfBirth = DateOfBirth;
        this.PhoneNumber = PhoneNumber;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName =firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FakeAvatar{" +
                "id='" + id + '\'' +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", dateofBirth='" + DateOfBirth + '\'' +
                ", phonenumber='" + PhoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
