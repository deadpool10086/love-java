package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Css;
import action.FirstAction;
import com.sun.xml.internal.ws.addressing.ProblemAction;
import java.util.*;
import java.sql.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/left.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zh-Hans\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"text/html; charset=UTF-8\" http-equiv=\"Content-Type\">\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("<title>挑战平台</title>\r\n");
      out.write("<link rel=\"stylesheet\" media=\"all\" href=\"style/style1.css\">\r\n");
      out.write("\r\n");
      out.write("</link>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<aside id=\"sidebar\">\r\n");
      out.write("<div class=\"masthead\">\r\n");
      out.write("<div class=\"contest-name\">挑战平台</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav id=\"nav\">\r\n");
      out.write("<ul class=\"session\">\r\n");
      out.write("<li>\r\n");
      out.write("<a rel=\"nofollow\" href=\"SignoutAction.action\" data-method=\"delete\">\r\n");
      out.write("注销\r\n");
      out.write("<i class=\"sign-out\"></i>\r\n");
      out.write("</a>\r\n");
      out.write("</li>\r\n");
      out.write("<li>\r\n");
      out.write("<a href=\"ListMemberInfoAction.action\">\r\n");
      out.write("个人信息\r\n");
      out.write("<i class=\"sign-in\"></i>\r\n");
      out.write("</a>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"links\">\r\n");
      out.write("<li></li>\r\n");
      out.write("<li class=\" active\">\r\n");
      out.write("<a href=\"ListQuestionAction.action\">题目</a>\r\n");
      out.write("</li>\r\n");
      out.write("<li></li>\r\n");
      out.write("<li class=\"\">\r\n");
      out.write("<a href=\"rankAction.action\">排名</a>\r\n");
      out.write("</li>\r\n");
      out.write("<li></li>\r\n");
      out.write("<li class=\"\">\r\n");
      out.write("<a href=\"NewsAction.action\">题目公告</a>\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</div>\r\n");
      out.write("</aside>");
      out.write(" \r\n");
      out.write("<main id=\"problems-index\">\r\n");
      out.write("\r\n");
      out.write("<h1>登录</h1>\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" 欢迎您参加此次比赛，祝您取得好成绩\r\n");
      out.write("\t\t  <form action=\"memberLoginAction.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t用户名:<input type=\"text\" name=\"membername\" ><br/>\r\n");
      out.write("\t\t\t\t\t\t\t密码&nbsp&nbsp&nbsp:<input type=\"password\" name=\"memberpassword\" ><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"登录\" name=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"注册\" onclick=\"javascript:window.location.href='register.jsp'\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
