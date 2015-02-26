package general;


import dao.UserParamDao;
import table.UserParam;

import java.sql.SQLException;
import java.util.List;

public class SerchUserOnID {

     public UserParam userParams(String id) throws SQLException {

         Integer intId = Integer.parseInt(id);
         List<UserParam> users = null;
         Factory factory = Factory.getInstance();
         UserParamDao userParamDao = factory.getUserParam();
         users = userParamDao.getUserParam();

         for (UserParam user:users){

             if (user.getId() == intId){
                 return user;
             }
         }

         return null;
     }
}
