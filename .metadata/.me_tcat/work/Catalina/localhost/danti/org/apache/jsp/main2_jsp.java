package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Question;
import java.util.*;
import java.sql.*;
import java.util.*;
import org.apache.struts2.components.Else;
import java.util.*;
import java.sql.*;

public final class main2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/left.jsp");
    _jspx_dependants.add("/top.jsp");
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html lang=\"zh-Hans\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>index</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" media=\"all\" href=\"style/style1.css\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    ");
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
      out.write("  \r\n");
      out.write("    \r\n");
      out.write(" <main id=\"problems-index\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
             String membername=session.getAttribute("info").toString();
             Class.forName("com.mysql.jdbc.Driver");
	         String url="jdbc:mysql://localhost:3306/ctf";
	         String username="ctf";
	         String password="ctf123";
	         Connection con=DriverManager.getConnection(url,username,password);
	         
	         String sql1="SELECT SUM(score) AS count FROM score WHERE MEMBERNAME=?";
	         PreparedStatement ps1=con.prepareStatement(sql1);
	         ps1.setString(1, membername);
	         ResultSet rs1=ps1.executeQuery();
	         
	          List allscore=new ArrayList();
	        
	         while(rs1.next())
	         {
	              int s=  rs1.getInt("count");
	              allscore.add(s);
	         }
	       
	         
	        
	        
  

      out.write(" \r\n");
      out.write("    <div class=\"current-score\">\r\n");
      out.write("您当前得分：");
      out.print(allscore.get(0) );
      out.write('\r');
      out.write('\n');


            String sqls="select rank from(select membername, score, if(@score > score, @rank:=@rank+@num+1, @rank) rank, if(@score = score, @num:=@num+1, @num:=0),@score:=score  from(select @score:=0, @rank:=1, @num:=0, membername,sum(score) score from  score group by membername order by score desc) tmp) as a where membername=?";
	         
	         PreparedStatement pss=con.prepareStatement(sqls);
	         pss.setString(1, membername);
	         ResultSet rss=pss.executeQuery();
	         
	          List rank=new ArrayList();
	        
	         if(rss.next())
	         {
	              String a=rss.getString("rank");
	             // int s=  rsl.getInt("rank");
	              rank.add(a);
	         }
	         else{
	         
	         String b="300";
	         rank.add(b);
	         }
	    
	         
	       
	         
	        
	        
  

 
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("您的排名：");
      out.print(rank.get(0) );
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>题目</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<div class=\"category category-knowledge\">\r\n");
      out.write("<h2>web</h2>\r\n");

   		    List<Question>list=(List<Question>)request.getAttribute("list");
   			
   			if(list==null||list.size()<1) { out.println("no data"); }
   			else { for(Question question:list){
   			
   			
          
           
           
           String membername1=session.getAttribute("info").toString();
            String sql="select questionid from score where questionid=? and membername=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, Integer.toString(question.getQuestionid()));
            ps.setString(2, membername1);
            
            
            ResultSet rs=ps.executeQuery();
           
             List ints = new ArrayList();
	        
             
            
            
            if(rs.next())
            {
           	  ints.add(0, "problem-solved");
           	 
            }
            else {
             ints.add(0,"problem");
             
          
			}
			



 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"problems\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"problem-21\" class=");
      out.print(ints.get(0));
      out.write(">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=");
      out.print(question.getQuestionhref() );
      out.write(">\r\n");
      out.write("<div class=\"problem-name\">");
      out.print(question.getQuestionname() );
      out.write("</div>\r\n");
      out.write("<div class=\"problem-base-score\">");
      out.print(question.getQuestionscore() );
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");

   		 
   		 }
   		
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"category category-knowledge\">\r\n");
      out.write("<h2>reverse</h2>\r\n");

   		    List<Question>list3=(List<Question>)request.getAttribute("list3");
   			
   			if(list3==null||list3.size()<1) { out.println("no data"); }
   			else { for(Question question:list3){
   			
   			
          
           
           
           String membername1=session.getAttribute("info").toString();
            String sql="select questionid from score where questionid=? and membername=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, Integer.toString(question.getQuestionid()));
            ps.setString(2, membername1);
            
            
            ResultSet rs=ps.executeQuery();
           
             List ints = new ArrayList();
	        
             
            
            
            if(rs.next())
            {
           	  ints.add(0, "problem-solved");
           	 
            }
            else {
             ints.add(0,"problem");
             
          
			}
			



 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"problems\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"problem-21\" class=");
      out.print(ints.get(0));
      out.write(">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=");
      out.print(question.getQuestionhref() );
      out.write(">\r\n");
      out.write("<div class=\"problem-name\">");
      out.print(question.getQuestionname() );
      out.write("</div>\r\n");
      out.write("<div class=\"problem-base-score\">");
      out.print(question.getQuestionscore() );
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");

   		 
   		 }
   		
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"category category-knowledge\">\r\n");
      out.write("<h2>mobile</h2>\r\n");

   		    List<Question>list4=(List<Question>)request.getAttribute("list4");
   			
   			if(list4==null||list4.size()<1) { out.println("no data"); }
   			else { for(Question question:list4){
   			
   			
          
           
           
           String membername1=session.getAttribute("info").toString();
            String sql="select questionid from score where questionid=? and membername=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, Integer.toString(question.getQuestionid()));
            ps.setString(2, membername1);
            
            
            ResultSet rs=ps.executeQuery();
           
             List ints = new ArrayList();
	        
             
            
            
            if(rs.next())
            {
           	  ints.add(0, "problem-solved");
           	 
            }
            else {
             ints.add(0,"problem");
             
          
			}
			



 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"problems\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"problem-21\" class=");
      out.print(ints.get(0));
      out.write(">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=");
      out.print(question.getQuestionhref() );
      out.write(">\r\n");
      out.write("<div class=\"problem-name\">");
      out.print(question.getQuestionname() );
      out.write("</div>\r\n");
      out.write("<div class=\"problem-base-score\">");
      out.print(question.getQuestionscore() );
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");

   		 
   		 }
   		
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<div class=\"sogoutip\" style=\"z-index: 2147483645; visibility: hidden; display: none;\"></div>\r\n");
      out.write("<div id=\"sougou_bottom\" class=\"sogoubottom\" style=\"display: none;\"></div>\r\n");
      out.write("<div id=\"ext_stophi\" style=\"z-index: 2147483647;\">\r\n");
      out.write("<div class=\"extnoticebg\"></div>\r\n");
      out.write("<div class=\"extnotice\">\r\n");
      out.write("<h2>\r\n");
      out.write("关闭提示\r\n");
      out.write("<a id=\"closenotice\" class=\"closenotice\" title=\"关闭提示\" href=\"http://xctf.jsxajs.cn/problems#\">关闭</a>\r\n");
      out.write("</h2>\r\n");
      out.write("<p id=\"sogouconfirmtxt\"></p>\r\n");
      out.write("<a id=\"sogouconfirm\" class=\"extconfirm\" href=\"http://xctf.jsxajs.cn/problems#\">确 认</a>\r\n");
      out.write("<a id=\"sogoucancel\" class=\"extconfirm\" href=\"http://xctf.jsxajs.cn/problems#\">取 消</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"ext_overlay\" class=\"ext_overlayBG\" style=\"display: none; z-index: 2147483646;\"></div>\r\n");
      out.write("<iframe class=\"sogou_sugg_feedbackquan\" frameborder=\"0\" style=\"border: none; display: none; z-index: 2147483645; background: transparent;\" src=\"./“天翼杯”第三届江苏省信息安全技能竞赛_files/yun4.htm\" scrolling=\"no\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"text/html; charset=GBK\" http-equiv=\"Content-Type\">\r\n");
      out.write("</head>\r\n");
      out.write("<body sid=\"4\">\r\n");
      out.write("<a id=\"windowcloseitnow\" class=\"closebtmbar\" style=\"display:none;\" href=\"javascript:void(0)\">关闭</a>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var uigs_para={\"abtestid\":\"1\",\"sceneid\":\"4\",\"v\":\"7112\",\"u\":\"1411467740272585\",\"hintbl\":\"0\",\"uigs_productid\":\"webext\",\"uigs_pbtag\":\"A\",\"uigs_cookie\":\"SUID\",\"type\":\"ext_sugg\",\"query\":\"“天翼杯”第三届江苏省信息安全技能竞赛|http://xctf.jsxajs.cn/problems\",\"y\":\"4C19B51B1A714F4546AEF989811308B5\",\"rn\":\"0\",\"lt\":(new Date()).getTime()-1418128073873};\r\n");
      out.write("var iploc = 'CN3203';\r\n");
      out.write("var remoteIP = '180.124.107.6';\r\n");
      out.write("var order = 2552;\r\n");
      out.write("uigs_para.ip = \"180.124.107.6\";\r\n");
      out.write("uigs_para.ls = \"201412092027\";\r\n");
      out.write("uigs_para.lc = \"201412090849\";\r\n");
      out.write("uigs_para.lk = \"201412011815\";\r\n");
      out.write("uigs_para.sd = \"105\";\r\n");
      out.write("uigs_para.cd = \"2\";\r\n");
      out.write("uigs_para.kd = \"0\";\r\n");
      out.write("uigs_para.w = \"1366\";\r\n");
      out.write("uigs_para.r = \"http://xctf.jsxajs.cn/problems\";\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"pb_v.0.0.js\" type=\"text/javascript\">\r\n");
      out.write("var uigs_clpingbackurl=\"http://pb.sogou.com/cl.gif\";var uigs_pvpingbackurl=\"http://pb.sogou.com/pv.gif\";var uigs_version=\"v1.1\";var uigs_staytime=new Date().getTime();if(typeof (uigs_para)!=\"undefined\"&&typeof (uigs_para.uigs_clpingbackurl)!=\"undefined\"&&uigs_para.uigs_clpingbackurl!=\"\"){uigs_clpingbackurl=uigs_para.uigs_clpingbackurl}if(typeof (uigs_para)!=\"undefined\"&&typeof (uigs_para.uigs_pvpingbackurl)!=\"undefined\"&&uigs_para.uigs_pvpingbackurl!=\"\"){uigs_pvpingbackurl=uigs_para.uigs_pvpingbackurl}var uigs_cookieArray=new Array();var uigs_acookie=document.cookie.split(\"; \");var uigs_pbs=new Array();for(var i=0;i<uigs_acookie.length;i++){var arr=uigs_acookie[i].split(\"=\");uigs_cookieArray[arr[0]]=arr[1]}function uigs_getCookie(A){return uigs_cookieArray[A]}function uigs_getCookiePara(){var A=\"\";if(typeof (uigs_para)!=\"undefined\"){if(typeof (uigs_para.uigs_cookie)==\"undefined\"){}else{var B=uigs_para.uigs_cookie.split(\",\");for(i in B){if(typeof (uigs_getCookie(B[i]))!=\"undefined\"){if(B[i]!=\"SUV\"){if(A==\"\"){A=B[i]+\"=\"+uigs_getCookie(B[i])}else{A=A+\"&\"+B[i]+\"=\"+uigs_getCookie(B[i])}}}}}}return encodeURIComponent(A)}uigs_d=escape((new Date().getTime())*1000+Math.round(Math.random()*1000));if(typeof (uigs_para)!=\"undefined\"&&typeof (uigs_para.uigs_uuid)==\"undefined\"){uigs_para.uigs_uuid=uigs_d}function uigs_getPingbackhead(){if(typeof (uigs_para)!=\"undefined\"&&typeof (uigs_para.uigs_productid)!=\"undefined\"){uigs_c=escape((new Date().getTime())*1000+Math.round(Math.random()*1000));r=(typeof (encodeURIComponent)==\"function\")?encodeURIComponent(document.referrer):document.referrer;var A=\"?uigs_productid=\"+uigs_para.uigs_productid+\"&uigs_t=\"+uigs_c;if(typeof (uigs_para.uigs_cookie)==\"undefined\"){}else{A+=\"&uigs_cookie=\"+uigs_getCookiePara()}if(typeof (uigs_para.uigs_uuid)!=\"undefined\"){A+=\"&uigs_uuid=\"+uigs_para.uigs_uuid}for(i in uigs_para){if(i==\"uigs_cookie\"||i==\"uigs_uuid\"||i==\"uigs_productid\"){}else{A+=\"&\"+encodeURIComponent(i)+\"=\"+encodeURIComponent(uigs_para[i])}}A+=\"&uigs_version=\"+uigs_version+\"&uigs_refer=\"+r;return A}else{return\"\"}}function uigs_pv(){if(!uigs_getCookie(\"SUV\")){uigs_c=escape((new Date().getTime())*1000+Math.round(Math.random()*1000));cookie=\"SUV=\"+uigs_c+\";path=/;expires=Tue, 19-Jan-2046 00:00:00 GMT;domain=sogou.com\"}if(typeof (uigs_para)!=\"undefined\"&&typeof (uigs_para.uigs_productid)!=\"undefined\"){var C=uigs_staytime;if(uigs_staytime<0){C=0-uigs_staytime}var A=uigs_pvpingbackurl+uigs_getPingbackhead();var B=uigs_pbs.length;uigs_pbs[B]=new Image();uigs_pbs[B].src=A}}var uigs_spv;if(typeof (uigs_pvflag)==\"undefined\"||!uigs_pvflag){if(!uigs_spv){uigs_pv()}}uigs_spv=1;$uigs_d=document;var uigs_oldclick=$uigs_d.onclick;$uigs_d.onclick=function(A){var B;if(uigs_oldclick){B=uigs_oldclick(A)}uigs_clickit(A);return B};var uigs_clickit=function(D){if(typeof (uigs_para)!=\"undefined\"&&typeof (uigs_para.uigs_productid)!=\"undefined\"){if((D&&(D.button!=0))||((!D)&&(window.event.button!=0))){return }try{D=D||window.event;var G=((D.target)?D.target:D.srcElement);var C=\"\";var H=\"\";var A=\"\";var E=\"\";while(C==\"\"){A=G.tagName.toUpperCase();if(!C){C=G.uigs||G.getAttribute(\"uigs\")||\"\"}if(C&&C==\"nouigs\"){return }if(A==\"A\"||A==\"LINK\"||A==\"AREA\"||A==\"INPUT\"||A==\"DIV\"){H=A}if(G.href){E=G.href}try{if(H==uigs_para.uigs_pbtag){C=G.id||G.getAttribute(\"id\")||\"\";while(C==\"\"){if(G.parentNode){G=G.parentNode}else{break}if(!G.tagName){break}if(!C){C=G.id||G.getAttribute(\"id\")||\"\"}}break}}catch(B){}if(G.parentNode){G=G.parentNode}else{break}if(!G.tagName){break}}if((H&&(C))||(H&&H==uigs_para.uigs_pbtag)){uigsPB(C+\"&href=\"+E)}}catch(F){}}};function uigsPB(A){if(typeof (uigs_para)!=\"undefined\"&&typeof (uigs_para.uigs_productid)!=\"undefined\"){var D=uigs_staytime;if(uigs_staytime<0){D=0-uigs_staytime}var B=uigs_clpingbackurl+uigs_getPingbackhead()+\"&uigs_st=\"+parseInt((new Date().getTime()-D)/1000)+\"&uigs_cl=\"+encodeURIComponent(A);var C=uigs_pbs.length;uigs_pbs[C]=new Image();uigs_pbs[C].src=B}}var uigs_al=false;function uigs_iecompattest(){return(document.compatMode&&document.compatMode!=\"BackCompat\")?document.documentElement:document.body}var uigs_judgeBottom=function(){try{var B=uigs_iecompattest().clientHeight;var A=uigs_iecompattest().scrollHeight;var F=uigs_iecompattest().scrollTop;if(F>100&&A-B-F<100&&!uigs_al){uigs_al=true;var C=\"\";var D=uigs_staytime;if(uigs_staytime<0){D=0-uigs_staytime}C=\"tob=\"+parseInt((new Date().getTime()-D)/1000);uigsPB(C)}}catch(E){}};window.setInterval(uigs_judgeBottom,100);\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("</iframe>\r\n");
      out.write("<script src=\"./“天翼杯”第三届江苏省信息安全技能竞赛_files/pv.gif\">\r\n");
      out.write("undefined\r\n");
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
