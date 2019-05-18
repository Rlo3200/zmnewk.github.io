package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Online Movie Store : Payment</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap3.min.css\">\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write("        button\n");
      out.write("        {\n");
      out.write("            margin-top: 10px;\n");
      out.write("            align-content: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        input\n");
      out.write("        {\n");
      out.write("            margin-top: 10px;\n");
      out.write("            margin-right: 5px;\n");
      out.write("        }\n");
      out.write("                 body\n");
      out.write("         {\n");
      out.write("             background: #c9daf2;\n");
      out.write("         }\n");
      out.write("        h1\n");
      out.write("        {\n");
      out.write("            display: grid;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write(".container\n");
      out.write("        {\n");
      out.write("            display: grid;\n");
      out.write("            margin-top: 5%;\n");
      out.write("            margin-left:30%;\n");
      out.write("            height: 500px;\n");
      out.write("            background-color: aliceblue;\n");
      out.write("            width:40%;\n");
      out.write("            align-content: center;\n");
      out.write("        }\n");
      out.write("        form\n");
      out.write("        {\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("  <h1>Payment</h1>\n");
      out.write("      <form method=\"post\" action=\"Payment_C.jsp\">\n");
      out.write("CardNumber: <input type= \"text\" name=\"Card Number\" value=\"\" minlength=\"1000000000000000\" maxlength=\"16\" required autofocus><br>\n");
      out.write("CVV: <input type=\"text\" name=\"CVV\" value=\"\" size=\"3\" min= \"001\" max=\"999\" maxlength=\"3\" required>\n");
      out.write("Expiry Date: <input  type= \"month\" name=\"Expiry\" value=\"\" size=\"8\" required><br>\n");
      out.write("<button type=\"submit\">SUBMIT</button>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("function myFunction() {\n");
      out.write("    var x = document.getElementById(\"CVV\").id;\n");
      out.write("    document.getElementById(\"demo\").innerHTML = x;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
