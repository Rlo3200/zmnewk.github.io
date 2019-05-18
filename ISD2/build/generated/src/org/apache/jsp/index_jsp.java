package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import uts.isd.controller.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("\t\t.form-control {\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  max-width: 330px;\n");
      out.write("  margin: auto;\n");
      out.write("  padding: 0.375rem 0.75rem;\n");
      out.write("  font-size: 1rem;\n");
      out.write("  line-height: 1.5;\n");
      out.write("  color: #495057;\n");
      out.write("  background-color: #fff;\n");
      out.write("  background-clip: padding-box;\n");
      out.write("  border: 1px solid #ced4da;\n");
      out.write("  border-radius: 0.25rem;\n");
      out.write("  transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground: #c9daf2;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<main role=\"main\">\n");
      out.write("\n");
      out.write("  <section class=\"jumbotron text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <img class=\"mb-4\" src=\"cinema.png\" alt=\"\" width=\"100\" height=\"100\">\n");
      out.write("      <h1 class=\"jumbotron-heading\">Online Movie Store</h1>\n");
      out.write("      <p class=\"lead text-muted\">Hub for movie lovers! Buy and watch a vast range of movies that is constantly updated. View the library or register an account now!</p>\n");
      out.write("      <p>\n");
      out.write("        <a href=\"login.html\" class=\"btn btn-primary my-2\">Login</a>\n");
      out.write("        <a href=\"https://zmnewk.github.io/database.html\" class=\"btn btn-secondary my-2\">View Library</a>\n");
      out.write("      </p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </main>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"text-center\">\n");
      out.write("  <br />\n");
      out.write("<div>\n");
      out.write("<h1 class=\"jumbotron-heading\">Create an Account</h1>\n");
      out.write("<form>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write("  <label for=\"exampleInputPassword1\">Gender</label>\n");
      out.write("  <br />\n");
      out.write("<div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio1\" value=\"Female\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio1\">Female</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"Male\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio2\">Male</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio1\" value=\"Other\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio1\">Other</label>\n");
      out.write("</div>\n");
      out.write("<br /><br />\n");
      out.write("  <a location.href = 'database.jsp' class=\"btn btn-secondary my-2\">Submit</a>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<br /><br />\n");
      out.write("<!-- The core Firebase JS SDK is always required and must be listed first -->\n");
      out.write("<script src=\"https://www.gstatic.com/firebasejs/5.11.1/firebase-app.js\"></script>\n");
      out.write("\n");
      out.write("<!-- TODO: Add SDKs for Firebase products that you want to use\n");
      out.write("     https://firebase.google.com/docs/web/setup#config-web-app -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  // Your web app's Firebase configuration\n");
      out.write("  var firebaseConfig = {\n");
      out.write("    apiKey: \"AIzaSyCWHXERezjawFL3qiQZU-lYdSLQYtwR9J4\",\n");
      out.write("    authDomain: \"isd-project-2.firebaseapp.com\",\n");
      out.write("    databaseURL: \"https://isd-project-2.firebaseio.com\",\n");
      out.write("    projectId: \"isd-project-2\",\n");
      out.write("    storageBucket: \"isd-project-2.appspot.com\",\n");
      out.write("    messagingSenderId: \"192291480470\",\n");
      out.write("    appId: \"1:192291480470:web:c67c6e624c404199\"\n");
      out.write("  };\n");
      out.write("  // Initialize Firebase\n");
      out.write("  firebase.initializeApp(firebaseConfig);\n");
      out.write("</script>\n");
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
