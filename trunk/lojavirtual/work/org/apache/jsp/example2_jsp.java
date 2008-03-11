package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class example2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/menus-taglib.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fselFntColor_005fselBckColor_005fname_005fi_005ffntface_005ffntSize_005ffntColor_005fd_005fcolWidth_005fborderSize_005fborderColor_005fbckColor_005farrow2_005farrow1;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fd_005fborderSize_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fbckColor_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fname_005fisVertical;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fselFntColor_005fselBckColor_005fname_005fi_005ffntface_005ffntSize_005ffntColor_005fd_005fcolWidth_005fborderSize_005fborderColor_005fbckColor_005farrow2_005farrow1 = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fd_005fborderSize_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fbckColor_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fname_005fisVertical = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1 = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fselFntColor_005fselBckColor_005fname_005fi_005ffntface_005ffntSize_005ffntColor_005fd_005fcolWidth_005fborderSize_005fborderColor_005fbckColor_005farrow2_005farrow1.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fd_005fborderSize_005fborderColor.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fbckColor_005fnobody.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fname_005fisVertical.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1.release();
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fnobody.release();
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
      response.setContentType("text/html");
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
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>Orange free navigation LIB</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FF6600\">\r\n");
      if (_jspx_meth_menu_005fddmenu_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_menu_005fddmenu_005f11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<table border=\"0\" width=\"760\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"150\" bordercolor=\"#FF6600\" bgcolor=\"#FF6600\" valign=\"top\">\r\n");
      out.write("      <h1><i><font color=\"#FFFFFF\">O'range's free JSP navigation lib.</font></i></h1>\r\n");
      out.write("      <p><font color=\"#FFFFFF\"><b>Features:</b></font></p>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><font color=\"#FFFFFF\"><i>Extra wide browser support : NS4.05+ IE4+\r\n");
      out.write("          NS6+ Opera5+ Mozilla0.9+</i></font></li>\r\n");
      out.write("        <li><font color=\"#FFFFFF\"><i>Vertical\\ horisontal alignment</i></font></li>\r\n");
      out.write("        <li><font color=\"#FFFFFF\"><i>each menu item can be independently\r\n");
      out.write("          configured</i></font></li>\r\n");
      out.write("        <li><font color=\"#FFFFFF\"><i>menu item icons and folder arrows&nbsp;\r\n");
      out.write("          rollower effect</i></font></li>\r\n");
      out.write("        <li><font color=\"#FFFFFF\"><i>Frame targeting and javascript: URL support</i></font></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"60\" bgcolor=\"#FF6600\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"100\" bgcolor=\"#ffffff\">&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("    <td width=\"450\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("<div align=\"right\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\" bgcolor=\"#808080\" cellspacing=\"0\" cellpadding=\"0\" height=\"50\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"bottom\" height=\"0\"><h3 align=\"right\"><font color=\"#FFFFFF\">Horisontal alignment</font></h3>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<p align=\"right\">&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("<p>This is menu example with default config. See the code below:</p>\r\n");
      out.write("\r\n");
      out.write("<table border=\"0\" width=\"100%\" bgcolor=\"#C0C0C0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"100%\">&lt;%@page contentType=&quot;text/html&quot;%&gt;<br>\r\n");
      out.write("    &lt;%@ taglib uri=&quot;menus-taglib.tld&quot; prefix=&quot;menu&quot; %&gt;<br>\r\n");
      out.write("    &lt;html&gt;<br>\r\n");
      out.write("    <br>\r\n");
      out.write("    &lt;head&gt;<br>\r\n");
      out.write("    &lt;meta http-equiv=&quot;Content-Language&quot; content=&quot;en-us&quot;&gt;<br>\r\n");
      out.write("    &lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html;\r\n");
      out.write("    charset=windows-1252&quot;&gt;<br>\r\n");
      out.write("    &lt;title&gt;Orange free navigation LIB&lt;/title&gt;<br>\r\n");
      out.write("    &lt;/head&gt;<br>\r\n");
      out.write("    <br>\r\n");
      out.write("    &lt;body bgcolor=&quot;#FF6600&quot;&gt;<p>&lt;menu:ddmenu name=&quot;first&quot;\r\n");
      out.write("    x=&quot;460&quot; y=&quot;150&quot; isVertical=&quot;false&quot;&gt;<br>\r\n");
      out.write("    &lt;menu:ddmenu text=&quot;About&quot; link=&quot;green.htm&quot;\r\n");
      out.write("    icon1=&quot;doc.gif&quot; icon2=&quot;doc1.gif&quot;/&gt;<br>\r\n");
      out.write("    &lt;menu:ddmenu text=&quot;Examples&quot; link=&quot;green.htm&quot;\r\n");
      out.write("    icon1=&quot;fold.gif&quot; icon2=&quot;fold1.gif&quot;&gt;<br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp; &lt;menu:ddmenu text=&quot;default configuration&quot;\r\n");
      out.write("    link=&quot;example1.jsp&quot; colWidth=&quot;140&quot;/&gt;<br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp; &lt;menu:ddmenu text=&quot;Horisontal alignment&quot;\r\n");
      out.write("    link=&quot;green.htm&quot;/&gt;<br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp; &lt;menu:ddmenu text=&quot;Vertical alignment&quot;\r\n");
      out.write("    link=&quot;green.htm&quot;/&gt;<br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp; &lt;menu:ddmenu text=&quot;muliple menus&quot;\r\n");
      out.write("    link=&quot;green.htm&quot;/&gt;<br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp; &lt;menu:ddmenu text=&quot;different colors&quot;\r\n");
      out.write("    link=&quot;green.htm&quot;/&gt;<br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp; &lt;menu:ddmenu text=&quot;image menu&quot;\r\n");
      out.write("    link=&quot;green.htm&quot;/&gt;<br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp; <br>\r\n");
      out.write("    &lt;/menu:ddmenu&gt;<br>\r\n");
      out.write("    &lt;menu:ddmenu text=&quot;Installation&quot; link=&quot;green.htm&quot;\r\n");
      out.write("    icon1=&quot;doc.gif&quot; icon2=&quot;doc1.gif&quot;/&gt;<br>\r\n");
      out.write("    &lt;menu:ddmenu text=&quot;Configuration&quot; link=&quot;green.htm&quot;\r\n");
      out.write("    icon1=&quot;doc.gif&quot; icon2=&quot;doc1.gif&quot;/&gt;<br>\r\n");
      out.write("    &lt;menu:ddmenu text=&quot;Feedback&quot; link=&quot;green.htm&quot;\r\n");
      out.write("    icon1=&quot;doc.gif&quot; icon2=&quot;doc1.gif&quot;/&gt;<br>\r\n");
      out.write("    &lt;menu:ddmenu text=&quot;Orange&quot; link=&quot;green.htm&quot;/&gt;<br>\r\n");
      out.write("    &lt;/menu:ddmenu&gt;</p>\r\n");
      out.write("    <p>&lt;/body&gt;<br>\r\n");
      out.write("    <br>\r\n");
      out.write("    &lt;/html&gt;</p>\r\n");
      out.write("    <p>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p align=\"center\"><font color=\"#FFFFFF\"><i><u>O'range 2002</u></i></font></p>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_menu_005fddmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f0 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fselFntColor_005fselBckColor_005fname_005fi_005ffntface_005ffntSize_005ffntColor_005fd_005fcolWidth_005fborderSize_005fborderColor_005fbckColor_005farrow2_005farrow1.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f0.setParent(null);
    // /example2.jsp(12,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setName("second");
    // /example2.jsp(12,0) name = bckColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setBckColor("#606060");
    // /example2.jsp(12,0) name = selBckColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setSelBckColor("#a0a0a0");
    // /example2.jsp(12,0) name = x type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setX("160");
    // /example2.jsp(12,0) name = y type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setY("80");
    // /example2.jsp(12,0) name = colWidth type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setColWidth("125");
    // /example2.jsp(12,0) name = fntSize type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setFntSize("3");
    // /example2.jsp(12,0) name = i type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setI("true");
    // /example2.jsp(12,0) name = d type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setD("10");
    // /example2.jsp(12,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setBorderColor("transparent");
    // /example2.jsp(12,0) name = borderSize type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setBorderSize("0");
    // /example2.jsp(12,0) name = arrow1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setArrow1("list-img0.gif");
    // /example2.jsp(12,0) name = arrow2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setArrow2("list-img1.gif");
    // /example2.jsp(12,0) name = fntColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setFntColor("#ffffe0");
    // /example2.jsp(12,0) name = selFntColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setSelFntColor("#201500");
    // /example2.jsp(12,0) name = fntface type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f0.setFntface("Helvetica");
    int _jspx_eval_menu_005fddmenu_005f0 = _jspx_th_menu_005fddmenu_005f0.doStartTag();
    if (_jspx_eval_menu_005fddmenu_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_menu_005fddmenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_menu_005fddmenu_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_menu_005fddmenu_005f0.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f1(_jspx_th_menu_005fddmenu_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f2(_jspx_th_menu_005fddmenu_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f7(_jspx_th_menu_005fddmenu_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f8(_jspx_th_menu_005fddmenu_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f9(_jspx_th_menu_005fddmenu_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f10(_jspx_th_menu_005fddmenu_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_menu_005fddmenu_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_menu_005fddmenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_menu_005fddmenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fselFntColor_005fselBckColor_005fname_005fi_005ffntface_005ffntSize_005ffntColor_005fd_005fcolWidth_005fborderSize_005fborderColor_005fbckColor_005farrow2_005farrow1.reuse(_jspx_th_menu_005fddmenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fselFntColor_005fselBckColor_005fname_005fi_005ffntface_005ffntSize_005ffntColor_005fd_005fcolWidth_005fborderSize_005fborderColor_005fbckColor_005farrow2_005farrow1.reuse(_jspx_th_menu_005fddmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f1 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f1.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f0);
    // /example2.jsp(13,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f1.setText("About");
    // /example2.jsp(13,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f1.setLink("index.jsp");
    // /example2.jsp(13,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f1.setIcon1("doc.gif");
    // /example2.jsp(13,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f1.setIcon2("doc1.gif");
    int _jspx_eval_menu_005fddmenu_005f1 = _jspx_th_menu_005fddmenu_005f1.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f1);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f2 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fd_005fborderSize_005fborderColor.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f2.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f0);
    // /example2.jsp(14,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f2.setText("Examples");
    // /example2.jsp(14,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f2.setLink("");
    // /example2.jsp(14,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f2.setIcon1("fold.gif");
    // /example2.jsp(14,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f2.setIcon2("fold1.gif");
    // /example2.jsp(14,0) name = borderSize type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f2.setBorderSize("1");
    // /example2.jsp(14,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f2.setBorderColor("#404040");
    // /example2.jsp(14,0) name = d type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f2.setD("1");
    int _jspx_eval_menu_005fddmenu_005f2 = _jspx_th_menu_005fddmenu_005f2.doStartTag();
    if (_jspx_eval_menu_005fddmenu_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_menu_005fddmenu_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_menu_005fddmenu_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_menu_005fddmenu_005f2.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f3(_jspx_th_menu_005fddmenu_005f2, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f4(_jspx_th_menu_005fddmenu_005f2, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f5(_jspx_th_menu_005fddmenu_005f2, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f6(_jspx_th_menu_005fddmenu_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\r\n");
        int evalDoAfterBody = _jspx_th_menu_005fddmenu_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_menu_005fddmenu_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_menu_005fddmenu_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fd_005fborderSize_005fborderColor.reuse(_jspx_th_menu_005fddmenu_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fd_005fborderSize_005fborderColor.reuse(_jspx_th_menu_005fddmenu_005f2);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f3 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fbckColor_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f3.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f2);
    // /example2.jsp(15,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f3.setText("default configuration");
    // /example2.jsp(15,1) name = bckColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f3.setBckColor("#ff9000");
    // /example2.jsp(15,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f3.setLink("example1.jsp");
    // /example2.jsp(15,1) name = colWidth type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f3.setColWidth("180");
    int _jspx_eval_menu_005fddmenu_005f3 = _jspx_th_menu_005fddmenu_005f3.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f3);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f4 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f4.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f2);
    // /example2.jsp(16,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f4.setText("Horisontal alignment");
    // /example2.jsp(16,1) name = bckColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f4.setBckColor("#ff9020");
    // /example2.jsp(16,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f4.setLink("example2.jsp");
    int _jspx_eval_menu_005fddmenu_005f4 = _jspx_th_menu_005fddmenu_005f4.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f4);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f5 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f5.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f2);
    // /example2.jsp(17,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f5.setText("different colors");
    // /example2.jsp(17,1) name = bckColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f5.setBckColor("#ff9040");
    // /example2.jsp(17,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f5.setLink("example3.jsp");
    int _jspx_eval_menu_005fddmenu_005f5 = _jspx_th_menu_005fddmenu_005f5.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f5);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f6 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f6.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f2);
    // /example2.jsp(18,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f6.setText("image menu");
    // /example2.jsp(18,1) name = bckColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f6.setBckColor("#ff9060");
    // /example2.jsp(18,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f6.setLink("example4.jsp");
    int _jspx_eval_menu_005fddmenu_005f6 = _jspx_th_menu_005fddmenu_005f6.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fbckColor_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f6);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f7 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f7.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f0);
    // /example2.jsp(21,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f7.setText("Installation");
    // /example2.jsp(21,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f7.setLink("install.jsp");
    // /example2.jsp(21,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f7.setIcon1("doc.gif");
    // /example2.jsp(21,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f7.setIcon2("doc1.gif");
    int _jspx_eval_menu_005fddmenu_005f7 = _jspx_th_menu_005fddmenu_005f7.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f7);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f8 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f8.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f0);
    // /example2.jsp(22,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f8.setText("Configuration");
    // /example2.jsp(22,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f8.setLink("config.jsp");
    // /example2.jsp(22,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f8.setIcon1("doc.gif");
    // /example2.jsp(22,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f8.setIcon2("doc1.gif");
    int _jspx_eval_menu_005fddmenu_005f8 = _jspx_th_menu_005fddmenu_005f8.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f8);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f9 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f9.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f0);
    // /example2.jsp(23,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f9.setText("Feedback");
    // /example2.jsp(23,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f9.setLink("mailto:ilya@iep.uran.ru");
    // /example2.jsp(23,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f9.setIcon1("doc.gif");
    // /example2.jsp(23,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f9.setIcon2("doc1.gif");
    int _jspx_eval_menu_005fddmenu_005f9 = _jspx_th_menu_005fddmenu_005f9.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f9);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f10 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f10.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f0);
    // /example2.jsp(24,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f10.setText("Orange");
    // /example2.jsp(24,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f10.setLink("http://javer.narod.ru");
    int _jspx_eval_menu_005fddmenu_005f10 = _jspx_th_menu_005fddmenu_005f10.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f10);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f11 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fname_005fisVertical.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f11.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f11.setParent(null);
    // /example2.jsp(27,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f11.setName("first");
    // /example2.jsp(27,0) name = x type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f11.setX("340");
    // /example2.jsp(27,0) name = y type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f11.setY("80");
    // /example2.jsp(27,0) name = isVertical type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f11.setIsVertical("false");
    int _jspx_eval_menu_005fddmenu_005f11 = _jspx_th_menu_005fddmenu_005f11.doStartTag();
    if (_jspx_eval_menu_005fddmenu_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_menu_005fddmenu_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_menu_005fddmenu_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_menu_005fddmenu_005f11.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f12(_jspx_th_menu_005fddmenu_005f11, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f13(_jspx_th_menu_005fddmenu_005f11, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f20(_jspx_th_menu_005fddmenu_005f11, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_menu_005fddmenu_005f21(_jspx_th_menu_005fddmenu_005f11, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_menu_005fddmenu_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_menu_005fddmenu_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_menu_005fddmenu_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fname_005fisVertical.reuse(_jspx_th_menu_005fddmenu_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005fy_005fx_005fname_005fisVertical.reuse(_jspx_th_menu_005fddmenu_005f11);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f12 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f12.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f11);
    // /example2.jsp(28,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f12.setText("About");
    // /example2.jsp(28,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f12.setLink("green.htm");
    // /example2.jsp(28,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f12.setIcon1("doc.gif");
    // /example2.jsp(28,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f12.setIcon2("doc1.gif");
    int _jspx_eval_menu_005fddmenu_005f12 = _jspx_th_menu_005fddmenu_005f12.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f12);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f13 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f13.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f11);
    // /example2.jsp(29,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f13.setText("Examples");
    // /example2.jsp(29,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f13.setLink("green.htm");
    // /example2.jsp(29,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f13.setIcon1("fold.gif");
    // /example2.jsp(29,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f13.setIcon2("fold1.gif");
    int _jspx_eval_menu_005fddmenu_005f13 = _jspx_th_menu_005fddmenu_005f13.doStartTag();
    if (_jspx_eval_menu_005fddmenu_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_menu_005fddmenu_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_menu_005fddmenu_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_menu_005fddmenu_005f13.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f14(_jspx_th_menu_005fddmenu_005f13, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f15(_jspx_th_menu_005fddmenu_005f13, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f16(_jspx_th_menu_005fddmenu_005f13, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f17(_jspx_th_menu_005fddmenu_005f13, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f18(_jspx_th_menu_005fddmenu_005f13, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_menu_005fddmenu_005f19(_jspx_th_menu_005fddmenu_005f13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\r\n");
        int evalDoAfterBody = _jspx_th_menu_005fddmenu_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_menu_005fddmenu_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_menu_005fddmenu_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1.reuse(_jspx_th_menu_005fddmenu_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1.reuse(_jspx_th_menu_005fddmenu_005f13);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f14 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f14.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f13);
    // /example2.jsp(30,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f14.setText("default configuration");
    // /example2.jsp(30,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f14.setLink("example1.jsp");
    // /example2.jsp(30,1) name = colWidth type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f14.setColWidth("140");
    int _jspx_eval_menu_005fddmenu_005f14 = _jspx_th_menu_005fddmenu_005f14.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fcolWidth_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f14);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f15 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f15.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f13);
    // /example2.jsp(31,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f15.setText("Horisontal alignment");
    // /example2.jsp(31,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f15.setLink("green.htm");
    int _jspx_eval_menu_005fddmenu_005f15 = _jspx_th_menu_005fddmenu_005f15.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f15);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f16 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f16.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f13);
    // /example2.jsp(32,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f16.setText("Vertical alignment");
    // /example2.jsp(32,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f16.setLink("green.htm");
    int _jspx_eval_menu_005fddmenu_005f16 = _jspx_th_menu_005fddmenu_005f16.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f16);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f17 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f17.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f13);
    // /example2.jsp(33,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f17.setText("muliple menus");
    // /example2.jsp(33,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f17.setLink("green.htm");
    int _jspx_eval_menu_005fddmenu_005f17 = _jspx_th_menu_005fddmenu_005f17.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f17);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f18 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f18.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f13);
    // /example2.jsp(34,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f18.setText("different colors");
    // /example2.jsp(34,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f18.setLink("green.htm");
    int _jspx_eval_menu_005fddmenu_005f18 = _jspx_th_menu_005fddmenu_005f18.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f18);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f19 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f19.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f13);
    // /example2.jsp(35,1) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f19.setText("image menu");
    // /example2.jsp(35,1) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f19.setLink("green.htm");
    int _jspx_eval_menu_005fddmenu_005f19 = _jspx_th_menu_005fddmenu_005f19.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f19);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f20 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f20.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f11);
    // /example2.jsp(38,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f20.setText("Installation");
    // /example2.jsp(38,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f20.setLink("green.htm");
    // /example2.jsp(38,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f20.setIcon1("doc.gif");
    // /example2.jsp(38,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f20.setIcon2("doc1.gif");
    int _jspx_eval_menu_005fddmenu_005f20 = _jspx_th_menu_005fddmenu_005f20.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f20);
    return false;
  }

  private boolean _jspx_meth_menu_005fddmenu_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_005fddmenu_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:ddmenu
    com.orange.tags.Menu _jspx_th_menu_005fddmenu_005f21 = (com.orange.tags.Menu) _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.get(com.orange.tags.Menu.class);
    _jspx_th_menu_005fddmenu_005f21.setPageContext(_jspx_page_context);
    _jspx_th_menu_005fddmenu_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_005fddmenu_005f11);
    // /example2.jsp(39,0) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f21.setText("Configuration");
    // /example2.jsp(39,0) name = link type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f21.setLink("green.htm");
    // /example2.jsp(39,0) name = icon1 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f21.setIcon1("doc.gif");
    // /example2.jsp(39,0) name = icon2 type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_menu_005fddmenu_005f21.setIcon2("doc1.gif");
    int _jspx_eval_menu_005fddmenu_005f21 = _jspx_th_menu_005fddmenu_005f21.doStartTag();
    if (_jspx_th_menu_005fddmenu_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fmenu_005fddmenu_005ftext_005flink_005ficon2_005ficon1_005fnobody.reuse(_jspx_th_menu_005fddmenu_005f21);
    return false;
  }
}
