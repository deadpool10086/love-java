package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Forum;
import po.Fcomment;
import po.Learn;
import java.util.*;

public final class forumshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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

   		    List<Forum>list=(List<Forum>)request.getAttribute("flist");
   			
   			if(list==null||list.size()<1) { out.println("no data"); }
   			else { for(Forum forum:list){



   		
      out.write("\r\n");
      out.write("   \t\t<div class=\"banner\">\r\n");
      out.write("<div id=\"showContent\">\r\n");
      out.write("\r\n");
      out.print(forum.getFcontent() );
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("   <div class=\"sf\" >\r\n");
      out.write("   <form  id=\"form1\" method=\"post\">\r\n");
      out.write("   <input name=\"forumid\" value=");
      out.print(forum.getForumid() );
      out.write(" type=\"hidden\"/>\r\n");
      out.write("    ");
}
   } 
      out.write("\r\n");
      out.write("   <div class=\"comment-text\">\r\n");
      out.write("        <textarea class=\"mousetrap\" name=\"fcomment\" maxlength=\"2000\" placeholder=\"添加回复…\"></textarea>\r\n");
      out.write("        <div>\r\n");
      out.write("          <input class=\"btn\" data-disable-with=\"提交中...\" name=\"commit\" id=\"btnAjaxSubmit\" type=\"submit\" value=\"发 表\">\r\n");
      out.write("          <span class=\"warning\" style=\"display: none\"><i class=\"fa fa-exclamation-circle\"></i><span class=\"warning-text\"></span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </form>\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"fmain\">\r\n");
      out.write("   \r\n");
      out.write("<ul>\r\n");
      out.write("\r\n");
      out.write("    ");

   		    List<Fcomment>list1=(List<Fcomment>)request.getAttribute("fclist");
   			
   			if(list1==null||list1.size()<1) { out.println("no data"); }
   			else { for(Fcomment fcomment:list1){



   		
      out.write("\r\n");
      out.write("<li> \r\n");
      out.write("\r\n");
      out.write(" <div class=\"fmainarticlec\">\r\n");
      out.write("       <div class=\"fmainarticlecp\" >\r\n");
      out.write("       <a href=\"http://www.baidu.com\">\r\n");
      out.write("       <img src=\"image/tx.png\"></img>        \r\n");
      out.write("       </a>\r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"fmainarticlecc\" >\r\n");
      out.write("      <p ><label>");
      out.print(fcomment.getMembername() );
      out.write("</label>时间: <label>");
      out.print(fcomment.getFcdate() );
      out.write("</label></p>\r\n");
      out.write("                 ");
      out.print(fcomment.getFcomment() );
      out.write("\r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("      \r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("</li>\r\n");
      out.write(" ");
}
   } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<li> \r\n");
      out.write("\r\n");
      out.write(" <div class=\"fmainarticlec\">\r\n");
      out.write("       <div class=\"fmainarticlecp\" >\r\n");
      out.write("       <a href=\"http://www.baidu.com\">\r\n");
      out.write("       <img src=\"image/tx.png\"></img>        \r\n");
      out.write("       </a>\r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"fmainarticlecc\" >\r\n");
      out.write("       \r\n");
      out.write("        <p >作者:<label>Arthur</label>时间: <label>2016-04-03</label></p>\r\n");
      out.write("                   大家在win server 2012抓密码的时候有没有遇到这种情况？\r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("      \r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("</li>\r\n");
      out.write("  </ul>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div>\r\n");
      out.write("   \r\n");
      out.write("  </div> \r\n");
      out.write("   </div>\r\n");
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