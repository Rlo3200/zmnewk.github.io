package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Online Movie Store</title>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"login.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<body class=\"text-center\">\n");
      out.write("    <form class=\"form-signin\">\n");
      out.write("  <img class=\"mb-4\" src=\"cinema.png\" alt=\"\" width=\"75\" height=\"75\">\n");
      out.write("  <h1 class=\"h3 mb-3 font-weight-normal\">Please sign in</h1>\n");
      out.write("  <label for=\"inputEmail\" class=\"sr-only\">Email address</label>\n");
      out.write("  <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\n");
      out.write("  <label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("  <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("  <div class=\"checkbox mb-3\">\n");
      out.write("    <label>\n");
      out.write("      <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <a href=\"database.jsp\" class=\"btn btn-secondary my-2\">Login</a>\n");
      out.write("  <p class=\"mt-5 mb-3 text-muted\">&copy; 2019</p>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
