package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.*;

public final class database_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Online Movie Store</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap3.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  .Main_Display {\n");
      out.write("\n");
      out.write("  Margin: auto;\n");
      out.write("  text-align:center;\n");
      out.write("  justify-content:space-evenly;\n");
      out.write("  display: flex;             \n");
      out.write("  flex-wrap: wrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  .row {\n");
      out.write("     margin: 0px auto;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .col-sm-3{\n");
      out.write("    padding: 2em;\n");
      out.write("    width: 20vh;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .thumbnail {\n");
      out.write("    background-color: #0C2F5A;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  body {\n");
      out.write("    background-color: #556B85;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  h1 {\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  a {\n");
      out.write("    color: white;\n");
      out.write("    padding: 2px;\n");
      out.write("    margin: 2px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("    button {\n");
      out.write("        width: 60%;\n");
      out.write("        margin-right: 20%;\n");
      out.write("        margin-left: 20%;\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div align=\"left\"> \n");
      out.write("<b><a href=\"login.html\"> LOGIN</a>\n");
      out.write("  <a>  |  </a>\n");
      out.write("<a href=\"index.html\"> SIGN UP </a></b>\n");
      out.write("</div>  \n");
      out.write("\n");
      out.write("<h1>\n");
      out.write("Available Movies\n");
      out.write("</h1>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-md-3\">\n");
      out.write("  <div class=\"thumbnail\">\n");
      out.write("    <img src=\"MovieImages/12485_Batman-The-Dark-Knight-Joker-Wallpaper.jpg\">\n");
      out.write("    <div class=\"caption\">\n");
      out.write("      <h3>The Dark Knight</h3>\n");
      out.write("      <p style=\"height:40px;overflow-y:scroll;\" >With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.</p>  \n");
      out.write("    </div>\n");
      out.write("      <br>\n");
      out.write("        <form method=\"get\" action=\"order.html\"><button type=\"submit\">BUY</button></form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-md-3\">\n");
      out.write("  <div class=\"thumbnail\">\n");
      out.write("    <img src=\"MovieImages/1Divergent-movie-poster-wallpaper-1920x1200.jpg\">\n");
      out.write("    <div class=\"caption\">\n");
      out.write("      <h3>Divergent</h3>\n");
      out.write("      <p style=\"height:40px;overflow-y:scroll;\" >Tris Prior (Shailene Woodley) lives in a futuristic world in which society is divided into five factions. As each person enters adulthood, he or she must choose a faction and commit to it for life. Tris chooses Dauntless -- those who pursue bravery above all else. However, her initiation leads to the discovery that she is a Divergent and will never be able to fit into just one faction. Warned that she must conceal her status, Tris uncovers a looming war which threatens everyone she loves.</p>\n");
      out.write("    </div>\n");
      out.write("      <br>\n");
      out.write("        <form method=\"get\" action=\"order.html\"><button type=\"submit\">BUY</button></form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-md-3\">\n");
      out.write("  <div class=\"thumbnail\">\n");
      out.write("    <img src=\"MovieImages/GN_onesheet_AU.jpg\">\n");
      out.write("    <div class=\"caption\">\n");
      out.write("      <h3>Game Night</h3>\n");
      out.write("      <p style=\"height:40px;overflow-y:scroll;\" >Max and Annie's weekly game night gets kicked up a notch when Max's brother Brooks arranges a murder mystery party -- complete with fake thugs and federal agents. So when Brooks gets kidnapped, it's all supposed to be part of the game. As the competitors set out to solve the case, they start to learn that neither the game nor Brooks are what they seem to be. The friends soon find themselves in over their heads as each twist leads to another unexpected turn over the course of one chaotic night.<span class=\"label label-success\">VEG</span></p>\n");
      out.write("    </div>\n");
      out.write("      <br>\n");
      out.write("        <form method=\"get\" action=\"order.html\"><button type=\"submit\">BUY</button></form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-md-3\">\n");
      out.write("  <div class=\"thumbnail\">\n");
      out.write("    <img src=\"MovieImages/1Miller-Landscape.jpg\">\n");
      out.write("    <div class=\"caption\">\n");
      out.write("      <h3>We're The Millers</h3>\n");
      out.write("      <p style=\"height:40px;overflow-y:scroll;\" >Small-time pot dealer David (Jason Sudeikis) learns the hard way that no good deed goes unpunished; trying to help some teens, he is jumped by thugs and loses his cash and stash. Now, David's in big debt to his supplier and -- to wipe the slate clean -- he must go to Mexico to pick up the guy's latest shipment. To accomplish his mission, Dave devises a foolproof plan: He packs a fake family into a huge RV and heads south of the border for a wild weekend that is sure to end with a bang.</p>\n");
      out.write("    </div>\n");
      out.write("      <br>\n");
      out.write("        <form method=\"get\" action=\"order.html\"><button type=\"submit\">BUY</button></form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-md-3\">\n");
      out.write("  <div class=\"thumbnail\">\n");
      out.write("    <img src=\"MovieImages/1NYSM poster.jpg\">\n");
      out.write("    <div class=\"caption\">\n");
      out.write("      <h3>Now You See Me</h3>\n");
      out.write("      <p style=\"height:40px;overflow-y:scroll;\" >Now You See Me is a series of heist thriller films written by Ed Solomon, Boaz Yakin, and Edward Ricourt. They focus on the actions of a team of illusionists named \"The Four Horsemen\" who pull off near impossible heists.</p>\n");
      out.write("    </div>\n");
      out.write("      <br>\n");
      out.write("        <form method=\"get\" action=\"order.html\"><button type=\"submit\">BUY</button></form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
