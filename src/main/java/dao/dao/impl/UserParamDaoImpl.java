package dao.dao.impl;


import dao.UserParamDao;
import org.hibernate.Session;
import table.UserParam;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

public class UserParamDaoImpl implements UserParamDao {
    @Override
    public void addUserParam(UserParam userparam) throws SQLException {

        Session session = null;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(userparam);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
    }

    @Override
    public List<UserParam> getUserParam() throws SQLException {
        List<UserParam> userParams = null;
        Session session = null;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            userParams = session.createCriteria(UserParam.class).list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return userParams;
    }
}
