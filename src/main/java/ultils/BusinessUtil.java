package ultils;

import enums.UserRoleEnum;

public class BusinessUtil {
    public static boolean isAdmin(UserRoleEnum role) {
        return UserRoleEnum.ADMIN.equals(role);
    }

    public static boolean isLandLord(UserRoleEnum role) {
        return UserRoleEnum.LANDLORD.equals(role);
    }

}
