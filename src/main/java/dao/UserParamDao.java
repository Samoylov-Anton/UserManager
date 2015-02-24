package dao;


import table.UserParam;
import java.sql.SQLException;
import java.util.List;

public interface UserParamDao {

    public void addUserParam (UserParam userparam) throws SQLException;
    public List<UserParam> getUserParam()throws SQLException;

}
