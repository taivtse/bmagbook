package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.StringUtil;
import model.Profile;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("dates:getDateParts", util.StringUtil.class, "getDateParts", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/tlds/custom.tld");
    _jspx_dependants.add("/WEB-INF/top_nav.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/head_tag.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Profile", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("<nav class=\"container-fluid\" id=\"main-nav-user-home\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\" id=\"user-tools-left\">\n");
      out.write("            <a id=\"main-logo\">B</a>\n");
      out.write("            <div id=\"search-box\">\n");
      out.write("                <input type=\"text\" name=\"search-friend\">\n");
      out.write("                <button><i class=\"fa fa-search\"></i></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\" id=\"user-tools-right\">\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"ProcessProfile\">\n");
      out.write("                        <img class=\"avatar-small\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ProcessImage?emailOrPhone=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.emailOrPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"ProcessNewsFeed\">Home <span>20+</span></a></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <span class=\"mess-notif\">9</span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a id=\"show-chat-box-button\" href=\"/\"><i class=\"fa fa-weixin\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <span class=\"mess-notif\">25</span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <span class=\"mess-notif\">5</span>\n");
      out.write("                </li>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null ? \n                  '<a href=\"ProcessLogout\">Logout <i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i></a>' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section class=\"container-fluid\" id=\"main-body\">\r\n");
      out.write("            <div class=\"row no-pad\">\r\n");
      out.write("                <div class=\"col-md-8 no-pad\">\r\n");
      out.write("                    <div class=\"profile-header\">\r\n");
      out.write("                        <div class=\"profile-header-top\">\r\n");
      out.write("                            <span id=\"profile-button-add-cover\">\r\n");
      out.write("                                <form action=\"UploadImage\" id=\"frmUploadPhoto\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("                                    <i class=\"fa fa-camera\" aria-hidden=\"true\"></i> Add Cover Photo\r\n");
      out.write("                                    <input type=\"file\" class=\"input-cover-photo\" id=\"userCoverPhoto\" name=\"userCoverPhoto\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ProcessImage?emailOrPhone=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.emailOrPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            <h3>\r\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                            </h3>\r\n");
      out.write("                            <a href=\"\" id=\"profile-button-update-info\">Update Info <span>1</span></a>\r\n");
      out.write("                            <a href=\"\" id=\"profile-button-view-log\">View Activity Log <span>5</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul class=\"profile-header-nav\">\r\n");
      out.write("                            <li></li>\r\n");
      out.write("                            <li><a href=\"/\">Timeline</a></li>\r\n");
      out.write("                            <li><a href=\"/\">About</a></li>\r\n");
      out.write("                            <li><a href=\"/\">Friends</a></li>\r\n");
      out.write("                            <li><a href=\"/\">Photos</a></li>\r\n");
      out.write("                            <li><a href=\"/\">More <i class=\"fa fa-caret-down\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"profile-body\">\r\n");
      out.write("                        <div class=\"profile-body-header\">\r\n");
      out.write("                            <h3><i class=\"fa fa-user\" aria-hidden=\"true\"></i> About</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"profile-body-content\">\r\n");
      out.write("                            <div class=\"row no-pad\">\r\n");
      out.write("                                <div class=\"col-md-4 profile-body-content-tool no-pad\">\r\n");
      out.write("                                    <a href=\"/\" class=\"active\">Overview</a>\r\n");
      out.write("                                    <a href=\"/\">Work and education</a>\r\n");
      out.write("                                    <a href=\"/\">Places you've lived</a>\r\n");
      out.write("                                    <a href=\"/\">Contact information</a>\r\n");
      out.write("                                    <a href=\"/\">Family and relationship</a>\r\n");
      out.write("                                    <a href=\"/\">Detailed about you</a>\r\n");
      out.write("                                    <a href=\"/\">Life events</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-8 profile-body-content-editing\">\r\n");
      out.write("                                    <h4>Overview</h4>\r\n");
      out.write("                                    <div class=\"overview-form\">\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\r\n                                        sessionScope.error != null ? \r\n                                            '<div class=\"alert-danger\" style=\"padding: 5px 15px\">'.concat(sessionScope.error) : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        <form action=\"ProcessProfile\" method=\"post\">\r\n");
      out.write("                                            <label>First Name:</label>\r\n");
      out.write("                                            <input required type=\"text\" name=\"first-name\" maxlength=\"30\" \r\n");
      out.write("                                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("                                            <label>Last Name:</label>\r\n");
      out.write("                                            <input required type=\"text\" name=\"last-name\" maxlength=\"30\" \r\n");
      out.write("                                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("                                            <label>Email/Mobile:</label>\r\n");
      out.write("                                            <input required type=\"email\" name=\"mobile-or-email\" \r\n");
      out.write("                                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.emailOrPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("                                            <label>Password:</label>\r\n");
      out.write("                                            <input required type=\"password\" name=\"user-password\" />\r\n");
      out.write("\r\n");
      out.write("                                            <label>Sex:</label>\r\n");
      out.write("                                            <input checked type=\"radio\" name=\"sex\" id=\"male\" value=\"male\"> <label class=\"light\" for=\"male\">Male</label>\r\n");
      out.write("                                            <input type=\"radio\" name=\"sex\" id=\"female\" value=\"female\"> <label class=\"light\" for=\"female\">Female</label>\r\n");
      out.write("\r\n");
      out.write("                                            <label style=\"display:block;\">Birthday</label>\r\n");
      out.write("                                            <div class=\"reg-input\">\r\n");
      out.write("                                                <select name=\"day\" id=\"days\">\r\n");
      out.write("                                                    <option>Day</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                                <select name=\"month\" id=\"months\">\r\n");
      out.write("                                                    <option>Month</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                                <select name=\"year\" id=\"years\">\r\n");
      out.write("                                                    <option>Year</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <button name=\"action\" value=\"update-profile\" type=\"submit\">Save Changes</button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-2\">\r\n");
      out.write("                    <div class=\"middle-right-ads\">\r\n");
      out.write("                        <h4>Sponsored</h4>\r\n");
      out.write("                        <div class=\"ads-item\">\r\n");
      out.write("                            <img src=\"img/ad1.jpg\">\r\n");
      out.write("                            <a href=\"\">ABC Banking</a>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                ACB PRIVILEGE BANKING â TRá»N Váº¸N Äáº²NG Cáº¤P Äá»ng hÃ nh cÃ¹ng Äáº³ng cáº¥p vÃ  vá» tháº¿ cá»§a báº¡n, pháº£i...\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"ads-item\">\r\n");
      out.write("                            <img src=\"img/ad2.jpg\">\r\n");
      out.write("                            <a href=\"\">ABC Banking</a>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                ACB PRIVILEGE BANKING â TRá»N Váº¸N Äáº²NG Cáº¤P Äá»ng hÃ nh cÃ¹ng Äáº³ng cáº¥p vÃ  vá» tháº¿ cá»§a báº¡n, pháº£i...\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"ads-item\">\r\n");
      out.write("                            <img src=\"img/ad3.png\">\r\n");
      out.write("                            <a href=\"\">ABC Banking</a>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                ACB PRIVILEGE BANKING â TRá»N Váº¸N Äáº²NG Cáº¤P Äá»ng hÃ nh cÃ¹ng Äáº³ng cáº¥p vÃ  vá» tháº¿ cá»§a báº¡n, pháº£i...\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-2 no-pad\">\r\n");
      out.write("                    <div id=\"online-list\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend1.jpg\">\r\n");
      out.write("                                <span>Trung Hiáº¿u</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend2.jpg\">\r\n");
      out.write("                                <span>Há»ng Ngá»c</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend3.jpg\">\r\n");
      out.write("                                <span>Ca Chua</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/avatar.jpg\">\r\n");
      out.write("                                <span>HÃ  An</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user-comment1.jpg\">\r\n");
      out.write("                                <span>Há»ng Ngá»c</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user_comment2.jpg\">\r\n");
      out.write("                                <span>Háº£i SÆ¡n</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user-comment3.jpg\">\r\n");
      out.write("                                <span>HÃ  Giang</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend1.jpg\">\r\n");
      out.write("                                <span>Trung Hiáº¿u</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend2.jpg\">\r\n");
      out.write("                                <span>Há»ng Ngá»c</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend3.jpg\">\r\n");
      out.write("                                <span>Ca Chua</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/avatar.jpg\">\r\n");
      out.write("                                <span>HÃ  An</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user-comment1.jpg\">\r\n");
      out.write("                                <span>Há»ng Ngá»c</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user_comment2.jpg\">\r\n");
      out.write("                                <span>Háº£i SÆ¡n</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user-comment3.jpg\">\r\n");
      out.write("                                <span>HÃ  Giang</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend1.jpg\">\r\n");
      out.write("                                <span>Trung Hiáº¿u</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend2.jpg\">\r\n");
      out.write("                                <span>Há»ng Ngá»c</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/friend3.jpg\">\r\n");
      out.write("                                <span>Ca Chua</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/avatar.jpg\">\r\n");
      out.write("                                <span>HÃ  An</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user-comment1.jpg\">\r\n");
      out.write("                                <span>Há»ng Ngá»c</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user_comment2.jpg\">\r\n");
      out.write("                                <span>Háº£i SÆ¡n</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <img src=\"img/user-comment3.jpg\">\r\n");
      out.write("                                <span>HÃ  Giang</span>\r\n");
      out.write("                                <span></span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                var day = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dates:getDateParts(sessionScope.user.birthday)[0]}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\";\r\n");
      out.write("                var month = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dates:getDateParts(sessionScope.user.birthday)[1]}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\";\r\n");
      out.write("                var year = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dates:getDateParts(sessionScope.user.birthday)[2]}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("                for (var i = 1; i <= 31; i++) {\r\n");
      out.write("                    if (i == day)\r\n");
      out.write("                        $(\"#days\").append(\"<option selected>\" + i + \"</option>\");\r\n");
      out.write("                    else\r\n");
      out.write("                        $(\"#days\").append(\"<option >\" + i + \"</option>\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                for (var i = 1; i <= 12; i++) {\r\n");
      out.write("                    if (i == month)\r\n");
      out.write("                        $(\"#months\").append(\"<option selected>\" + i + \"</option>\");\r\n");
      out.write("                    else\r\n");
      out.write("                        $(\"#months\").append(\"<option>\" + i + \"</option>\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                for (var i = 2010; i >= 1900; i--) {\r\n");
      out.write("                    if (i == year)\r\n");
      out.write("                        $(\"#years\").append(\"<option selected>\" + i + \"</option>\");\r\n");
      out.write("                    else\r\n");
      out.write("                        $(\"#years\").append(\"<option>\" + i + \"</option>\");\r\n");
      out.write("                }\r\n");
      out.write("                $(\"input[name=sex][value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("]\").prop(\"checked\", true);\r\n");
      out.write("                var viewportHeight = $(window).height();\r\n");
      out.write("                $(\"#online-list\").css(\"max-height\", viewportHeight);\r\n");
      out.write("\r\n");
      out.write("                $(\"#userCoverPhoto\").change(function () {\r\n");
      out.write("                    $(\"#frmUploadPhoto\").submit();\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"js/app.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
