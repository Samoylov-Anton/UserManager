package servlets;

import dao.dao.impl.UsersDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import table.Users;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CheckServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UsersDaoImpl usersDao = (UsersDaoImpl) context.getBean("UsersDaoImpl");

        try {
            List<Users> usersList = usersDao.getUsers();

            for (Users user: usersList){
               if (user.getEmail().equals(email) && user.getPassword().equals(password)){

                   session.setAttribute("role",user.getRole());
                   resp.sendRedirect("/index.jsp");
               }
            }

            resp.sendRedirect("/login.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
