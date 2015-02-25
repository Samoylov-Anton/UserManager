package general;

import dao.UserParamDao;
import table.UserParam;

import java.sql.SQLException;
import java.util.List;


public class UsersList {

    public List<UserParam> getUsersParam() throws SQLException {
        Factory factory = Factory.getInstance();
        UserParamDao userParamDao = factory.getUserParam();

        return userParamDao.getUserParam();
    }
}
