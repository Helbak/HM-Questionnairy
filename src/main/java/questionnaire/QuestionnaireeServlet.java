package questionnaire;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "QuestionnaireeServlet")
@WebServlet(urlPatterns = "/QuestionnaireeServlet")
public class QuestionnaireeServlet extends HttpServlet {

    static final int q_1_yes = 25;
    static final int q_1_no = 0;
    static final int q_2_yes = 25;
    static final int q_2_no = 0;
    static final int q_3_yes = 25;
    static final int q_3_no = 0;
    static final int q_4_yes = 25;
    static final int q_4_no = 0;
    static final String template = "<html>" + "<head><title>Resoult</title></head>" +
            "<body><h4>%s</h1></body></htm4>";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String q1 = request.getParameter("question1");
        final String q2 = request.getParameter("question2");
        final String q3 = request.getParameter("question3");
        final String q4 = request.getParameter("question4");

        final int idx1 = "yes".equals(q1)? q_1_yes:q_1_no;
        final int idx2 = "yes".equals(q2)? q_2_yes:q_2_no;
        final int idx3 = "yes".equals(q3)? q_3_yes:q_3_no;
        final int idx4 = "yes".equals(q4)?q_4_yes:q_4_no;
        final int sum= idx1+idx2+idx3+idx4;

        String ansv = "<br/> Your answer to the first question   "+q1+ " it gives you  "+idx1+" points"+
                "<br/> Your answer to the second question   "+q2+ " it gives you  "+idx2+" points"+
                "<br/> Your answer to the third question   "+q3+ " it gives you  "+idx3+" points"+
                "<br/> Your answer to the fourth question   "+q4+ " it gives you  "+idx4+" points"+
                "<br/><h2> your total score " +sum +"</h2>";

        response.getWriter().println(String.format(template, ansv));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
