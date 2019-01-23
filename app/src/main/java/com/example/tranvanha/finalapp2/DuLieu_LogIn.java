package com.example.tranvanha.finalapp2;

public class DuLieu_LogIn {
    int errorCode;
    boolean ForceUpdate;
    String MapKeyName;
    String MapKeyPass;
    String Message;
    int ResultCode;
    String SessionID;
    boolean UpdateAvailable;
    String Url;
    UserInfo UserInfo;
    String token;

    public DuLieu_LogIn(int errorCode, boolean forceUpdate, String mapKeyName, String mapKeyPass,
                        String message, int resultCode, String sessionID, boolean updateAvailable, String url, DuLieu_LogIn.UserInfo userInfo, String token) {
        this.errorCode = errorCode;
        ForceUpdate = forceUpdate;
        MapKeyName = mapKeyName;
        MapKeyPass = mapKeyPass;
        Message = message;
        ResultCode = resultCode;
        SessionID = sessionID;
        UpdateAvailable = updateAvailable;
        Url = url;
        UserInfo = userInfo;
        this.token = token;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isForceUpdate() {
        return ForceUpdate;
    }

    public void setForceUpdate(boolean forceUpdate) {
        ForceUpdate = forceUpdate;
    }

    public String getMapKeyName() {
        return MapKeyName;
    }

    public void setMapKeyName(String mapKeyName) {
        MapKeyName = mapKeyName;
    }

    public String getMapKeyPass() {
        return MapKeyPass;
    }

    public void setMapKeyPass(String mapKeyPass) {
        MapKeyPass = mapKeyPass;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int resultCode) {
        ResultCode = resultCode;
    }

    public String getSessionID() {
        return SessionID;
    }

    public void setSessionID(String sessionID) {
        SessionID = sessionID;
    }

    public boolean isUpdateAvailable() {
        return UpdateAvailable;
    }

    public void setUpdateAvailable(boolean updateAvailable) {
        UpdateAvailable = updateAvailable;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public DuLieu_LogIn.UserInfo getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(DuLieu_LogIn.UserInfo userInfo) {
        UserInfo = userInfo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    class UserInfo {
        String AmCode;
        String Email;
        String Fullname;
        int GroupID;
        int IsGroupRoot;
        int IsNewTenant;
        int IsSupper;
        int ManagementId;
        int ParentId;
        int TenantId;
        String TimeZone;
        int Type;
        int UserID;
        String UserPhoneNumber;
        int UserType;
        String Username;
        int isNew;

        public UserInfo(String amCode, String email, String fullname, int groupID, int isGroupRoot, int isNewTenant, int isSupper, int managementId, int parentId, int tenantId, String timeZone, int type, int userID, String userPhoneNumber, int userType, String username, int isNew) {
            AmCode = amCode;
            Email = email;
            Fullname = fullname;
            GroupID = groupID;
            IsGroupRoot = isGroupRoot;
            IsNewTenant = isNewTenant;
            IsSupper = isSupper;
            ManagementId = managementId;
            ParentId = parentId;
            TenantId = tenantId;
            TimeZone = timeZone;
            Type = type;
            UserID = userID;
            UserPhoneNumber = userPhoneNumber;
            UserType = userType;
            Username = username;
            this.isNew = isNew;
        }


        public String getAmCode() {
            return AmCode;
        }

        public void setAmCode(String amCode) {
            AmCode = amCode;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getFullname() {
            return Fullname;
        }

        public void setFullname(String fullname) {
            Fullname = fullname;
        }

        public int getGroupID() {
            return GroupID;
        }

        public void setGroupID(int groupID) {
            GroupID = groupID;
        }

        public int getIsGroupRoot() {
            return IsGroupRoot;
        }

        public void setIsGroupRoot(int isGroupRoot) {
            IsGroupRoot = isGroupRoot;
        }

        public int getIsNewTenant() {
            return IsNewTenant;
        }

        public void setIsNewTenant(int isNewTenant) {
            IsNewTenant = isNewTenant;
        }

        public int getIsSupper() {
            return IsSupper;
        }

        public void setIsSupper(int isSupper) {
            IsSupper = isSupper;
        }

        public int getManagementId() {
            return ManagementId;
        }

        public void setManagementId(int managementId) {
            ManagementId = managementId;
        }

        public int getParentId() {
            return ParentId;
        }

        public void setParentId(int parentId) {
            ParentId = parentId;
        }

        public int getTenantId() {
            return TenantId;
        }

        public void setTenantId(int tenantId) {
            TenantId = tenantId;
        }

        public String getTimeZone() {
            return TimeZone;
        }

        public void setTimeZone(String timeZone) {
            TimeZone = timeZone;
        }

        public int getType() {
            return Type;
        }

        public void setType(int type) {
            Type = type;
        }

        public int getUserID() {
            return UserID;
        }

        public void setUserID(int userID) {
            UserID = userID;
        }

        public String getUserPhoneNumber() {
            return UserPhoneNumber;
        }

        public void setUserPhoneNumber(String userPhoneNumber) {
            UserPhoneNumber = userPhoneNumber;
        }

        public int getUserType() {
            return UserType;
        }

        public void setUserType(int userType) {
            UserType = userType;
        }

        public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        public int getIsNew() {
            return isNew;
        }

        public void setIsNew(int isNew) {
            this.isNew = isNew;
        }
    }

}
