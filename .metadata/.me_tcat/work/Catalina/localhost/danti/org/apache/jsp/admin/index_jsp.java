package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- saved from url=(0058)http://static.demo.ruyo.net/Bootstrap_left_menu.html2.html -->\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <title>管理系统</title>\r\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("   <link href=\"../assets/css/dpl-min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("  <link href=\"../assets/css/bui-min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("   <link href=\"../assets/css/main-min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("   <link rel=\"shortcut icon\" href=\"http://127.0.0.1:8080/danti//image/qt.ico\">\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"dl-title\">\r\n");
      out.write("       \r\n");
      out.write("          <span class=\"lp-title-port\"></span><span class=\"dl-title-text\">后台管理系统</span>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"dl-log\">欢迎您，<span class=\"dl-log-user\">m</span><a href=\"###\" title=\"退出系统\" class=\"dl-log-quit\">[退出]</a><a href=\"http://http://sc.chinaz.com/\" title=\"文档库\" class=\"dl-log-quit\">文档库</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"content\">\r\n");
      out.write("    <div class=\"dl-main-nav\">\r\n");
      out.write("      <div class=\"dl-inform\"><div class=\"dl-inform-title\"><s class=\"dl-inform-icon dl-up\"></s></div></div>\r\n");
      out.write("      <ul id=\"J_Nav\"  class=\"nav-list ks-clear\">\r\n");
      out.write("        <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-home\">首页管理</div></li>\r\n");
      out.write("        <li class=\"nav-item\"><div class=\"nav-item-inner nav-order\">CTF学习后台</div></li>\r\n");
      out.write("        <li class=\"nav-item\"><div class=\"nav-item-inner nav-inventory\">CTF训练后台</div></li>\r\n");
      out.write("        <li class=\"nav-item\"><div class=\"nav-item-inner nav-supplier\">技术社区后台</div></li>\r\n");
      out.write("        <li class=\"nav-item\"><div class=\"nav-item-inner nav-marketing\">挑战平台后台</div></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul id=\"J_NavContent\" class=\"dl-tab-conten\">\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("   </div>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"../assets/js/jquery-1.8.1.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"../assets/js/bui.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"../assets/js/config.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    BUI.use('common/main',function(){\r\n");
      out.write("      var config = [{\r\n");
      out.write("          id:'menu', \r\n");
      out.write("          homePage : 'code',\r\n");
      out.write("          menu:[{\r\n");
      out.write("              text:'首页管理',\r\n");
      out.write("              items:[\r\n");
      out.write("                {id:'code',text:'安全快讯',href:'index/addkuaixun.jsp',closeable : false},\r\n");
      out.write("                {id:'main-menu',text:'顶部侧滑图片',href:'index/topimage.jsp'},\r\n");
      out.write("                {id:'second-menu',text:'工具推荐',href:'index/tool.jsp'},\r\n");
      out.write("                {id:'dyna-menu',text:'最新文章',href:'index/article.jsp'}\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("              ]\r\n");
      out.write("            },{\r\n");
      out.write("              text:'视频',\r\n");
      out.write("              items:[\r\n");
      out.write("                {id:'operation',text:'视频添加',href:'main/operation.html'},\r\n");
      out.write("                {id:'quick',text:'',href:'main/quick.html'}  \r\n");
      out.write("              ]\r\n");
      out.write("            },{\r\n");
      out.write("              text:'友情链接',\r\n");
      out.write("              items:[\r\n");
      out.write("                {id:'resource',text:'友情链接添加',href:'main/resource.html'},\r\n");
      out.write("                {id:'loader',text:'',href:'main/loader.html'}  \r\n");
      out.write("              ]\r\n");
      out.write("            }]\r\n");
      out.write("          },{\r\n");
      out.write("            id:'form',\r\n");
      out.write("            menu:[{\r\n");
      out.write("                text:'表单页面',\r\n");
      out.write("                items:[\r\n");
      out.write("                  {id:'code',text:'添加',href:'learnadd.jsp'},\r\n");
      out.write("                  {id:'example',text:'表单示例',href:'form/example.html'},\r\n");
      out.write("                  {id:'introduce',text:'表单简介',href:'form/introduce.html'},\r\n");
      out.write("                  {id:'valid',text:'表单基本验证',href:'form/basicValid.html'},\r\n");
      out.write("                  {id:'advalid',text:'表单复杂验证',href:'form/advalid.html'},\r\n");
      out.write("                  {id:'remote',text:'远程调用',href:'form/remote.html'},\r\n");
      out.write("                  {id:'group',text:'表单分组',href:'form/group.html'},\r\n");
      out.write("                  {id:'depends',text:'表单联动',href:'form/depends.html'}\r\n");
      out.write("                  \r\n");
      out.write("                ]\r\n");
      out.write("              },{\r\n");
      out.write("                text:'成功失败页面',\r\n");
      out.write("                items:[\r\n");
      out.write("                  {id:'success',text:'成功页面',href:'form/success.html'},\r\n");
      out.write("                  {id:'fail',text:'失败页面',href:'form/fail.html'}\r\n");
      out.write("                \r\n");
      out.write("                ]\r\n");
      out.write("              },{\r\n");
      out.write("                text:'可编辑表格',\r\n");
      out.write("                items:[\r\n");
      out.write("                  {id:'grid',text:'可编辑表格',href:'form/grid.html'},\r\n");
      out.write("                  {id:'form-grid',text:'表单中的可编辑表格',href:'form/form-grid.html'},\r\n");
      out.write("                  {id:'dialog-grid',text:'使用弹出框',href:'form/dialog-grid.html'},\r\n");
      out.write("                  {id:'form-dialog-grid',text:'表单中使用弹出框',href:'form/form-dialog-grid.html'}\r\n");
      out.write("                ]\r\n");
      out.write("              }]\r\n");
      out.write("          },{\r\n");
      out.write("            id:'search',\r\n");
      out.write("            menu:[{\r\n");
      out.write("                text:'搜索页面',\r\n");
      out.write("                items:[\r\n");
      out.write("                  {id:'code',text:'添加',href:'index/addtrain1.jsp'},\r\n");
      out.write("                  {id:'example',text:'搜索页面示例',href:'search/example.html'},\r\n");
      out.write("                  {id:'example-dialog',text:'搜索页面编辑示例',href:'search/example-dialog.html'},\r\n");
      out.write("                  {id:'introduce',text:'搜索页面简介',href:'search/introduce.html'}, \r\n");
      out.write("                  {id:'config',text:'搜索配置',href:'search/config.html'}\r\n");
      out.write("                ]\r\n");
      out.write("              },{\r\n");
      out.write("                text : '更多示例',\r\n");
      out.write("                items : [\r\n");
      out.write("                  {id : 'tab',text : '使用tab过滤',href : 'search/tab.html'}\r\n");
      out.write("                ]\r\n");
      out.write("              }]\r\n");
      out.write("          },{\r\n");
      out.write("            id:'detail',\r\n");
      out.write("            menu:[{\r\n");
      out.write("                text:'详情页面',\r\n");
      out.write("                items:[\r\n");
      out.write("                  {id:'code',text:'详情页面代码',href:'detail/code.html'},\r\n");
      out.write("                  {id:'example',text:'详情页面示例',href:'detail/example.html'},\r\n");
      out.write("                  {id:'introduce',text:'详情页面简介',href:'detail/introduce.html'}\r\n");
      out.write("                ]\r\n");
      out.write("              }]\r\n");
      out.write("          },{\r\n");
      out.write("            id : 'chart',\r\n");
      out.write("            menu : [{\r\n");
      out.write("              text : '页面',\r\n");
      out.write("              items:[\r\n");
      out.write("                  {id:'code',text:'发布题目',href:'JumpToQuestionAdd.action'},\r\n");
      out.write("                  {id:'line',text:'排名',href:'AdminRankAction.action'},\r\n");
      out.write("                  {id:'area',text:'得分管理',href:'ManageAction.action'},\r\n");
      out.write("                  {id:'column',text:'发布公告',href:'JumpToNotice.action'},\r\n");
      out.write("                  {id:'pie',text:'',href:'chart/pie.html'}, \r\n");
      out.write("                  {id:'radar',text:'',href:'chart/radar.html'}\r\n");
      out.write("              ]\r\n");
      out.write("            }]\r\n");
      out.write("          }];\r\n");
      out.write("      new PageUtil.MainPage({\r\n");
      out.write("        modulesConfig : config\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("<div style=\"display:none\"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>\r\n");
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
