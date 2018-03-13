<%-- 
    Document   : index
    Created on : 08-Mar-2018, 21:50:07
    Author     : A1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consuming a Web Service in Java using NetBeans IDE</title>
         <link rel="stylesheet" type="text/css" href="index.css">
    </head>
    <body>
        <h1>Consuming a Web Service in Java using NetBeans IDE</h1>
        <p>This document provides step-by-step instructions to consume
            a web service in Java using NetBeans IDE.</p>
        <h3>Prerequisites</h3>
        
        <ul>
            <li>NetBeans - https://netbeans.org/</li>
            <li>Web service - http://www.webservicex.net/New/Home/ServiceDetail/31</li>
            <li>WSDL - http://www.webservicex.net/ConvertTemperature.asmx?WSDL</li>
        </ul>
        <h3>Steps</h3>

        <p>Click on "New Project" and choose "Java Web" and then "Web Application" on menu then "Next" </p>
        <img src="images/01.png" alt=""/>
        <p>Type in "project name" the name for the project in this case "ConvertTemp" and then click on "Next" </p>
        <img src="images/02.png" alt=""/>
        <p>Ensure that "Server" is "GlassFish Server 4.1.1" and "Java EE version" is "Java EE 7 Web" then click "Next"</p>
        <img src="images/03.png" alt=""/>
        <p>NetBeans will create a "index.html" in "Web Pages" folder, right click on it, and click "Delete" option</p>
        <img src="images/04.png" alt=""/>
        <p>Right click on "Web Pages" folder, and chose "New" then click on "JSP" (if "JSP" does not appear, click on "Other" and then it will show you all option and click on "JSP") then on the window for "File Name" type "index" and click on "Finish"</p>
        <img src="images/05.png" alt=""/>
        <p>Right click on "ConvertTemp" node chose "New" then click on "Web Service Client" (if "Web Service Client" does not appear, click on "Other" and then it will show you all option and click on "Web Service CLiente")</p>
        <img src="images/06.png" alt=""/>
        <p>Ensure to chose "WSDL URL" and type "http://www.webservicex.net/ConvertTemperature.asmx?WSDL" then click finish </p>
        <img src="images/07.png" alt=""/>
        <p>Right click on "ConvertTemp" node chose "New" then click on "Java Class" (if "JSP" does not appear, click on "Other" and then it will show you all option and click on "Java Class")</p>
        <img src="images/08.png" alt=""/>
        <p>Ensure for "Class Name" type "ConvertTemp" and for "Package" type "converttemp" then click on "Finish." </p>
        <img src="images/09.png" alt=""/>
        <p>NetBeans will add the folder "Web Services References" open the tree and click "Convert Temperature" that will open the tree and click on the subtree "ConvertTemperature" then it will show you the sub-menus of services available "ConvertTemperatureSOAP", "ConvertTemperatureSOAP12", "ConvertTemperatureGet" and "ConvertTemperaturePOST", you can click on any of them in this case we will click on "ConvertTemperatureSOAP" that will open the tree to show "ConvertTemp" service, now you can  simply drang and drop the services to the "ConvertTemp.java" file. </p>
        <img src="images/10.png" alt=""/>
        <p>NetBeans automatically will write the appropriate code to use the service</p>
        <img src="images/11.png" alt=""/>
        <p>Now we need to type code to make handle the service, Ensure to create the variables double "temp" for temperature, String variable "fromUnit" for the Unit origin of the data, and string variable "toUnit" for Unit to convert the temperature, also getter and setter for each variable, a a constructor to handle the initialization of the instance, also ensure that the function of "getTemp" get the use the "convertTemp" function from the web service  to convert the temperature. </p>
        <img src="images/12.png" alt=""/>
        <p>Now we will create the "response.jsp" file to handle the service, right click on "ConvertTemp" node chose "New" then click on "JSP" (if "JSP" does not appear, click on "Other" and then it will show you all option and click on "JSP")</p>
        <img src="images/13.png" alt=""/>
        <p>NetBeans will display a window, ensure for "File Name" to type "reponse" and click on "Finish"</p>
        <img src="images/14.png" alt=""/>
        <p>Now we will work on the  "index.jsp" file,, click on it, and change the "h1" tag for a more convenient title for the web service, then click on menu "Window" submenu "IDE Tools" and click on "Pallette", this will display a "Pallete menu with HTML and JSP tags</p>
        <img src="images/15.png" alt=""/>
        <p>Now drang and drop from the "Palette" menu the "form" option, in between the "body" tags and below the "h1" tags</p>
        <img src="images/16.png" alt=""/>
        <p>NetBeans automatically will insert the code needed to use the form</p>
        <img src="images/17.png" alt=""/>
        <p>Now drang and drop from the "Palette" menu the "text input" option, in between the "form" tags</p>
        <img src="images/18.png" alt=""/>
        <p>Netbeans will show you a window to set the "text Input", type "temp" for "Name" and "text" for "type" then click "OK"</p>
        <img src="images/19.png" alt=""/>
        <p>Now drag and drop two times from the "Palette" menu the "Drop Down List" option, in between the "form" tags and below the "Input" tag</p>
        <img src="images/20.png" alt=""/>
        <p>We need to check the "TemperatureUnit.java" file to check the values that the web service requires in order to convert the temperature</p>
        <img src="images/21.png" alt=""/>
        <p>Ensure to create the "select" tags with the same values from the "TemperatureUnit.java" </p>
        <img src="images/22.png" alt=""/>
        <p>Now drag and drop from the "Palette" menu the "button" option, in between the "form" tags and below the "select" tags</p>
        <img src="images/23.png" alt=""/>
        <p>NetBeans will show a windows to set the button, type "submit" for "Label" option, and chose "submit" for "type" then click "OK"</p>
        <img src="images/24.png" alt=""/>
        <p>NetBeans automatically will insert the code needed to use the submit button</p>
        <img src="images/25.png" alt=""/>
        <p>Now we will work on the "reponse.jsp" file, click on it, and change the "h1" tag for a more appropriate title, such as "Temperature converted", and from the "Pallete" menu drag and drop the "Use Bean" option in between the "body" tags and below the "h1" tag.</p>
        <img src="images/26.png" alt=""/>
        <p>NetBeans will display a window, ensure thath for "Id" type "converttemp", for "Class" type "converttemp.ConvertTemp", and "Scope" chose "session", then click "OK".</p>
        <img src="images/27.png" alt=""/>
        <p>NetBeans automatically will insert the code needed to use the bean.</p>
        <img src="images/28.png" alt=""/>
        <p>Now from the "Pallete" menu drag and drop the "Set Bean" option in between the "body" tags and below the "use bean" tag.</p>
        <img src="images/29.png" alt=""/>
        <p>NetBeans will display a window, ensure that for "Bean name" type "converttemp", for "Property Name" type "temp", and "Property Value" empty, then click "OK".</p>
        <img src="images/30.png" alt=""/>
        <p>Now from the "Pallete" menu drag and drop the "Set Bean" option in between the "body" tags and below the "set bean" tag. NetBeans will display a window, ensure that for "Bean name" type "converttemp", for "Property Name" type "fromUnit", and "Property Value" empty, then click "OK".</p>
        <img src="images/31.png" alt=""/>
        <p>Now from the "Pallete" menu drag and drop the "Set Bean" option in between the "body" tags and below the "set bean" tag. NetBeans will display a window, ensure that for "Bean name" type "converttemp", for "Property Name" type "toUnit", and "Property Value" empty, then click "OK".</p>
        <img src="images/32.png" alt=""/>
        <p>Now from the "Pallete" menu drag and drop the "get Bean" option in between the "body" tags and below the "set bean" tag.</p>
        <img src="images/33.png" alt=""/>
        <p> NetBeans will display a window, ensure that for "Bean name" type "converttemp", for "Property Name" type "temp", then click "OK".</p>
        <img src="images/34.png" alt=""/>
        <p>NetBeans automatically will insert the code needed to use the get bean.</p>
        <img src="images/35.png" alt=""/>
        <p>Now go to "Services" tab and click on it, then right click on "Servers" node and click on "restart"</p>
        <img src="images/36.png" alt=""/>
        <p>Then click on the "Project" tab, and right click on the "ConvertTep" node and click on "Deploy" option, wait until process is completed.</p>
        <img src="images/37.png" alt=""/>
        <p>Then right click on the "response.jsp" file and click on "Run File" </p>
        <img src="images/38.png" alt=""/>
        <p>or also you can first click "Clean and Build" (brush and hammer icon) and then "Run" (green triangle), in order to run the application.</p>
        <img src="images/39.png" alt=""/>
        <p>NetBean will open the Browser and will show  show the "index.jsp" file. </p>
        <img src="images/40.png" alt=""/>
        <p>Type a number of the temperature and chose the temperature of origin and the temperature that you want to convert then click submit</p>
        <img src="images/41.png" alt=""/>
        <p>Then the browser will display the "response.jsp" file with the temperature converted</p>
        <img src="images/42.png" alt=""/>
        <p>We can add an extra data by adding to the "response.jsp" file, drag and drop from "Palette" the "get Bean" option and setting it as "toUnit", and re-buil and re-run the application.</p>
        <img src="images/43.png" alt=""/>
        <p>We will input a temperature int he "input" area and chose "fromUnit" and "toUnit" options, and then click "submit" button, this will display, the temperature converted, and also the unit of temperature converted. </p>
        <img src="images/44.png" alt=""/>
        <div>
        <h1>Technologies used in consuming a Web Service</h1>
            <h2>JDK</h2>
                <p>JDK stands for Java Developmenr Kit  and is a software development environment used for developing Java applications and applets. It includes the Java Runtime Environment (JRE), an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (javadoc) and other tools needed in Java development.<br>JDK is a kit(or package) which includes two things:</p>
        <ul>
            <li>Development Tools(to provide an environment to develop your java programs)</li>
            <li>JRE (to execute your java program).</li>
        </ul>
                <p>There are different JDKs for various platforms. The supported platforms include Windows, Linux and Solaris. Mac users need a different software development kit, which includes adaptations of some tools found in the JDK.</p>
            <h2>NetBeans</h2>
                <p>is an open-source integrated development environment (IDE) for developing with Java, PHP, C++, and other programming languages. NetBeans is also referred to as a platform of modular components used for developing Java desktop applications.</p>
            <h2>SOAP</h2>
                <p>Simple Object Access Protocol is a protocol for implementing Web services. SOAP features guidelines that allow communication via the Internet between two programs, even if they run on different platforms, use different technologies and are written in different programming languages.<br>As a protocol, SOAP has four basic parts:</p>
        <ul>
            <lI>Guidelines for the contents of a message and how it is processed</lI>    
            <lI>Encoding guidelines for application-defined data types</lI>    
            <lI>Guidelines for remote procedure calls (RPCs) and responses</lI> 
            <lI>Guidelines for exchanging messages through certain protocols</lI>    
        </ul>
            <p>SOAP is written using Extensible Markup Language (XML). The XML document structure is therefore also made up of four basic elements:</p>
        <ul>
            <li>Envelope
                <p>The envelope element is where an XML document can be identified as a SOAP message. A SOAP message is an XML document structured with the envelope element encapsulating both the header element and the body element, in that order. The fault element is located within the body.</p></li>
            <li>Header
                <p>The header element is actually optional. But when present, it is where information may be found about the application, such as authentication, payment, transaction ID, etc.</p></li>
            <li>Body
                <p>The body element is where the actual message is found. The fault element contains errors and status information.</p></li>
            <li>Fault</li>
        </ul>
                <p>Although SOAP messages use HTTP as their delivery system, other transport protocols are also supported.</p>
            <h2>XML</h2>
                <p>XML is a software- and hardware-independent tool for storing and transporting data.
XML stands for eXtensible Markup Language<br>
XML is a markup language much like HTML, was designed to store and transport data, to be self-descriptive and  is a W3C Recommendation<br>
XML describes the content in terms of what data is being described. For example, the word "phonenum" placed within markup tags could indicate that the data that followed was a phone number. An XML file can be processed purely as data by a program or it can be stored with similar data on another computer or it can be displayed, like an HTML file.</p>
    </div>
        <p>This is the final product of the tutorial, you can input the temperature and chose the option, and it will use the web service to convert the temperature and retrieve the temperature converted and the unit of the temperature.</p>
        <div id="finalResult">
        <h1>Please enter a Temperature you want to convert:</h1>
        <form action="response.jsp">
            <input type="text" name="temp" />
            <select name="fromUnit">
                <option value="DEGREE_CELSIUS">Celsius</option>
                <option value="DEGREE_FAHRENHEIT">Fahrenheit</option>
                <option value="DEGREE_RANKINE">Rankine</option>
                <option value="DEGREE_REAUMUR">Reaumur</option>
                <option value="KELVIN">Kelvin</option>
            </select>
            <select name="toUnit">
                <option value="DEGREE_FAHRENHEIT">Fahrenheit</option>
                <option value="DEGREE_CELSIUS">Celsius</option>
                <option value="DEGREE_RANKINE">Rankine</option>
                <option value="DEGREE_REAUMUR">Reaumur</option>
                <option value="KELVIN">Kelvin</option>
            </select>
            <input type="submit" value="submit" />
        </form>
        </div>
        
        <h5>authors:<b> <br>Pedro Alberto Duenas Orozco<br>Roberto Alejandro Rivera Mejia</b></h5><br><br><br>
    </body>
</html>
