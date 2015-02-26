package servlets;


import dao.dao.impl.UserParamDaoImpl;
import general.CheckCreateUser;
import general.SerchUserOnID;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import table.UserParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class EditUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("error", null);
        boolean check = true;

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        SerchUserOnID serchUserOnID = (SerchUserOnID) context.getBean("SerchUserOnId");

        try {
            UserParam userParam = serchUserOnID.userParams(req.getParameter("id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}