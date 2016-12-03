package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Train;
import java.util.*;
import java.util.*;
import java.util.*;

public final class train_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>train</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"all\" href=\"style/style0.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write("\r\n");
      out.write("\t<div class=\"banner1\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div class=\"ftop\">\r\n");
      out.write("\t\t\t\t\t<div class=\"learn-search-box\">\r\n");
      out.write("\t\t\t\t\t\t<form method=\"get\" id=\"searchform\"\r\n");
      out.write("\t\t\t\t\t\t\taction=\"http://drops.wooyun.org/\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"textfield1\" size=\"2\" name=\"s\" id=\"s\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"输入关键字进行搜索\"> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"learnbutton\" name=\"submit\" id=\"searchbutton\" value=\"搜索\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"container1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tmain\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t  ");

   		    List<Train>list=(List<Train>)request.getAttribute("LList");
   			
   			if(list==null||list.size()<1) { out.println("no data"); }
   			else { for(Train train:list){



   		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tmainarticlec\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tmainarticlecp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"http://www.baidu.com\"> <img src=\"image/train.png\"></img>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tmainarticlecc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"TrainFindAction?trainid=");
      out.print(train.getTrainid());
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(train.getTraintitle() );
      out.write(" </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t类别:<label>");
      out.print(train.getTraintype() );
      out.write("</label>时间: <label>");
      out.print(train.getTraindate() );
      out.write("</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
}} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ffenye\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/TrainAction?newPage=1\">首页</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/TrainAction?newPage=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">末页</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
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
      out.write("\r\n");
      out.write("</body>\r\n");
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