package org.apache.jsp.admin.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addkuaixun_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>添加快讯</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  <link rel=\"stylesheet\" media=\"all\" href=\"style/style0.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("   <form action=\"AddKuaiXunAction\" method=\"post\"  style=\"margin-left:50px;margin-top:20px;\">\t\t\r\n");
      out.write("    <table border=\"0\"align=\"left\">\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td><span>快讯标题：</span></td>\r\n");
      out.write("         <td><input id=\"kxtitle\" type=\"text\"name=\"kxtitle\"></td>\r\n");
      out.write("         <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr style=\"margin-top:40px\">\r\n");
      out.write("         <td height=\"12\"><span>url地址：</span></td>\r\n");
      out.write("         <td height=\"12\"><input id=\"kxurl\" type=\"text\"name=\"kxurl\"></td>\r\n");
      out.write("        <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>\r\n");
      out.write("       <div align=\"left\">\r\n");
      out.write("         <input id=\"sub\" type=\"submit\" class=\"btnlogin\" name=\"Submit\" value=\"保存\" >\r\n");
      out.write("       </div> \r\n");
      out.write("     </td>\r\n");
      out.write("    \r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
