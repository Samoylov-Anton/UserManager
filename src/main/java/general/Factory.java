package general;


import dao.UserParamDao;
import dao.dao.impl.UserParamDaoImpl;


public class Factory {
    public static Factory instance = new Factory();
    public UserParamDao userParamDao;

    private Factory(){}

    public static Factory getInstance(){

        return Factory.instance;
    }

    public UserParamDao getUserParam(){

        if (userParamDao == null) userParamDao = new UserParamDaoImpl();

        return userParamDao;
    }
}
