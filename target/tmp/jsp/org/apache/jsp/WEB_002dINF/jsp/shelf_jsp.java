/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.6.v20170531
 * Generated at: 2017-11-03 02:56:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shelf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Library MASA Shelf Entry</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"/assets/bootstrap-4.0.0-beta.2/dist/css/bootstrap.min.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\" id=\"container\">\n");
      out.write("\t\t");

			/* List<Shelf> shelfs = //(List)request.getAttribute("shelfs");		
			for(Shelf shelf: shelfs){
				out.println("name : "+ shelf.getName());
			} */
		
      out.write("\n");
      out.write("\t\t<table class=\"table table-sm table-striped table-bordered table-hover\">\n");
      out.write("\t\t\t<thead class=\"thead-dark\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>Category</th>\n");
      out.write("\t\t\t\t\t<th>Sub-category</th>\n");
      out.write("\t\t\t\t\t<th>Section</th>\n");
      out.write("\t\t\t\t\t<th>Action</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\n");
      out.write("\t\t<form action=\"shelf/save\" method=\"POST\">\n");
      out.write("\t\t\t<h2>Shelf Entry</h2>\n");
      out.write("\t\t\t<div class=\"form-group row\">\n");
      out.write("\t\t\t\t<label class=\"control-label col-sm-2\" for=\"category\">Category :</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"category\" placeholder=\" \"\n");
      out.write("\t\t\t\t\t\tname=\"category\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group row\">\n");
      out.write("\t\t\t\t<label class=\"control-label col-sm-2\" for=\"subcategory\">Sub-category :</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"subcategory\" placeholder=\" \"\n");
      out.write("\t\t\t\t\t\tname=\"subcategory\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group row\">\n");
      out.write("\t\t\t\t<label class=\"control-label col-sm-2\" for=\"section\">Section\n");
      out.write("\t\t\t\t\t:</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"section\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\" \" name=\"section\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\" name=\"submit\"\n");
      out.write("\t\t\t\t\t\tvalue=\"save\">Submit</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"/assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"/assets/bootstrap-4.0.0-beta.2/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tvar id = 0;\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t\t$('.update-btn').on('click', function() {\n");
      out.write("\n");
      out.write("\t\t\t\t//ambil data dari server => ajax\n");
      out.write("\t\t\t\tid = $(this).attr('id');\n");
      out.write("\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\t\turl : 'shelf/edit/' + id,\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\tconsole.log(JSON.stringify(data));\n");
      out.write("\t\t\t\t\t\t_setFieldUpdateModal(data);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tdataType : 'json'\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t$('#updateModal').modal();\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\tfunction _setFieldUpdateModal(data) {\n");
      out.write("\t\t\t\t$('#modcategory').val(data.category);\n");
      out.write("\t\t\t\t$('#modsubcategory').val(data.subcategory);\n");
      out.write("\t\t\t\t$('#modsection').val(data.section);\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t//event submit data for update\n");
      out.write("\t\t\t$('#submit-update').click(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t//Object ala js\n");
      out.write("\t\t\t\tvar Shelf = {\n");
      out.write("\t\t\t\t\tid : id,\n");
      out.write("\t\t\t\t\tcategory : $('#modcategory').val(),\n");
      out.write("\t\t\t\t\tsubcategory : $('#modsubcategory').val(),\n");
      out.write("\t\t\t\t\tsection : $('#modsection').val(),\n");
      out.write("\t\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\t\t//ajax update\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype : 'PUT',\n");
      out.write("\t\t\t\t\turl : 'shelf/update',\n");
      out.write("\t\t\t\t\tcontentType : \"application/json\",\n");
      out.write("\t\t\t\t\tdata : JSON.stringify(Shelf),\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\twindow.location = \"/shelf\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t//delete\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t\t$('.delete-btn').on('click', function() {\n");
      out.write("\n");
      out.write("\t\t\t\tid = $(this).data('id');\n");
      out.write("\t\t\t\t$('#deleteModal').modal(id);\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$('#submit-delete').click(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype : 'DELETE',\n");
      out.write("\t\t\t\t\turl : 'shelf/delete/' + id,\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\twindow.location = \"/shelf\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<div class=\"modal fade\" id=\"updateModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">Update\n");
      out.write("\t\t\t\t\t\tConfirmation</h5>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"modcategory\">Category</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"modcategory\" name=\"modcategory\" placeholder=\" \">\n");
      out.write("\t\t\t\t\t\t\t<!-- <small id=\"nameHelp\" class=\"form-text text-muted\">Silahkan anda mengisi nama dengan benar</small> -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"modsubcategory\">Sub-category</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"modsubcategory\" name=\"modsubcategory\" placeholder=\" \">\n");
      out.write("\t\t\t\t\t\t\t<!-- <small id=\"nameHelp\" class=\"form-text text-muted\">Silahkan anda mengisi nama dengan benar</small> -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"modsection\">Section</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"modsection\" name=\"modsection\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\" \">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"submit-update\">Update</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"modal fade\" id=\"deleteModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">Delete\n");
      out.write("\t\t\t\t\t\tConfirmation</h5>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">Are you sure?</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">Cancel</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"submit-delete\">Delete</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
      // /WEB-INF/jsp/shelf.jsp(31,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("shelf");
      // /WEB-INF/jsp/shelf.jsp(31,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/shelf.jsp(31,4) '${shelfs }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${shelfs }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shelf.category }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shelf.subcategory }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shelf.section }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td><a data-id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shelf.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\tclass=\"btn btn-outline-danger delete-btn\">Delete</a> <a\n");
            out.write("\t\t\t\t\t\t\tid=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shelf.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"btn btn-outline-warning update-btn\">Update</a></td>\n");
            out.write("\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t");
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
}