package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Css;
import action.FirstAction;
import com.sun.xml.internal.ws.addressing.ProblemAction;
import java.util.*;
import java.sql.*;

public final class questionadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"keywords\" content=\"江苏省信息安全技能竞赛, 网络安全\">\r\n");
      out.write("<meta name=\"description\" content=\"“天翼杯”第三届信息安全技能竞赛，是由江苏省委网络安全和信息化领导小组办公室、江苏省经济和信息化委员会、江苏省教育厅主办，中国电信江苏分公司、南京信息职业技术学院、江苏省信息安全测评中心承办的网络安全技术实战竞赛！\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" media=\"all\" href=\"../style/style1.css\">\r\n");
      out.write("\r\n");
      out.write("</link>\r\n");
      out.write("<meta name=\"csrf-param\" content=\"authenticity_token\">\r\n");
      out.write("<meta name=\"csrf-token\" content=\"xPVTea1BgHfK1RDyX1cZBMXxwhZM1rKxWwzz413Lf00=\">\r\n");
      out.write("<link type=\"image/vnd.microsoft.icon\" rel=\"shortcut icon\" href=\"http://xctf.jsxajs.cn/assets/favicon-b5add2dbbd6e51003b8fd675501d6241.ico\">\r\n");
      out.write("<link rel=\"author\" href=\"http://xctf.jsxajs.cn/humans.txt\">\r\n");
      out.write("\r\n");
      out.write("<script async=\"\" src=\"//hm.baidu.com/h.js?74bf0bf0d27dc22d8f6d5a62726cb6cc\">\r\n");
      out.write("undefined\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<main id=\"problems-index\" style=\"margin-top:-5px; margin-left:-20px\">\r\n");
      out.write("\r\n");
      out.write("<h1>登录</h1>\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"AddQuestionAction.action\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\"align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td>请输入题目：</td>\r\n");
      out.write("         <td><input type=\"text\"name=\"questionname\"></td>\r\n");
      out.write("         <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td height=\"12\">请输入题目分值：</td>\r\n");
      out.write("         <td height=\"12\"><input  type=\"text\"name=\"questionscore\"></td>\r\n");
      out.write("        <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("         <td>请输入题目链接地址：</td>\r\n");
      out.write("         <td>\r\n");
      out.write("          <select  name=\"questionhref\">\r\n");
      out.write("  <option value=\"questions/eighth.jsp\" name=\"questiontype\">questions/eighth.jsp</option>\r\n");
      out.write("  <option value=\"questions/ninth.jsp\"  name=\"questiontype\">questions/ninth.jsp</option>\r\n");
      out.write("  <option value=\"questions/third.jsp\"  name=\"questiontype\">questions/third.jsp</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         </td>\r\n");
      out.write("         <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td height=\"12\">请输入题目类型：</td>\r\n");
      out.write("         <td height=\"12\">\r\n");
      out.write("         \r\n");
      out.write("          <select  name=\"questiontype\">\r\n");
      out.write("  <option value=\"web\" name=\"questiontype\">web</option>\r\n");
      out.write("  <option value=\"reverse\"  name=\"questiontype\">reverse</option>\r\n");
      out.write("  <option value=\"mobile\"  name=\"questiontype\">mobile</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("         \r\n");
      out.write("         </td>\r\n");
      out.write("        <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("<div align=\"left\">\r\n");
      out.write("       <input type=\"submit\" value=\"发布\" name=\"submit\">\r\n");
      out.write("       \t<input type=\"button\" value=\"返回\" onclick=\"javascript:window.location.href='main.jsp'\">\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\t\r\n");
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
