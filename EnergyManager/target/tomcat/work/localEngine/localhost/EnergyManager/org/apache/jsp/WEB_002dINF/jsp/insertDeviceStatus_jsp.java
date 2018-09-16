package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertDeviceStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/echarts.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t $(\"#button1\").click(function(){\r\n");
      out.write("\t\t\t var deviceId=$(\"#deviceId\").val();\r\n");
      out.write("\t         var power=$(\"#power\").val();           \r\n");
      out.write("\t         var date=$(\"#date\").val(); \r\n");
      out.write("\t         var data={\"deviceId\":deviceId,\"power\":power,\"date\":date};\r\n");
      out.write("\t         $.get(\"http://localhost:8080/ssm0523/deviceStatus/insertDeviceStatus.action\"\r\n");
      out.write("          \t\t\t  ,data,function(obj){ \r\n");
      out.write("\t        \t alert(\"success\");\r\n");
      out.write("\t         },\"json\");\r\n");
      out.write("\t\t });\r\n");
      out.write("\t\t $(\"#button2\").click(function(){\r\n");
      out.write("\t\t\t var roomId=$(\"#roomId\").val();\r\n");
      out.write("\t                 \r\n");
      out.write("\t         var time=$(\"#time\").val(); \r\n");
      out.write("\t         var data={\"roomId\":roomId,\"time\":time};\r\n");
      out.write("\t         $.get(\"http://localhost:8080/ssm0523/roomInformation/insertRoomInformation.action\"\r\n");
      out.write("          \t\t\t  ,data,function(obj){ \r\n");
      out.write("\t        \t alert(\"success\");\r\n");
      out.write("\t         },\"json\");\r\n");
      out.write("\t\t });\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <p>向deviceState表中插入数据</p>\r\n");
      out.write("\t<select id=\"deviceId\">\r\n");
      out.write("\t\t\t\t<option value=\"1\">设备1</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">设备2</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">设备3</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<select id=\"power\">\r\n");
      out.write("\t\t\t\t<option value=\"1\">功耗1</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">功耗2</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">功耗3</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<input type=\"datetime-local\" id=\"date\" value=\"2018-07-05T02:20\">\r\n");
      out.write("\t<button id=\"button1\">插入数据</button><br>\r\n");
      out.write("\t\r\n");
      out.write("\t<p>向roomInformation表中插入数据</p>\r\n");
      out.write("\t<select id=\"roomId\">\r\n");
      out.write("\t\t\t\t<option value=\"258\">房间258</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">房间2</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">房间3</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<input type=\"datetime-local\" id=\"time\" value=\"2018-07-05T02:20\">\r\n");
      out.write("\t<button id=\"button2\">插入数据</button><br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
