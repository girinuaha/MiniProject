/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.6.v20170531
 * Generated at: 2017-11-03 09:48:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class borrowTransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/Users/girinuaha/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1501135608000L));
    _jspx_dependants.put("jar:file:/C:/Users/girinuaha/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425953470000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Library MASA | BOOK</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- start: Css -->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- plugins -->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/font-awesome.min.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/simple-line-icons.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/select2.min.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/datatables.bootstrap.min.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/animate.min.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/bootstrap-material-datetimepicker.css\"/>\r\n");
      out.write("  <link href=\"assets/asset/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- end: Css -->\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"assets/asset/img/logomi.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"mimin\" class=\"dashboard\">\r\n");
      out.write("\t<!-- start: Header -->\r\n");
      out.write("\t<nav class=\"navbar navbar-default header navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"col-md-12 nav-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<div class=\"opener-left-menu is-open\">\r\n");
      out.write("\t\t\t\t\t<span class=\"top\"></span> <span class=\"middle\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"bottom\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"index.html\" class=\"navbar-brand\"> <b>MASA</b>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav search-nav\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-search icon-search\" style=\"font-size: 23px;\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-animate-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-text\" required> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"bar\"></span> <label class=\"label-search\">Type\r\n");
      out.write("\t\t\t\t\t\t\t\t\tanywhere to <b>Search</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right user-nav\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-right: 5px;\">\r\n");
      out.write("\t\t\t\t\t<li class=\"user-name\"><span>Akihiko Avaron</span></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown avatar-dropdown\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"assets/asset/img/avatar.jpg\" class=\"img-circle avatar\"\r\n");
      out.write("\t\t\t\t\t\talt=\"user name\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"true\" />\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu user-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-user\"></span> My\r\n");
      out.write("\t\t\t\t\t\t\t\t\tProfile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-calendar\"></span> My\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCalendar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"float: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><span class=\"fa fa-power-off \"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- end: Header -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container-fluid mimin-wrapper\">\r\n");
      out.write("\t\t<!-- start:Left Menu -->\r\n");
      out.write("\t\t<div id=\"left-menu\">\r\n");
      out.write("\t\t\t<div class=\"sub-left-menu scroll\">\r\n");
      out.write("                <ul class=\"nav nav-list\">\r\n");
      out.write("                \t<li><div class=\"left-bg\"></div></li>\r\n");
      out.write("                    <li class=\"time\">\r\n");
      out.write("                      <h1 class=\"animated fadeInLeft\">21:00</h1>\r\n");
      out.write("                      <p class=\"animated fadeInRight\">Sat,October 1st 2029</p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"ripple animated fadeInLeft\">\r\n");
      out.write("                    \t<a class=\"nav-header\" href=\"book\">\r\n");
      out.write("                    \t\t<span class=\"fa fa-book\"></span> Books  \r\n");
      out.write("                    \t\t<span class=\"fa-angle-right fa right-arrow text-right\"></span>\r\n");
      out.write("                    \t</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"active ripple animated fadeInRight\">\r\n");
      out.write("                    \t<a class=\"tree-toggle nav-header\">\r\n");
      out.write("                    \t\t<span class=\"fa fa-money\"></span> Rent History \r\n");
      out.write("                    \t\t<span class=\"fa-angle-right fa right-arrow text-right\"></span>\r\n");
      out.write("                    \t</a>\r\n");
      out.write("                    \t<ul class=\"nav nav-list tree\">\r\n");
      out.write("\t                        <li><a href=\"rent_history\">Book Rent List</a></li>\r\n");
      out.write("\t                        <li><a href=\"borrow_transaction\">Borrow Book</a></li>\r\n");
      out.write("                      \t</ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"ripple animated fadeInLeft\">\r\n");
      out.write("                    \t<a class=\"nav-header\" href=\"customer\">\r\n");
      out.write("                    \t\t<span class=\"fa fa-users\"></span> Customer  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\r\n");
      out.write("                    \t</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"ripple animated fadeInRight\">\r\n");
      out.write("                    \t<a class=\"nav-header\" href=\"employee\">\r\n");
      out.write("                    \t\t<span class=\"fa fa-user\"></span> Employee  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\r\n");
      out.write("                    \t</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"ripple animated fadeInLeft\">\r\n");
      out.write("                    \t<a class=\"nav-header\" href=\"shelf\">\r\n");
      out.write("                    \t\t<span class=\"fa fa-archive\"></span> Shelf  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\r\n");
      out.write("                    \t</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"ripple animated fadeInRight\">\r\n");
      out.write("                    \t<a class=\"nav-header\" href=\"publisher\">\r\n");
      out.write("                    \t\t<span class=\"fa fa-newspaper-o\"></span> Publisher  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\r\n");
      out.write("                    \t</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end: Left Menu -->\r\n");
      out.write("\t\t<!-- start: Content -->\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"panel box-shadow-none content-header\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"animated fadeInLeft\">Rent</h3>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"animated fadeInDown\">\r\n");
      out.write("\t\t\t\t\t\t\tBorrow <span class=\"fa-angle-right fa\"></span> Book\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            <div class=\"col-md-12 top-20 padding-0\">\r\n");
      out.write("            \t<div class=\"col-md-12\">\r\n");
      out.write("                  <div class=\"panel\">\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                    \t<form action=\"borrow_transaction/save\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <label>Customer</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <select class=\"form-control customer\" name=\"customer.id\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t<option></option>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    \t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label>Borrow Date</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<input type=\"text\" class=\"form-control\" name=\"borrowDate\" id=\"borrowDate\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t  \t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label>Employee</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<select class=\"form-control employee\" name=\"employee.id\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    \t</select>\r\n");
      out.write("\t\t\t\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Save</button><br><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- end: content -->         \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- start: Javascript -->\r\n");
      out.write("\t<script src=\"assets/asset/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/jquery.ui.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/popper.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- plugins -->\r\n");
      out.write("\t<script src=\"assets/asset/js/plugins/moment.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/plugins/jquery.datatables.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/plugins/datatables.bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/plugins/bootstrap-material-datetimepicker.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/plugins/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/plugins/jquery.validate.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/asset/js/plugins/select2.full.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- custom -->\r\n");
      out.write("\t<script src=\"assets/asset/js/main.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("        $('#borrowDate').bootstrapMaterialDatePicker({\r\n");
      out.write("        \tweekStart : 0, \r\n");
      out.write("\t       \ttime: false,\r\n");
      out.write("\t       \tmaxDate : new Date(),\r\n");
      out.write("\t       \tformat : 'DD/MM/YYYY',\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        $(\".customer\").select2({\r\n");
      out.write("            placeholder: \"Select a customer\",\r\n");
      out.write("            allowClear: true\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        $(\".employee\").select2({\r\n");
      out.write("            placeholder: \"Select a employee\",\r\n");
      out.write("            allowClear: true\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/jsp/borrowTransaction.jsp(149,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("customers");
      // /WEB-INF/jsp/borrowTransaction.jsp(149,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/borrowTransaction.jsp(149,13) '${customers }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${customers }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t    \t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customers.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customers.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("\t\t\t\t\t\t\t    \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/jsp/borrowTransaction.jsp(161,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("employee");
      // /WEB-INF/jsp/borrowTransaction.jsp(161,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/borrowTransaction.jsp(161,13) '${employees }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${employees }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t    \t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("\t\t\t\t\t\t\t\t    \t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t    \t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
