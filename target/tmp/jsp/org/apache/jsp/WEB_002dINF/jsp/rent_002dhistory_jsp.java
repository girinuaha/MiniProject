/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.6.v20170531
 * Generated at: 2017-11-07 03:37:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rent_002dhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Library MASA | Rent History</title> \n");
      out.write("\n");
      out.write("  <!-- start: Css -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("  <!-- plugins -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/font-awesome.min.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/simple-line-icons.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/datatables.bootstrap.min.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/asset/css/plugins/animate.min.css\"/>\n");
      out.write("  <link href=\"assets/asset/css/style.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- end: Css -->\n");
      out.write("\n");
      out.write("  <link rel=\"shortcut icon\" href=\"assets/asset/img/logomi.png\">\n");
      out.write("  <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("      <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"mimin\" class=\"dashboard\">\n");
      out.write("      <!-- start: Header -->\n");
      out.write("        <nav class=\"navbar navbar-default header navbar-fixed-top\">\n");
      out.write("          <div class=\"col-md-12 nav-wrapper\">\n");
      out.write("            <div class=\"navbar-header\" style=\"width:100%;\">\n");
      out.write("              <div class=\"opener-left-menu is-open\">\n");
      out.write("                <span class=\"top\"></span>\n");
      out.write("                <span class=\"middle\"></span>\n");
      out.write("                <span class=\"bottom\"></span>\n");
      out.write("              </div>\n");
      out.write("                <a href=\"index.html\" class=\"navbar-brand\"> \n");
      out.write("                 <b>MASA</b>\n");
      out.write("                </a>\n");
      out.write("              \n");
      out.write("              <ul class=\"nav navbar-nav navbar-right user-nav\" style=\"margin-right: 5px;\">\n");
      out.write("                <li class=\"user-name\"><span>Akihiko Avaron</span></li>\n");
      out.write("                  <li class=\"dropdown avatar-dropdown\">\n");
      out.write("                   <img src=\"assets/asset/img/avatar.jpg\" class=\"img-circle avatar\" alt=\"user name\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\"/>                   \n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      <!-- end: Header -->\n");
      out.write("\n");
      out.write("      <div class=\"container-fluid mimin-wrapper\">\n");
      out.write("  \n");
      out.write("          <!-- start:Left Menu -->\n");
      out.write("            <div id=\"left-menu\">\n");
      out.write("              <div class=\"sub-left-menu scroll\">\n");
      out.write("                <ul class=\"nav nav-list\">\n");
      out.write("                    <li><div class=\"left-bg\"></div></li>\n");
      out.write("                    <li class=\"time\">\n");
      out.write("                      <h1 class=\"animated fadeInLeft\">21:00</h1>\n");
      out.write("                      <p class=\"animated fadeInRight\">Sat,October 1st 2029</p>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"ripple animated fadeInLeft\">\n");
      out.write("                    \t<a class=\"nav-header\" href=\"book\">\n");
      out.write("                    \t\t<span class=\"fa fa-book\"></span> Books  \n");
      out.write("                    \t\t<span class=\"fa-angle-right fa right-arrow text-right\"></span>\n");
      out.write("                    \t</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"active ripple animated fadeInRight\">\n");
      out.write("                    \t<a class=\"tree-toggle nav-header\">\n");
      out.write("                    \t\t<span class=\"fa fa-money\"></span> Rent History \n");
      out.write("                    \t\t<span class=\"fa-angle-right fa right-arrow text-right\"></span>\n");
      out.write("                    \t</a>\n");
      out.write("                    \t<ul class=\"nav nav-list tree\">\n");
      out.write("\t                        <li><a href=\"rent_history\">Book Rent List</a></li>\n");
      out.write("\t                        <li><a href=\"borrow_transaction\">Borrow Book</a></li>\n");
      out.write("                      \t</ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"ripple animated fadeInLeft\">\n");
      out.write("                    \t<a class=\"nav-header\" href=\"customer\">\n");
      out.write("                    \t\t<span class=\"fa fa-users\"></span> Customer  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\n");
      out.write("                    \t</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"ripple animated fadeInRight\">\n");
      out.write("                    \t<a class=\"nav-header\" href=\"employee\">\n");
      out.write("                    \t\t<span class=\"fa fa-user\"></span> Employee  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\n");
      out.write("                    \t</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"ripple animated fadeInLeft\">\n");
      out.write("                    \t<a class=\"nav-header\" href=\"shelf\">\n");
      out.write("                    \t\t<span class=\"fa fa-archive\"></span> Shelf  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\n");
      out.write("                    \t</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"ripple animated fadeInRight\">\n");
      out.write("                    \t<a class=\"nav-header\" href=\"publisher\">\n");
      out.write("                    \t\t<span class=\"fa fa-newspaper-o\"></span> Publisher  <span class=\"fa-angle-right fa right-arrow text-right\"></span>\n");
      out.write("                    \t</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          <!-- end: Left Menu -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- start: Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("               <div class=\"panel box-shadow-none content-header\">\n");
      out.write("                  <div class=\"panel-body\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h3 class=\"animated fadeInLeft\">Rent History</h3>\n");
      out.write("                        <p class=\"animated fadeInDown\">\n");
      out.write("                         \tRent History <span class=\"fa-angle-right fa\"></span> List\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-12 top-20 padding-0\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <div class=\"panel\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                      <div class=\"responsive-table\">\n");
      out.write("                      <table id=\"rent-list\" class=\"table table-striped table-bordered\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("\t                      <thead>\n");
      out.write("\t                        <tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Customer</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Borrow Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Due Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Return Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Fine</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 15%;\">Action</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t                      </thead>\n");
      out.write("\t                      <tbody>\n");
      out.write("\t                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t                      </tbody>\n");
      out.write("                      </table>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>  \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- end: content -->         \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\t<!-- start: Javascript -->\n");
      out.write("\t<script src=\"assets/asset/js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"assets/asset/js/jquery.ui.min.js\"></script>\n");
      out.write("\t<script src=\"assets/asset/js/popper.min.js\"></script>\n");
      out.write("\t<script src=\"assets/asset/js/bootstrap.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- plugins -->\n");
      out.write("\t<script src=\"assets/asset/js/plugins/moment.min.js\"></script>\n");
      out.write("\t<script src=\"assets/asset/js/plugins/jquery.datatables.min.js\"></script>\n");
      out.write("\t<script src=\"assets/asset/js/plugins/datatables.bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"assets/asset/js/plugins/jquery.nicescroll.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- custom -->\n");
      out.write("\t<script src=\"assets/asset/js/main.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t  $(document).ready(function(){\n");
      out.write("\t    $('#rent-list').DataTable();\n");
      out.write("\t  });\n");
      out.write("\t</script>\n");
      out.write("\t<!-- end: Javascript -->\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t\tvar id = 0;\n");
      out.write("\t\t\n");
      out.write("\t\t//update\n");
      out.write("\t\t$(document).ready(function (){\n");
      out.write("\t\t\t$('.update-btn').on('click',function() {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tid = $(this).data('id');\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//ajax retrive data\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype: 'POST',\n");
      out.write("\t\t\t\t\turl: '/rent_history/edit/'+id,\n");
      out.write("\t\t\t\t\tsuccess: function(data) {\t\t\n");
      out.write("\t\t\t\t\t\tsetField(data);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tdataType: 'json'\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#update-modal').modal();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar date = new Date();\n");
      out.write("\n");
      out.write("\t\t\tvar day = date.getDate();\n");
      out.write("\t\t\tvar month = date.getMonth() + 1;\n");
      out.write("\t\t\tvar year = date.getFullYear();\n");
      out.write("\n");
      out.write("\t\t\tif (month < 10) month = \"0\" + month;\n");
      out.write("\t\t\tif (day < 10) day = \"0\" + day;\n");
      out.write("\n");
      out.write("\t\t\tvar today = year + \"-\" + month + \"-\" + day;\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\tfunction setField(data) {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar oneDay = 24*60*60*1000;\n");
      out.write("\t\t\t\tvar firstDate = new Date(data.dueDate);\n");
      out.write("\t\t\t\tvar secondDate = new Date(today);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif (secondDate <= firstDate) {\n");
      out.write("\t\t\t\t\tvar diffDays = 0;\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\tvar diffDays = Math.round(Math.abs(((firstDate.getTime() - secondDate.getTime())/(oneDay))*5000));\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#borrowId').val(data.borrowTransaction.id);\n");
      out.write("\t\t\t\t$('#customerId').val(data.borrowTransaction.customer.id);\n");
      out.write("\t\t\t\t$('#customer').val(data.borrowTransaction.customer.name);\n");
      out.write("\t\t\t\t$('#borrowDate').val(data.borrowTransaction.borrowDate);\n");
      out.write("\t\t\t\t$('#employeeBorrowId').val(data.borrowTransaction.employee.id);\n");
      out.write("\t\t\t\t$('#employeeBorrow').val(data.borrowTransaction.employee.name);\n");
      out.write("\t\t\t\t$('#dueDate').val(data.dueDate);\n");
      out.write("\t\t\t\t$('#returnDate').val(today);\n");
      out.write("\t\t\t\t$('#fine').val(diffDays);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//submit update\n");
      out.write("\t\t\t$('#submit-update').click(function(){\n");
      out.write("\t\t\t\tvar returnTransaction = {\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tid : id,\n");
      out.write("\t\t\t\t\tfine : $('#fine').val(),\n");
      out.write("\t\t\t\t\tdueDate : $('#dueDate').val(),\n");
      out.write("\t\t\t\t\tborrowTransaction : {\n");
      out.write("\t\t\t\t\t\tid : $('#borrowId').val(),\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\treturnTransaction : {\n");
      out.write("\t\t\t\t\t\treturnDate : $('#returnDate').val(),\n");
      out.write("\t\t\t\t\t\temployee : {\n");
      out.write("\t\t\t\t\t\t\tid : $('#employeeReturn').val()\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t// ajax update\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype: 'PUT',\n");
      out.write("\t\t\t\t\turl: '/rent_history/update',\n");
      out.write("\t\t\t\t\tcontentType: \"application/json\",\n");
      out.write("\t\t\t\t\tdata : JSON.stringify(returnTransaction),\n");
      out.write("\t\t\t\t\tsuccess: function(data) {\n");
      out.write("\t\t\t\t\t\twindow.location = \"/rent_history\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//List Book\n");
      out.write("\t\t\t$('.detail-btn').on('click',function() {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tid = $(this).data('id');\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//ajax retrive data\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype: 'POST',\n");
      out.write("\t\t\t\t\turl: '/rent_history/edit/'+id,\n");
      out.write("\t\t\t\t\tsuccess: function(data) {\n");
      out.write("\t\t\t\t\t\tconsole.log(data.borrowTransaction.bookTransaction[1].book.title);\n");
      out.write("\t\t\t\t\t\t//setFieldDetail(data);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tdataType: 'json'\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#detail-modal').modal();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction setFieldDetail(data){\n");
      out.write("\t\t\t\tfor (var i = 0; i < data.borrowTransaction.bookTransaction.length; i++) {\n");
      out.write("\t\t\t\t\t$('#book['+i+']').val(data.borrowTransaction.bookTransaction[i].book.title);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t<!-- Modal View Books -->\n");
      out.write("\t<div class=\"col-md-12\">\n");
      out.write("\t\t<div class=\"modal fade\"  id=\"detail-modal\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t        <h4 class=\"modal-title\">List Book</h4>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"modal-body\">\n");
      out.write("\t\t        \t<form style=\"margin-top: 3%;\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\" name=\"borrowId\" id=\"borrowId\">\n");
      out.write("\t\t\t\t\t\t    <div class=\"form-group col-md-12\">\n");
      out.write("\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t    \t<label>Book</label>\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"text\" class=\"form-control\" id=\"book[0]\">\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"text\" class=\"form-control\" id=\"book[1]\">\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"text\" class=\"form-control\" id=\"book[2]\">\n");
      out.write("\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  \t<label> </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"modal-footer\">\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t        \t</div>\n");
      out.write("\t        </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -->\n");
      out.write("        </div><!-- /.modal -->\n");
      out.write("   \t</div>\n");
      out.write("   \t\n");
      out.write("\t<!-- Modal Update -->\n");
      out.write("\t<div class=\"col-md-12\">\n");
      out.write("\t\t<div class=\"modal fade\"  id=\"update-modal\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t        <h4 class=\"modal-title\">Return Book</h4>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"modal-body\">\n");
      out.write("\t\t        \t<form style=\"margin-top: 3%;\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\" name=\"borrowId\" id=\"borrowId\">\n");
      out.write("\t\t\t\t\t\t    <div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t    <label>Customer</label>\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"hidden\" class=\"form-control\" name=\"customerId\" id=\"customerId\">\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"customer\" id=\"customer\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t    \t<label>Borrow Date</label>\n");
      out.write("\t\t\t\t\t\t    \t<input type=\"text\" class=\"form-control\" name=\"borrowDate\" id=\"borrowDate\">\n");
      out.write("\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t    \t<label>Employee On Duty</label>\n");
      out.write("\t\t\t\t\t\t    \t<input class=\"form-control\" type=\"hidden\" name=\"employeeBorrowId\" id=\"employeeBorrowId\">\n");
      out.write("\t\t\t\t\t\t    \t<input class=\"form-control\" type=\"text\" name=\"employeeBorrow\" id=\"employeeBorrow\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t    \t<label>Due Date</label>\n");
      out.write("\t\t\t\t\t\t    \t<input type=\"text\" class=\"form-control\" name=\"dueDate\" id=\"dueDate\">\n");
      out.write("\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t    \t<label>Return Date</label>\n");
      out.write("\t\t\t\t\t\t    \t<input type=\"text\" class=\"form-control\" name=\"returnDate\" id=\"returnDate\">\n");
      out.write("\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t    \t<label>Fine</label>\n");
      out.write("\t\t\t\t\t\t    \t<input type=\"text\" class=\"form-control\" name=\"fine\" id=\"fine\">\n");
      out.write("\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t    <label>Employee</label>\n");
      out.write("\t\t\t\t\t\t\t    <select class=\"form-control\" name=\"employeeReturn\" id=\"employeeReturn\">\n");
      out.write("\t\t\t\t\t\t\t    \t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t    </select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  \t<label> </label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"modal-footer\">\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t        \t\t<button type=\"button\" class=\"btn btn-primary\" id=\"submit-update\">Save changes</button>\n");
      out.write("\t\t        </div>\n");
      out.write("\t        </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -->\n");
      out.write("        </div><!-- /.modal -->\n");
      out.write("   \t</div>\n");
      out.write("</body>\n");
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
      // /WEB-INF/jsp/rent-history.jsp(136,25) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("rentHistory");
      // /WEB-INF/jsp/rent-history.jsp(136,25) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/rent-history.jsp(136,25) '${rentHistories }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${rentHistories }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rentHistory.borrowTransaction.customer.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rentHistory.borrowTransaction.borrowDate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rentHistory.dueDate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rentHistory.returnTransaction.returnDate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rentHistory.fine }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t<td style=\"text-align: center;\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success btn-xs detail-btn icon-box\" data-id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rentHistory.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" title=\"View Books\"><span class=\"icons icon-eye\"></span></button>&nbsp;\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-warning btn-xs update-btn icon-box\" data-id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rentHistory.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" title=\"Update\"><span class=\"icons icon-note\"></span></button>&nbsp;\n");
            out.write("\t\t\t\t\t\t\t\t\t</td>\n");
            out.write("\t\t\t\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t\t\t\t");
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
      // /WEB-INF/jsp/rent-history.jsp(371,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("employee");
      // /WEB-INF/jsp/rent-history.jsp(371,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/rent-history.jsp(371,12) '${employees }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${employees }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t    \t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\n");
            out.write("\t\t\t\t\t\t\t\t    ");
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
