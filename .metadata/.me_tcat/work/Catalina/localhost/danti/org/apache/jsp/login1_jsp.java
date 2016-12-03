package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"zh-cn\" data-ng-app=\"angle\" class=\"ng-scope js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><style type=\"text/css\">@charset \"UTF-8\";[ng\\:cloak],[ng-cloak],[data-ng-cloak],[x-ng-cloak],.ng-cloak,.x-ng-cloak,.ng-hide{display:none !important;}ng\\:form{display:block;}.ng-animate-block-transitions{transition:0s all!important;-webkit-transition:0s all!important;}.ng-hide-add-active,.ng-hide-remove{display:block!important;}</style>\r\n");
      out.write("    \r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <script src=\"./loginfile/0569ba6c.base.min.js\"></script>\r\n");
      out.write("    <script src=\"./loginfile/73125f11.material.min.js\"></script>\r\n");
      out.write("    <script src=\"./loginfile/71b67208.app.js\"></script>\r\n");
      out.write("    <meta name=\"description\" content=\"让云上的日子多些安全感\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"青藤云安全,安全一体化平台\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"https://console.qingteng.cn/app/img/qt.ico\">\r\n");
      out.write("    <link rel=\"stylesheet\" ng-href=\"\">\r\n");
      out.write("    <meta http-equiv=\"cache-control\" content=\"max-age=5\">\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"windows-Target\" content=\"_top\">\r\n");
      out.write("    <title data-ng-bind=\"pageTitle()\" class=\"ng-binding\"></title>\r\n");
      out.write("    <script src=\"./loginfile/modernizr.js\" async=\"\"></script><script src=\"./loginfile/parsley.min.js\" async=\"\"></script><script src=\"./loginfile/4b8fd4b9.login-form.js\" async=\"\"></script><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/ngDialog.min.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/ngDialog-theme-default.min.css\"><script src=\"./loginfile/ngDialog.min.js\" async=\"\"></script><script src=\"./loginfile/e5c6c790.common-service.js\" async=\"\"></script><script src=\"./loginfile/d7b18ea8.base-page.js\" async=\"\"></script><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/c27f535c.appmin.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/c8493cff.theme-f.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/f7d0426a.common.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/1104b4ad.material-simple.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/b7127f40.login.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/8456f37c.icon-config.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/144a8590.new-common.css\"><link type=\"text/css\" rel=\"stylesheet\" href=\"./loginfile/78b12fd6.czb-css.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body data-ng-class=\"{true: &#39;aside-collapsed &#39;+currentFirm.firmClass, false: currentFirm.firmClass }[app.layout.isCollapsed]\" class=\"qtSystem\">\r\n");
      out.write("    <!--<div class=\"body-loading\" ng-include=\"'app/views/genericCom/4286a8fc.loading.html'\"></div>-->\r\n");
      out.write("    <!-- uiView:  --><div data-ui-view=\"\" data-autoscroll=\"false\" data-ng-class=\"mainViewAnimation\" class=\"wrapper ng-scope\"><div class=\"login-bg ng-scope\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"login shadow-z-1 ng-scope\" ng-controller=\"LoginForm\">\r\n");
      out.write("\t\t<div class=\"banner\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"login-content\">\r\n");
      out.write("\t\t\t<form  action=\"memberLoginAction.action\" method=\"post\" class=\"ng-pristine ng-valid\" novalidate=\"\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<ol>\r\n");
      out.write("\t\t\t                        \r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-control-wrapper\"><input class=\"form-control ng-pristine ng-valid empty\" name=\"membername\" ng-model=\"account.email\" ng-class=\"{true: &#39;empty&#39;, false: &#39;unempty&#39;}[account.email==null||account.email==&#39;&#39;]\" type=\"text\" autocomplete=\"off\" data-parsley-id=\"2473\"><div class=\"floating-label\">用户名</div><span class=\"material-input\"></span></div><ul class=\"parsley-errors-list\" id=\"parsley-id-2473\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" data-parsley-id=\"0823\"><ul class=\"parsley-errors-list\" id=\"parsley-id-0823\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-control-wrapper\"><input name=\"memberpassword\" class=\"form-control ng-pristine ng-valid empty\" ng-model=\"account.password\" ng-class=\"{true: &#39;empty&#39;, false: &#39;unempty&#39;}[account.password==null||account.password==&#39;&#39;]\" type=\"password\" autocomplete=\"off\" data-parsley-id=\"1519\"><div class=\"floating-label\">密码</div><span class=\"material-input\"></span></div><ul class=\"parsley-errors-list\" id=\"parsley-id-1519\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<input value=\"登 录\" name=\"login\" class=\"btn btn-info login-btn\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t<div ng-show=\"authMsg\" class=\"login-error ng-binding ng-hide\" ng-bind=\"authMsg\"></div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("</body></html>");
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
