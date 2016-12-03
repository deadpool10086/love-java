package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class register0_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/top0.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("    <title>My JSP 'register0.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" media=\"all\" href=\"style/style0.css\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<div>\r\n");
      out.write("<div class=\"top\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("    <ul class=\"nav\">\r\n");
      out.write("     <li><p>欢迎来到CTF训练营</p></li>\r\n");
      out.write("      <li><a href=\"KuaiXunAction\">首页</a></li>\r\n");
      out.write("      <li><a href=\"LearnAction?newPage=1\">CTF学习</a></li>\r\n");
      out.write("      <li><a href=\"TrainAction?newPage=1\">CTF训练</a></li>\r\n");
      out.write("      <li><a href=\"ForumAction?newPage=1\">技术社区</a></li>\r\n");
      out.write("      <li><a href=\"ListQuestionAction\">挑战平台</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("      <ul class=\"navright\">\r\n");
      out.write("  <li class=\"\">\r\n");
      out.write("<a class=\"sign\" href=\"register0.jsp\">注册</a>\r\n");
      out.write("</li>\r\n");
      out.write("<li class=\"loginleft\">\r\n");
      out.write("<a class=\"login\" href=\"login1.jsp\">登录</a>\r\n");
      out.write("</li>\r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"animenu\"> \r\n");

             List ints = new ArrayList();
	        
            
            
            if(session.getAttribute("info")==null)
            {
           	  ints.add(0, "display:none");
           	   ints.add(1,"");
           	 
           	 
            }
            else {
             String membername=session.getAttribute("info").toString();
             ints.add(0," ");
              ints.add(1, membername);
             
          
			}


 
      out.write("\r\n");
      out.write("\t  \r\n");
      out.write("\t  <ul class=\"animenu__nav\" style=");
      out.print(ints.get(0) );
      out.write(" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t  <a href=\"#\" class=\"loginname\">");
      out.print(ints.get(1) );
      out.write("</a>\r\n");
      out.write("\t\t  <ul class=\"animenu__nav__child\">\r\n");
      out.write("\t\t\t<li><a href=\"\">撰写文章</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"addforum.jsp\">社区提问</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"SignoutAction.action\">退出</a></li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t\t</li>     \r\n");
      out.write("\t       \r\n");
      out.write("\t  </ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t(function(){\r\n");
      out.write("\t  var animenuToggle = document.querySelector('.animenu__toggle'),\r\n");
      out.write("\t\t  animenuNav    = document.querySelector('.animenu__nav'),\r\n");
      out.write("\t\t  hasClass = function( elem, className ) {\r\n");
      out.write("\t\t\treturn new RegExp( ' ' + className + ' ' ).test( ' ' + elem.className + ' ' );\r\n");
      out.write("\t\t  },\r\n");
      out.write("\t\t  toggleClass = function( elem, className ) {\r\n");
      out.write("\t\t\tvar newClass = ' ' + elem.className.replace( /[\\t\\r\\n]/g, ' ' ) + ' ';\r\n");
      out.write("\t\t\tif( hasClass(elem, className ) ) {\r\n");
      out.write("\t\t\t  while( newClass.indexOf( ' ' + className + ' ' ) >= 0 ) {\r\n");
      out.write("\t\t\t\tnewClass = newClass.replace( ' ' + className + ' ' , ' ' );\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\t  elem.className = newClass.replace( /^\\s+|\\s+$/g, '' );\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t  elem.className += ' ' + className;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t  },           \r\n");
      out.write("\t\t  animenuToggleNav =  function (){        \r\n");
      out.write("\t\t\ttoggleClass(animenuToggle, \"animenu__toggle--active\");\r\n");
      out.write("\t\t\ttoggleClass(animenuNav, \"animenu__nav--open\");        \r\n");
      out.write("\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t  if (!animenuToggle.addEventListener) {\r\n");
      out.write("\t\t  animenuToggle.attachEvent(\"onclick\", animenuToggleNav);\r\n");
      out.write("\t  }\r\n");
      out.write("\t  else {\r\n");
      out.write("\t\t  animenuToggle.addEventListener('click', animenuToggleNav);\r\n");
      out.write("\t  }\r\n");
      out.write("\t})()\r\n");
      out.write("</script>\r\n");
      out.write("  \r\n");
      out.write("     <div class=\"main\">\r\n");
      out.write("     <div class=\"mainbox\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"RegisterAction.action\" method=\"post\">\t\t\r\n");
      out.write(" <table border=\"0\"align=\"center\">\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td><span>请输入您的姓名：</span></td>\r\n");
      out.write("         <td><input id=\"membername\" type=\"text\"name=\"membername\"></td>\r\n");
      out.write("         <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td height=\"12\"><span>请输入您的密码：</span></td>\r\n");
      out.write("         <td height=\"12\"><input id=\"password\" type=\"password\"name=\"memberpassword\"></td>\r\n");
      out.write("        <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("         <td height=\"12\"><span>请再次输入您的密码：</span></td>\r\n");
      out.write("         <td height=\"12\"><input id=\"passwordConfirm\" type=\"password\" name=\"passwordConfirm\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("         <td height=\"12\"><span>QQ：</span></td>\r\n");
      out.write("         <td height=\"12\"><input id=\"qq\" type=\"text\" name=\"qq\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("         <tr>\r\n");
      out.write("         <td height=\"12\"><span>联系号码：</span></td>\r\n");
      out.write("         <td height=\"12\"><input id=\"phone\" type=\"text\" name=\"phone\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("         <td height=\"12\"><span>联系地址：</span></td>\r\n");
      out.write("         <td height=\"12\"><input id=\"address\" type=\"text\" name=\"address\"></td>\r\n");
      out.write("         <td height=\"12\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>\r\n");
      out.write("       <div align=\"left\">\r\n");
      out.write("         <input id=\"sub\" type=\"button\" class=\"btnlogin\" name=\"Submit\" value=\"注册\" >\r\n");
      out.write("       </div> \r\n");
      out.write("     </td>\r\n");
      out.write("     <td>\r\n");
      out.write("     \r\n");
      out.write("     \t<input type=\"button\" value=\"返回\" class=\"btnlogin\" onclick=\"javascript:window.location.href='login.jsp'\">\r\n");
      out.write("     </td>\r\n");
      out.write("     \r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("     \r\n");
      out.write("     </div>\r\n");
      out.write("     <br>\r\n");
      out.write("     <div>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("     </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("(function(){\r\n");
      out.write("    var sub = document.getElementById(\"sub\");\r\n");
      out.write("    //初始化移入移出事件\r\n");
      out.write("    if(sub.addEventListener){\r\n");
      out.write("        sub.addEventListener(\"click\", test);  \r\n");
      out.write("    }else if(sub.attachEvent){\r\n");
      out.write("        sub.attachEvent(\"onClick\", test);\r\n");
      out.write("    }\r\n");
      out.write("})();\r\n");
      out.write(" \r\n");
      out.write("function test(){\r\n");
      out.write("    var membername = document.getElementById(\"membername\");\r\n");
      out.write("    var password = document.getElementById(\"password\");\r\n");
      out.write("    var passwordConfirm = document.getElementById(\"passwordConfirm\");\r\n");
      out.write("    var phone = document.getElementById(\"phone\");\r\n");
      out.write("    \r\n");
      out.write("    var reg=/^[\\@A-Za-z0-9\\!#$%\\^\\&\\*\\.\\~]{6,22}$/;\r\n");
      out.write("    regexp=\"^((\\(\\d{3}\\))|(\\d{3}\\-))?13[0-9]\\d{8}|15[89]\\d{8}\";\r\n");
      out.write("    regphone= /^([0-9]{11})?$/;\r\n");
      out.write("    falg=phone.value.search(regphone);\r\n");
      out.write("    \r\n");
      out.write("    if(password.value==\"\"|membername.value==\"\")\r\n");
      out.write("    {\r\n");
      out.write("    alert(\"用户名和密码不能为空\");\r\n");
      out.write("    return false;\r\n");
      out.write("    }\r\n");
      out.write("    if(!reg.test(password.value))\r\n");
      out.write("    {\r\n");
      out.write("      alert(\"密码不符合要求，请重新输入\");\r\n");
      out.write("    }\r\n");
      out.write("   if (falg==-1){\r\n");
      out.write("                                alert(\"手机号不合法！\");\r\n");
      out.write("                                return false;\r\n");
      out.write("                }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    else if(password.value != passwordConfirm.value)\r\n");
      out.write("        alert(\"对不起，您两次次输入的密码不一致\");\r\n");
      out.write("    else\r\n");
      out.write("    document.forms[0].submit();\r\n");
      out.write("     \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
