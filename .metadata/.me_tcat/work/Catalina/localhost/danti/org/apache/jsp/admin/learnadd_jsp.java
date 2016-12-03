package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class learnadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <title>完整demo</title>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"/>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"../ueditor/ueditor.config.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"../ueditor/ueditor.all.min.js\"> </script>\r\n");
      out.write("    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->\r\n");
      out.write("    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"lang/zh-cn/zh-cn.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        div{\r\n");
      out.write("            width:100%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../style/Admin.css\" type=\"text/css\"></link>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"publish.action\"method=\"post\">\r\n");
      out.write("<span>文章标题：</span> <input type=\"text\" class=\"tc\" name=\"title\"/><br/>\r\n");
      out.write("<label class=\"cg\">内容概要：</label>\r\n");
      out.write("<div class=\"tarea\" ><textarea name=\"category\"  ></textarea></div>\r\n");
      out.write("<br/>\r\n");
      out.write("<input class=\"btnla\" type=\"submit\"value=\"提交\"/>\r\n");
      out.write("<textarea class=\"ue\" name=\"content\" id=\"myEditor\" >从这里开始</textarea>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var editor =new UE.ui.Editor({initialFrameHeight:400,initialFrameWidth:1000 });\r\n");
      out.write("editor.render(\"myEditor\");\r\n");
      out.write("//1.2.4以后可以使用一下代码实例化编辑器\r\n");
      out.write("//UE.getEditor('myEditor')\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"btns\">\r\n");
      out.write("    <div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    //实例化编辑器\r\n");
      out.write("    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
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
