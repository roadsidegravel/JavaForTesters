package domainentities;

public class UsersArray {
    static int  arrayLength = 100;
    public static User[] createUsersArray(){
        User[] result = createUsersArray(arrayLength);
        return result;
    }
    public static User[] createUsersArray(int arrayLength){
        User[] result = new User[arrayLength];
        for(int i = 0; i < result.length; i++) {
            String name = "user"+(i+1);
            String password = "password"+(i+1);
            result[i] = new User(name, password);
        }
        return result;
    }

}
