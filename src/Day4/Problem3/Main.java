package Day4.Problem3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void getAllUser(ArrayList<FakeAvatar> fakeAvatar) {
        for (FakeAvatar a : fakeAvatar) {
            System.out.println(a);
        }
    }

    public static void getUserById(ArrayList<FakeAvatar> fakeAvatars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter id of the user");
        String id = scn.nextLine();
        int flag = 0;
        for(FakeAvatar fakeAvatar: fakeAvatars){
            if(fakeAvatar.getId().equals(id)){
                System.out.println(fakeAvatar);
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("User with " + id + " does not exist");
        }
    }
    public static void addUser(ArrayList<FakeAvatar> fakeAvatar) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the User Details");
        System.out.println("Enter user id");
        String id = scn.nextLine();
        System.out.println("Enter User's  first name");
        String firstName = scn.nextLine();
        System.out.println("Enter User's  Last name");
        String lastName = scn.nextLine();
        System.out.println("Enter User's date of birth");
        String dateOfBirth = scn.nextLine();
        System.out.println("Enter User's phone number");
        String phoneNumber = scn.nextLine();
        System.out.println("Enter User's address");
        String address = scn.nextLine();
//        String address = scn.nextLine();
//        FakeAvatar user = new FakeAvatar();
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
//        user.setDateOfBirth(dateOfBirth);
//        user.setPhoneNumber(phoneNumber);
//        user.setAddress(address);
        FakeAvatar newFakeAvatar = new FakeAvatar(id, firstName, lastName, dateOfBirth, phoneNumber, address);
        fakeAvatar.add(newFakeAvatar);

        System.out.println("new user added successfully");
        System.out.println("new User Details: " + newFakeAvatar);
    }

    public static void updateCSV(String filePath, ArrayList<FakeAvatar> fakeAvatars) {
//        System.out.println("coming code in update csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (FakeAvatar fakeAvatar : fakeAvatars) {
                bw.write(fakeAvatar.getId());
                bw.write(",");
                bw.write(fakeAvatar.getFirstName());
                bw.write(",");
                bw.write(fakeAvatar.getLastName());
                bw.write(",");
                bw.write(fakeAvatar.getDateOfBirth());
                bw.write(",");
                bw.write(fakeAvatar.getPhoneNumber());
                bw.write(",");
                bw.write(fakeAvatar.getAddress());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<FakeAvatar> loadCsvFile(String filePath) {
        ArrayList<FakeAvatar> fakeAvatar = new ArrayList<FakeAvatar>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");
                if (arr.length < 6) {
                    continue;
                }
                String id = arr[0];
                String firstName = arr[1];
                String lastName = arr[2];
                String dateOfBirth = arr[3];
                String phoneNumber = arr[4];
                String address = arr[5];
                fakeAvatar.add(new FakeAvatar(id, firstName, lastName, dateOfBirth, phoneNumber, address));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fakeAvatar;
    }

    public static void updateUser(ArrayList<FakeAvatar> fakeAvatars) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the ID of the user to update: ");
        String id = scn.nextLine();
        scn.nextLine();

        FakeAvatar updatedFakeAvatar = null;
        for (FakeAvatar fakeAvatar : fakeAvatars) {
//            System.out.println(fakeAvatar.getId()+", "+ id);
            if (fakeAvatar.getId().equals(id)) {
                System.out.print("Enter 'F' to update the first name, 'L' to update the last name, 'D' to update the date of birth, 'P' to update the phone number, 'A' to update the address: ");
                String fieldToUpdate = scn.nextLine().toUpperCase();

                switch (fieldToUpdate) {
                    case "F":
                        System.out.print("Enter the updated first name: ");
                        String firstName = scn.nextLine();
                        fakeAvatar.setFirstName(firstName);
                        break;
                    case "L":
                        System.out.print("Enter the updated last name: ");
                        String lastName = scn.nextLine();
                        fakeAvatar.setLastName(lastName);
                        break;
                    case "D":
                        System.out.print("Enter the updated date of birth: ");
                        String dateOfBirth = scn.nextLine();
                        fakeAvatar.setDateOfBirth(dateOfBirth);
                        break;
                    case "P":
                        System.out.print("Enter the updated phone number: ");
                        String phoneNumber = scn.nextLine();
                        fakeAvatar.setPhoneNumber(phoneNumber);
                        break;
                    case "A":
                        System.out.print("Enter the updated address: ");
                        String address = scn.nextLine();
                        fakeAvatar.setAddress(address);
                        break;
                    default:
                        System.out.println("Invalid field choice. No updates performed.");
                        return;
                }

                updatedFakeAvatar = fakeAvatar;
                break;
            }
        }

        if (updatedFakeAvatar != null) {
            System.out.println("User with ID " + id + " has been updated.");
            System.out.println("Updated user details: " + updatedFakeAvatar);
        } else {
            System.out.println("User with ID " + id + " not found.");
        }
    }

    public static void deleteUser(List<FakeAvatar> fakeAvatars) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the ID of the user to delete: ");
        String id = scn.nextLine();
//        scn.nextLine(); // Consume the newline character

        FakeAvatar deletedFakeAvatar = null;
        for (FakeAvatar fakeAvatar : fakeAvatars) {
            if (fakeAvatar.getId().equals(id)) {
                deletedFakeAvatar = fakeAvatar;
                break;
            }
        }

        if (deletedFakeAvatar != null) {
            fakeAvatars.remove(deletedFakeAvatar);
            System.out.println("User with ID " + id + " has been deleted.");
            System.out.println("Deleted user details: " + deletedFakeAvatar);
        } else {
            System.out.println("User with ID " + id + " not found.");
        }
    }
    public static void getUserByName(ArrayList<FakeAvatar> fakeAvatars){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the name to search : ");
        String searchTerm = scn.nextLine();
        List<FakeAvatar> searchByFirstName =  fakeAvatars.stream()
                .filter(avatar-> avatar.getFirstName().equalsIgnoreCase(searchTerm))
                .collect(Collectors.toList());
        if(searchByFirstName.isEmpty()){
            System.out.println("There is no user with the given name");
        }else{
            searchByFirstName.forEach(System.out::println);
        }

    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\veera\\Downloads\\fake_data.csv";
        ArrayList<FakeAvatar> fakeAvatars = loadCsvFile(filePath);

        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter 1 to get user by id");
            System.out.println("Enter 2 to get all user");
            System.out.println("Enter 3 to add user");
            System.out.println("Enter 4 to update user");
            System.out.println("Enter 5 to delete user");
            System.out.println("Enter 6 to search by user name");
            int x = scn.nextInt();
            scn.nextLine();
            switch (x) {
                case 1:
                    getUserById(fakeAvatars);
                    break;
                case 2:
                    getAllUser(fakeAvatars);
                    break;
                case 3:
                    addUser(fakeAvatars);
                    break;
                case 4:
                    updateUser(fakeAvatars);
                    break;
                case 5: deleteUser(fakeAvatars);
                    break;
                case 6: getUserByName(fakeAvatars);
                    break;
                default:
                    System.out.println("You have entered the wrong input");
            }
            updateCSV(filePath, fakeAvatars);
            System.out.println("Enter 'YES' to start application or 'NO' to quit");
            String s = scn.nextLine();
            if(s.equals("NO")){
                break;
            }
        }

    }
}