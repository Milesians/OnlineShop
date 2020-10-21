package onlineshop.servlet.user;

import onlineshop.dao.BaseDao;
import onlineshop.entity.User;
import onlineshop.service.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * DoUserAdd.java
 *
 * @author Milesians
 * @date 2020/10/20
 */
@WebServlet("/manage/admin_douseradd")
public class DoUserAdd extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String username = req.getParameter("userName");
        String name = req.getParameter("name");
        String pwd = req.getParameter("passWord");
        String sex = req.getParameter("sex");
        String birthday = req.getParameter("birthday");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String address = req.getParameter("address");
        //创建用户实体
        User u = new User(username, name, pwd, sex, birthday, email, null, mobile, address, 1);
        //加入数据库的用户表中
        int count = UserDao.insert(u);
        //成功或失败重定向
        if (count > 0) {
            resp.sendRedirect("admin_user.jsp");
        } else {
            PrintWriter out = resp.getWriter();
            out.write("<script>");
            out.write("alert('用户添加失败');");
            out.write("location.href='admin_useradd.jsp'");
            out.write("</script>");
            out.close();
        }

    }
}
