package org.apache.jsp.cd;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_ok_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/cd/../menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<ul class=\"menu\">\r\n");
      out.write("\t<li><a href=\"menu.jsp\">Menu</a></li>\r\n");
      out.write("\t<li><a href=\"usuario.lista.logic\">Lista de Usuários</a></li>\r\n");
      out.write("\t<li><a href=\"usuario.formulario.logic\">Novo Usuário</a></li>\r\n");
      out.write("\t<li><a href=\"cd.formulario.logic\">Novo Cd</a></li>\r\n");
      out.write("\t<li><a href=\"cd.lista.logic\">Lista CDs</a></li>\r\n");
      out.write("\t<li><a href=\"musica.lista.logic\">Lista de Musicas</a></li>\r\n");
      out.write("\t<li><a href=\"musica.formulario.logic\">Nova Musica</a></li>\r\n");
      out.write("\t<li><a href=\"admin.logout.logic\">Logout</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("<title>Cadastra CD</title>\r\n");
      out.write("  <script src=\"../javascripts/valida_cd.js\"> </script>\r\n");
      out.write("   <script type=\"text/javascript\"> \r\n");
      out.write("</head>\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <ul id=\"errors\">\r\n");
      out.write(" \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </ul>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" ref=\"css/style.css\"/>\r\n");
      out.write("\t<h1>Cadastro de Cd</h1>\r\n");
      out.write("\t<form action=\"cd.armazena.logic\" method=\"post\" onSubmit=\"return validaForm();\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"cd.id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cd.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\tTitulo:<br>\r\n");
      out.write("\t\t<input type=\"text\" name=\"cd.titulo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cd.titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"cd_titulo\"/><br>\r\n");
      out.write("\t\tArtista:<br>\r\n");
      out.write("\t\t<input type=\"text\" name=\"cd.artista\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cd.artista}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/><br>\r\n");
      out.write("\t\tGenero:<br>\r\n");
      out.write("\t\t<input type=\"text\" name=\"cd.genero\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cd.genero}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/><br>\r\n");
      out.write("\t\t\r\n");
      out.write("        <input type=\"submit\" value=\"Cadastrar\" onclick=\"recarrega();\">  \r\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /cd/formulario.ok.jsp(15,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("error");
    // /cd/formulario.ok.jsp(15,2) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errors.iterator}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write(" \t\t<li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write(" \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
