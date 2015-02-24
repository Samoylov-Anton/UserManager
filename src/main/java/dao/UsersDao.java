package dao;


import table.Users;

import java.sql.SQLException;
import java.util.List;


public interface UsersDao {

    public List<Users> getUsers()throws SQLException;
}
