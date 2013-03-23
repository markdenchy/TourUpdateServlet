package tourupdates;

import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: markdenchy
 * Date: 3/23/13
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class tourupdateservlet {

    public class MyServlet extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response
                          PrintWriter out = response.getWriter();
        out.println("Hello, this is a servlet!!!"); }
}