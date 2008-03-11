package org.apache.jsp.usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_ok_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/usuario/../menu.jsp");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("<title>Cadastro de Usuários</title>\n");
      out.write("</head>\r\n");
      out.write("\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    ");
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" ref=\"css/style.css\"/>\r\n");
      out.write("\t<h1>Cadastro de usuarios</h1>\r\n");
      out.write("\t<form action=\"usuario.adiciona.logic\">\r\n");
      out.write("\t\tLogin :<input type=\"text\" name=\"usuario.login\"/> <br/>\r\n");
      out.write("\t\tSenha :<input type=\"text\" name=\"usuario.senha\"/> <br/>\r\n");
      out.write("\t\t<input type=\"submit\"/>\r\n");
      out.write("  \t</form>\r\n");
      out.write("\t\t\n");
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
}
