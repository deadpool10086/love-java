package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Article;
import po.Tool;
import po.IndexImageTop;
import po.KuaiXun;
import java.util.*;
import java.util.*;
import java.util.*;

public final class index0_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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
      out.write("    <title>hos</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" media=\"all\" href=\"style/style0.css\"> \r\n");
      out.write("\t <link rel=\"shortcut icon\" href=\"http://127.0.0.1:8080/danti//image/qt.ico\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("   ");
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
      out.write("   \r\n");
      out.write("   <div class=\"banner\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("  <div class=\"sideleft\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"kxtitle\">\r\n");
      out.write("  <h4>安全快讯</h4>\r\n");
      out.write("  \r\n");
      out.write("  <hr  size=2 color=#E9E9E9 style=\"FILTER: alpha(opacity=100,finishopacity=0,style=2)\"> \r\n");
      out.write("   <div>\r\n");
      out.write("   <ul class=\"kxcontent\">\r\n");
      out.write("     ");

   		    List<KuaiXun>list=(List<KuaiXun>)request.getAttribute("kxlist");
   			
   			if(list==null||list.size()<1) { out.println("no data"); }
   			else { for(KuaiXun kuaiXun:list){



   		
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("   <li>\r\n");
      out.write("   <a  href=");
      out.print(kuaiXun.kxurl );
      out.write(' ');
      out.write('>');
      out.print(kuaiXun.kxtitle );
      out.write("</a>\r\n");
      out.write("   <hr size=1 color=#E9E9E9 style=\"FILTER: alpha(opacity=100,finishopacity=0,style=3)\"> \r\n");
      out.write("   </li>\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("   ");
}
   } 
      out.write("\r\n");
      out.write("   </ul>\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write(" </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"sidepic\">\r\n");
      out.write("    <div id=\"wrapper\"><!-- 最外层部分 -->\r\n");
      out.write("        <div id=\"banner\"><!-- 轮播部分 -->\r\n");
      out.write("            <ul class=\"imgList\"><!-- 图片部分 -->\r\n");
      out.write("             ");

   		    List<IndexImageTop>list1=(List<IndexImageTop>)request.getAttribute("topimage");
   			
   			if(list1==null||list1.size()<1) { out.println("no data"); }
   			else { for(IndexImageTop imageTop:list1){



   		
      out.write("\r\n");
      out.write("            <li><a href=\"IndexImageFindAction?indeximagetopid=");
      out.print(imageTop.getIndeximagetopid() );
      out.write("\"><img src=");
      out.print("http://127.0.0.1:8080/danti/"+imageTop.getIndeximagetopurl() );
      out.write(" width=\"800px\" height=\"350px\" alt=\"puss in boots1\"></a></li>\r\n");
      out.write("            <\r\n");
      out.write("           ");
}} 
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            </ul>\r\n");
      out.write("            <img src=\"image/prev.png\" width=\"20px\" height=\"40px\" id=\"prev\">\r\n");
      out.write("            <img src=\"image/next.png\" width=\"20px\" height=\"40px\" id=\"next\">\r\n");
      out.write("            <div class=\"bg\"></div> <!-- 图片底部背景层部分-->\r\n");
      out.write("            <ul class=\"infoList\"><!-- 图片左下角文字信息部分 -->\r\n");
      out.write("                <li class=\"infoOn\">puss in boots1</li>\r\n");
      out.write("                <li>puss in boots2</li>\r\n");
      out.write("                <li>puss in boots3</li>\r\n");
      out.write("                <li>puss in boots4</li>\r\n");
      out.write("                <li>puss in boots5</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class=\"sideright\">\r\n");
      out.write("     \r\n");
      out.write("     <div class=\"tooltitle\">\r\n");
      out.write("     <h4>工具推荐</h4>\r\n");
      out.write("    \r\n");
      out.write("     </div>\r\n");
      out.write("     <ul>\r\n");
      out.write("        ");

   		    List<Tool>list2=(List<Tool>)request.getAttribute("tlist");
   			
   			if(list2==null||list2.size()<1) { out.println("no data"); }
   			else { for(Tool tool:list2){



   		
      out.write("\r\n");
      out.write("     <li>\r\n");
      out.write("     <div>\r\n");
      out.write("    <a href=\"ToolFindAction?toolid=");
      out.print(tool.getToolid());
      out.write("\">\r\n");
      out.write("       <img src=");
      out.print("http://127.0.0.1:8080/danti/"+tool.getToolimageurl() );
      out.write("></img>\r\n");
      out.write("      <span>");
      out.print(tool.getTooltitle() );
      out.write("   </span>   \r\n");
      out.write("       </a>\r\n");
      out.write("     \r\n");
      out.write("     </div>\r\n");
      out.write("     \r\n");
      out.write("     </li>\r\n");
      out.write("     ");
}} 
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("     </ul>\r\n");
      out.write("     \r\n");
      out.write("     </div>\r\n");
      out.write("      <div class=\"mainarticle\">\r\n");
      out.write("       <h4>最新文章</h4>\r\n");
      out.write("        <hr  size=2 color=#E9E9E9 style=\"FILTER: alpha(opacity=100,finishopacity=0,style=2)\"> \r\n");
      out.write("       <ul>\r\n");
      out.write("       \r\n");
      out.write("         ");

   		    List<Article>list3=(List<Article>)request.getAttribute("alist");
   			
   			if(list3==null||list3.size()<1) { out.println("no data"); }
   			else { for(Article article:list3){



   		
      out.write("\r\n");
      out.write("       <li>\r\n");
      out.write("       \r\n");
      out.write("       <div class=\"mainarticlec\">\r\n");
      out.write("       <div class=\"mainarticlecp\" >\r\n");
      out.write("       <a href=\"ArticleFindAction?articleid=");
      out.print(article.getArticleid());
      out.write("\">\r\n");
      out.write("       <img src=");
      out.print("http://127.0.0.1:8080/danti/"+article.getArticleimageurl() );
      out.write("></img>        \r\n");
      out.write("       </a>\r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"mainarticlecc\" >\r\n");
      out.write("        <a href=\"ArticleFindAction?articleid=");
      out.print(article.getArticleid());
      out.write("\">\r\n");
      out.write("       \r\n");
      out.write("                   ");
      out.print(article.getArticletitle() );
      out.write("\r\n");
      out.write("       </a>\r\n");
      out.write("       <p class=\"words\">");
      out.print(article.getArticlepre() );
      out.write("</p>\r\n");
      out.write("       \r\n");
      out.write("       <span class=\"words\">");
      out.print(article.getArticledate() );
      out.write("</span>\r\n");
      out.write("       </div>\r\n");
      out.write("      \r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       </li>\r\n");
      out.write("       ");
}} 
      out.write("\r\n");
      out.write("       \r\n");
      out.write("           \r\n");
      out.write("       </ul>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("       <div class=\"moive\">\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("   <div class=\"moivetitle\">\r\n");
      out.write("     <h4>精彩视频</h4>\r\n");
      out.write("     </div>\r\n");
      out.write("     <ul>\r\n");
      out.write("      <li>\r\n");
      out.write("       <a href=\"http://www.baidu.com\">\r\n");
      out.write("       <img src=\"image/m1.jpg\"></img> \r\n");
      out.write("       <span class=\"mcontent\">《安全大咖说》</span>       \r\n");
      out.write("       </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <li>\r\n");
      out.write("       <a href=\"http://www.baidu.com\">\r\n");
      out.write("       <img src=\"image/m2.jpg\"></img> \r\n");
      out.write("       <span class=\"mcontent\">《安全大咖说》</span>       \r\n");
      out.write("       </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("       <a href=\"http://www.baidu.com\">\r\n");
      out.write("       <img src=\"image/m3.jpg\"></img> \r\n");
      out.write("       <span class=\"mcontent\">《安全大咖说》</span>       \r\n");
      out.write("       </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("       <a href=\"http://www.baidu.com\">\r\n");
      out.write("       <img src=\"image/m4.jpg\"></img> \r\n");
      out.write("       <span class=\"mcontent\">《安全大咖说》</span>       \r\n");
      out.write("       </a>\r\n");
      out.write("      </li>\r\n");
      out.write("     </ul>\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("      <div class=\"friend\">\r\n");
      out.write("      \r\n");
      out.write("      <h3>合作伙伴</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("      <li>\r\n");
      out.write("      <a href=\"http://www.alipay.com\" target=\"_blank\" rel=\"nofollow\">支付宝</a>\r\n");
      out.write("      <span>|</span>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <li>\r\n");
      out.write("      <a href=\"http://www.alipay.com\" target=\"_blank\" rel=\"nofollow\">支付宝</a>\r\n");
      out.write("      <span>|</span>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("      <a href=\"http://www.alipay.com\" target=\"_blank\" rel=\"nofollow\">支付宝</a>\r\n");
      out.write("      <span>|</span>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write(" \r\n");
      out.write("      ");
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
      out.write("  </body>\r\n");
      out.write("  \r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    var curIndex = 0,  //当前index\r\n");
      out.write("            imgLen = $(\".imgList li\").length;  //图片总数\r\n");
      out.write("          // 定时器自动变换2.5秒每次\r\n");
      out.write("    var autoChange = setInterval(function(){ \r\n");
      out.write("        if(curIndex <  imgLen-1){ \r\n");
      out.write("            curIndex ++; \r\n");
      out.write("        }else{ \r\n");
      out.write("            curIndex = 0;\r\n");
      out.write("        }\r\n");
      out.write("        //调用变换处理函数\r\n");
      out.write("        changeTo(curIndex);  \r\n");
      out.write("    },5000);\r\n");
      out.write("\r\n");
      out.write("     //左箭头滑入滑出事件处理\r\n");
      out.write("    $(\"#prev\").hover(function(){ \r\n");
      out.write("        //滑入清除定时器\r\n");
      out.write("        clearInterval(autoChange);\r\n");
      out.write("    },function(){ \r\n");
      out.write("        //滑出则重置定时器\r\n");
      out.write("        autoChangeAgain();\r\n");
      out.write("    });\r\n");
      out.write("    //左箭头点击处理\r\n");
      out.write("    $(\"#prev\").click(function(){ \r\n");
      out.write("        //根据curIndex进行上一个图片处理\r\n");
      out.write("        curIndex = (curIndex > 0) ? (--curIndex) : (imgLen - 1);\r\n");
      out.write("        changeTo(curIndex);\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    //右箭头滑入滑出事件处理\r\n");
      out.write("   $(\"#next\").hover(function(){ \r\n");
      out.write("        //滑入清除定时器\r\n");
      out.write("        clearInterval(autoChange);\r\n");
      out.write("    },function(){ \r\n");
      out.write("        //滑出则重置定时器\r\n");
      out.write("        autoChangeAgain();\r\n");
      out.write("    });\r\n");
      out.write("    //右箭头点击处理\r\n");
      out.write("    $(\"#next\").click(function(){ \r\n");
      out.write("        curIndex = (curIndex < imgLen - 1) ? (++curIndex) : 0;\r\n");
      out.write("        changeTo(curIndex);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //对右下角按钮index进行事件绑定处理等\r\n");
      out.write("    $(\".indexList\").find(\"li\").each(function(item){ \r\n");
      out.write("        $(this).hover(function(){ \r\n");
      out.write("            clearInterval(autoChange);\r\n");
      out.write("            changeTo(item);\r\n");
      out.write("            curIndex = item;\r\n");
      out.write("        },function(){ \r\n");
      out.write("            autoChangeAgain();\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //清除定时器时候的重置定时器--封装\r\n");
      out.write("    function autoChangeAgain(){ \r\n");
      out.write("            autoChange = setInterval(function(){ \r\n");
      out.write("            if(curIndex < imgLen-1){ \r\n");
      out.write("                curIndex ++;\r\n");
      out.write("            }else{ \r\n");
      out.write("                curIndex = 0;\r\n");
      out.write("            }\r\n");
      out.write("        //调用变换处理函数\r\n");
      out.write("            changeTo(curIndex);  \r\n");
      out.write("        },5000);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    function changeTo(num){ \r\n");
      out.write("        var goLeft = num *  800;\r\n");
      out.write("        $(\".imgList\").animate({left: \"-\" + goLeft + \"px\"},500);\r\n");
      out.write("        $(\".infoList\").find(\"li\").removeClass(\"infoOn\").eq(num).addClass(\"infoOn\");\r\n");
      out.write("        $(\".indexList\").find(\"li\").removeClass(\"indexOn\").eq(num).addClass(\"indexOn\");\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
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
