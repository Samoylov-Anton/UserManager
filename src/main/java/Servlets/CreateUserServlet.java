package servlets;

import dao.dao.impl.UserParamDaoImpl;
import general.CheckCreateUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import table.UserParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class CreateUserServlet extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        boolean check = true;

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        CheckCreateUser checkCreateUser = (CheckCreateUser) context.getBean("CheckCreateUser");

        UserParam newUserParam = new UserParam();

        UserParamDaoImpl getNewUserParam = (UserParamDaoImpl) context.getBean("UserParamDaoImpl");

        if (checkCreateUser.emailCheck(req.getParameter("email"))){

            newUserParam.setEmail(req.getParameter("email"));

        }else check =false;

        if (checkCreateUser.passwordCheck(req.getParameter("password"))){

            newUserParam.setPassword(req.getParameter("password"));

        }else check = false;

        if (req.getParameter("nickname") != ""){

            newUserParam.setNickname(req.getParameter("nickname"));

        }else check = false;

        if (check){
            newUserParam.setDatetimecreate(checkCreateUser.getTimeCreate());
            newUserParam.setDatetimeedit(checkCreateUser.getTimeCreate());
            newUserParam.setTimezone(checkCreateUser.getTimeZone());
            newUserParam.setRole("user");

            try {
                getNewUserParam.addUserParam(newUserParam);
                resp.sendRedirect("index.jsp");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }else {

            resp.sendError(1,"Ошибка ввода параметров");
            resp.sendRedirect("newuser.jsp");
        }
    }
}
