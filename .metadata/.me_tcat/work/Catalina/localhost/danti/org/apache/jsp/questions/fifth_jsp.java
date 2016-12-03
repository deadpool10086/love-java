package org.apache.jsp.questions;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import po.Css;
import action.FirstAction;
import com.sun.xml.internal.ws.addressing.ProblemAction;
import java.util.*;
import java.sql.*;
import java.util.*;
import org.apache.struts2.components.Else;
import java.util.*;
import java.sql.*;

public final class fifth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/questions/../left.jsp");
    _jspx_dependants.add("/questions/../top.jsp");
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
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"keywords\" content=\"江苏省信息安全技能竞赛, 网络安全\">\r\n");
      out.write("<meta name=\"description\" content=\"“天翼杯”第三届信息安全技能竞赛，是由江苏省委网络安全和信息化领导小组办公室、江苏省经济和信息化委员会、江苏省教育厅主办，中国电信江苏分公司、南京信息职业技术学院、江苏省信息安全测评中心承办的网络安全技术实战竞赛！\">\r\n");
      out.write("<title>“天翼杯”第三届江苏省信息安全技能竞赛</title>\r\n");
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
      out.write(" ");
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
      out.write("\r\n");
      out.write("<main id=\"problems-index\">\r\n");
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
      out.write("<div class=\"\">\r\n");
      out.write("题目描述：你能从里面找到flag吗？<br/>\r\n");
      out.write("hash=\"118,97,114,32,74,61,102,117,110,99,116,105,111,110,40,109,41,123,114,\r\n");
      out.write("101,116,117,114,110,32,83,116,114,105,110,103,46,102,114,111,109,67,104,97,\r\n");
      out.write("114,67,111,100,101,40,109,94,50,41,125,59,101,118,97,108,40,74,40,49,48,54,\r\n");
      out.write("41,43,74,40,57,57,41,43,74,40,49,49,51,41,43,74,40,49,48,54,41,43,74,40,51,\r\n");
      out.write("52,41,43,74,40,54,51,41,43,74,40,51,52,41,43,74,40,51,55,41,43,74,40,56,51,\r\n");
      out.write("41,43,74,40,49,49,48,41,43,74,40,49,49,52,41,43,74,40,49,48,57,41,43,74,40,\r\n");
      out.write("55,55,41,43,74,40,56,54,41,43,74,40,54,56,41,43,74,40,54,52,41,43,74,40,56,\r\n");
      out.write("53,41,43,74,40,56,49,41,43,74,40,56,56,41,43,74,40,56,54,41,43,74,40,56,53,\r\n");
      out.write("41,43,74,40,57,49,41,43,74,40,49,49,53,41,43,74,40,53,53,41,43,74,40,49,48,\r\n");
      out.write("49,41,43,74,40,49,49,57,41,43,74,40,49,48,49,41,43,74,40,54,55,41,43,74,40,\r\n");
      out.write("54,55,41,43,74,40,54,55,41,43,74,40,57,57,41,43,74,40,55,50,41,43,74,40,49,\r\n");
      out.write("48,49,41,43,74,40,55,52,41,43,74,40,56,51,41,43,74,40,56,51,41,43,74,40,55,\r\n");
      out.write("55,41,43,74,40,53,50,41,43,74,40,49,49,55,41,43,74,40,56,51,41,43,74,40,54,\r\n");
      out.write("55,41,43,74,40,54,53,41,43,74,40,54,55,41,43,74,40,54,55,41,43,74,40,55,57,\r\n");
      out.write("41,43,74,40,56,55,41,43,74,40,49,49,55,41,43,74,40,54,55,41,43,74,40,54,55,\r\n");
      out.write("41,43,74,40,56,51,41,43,74,40,55,49,41,43,74,40,49,50,51,41,43,74,40,55,54,\r\n");
      out.write("41,43,74,40,55,57,41,43,74,40,57,57,41,43,74,40,55,51,41,43,74,40,49,49,48,\r\n");
      out.write("41,43,74,40,55,54,41,43,74,40,56,51,41,43,74,40,55,52,41,43,74,40,56,50,41,\r\n");
      out.write("43,74,40,56,54,41,43,74,40,56,50,41,43,74,40,49,50,51,41,43,74,40,55,48,41,\r\n");
      out.write("43,74,40,57,49,41,43,74,40,56,53,41,43,74,40,54,52,41,43,74,40,55,54,41,43,\r\n");
      out.write("74,40,54,56,41,43,74,40,52,57,41,43,74,40,55,50,41,43,74,40,54,56,41,43,74,\r\n");
      out.write("40,55,55,41,43,74,40,54,56,41,43,74,40,54,53,41,43,74,40,56,51,41,43,74,40,\r\n");
      out.write("49,48,55,41,43,74,40,49,49,50,41,43,74,40,49,49,49,41,43,74,40,54,53,41,43,\r\n");
      out.write("74,40,53,50,41,43,74,40,54,55,41,43,74,40,54,51,41,43,74,40,51,55,41,43,39,\r\n");
      out.write("39,41,59,10\"\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write(" ");

           
           // Statement stmt=con.createStatement();
           String membername1=session.getAttribute("info").toString();
            String sql="select questionid from score where questionid=? and membername=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,"5");
            ps.setString(2, membername1);
            
            
            ResultSet rs=ps.executeQuery();
           
             List ints = new ArrayList();
	        
             
            
            
            if(rs.next())
            {
           	  ints.add(0, "hd");
           	 
            }
            else {
             ints.add(0,"hh");
             
          
			}
			



 
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" <div class=");
      out.print(ints.get(0) );
      out.write(">\r\n");
      out.write(" \r\n");
      out.write(" &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t <form action=\"fifthAction.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\tflag:<input type=\"text\" name=\"key5\" ><br/>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"submit\" name=\"submit\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
