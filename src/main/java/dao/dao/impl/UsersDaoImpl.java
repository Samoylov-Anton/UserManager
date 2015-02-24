package dao.dao.impl;

import dao.UsersDao;
import org.hibernate.Session;
import table.Users;
import util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;


public class UsersDaoImpl implements UsersDao {
    @Override
    public List<Users> getUsers() throws SQLException {
        List<Users> users = null;
        Session session = null;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            users = session.createCriteria(Users.class).list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return users;
    }
}
