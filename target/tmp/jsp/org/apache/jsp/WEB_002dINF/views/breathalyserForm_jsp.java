/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2017-09-14 07:28:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class breathalyserForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("file:/C:/Users/Ewa/.m2/repository/org/springframework/spring-webmvc/4.3.10.RELEASE/spring-webmvc-4.3.10.RELEASE.jar", Long.valueOf(1504799814416L));
    _jspx_dependants.put("file:/C:/Users/Ewa/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1489323363246L));
    _jspx_dependants.put("jar:file:/C:/Users/Ewa/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384364862000L));
    _jspx_dependants.put("jar:file:/C:/Users/Ewa/.m2/repository/org/springframework/spring-webmvc/4.3.10.RELEASE/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1500543606000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>BreathalyserForm</title>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2>Beathalyser Virtual</h2>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/breathalyserForm.jsp(25,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction(".");
    // /WEB-INF/views/breathalyserForm.jsp(25,8) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("breathalyserForm");
    // /WEB-INF/views/breathalyserForm.jsp(25,8) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "form-horizontal");
    // /WEB-INF/views/breathalyserForm.jsp(25,8) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <div class=\"form-group\">\r\n");
          out.write("            <label class=\"control-label col-sm-2\" id=\"gender\" for=\"gender\">Płęć:</label>\r\n");
          out.write("            <div class=\"col-sm-10\">\r\n");
          out.write("                <label class=\"radio-inline\">\r\n");
          out.write("                    <input type=\"radio\" id=\"genderM\" name=\"gender\" path=\"gender\" value=\"Male\">Mężczyzna\r\n");
          out.write("                </label>\r\n");
          out.write("                <label class=\"radio-inline\">\r\n");
          out.write("                    <input type=\"radio\" id=\"genderF\" name=\"gender\" path=\"gender\" value=\"Female\">Kobieta\r\n");
          out.write("                </label>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"form-group\">\r\n");
          out.write("            <label class=\"control-label col-sm-2\" id=\"weightL\" for=\"weight\">Waga:</label>\r\n");
          out.write("            <div class=\"col-sm-10\">\r\n");
          out.write("                <input path=\"weight\" name=\"weight\" id=\"weight\" type=\"number\" min=\"30\" max=\"150\" required/>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"form-group\">\r\n");
          out.write("            <label class=\"control-label col-sm-2\" id=\"heightL\" for=\"height\">Wzrost:</label>\r\n");
          out.write("            <div class=\"col-sm-10\">\r\n");
          out.write("                <input path=\"height\" name=\"height\" id=\"height\" type=\"number\" min=\"110\" max=\"250\" required/>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"form-group\">\r\n");
          out.write("            <label class=\"control-label col-sm-2\" for=\"age\">Wiek:</label>\r\n");
          out.write("            <div class=\"col-sm-10\">\r\n");
          out.write("                <input path=\"age\" id=\"age\" type=\"number\" name=\"age\" min=\"18\" max=\"100\" required>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"form-group\">\r\n");
          out.write("            <label for=\"startDrinking\">Godzina rozpoczęcia:</label>\r\n");
          out.write("            <select class=\"form-control\" path=\"startDrinking\" id=\"startDrinking\" name=\"startDrinking\" >\r\n");
          out.write("                <option value=\"0\">0:00</option>\r\n");
          out.write("                <option value=\"1\">1:00</option>\r\n");
          out.write("                <option value=\"2\">2:00</option>\r\n");
          out.write("                <option value=\"3\">3:00</option>\r\n");
          out.write("                <option value=\"4\">4:00</option>\r\n");
          out.write("                <option value=\"5\">5:00</option>\r\n");
          out.write("                <option value=\"6\">6:00</option>\r\n");
          out.write("                <option value=\"7\">7:00</option>\r\n");
          out.write("                <option value=\"8\">8:00</option>\r\n");
          out.write("                <option value=\"9\">9:00</option>\r\n");
          out.write("                <option value=\"10\">10:00</option>\r\n");
          out.write("                <option value=\"11\">11:00</option>\r\n");
          out.write("                <option value=\"12\">12:00</option>\r\n");
          out.write("                <option value=\"13\">13:00</option>\r\n");
          out.write("                <option value=\"14\">14:00</option>\r\n");
          out.write("                <option value=\"15\">15:00</option>\r\n");
          out.write("                <option value=\"16\">16:00</option>\r\n");
          out.write("                <option value=\"17\">17:00</option>\r\n");
          out.write("                <option value=\"18\">18:00</option>\r\n");
          out.write("                <option value=\"19\">19:00</option>\r\n");
          out.write("                <option value=\"20\">20:00</option>\r\n");
          out.write("                <option value=\"21\">21:00</option>\r\n");
          out.write("                <option value=\"22\">22:00</option>\r\n");
          out.write("                <option value=\"23\">23:00</option>\r\n");
          out.write("            </select>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"form-group\">\r\n");
          out.write("            <label for=\"time\">Czas trwania:</label>\r\n");
          out.write("            <select class=\"form-control\" id=\"time\" name=\"time\" path=\"time\">\r\n");
          out.write("                <option value=\"15\">15 minut</option>\r\n");
          out.write("                <option value=\"30\">30 minut</option>\r\n");
          out.write("                <option value=\"60\">1 godzin</option>\r\n");
          out.write("                <option value=\"120\">2 godzin</option>\r\n");
          out.write("                <option value=\"180\">3 godzin</option>\r\n");
          out.write("                <option value=\"240\">4 godzin</option>\r\n");
          out.write("                <option value=\"300\">5 godzin</option>\r\n");
          out.write("                <option value=\"360\">6 godzin</option>\r\n");
          out.write("                <option value=\"420\">7 godzin</option>\r\n");
          out.write("                <option value=\"480\">8 godzin</option>\r\n");
          out.write("                <option value=\"720\">dłużej</option>\r\n");
          out.write("            </select>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"row\">\r\n");
          out.write("            <div class=\"col-xs-6 col-sm-3\">\r\n");
          out.write("                ");
          out.write("<label for=\"quantity\">Ilość<i>[szt.]</i></label>\r\n");
          out.write("            </div>\r\n");
          out.write("            <div class=\"col-xs-6 col-sm-3\">\r\n");
          out.write("                ");
          out.write("<label for=\"typ\">Typ alkoholu</label>\r\n");
          out.write("            </div>\r\n");
          out.write("            <div class=\"col-xs-6 col-sm-3\">\r\n");
          out.write("                ");
          out.write("<label for=\"procent\">Zawartość<i>[%]</i></label>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"row\">\r\n");
          out.write("            <div class=\"col-xs-6 col-sm-3\">\r\n");
          out.write("                <select class=\"form-control\" name=\"quantity\" id=\"quantity\" path=\"quantity\">\r\n");
          out.write("                    <option value=\"1\">1</option>\r\n");
          out.write("                    <option value=\"2\">2</option>\r\n");
          out.write("                    <option value=\"3\">3</option>\r\n");
          out.write("                    <option value=\"4\">4</option>\r\n");
          out.write("                    <option value=\"5\">5</option>\r\n");
          out.write("                    <option value=\"6\">6</option>\r\n");
          out.write("                    <option value=\"7\">7</option>\r\n");
          out.write("                    <option value=\"8\">8</option>\r\n");
          out.write("                    <option value=\"9\">9</option>\r\n");
          out.write("                    <option value=\"10\">10</option>\r\n");
          out.write("                    <option value=\"11\">11</option>\r\n");
          out.write("                    <option value=\"12\">12</option>\r\n");
          out.write("                    <option value=\"13\">13</option>\r\n");
          out.write("                    <option value=\"14\">14</option>\r\n");
          out.write("                    <option value=\"15\">15</option>\r\n");
          out.write("                </select>\r\n");
          out.write("            </div>\r\n");
          out.write("            <div class=\"col-xs-6 col-sm-3\">\r\n");
          out.write("                <select name=\"typ\" id=\"typ\" class=\"form-control\" path=\"typ\">\r\n");
          out.write("                    <option value=\"330\">Małe piwo (0,33)</option>\r\n");
          out.write("                    <option value=\"500\">Duże piwo (0,5)</option>\r\n");
          out.write("                    <option value=\"50\">50ml kieluszek wódki</option>\r\n");
          out.write("                    <option value=\"100\">100ml kieluszek wódki</option>\r\n");
          out.write("                    <option value=\"200\">Lampka wina</option>\r\n");
          out.write("                    <option value=\"750\">Butelka wina</option>\r\n");
          out.write("                    <option value=\"25\">Mały drink</option>\r\n");
          out.write("                    <option value=\"50\">Duży drink</option>\r\n");
          out.write("                </select>\r\n");
          out.write("            </div>\r\n");
          out.write("            <div class=\"col-xs-6 col-sm-3\">\r\n");
          out.write("                <input path=\"procent\" name=\"procent\" type=\"number\" id=\"procent\" min=\"0\" max=\"100\">\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("\r\n");
          out.write("        <br>\r\n");
          out.write("\r\n");
          out.write("        <div class=\"form-group\">\r\n");
          out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
          out.write("                <button type=\"submit\" class=\"btn btn-default\" name=\"submit\">Oblicz</button>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
