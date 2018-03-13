package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consuming a Web Service in Java using NetBeans IDE</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Consuming a Web Service in Java using NetBeans IDE</h1>\n");
      out.write("        <p>This document provides step-by-step instructions to consume\n");
      out.write("            a web service in Java using NetBeans IDE.</p>\n");
      out.write("        <h3>Prerequisites</h3>\n");
      out.write("        \n");
      out.write("        <ul>\n");
      out.write("            <li>NetBeans - https://netbeans.org/</li>\n");
      out.write("            <li>Web service - http://www.webservicex.net/New/Home/ServiceDetail/31</li>\n");
      out.write("            <li>WSDL - http://www.webservicex.net/ConvertTemperature.asmx?WSDL</li>\n");
      out.write("        </ul>\n");
      out.write("        <h3>Steps</h3>\n");
      out.write("\n");
      out.write("        <p>Click on \"New Project\" and choose \"Java Web\" and then \"Web Application\" on menu then \"Next\" </p>\n");
      out.write("        <img src=\"images/01.png\" alt=\"\"/>\n");
      out.write("        <p>Type in \"project name\" the name for the project in this case \"ConvertTemp\" and then click on \"Next\" </p>\n");
      out.write("        <img src=\"images/02.png\" alt=\"\"/>\n");
      out.write("        <p>Ensure that \"Server\" is \"GlassFish Server 4.1.1\" and \"Java EE version\" is \"Java EE 7 Web\" then click \"Next\"</p>\n");
      out.write("        <img src=\"images/03.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans will create a \"index.html\" in \"Web Pages\" folder, right click on it, and click \"Delete\" option</p>\n");
      out.write("        <img src=\"images/04.png\" alt=\"\"/>\n");
      out.write("        <p>Right click on \"Web Pages\" folder, and chose \"New\" then click on \"JSP\" (if \"JSP\" does not appear, click on \"Other\" and then it will show you all option and click on \"JSP\") then on the window for \"File Name\" type \"index\" and click on \"Finish\"</p>\n");
      out.write("        <img src=\"images/05.png\" alt=\"\"/>\n");
      out.write("        <p>Right click on \"ConvertTemp\" node chose \"New\" then click on \"Web Service Client\" (if \"Web Service Client\" does not appear, click on \"Other\" and then it will show you all option and click on \"Web Service CLiente\")</p>\n");
      out.write("        <img src=\"images/06.png\" alt=\"\"/>\n");
      out.write("        <p>Ensure to chose \"WSDL URL\" and type \"http://www.webservicex.net/ConvertTemperature.asmx?WSDL\" then click finish </p>\n");
      out.write("        <img src=\"images/07.png\" alt=\"\"/>\n");
      out.write("        <p>Right click on \"ConvertTemp\" node chose \"New\" then click on \"Java Class\" (if \"JSP\" does not appear, click on \"Other\" and then it will show you all option and click on \"Java Class\")</p>\n");
      out.write("        <img src=\"images/08.png\" alt=\"\"/>\n");
      out.write("        <p>Ensure for \"Class Name\" type \"ConvertTemp\" and for \"Package\" type \"converttemp\" then click on \"Finish.\" </p>\n");
      out.write("        <img src=\"images/09.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans will add the folder \"Web Services References\" open the tree and click \"Convert Temperature\" that will open the tree and click on the subtree \"ConvertTemperature\" then it will show you the sub-menus of services available \"ConvertTemperatureSOAP\", \"ConvertTemperatureSOAP12\", \"ConvertTemperatureGet\" and \"ConvertTemperaturePOST\", you can click on any of them in this case we will click on \"ConvertTemperatureSOAP\" that will open the tree to show \"ConvertTemp\" service, now you can  simply drang and drop the services to the \"ConvertTemp.java\" file. </p>\n");
      out.write("        <img src=\"images/10.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans automatically will write the appropriate code to use the service</p>\n");
      out.write("        <img src=\"images/11.png\" alt=\"\"/>\n");
      out.write("        <p>Now we need to type code to make handle the service, Ensure to create the variables double \"temp\" for temperature, String variable \"fromUnit\" for the Unit origin of the data, and string variable \"toUnit\" for Unit to convert the temperature, also getter and setter for each variable, a a constructor to handle the initialization of the instance, also ensure that the function of \"getTemp\" get the use the \"convertTemp\" function from the web service  to convert the temperature. </p>\n");
      out.write("        <img src=\"images/12.png\" alt=\"\"/>\n");
      out.write("        <p>Now we will create the \"response.jsp\" file to handle the service, right click on \"ConvertTemp\" node chose \"New\" then click on \"JSP\" (if \"JSP\" does not appear, click on \"Other\" and then it will show you all option and click on \"JSP\")</p>\n");
      out.write("        <img src=\"images/13.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans will display a window, ensure for \"File Name\" to type \"reponse\" and click on \"Finish\"</p>\n");
      out.write("        <img src=\"images/14.png\" alt=\"\"/>\n");
      out.write("        <p>Now we will work on the  \"index.jsp\" file,, click on it, and change the \"h1\" tag for a more convenient title for the web service, then click on menu \"Window\" submenu \"IDE Tools\" and click on \"Pallette\", this will display a \"Pallete menu with HTML and JSP tags</p>\n");
      out.write("        <img src=\"images/15.png\" alt=\"\"/>\n");
      out.write("        <p>Now drang and drop from the \"Palette\" menu the \"form\" option, in between the \"body\" tags and below the \"h1\" tags</p>\n");
      out.write("        <img src=\"images/16.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans automatically will insert the code needed to use the form</p>\n");
      out.write("        <img src=\"images/17.png\" alt=\"\"/>\n");
      out.write("        <p>Now drang and drop from the \"Palette\" menu the \"text input\" option, in between the \"form\" tags</p>\n");
      out.write("        <img src=\"images/18.png\" alt=\"\"/>\n");
      out.write("        <p>Netbeans will show you a window to set the \"text Input\", type \"temp\" for \"Name\" and \"text\" for \"type\" then click \"OK\"</p>\n");
      out.write("        <img src=\"images/19.png\" alt=\"\"/>\n");
      out.write("        <p>Now drag and drop two times from the \"Palette\" menu the \"Drop Down List\" option, in between the \"form\" tags and below the \"Input\" tag</p>\n");
      out.write("        <img src=\"images/20.png\" alt=\"\"/>\n");
      out.write("        <p>We need to check the \"TemperatureUnit.java\" file to check the values that the web service requires in order to convert the temperature</p>\n");
      out.write("        <img src=\"images/21.png\" alt=\"\"/>\n");
      out.write("        <p>Ensure to create the \"select\" tags with the same values from the \"TemperatureUnit.java\" </p>\n");
      out.write("        <img src=\"images/22.png\" alt=\"\"/>\n");
      out.write("        <p>Now drag and drop from the \"Palette\" menu the \"button\" option, in between the \"form\" tags and below the \"select\" tags</p>\n");
      out.write("        <img src=\"images/23.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans will show a windows to set the button, type \"submit\" for \"Label\" option, and chose \"submit\" for \"type\" then click \"OK\"</p>\n");
      out.write("        <img src=\"images/24.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans automatically will insert the code needed to use the submit button</p>\n");
      out.write("        <img src=\"images/25.png\" alt=\"\"/>\n");
      out.write("        <p>Now we will work on the \"reponse.jsp\" file, click on it, and change the \"h1\" tag for a more appropriate title, such as \"Temperature converted\", and from the \"Pallete\" menu drag and drop the \"Use Bean\" option in between the \"body\" tags and below the \"h1\" tag.</p>\n");
      out.write("        <img src=\"images/26.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans will display a window, ensure thath for \"Id\" type \"converttemp\", for \"Class\" type \"converttemp.ConvertTemp\", and \"Scope\" chose \"session\", then click \"OK\".</p>\n");
      out.write("        <img src=\"images/27.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans automatically will insert the code needed to use the bean.</p>\n");
      out.write("        <img src=\"images/28.png\" alt=\"\"/>\n");
      out.write("        <p>Now from the \"Pallete\" menu drag and drop the \"Set Bean\" option in between the \"body\" tags and below the \"use bean\" tag.</p>\n");
      out.write("        <img src=\"images/29.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans will display a window, ensure that for \"Bean name\" type \"converttemp\", for \"Property Name\" type \"temp\", and \"Property Value\" empty, then click \"OK\".</p>\n");
      out.write("        <img src=\"images/30.png\" alt=\"\"/>\n");
      out.write("        <p>Now from the \"Pallete\" menu drag and drop the \"Set Bean\" option in between the \"body\" tags and below the \"set bean\" tag. NetBeans will display a window, ensure that for \"Bean name\" type \"converttemp\", for \"Property Name\" type \"fromUnit\", and \"Property Value\" empty, then click \"OK\".</p>\n");
      out.write("        <img src=\"images/31.png\" alt=\"\"/>\n");
      out.write("        <p>Now from the \"Pallete\" menu drag and drop the \"Set Bean\" option in between the \"body\" tags and below the \"set bean\" tag. NetBeans will display a window, ensure that for \"Bean name\" type \"converttemp\", for \"Property Name\" type \"toUnit\", and \"Property Value\" empty, then click \"OK\".</p>\n");
      out.write("        <img src=\"images/32.png\" alt=\"\"/>\n");
      out.write("        <p>Now from the \"Pallete\" menu drag and drop the \"get Bean\" option in between the \"body\" tags and below the \"set bean\" tag.</p>\n");
      out.write("        <img src=\"images/33.png\" alt=\"\"/>\n");
      out.write("        <p> NetBeans will display a window, ensure that for \"Bean name\" type \"converttemp\", for \"Property Name\" type \"temp\", then click \"OK\".</p>\n");
      out.write("        <img src=\"images/34.png\" alt=\"\"/>\n");
      out.write("        <p>NetBeans automatically will insert the code needed to use the get bean.</p>\n");
      out.write("        <img src=\"images/35.png\" alt=\"\"/>\n");
      out.write("        <p>Now go to \"Services\" tab and click on it, then right click on \"Servers\" node and click on \"restart\"</p>\n");
      out.write("        <img src=\"images/36.png\" alt=\"\"/>\n");
      out.write("        <p>Then click on the \"Project\" tab, and right click on the \"ConvertTep\" node and click on \"Deploy\" option, wait until process is completed.</p>\n");
      out.write("        <img src=\"images/37.png\" alt=\"\"/>\n");
      out.write("        <p>Then right click on the \"response.jsp\" file and click on \"Run File\" </p>\n");
      out.write("        <img src=\"images/38.png\" alt=\"\"/>\n");
      out.write("        <p>or also you can first click \"Clean and Build\" (brush and hammer icon) and then \"Run\" (green triangle), in order to run the application.</p>\n");
      out.write("        <img src=\"images/39.png\" alt=\"\"/>\n");
      out.write("        <p>NetBean will open the Browser and will show  show the \"index.jsp\" file. </p>\n");
      out.write("        <img src=\"images/40.png\" alt=\"\"/>\n");
      out.write("        <p>Type a number of the temperature and chose the temperature of origin and the temperature that you want to convert then click submit</p>\n");
      out.write("        <img src=\"images/41.png\" alt=\"\"/>\n");
      out.write("        <p>Then the browser will display the \"response.jsp\" file with the temperature converted</p>\n");
      out.write("        <img src=\"images/42.png\" alt=\"\"/>\n");
      out.write("        <p>We can add an extra data by adding to the \"response.jsp\" file, drag and drop from \"Palette\" the \"get Bean\" option and setting it as \"toUnit\", and re-buil and re-run the application.</p>\n");
      out.write("        <img src=\"images/43.png\" alt=\"\"/>\n");
      out.write("        <p>We will input a temperature int he \"input\" area and chose \"fromUnit\" and \"toUnit\" options, and then click \"submit\" button, this will display, the temperature converted, and also the unit of temperature converted. </p>\n");
      out.write("        <img src=\"images/44.png\" alt=\"\"/>\n");
      out.write("        <p>This is the final product of the tutorial, you can input the temperature and chose the option, and it will use the web service to convert the temperature and retrieve the temperature converted and the unit of the temperature.</p>\n");
      out.write("        <div id=\"finalResult\">\n");
      out.write("        <h1>Please enter a Temperature you want to convert:</h1>\n");
      out.write("        <form action=\"response.jsp\">\n");
      out.write("            <input type=\"text\" name=\"temp\" />\n");
      out.write("            <select name=\"fromUnit\">\n");
      out.write("                <option value=\"DEGREE_CELSIUS\">Celsius</option>\n");
      out.write("                <option value=\"DEGREE_FAHRENHEIT\">Fahrenheit</option>\n");
      out.write("                <option value=\"DEGREE_RANKINE\">Rankine</option>\n");
      out.write("                <option value=\"DEGREE_REAUMUR\">Reaumur</option>\n");
      out.write("                <option value=\"KELVIN\">Kelvin</option>\n");
      out.write("            </select>\n");
      out.write("            <select name=\"toUnit\">\n");
      out.write("                <option value=\"DEGREE_FAHRENHEIT\">Fahrenheit</option>\n");
      out.write("                <option value=\"DEGREE_CELSIUS\">Celsius</option>\n");
      out.write("                <option value=\"DEGREE_RANKINE\">Rankine</option>\n");
      out.write("                <option value=\"DEGREE_REAUMUR\">Reaumur</option>\n");
      out.write("                <option value=\"KELVIN\">Kelvin</option>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"submit\" />\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h5>authors:<b> <br>Pedro Alberto Duenas Orozco<br>Roberto Alejandro Rivera Mejia</b></h5><br><br><br>\n");
      out.write("    </body>\n");
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
