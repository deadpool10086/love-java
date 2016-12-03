package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Train;
import po.Forum;
import po.Fcomment;
import po.Learn;
import java.util.*;

public final class trainshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"
+ request.getServerName()+":"+ request.getServerPort()
+ path +"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>论坛</title>\r\n");
      out.write("\r\n");
      out.write("<metahttp-equiv=\"pragma\"content=\"no-cache\">\r\n");
      out.write("<metahttp-equiv=\"cache-control\"content=\"no-cache\">\r\n");
      out.write("<metahttp-equiv=\"expires\"content=\"0\">\r\n");
      out.write("<metahttp-equiv=\"keywords\"content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<metahttp-equiv=\"description\"content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("-->\r\n");
      out.write("<link rel=\"stylesheet\" media=\"all\" href=\"style/lcomment.css\"> \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".banner\r\n");
      out.write("{\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("\twidth:950px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".comment-text {\r\n");
      out.write("padding: 10px;\r\n");
      out.write("border: 1px solid #d9d9d9;\r\n");
      out.write("font-family: \"lucida grande\", \"lucida sans unicode\", lucida, helvetica, \"Hiragino Sans GB\", \"Microsoft YaHei\", \"WenQuanYi Micro Hei\", sans-serif;\r\n");
      out.write("border-radius: 4px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mousetrap {\r\n");
      out.write("width: 100%;\r\n");
      out.write("height: 78px;\r\n");
      out.write("padding: 0;\r\n");
      out.write("margin: 0;\r\n");
      out.write("border: none;\r\n");
      out.write("box-shadow: none;\r\n");
      out.write("background: transparent;\r\n");
      out.write("resize: none;\r\n");
      out.write("outline:none;\r\n");
      out.write("font-family: 'Open Sans','Helvetica Neue',Arial,'Hiragino Sans GB','Microsoft YaHei','WenQuanYi Micro Hei',sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".btn {\r\n");
      out.write("\r\n");
      out.write("border-radius: 4px;\r\n");
      out.write("\r\n");
      out.write("color: #fff;\r\n");
      out.write("border-color: #15a7f0;\r\n");
      out.write("background: #15a7f0; \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("border: 1px solid #cccccc;\r\n");
      out.write("width:50px;\r\n");
      out.write("height:35px;\r\n");
      out.write("font-family: \"lucida grande\", \"lucida sans unicode\", lucida, helvetica, \"Hiragino Sans GB\", \"Microsoft YaHei\", \"WenQuanYi Micro Hei\", sans-serif;\r\n");
      out.write("margin-top:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</metahttp-equiv></metahttp-equiv></metahttp-equiv></metahttp-equiv></metahttp-equiv>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script></head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("  ");

   		    List<Train>list=(List<Train>)request.getAttribute("tlist");
   			
   			if(list==null||list.size()<1) { out.println("no data"); }
   			else { for(Train train:list){



   		
      out.write("\r\n");
      out.write("   \t\t<div class=\"banner\">\r\n");
      out.write("<div id=\"showContent\">\r\n");
      out.write("\r\n");
      out.print(train.getTraincontent() );
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("    ");
}
   } 
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(\"#btnAjaxSubmit\").click(function () {\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  window.location.reload();\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  );\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(\"#btnAjaxSubmit\").click(function () {\r\n");
      out.write("          \r\n");
      out.write("            var options = {\r\n");
      out.write("                url: 'AddFcommentAction',\r\n");
      out.write("                type: 'post',\r\n");
      out.write("                \r\n");
      out.write("                data: $(\"#form1\").serialize(),\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("               \r\n");
      out.write("                    \r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            $.ajax(options);\r\n");
      out.write("            \r\n");
      out.write("            return false;\r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("</script>");
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
