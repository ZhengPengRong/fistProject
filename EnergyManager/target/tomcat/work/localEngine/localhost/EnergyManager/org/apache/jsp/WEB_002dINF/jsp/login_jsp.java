package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd\">\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\" />\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tFONT-SIZE: 12px;\r\n");
      out.write("\tCOLOR: #ffffff;\r\n");
      out.write("\tFONT-FAMILY: 宋体\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("TD {\r\n");
      out.write("\tFONT-SIZE: 12px;\r\n");
      out.write("\tCOLOR: #ffffff;\r\n");
      out.write("\tFONT-FAMILY: 宋体\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.6000.16809\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("\t<FORM id=form1 name=form1\r\n");
      out.write("\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login/submit.action\" method=post>\r\n");
      out.write("\r\n");
      out.write("\t\t<DIV id=UpdatePanel1>\r\n");
      out.write("\t\t\t<DIV id=div1\r\n");
      out.write("\t\t\t\tstyle=\"LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff\"></DIV>\r\n");
      out.write("\t\t\t<DIV id=div2\r\n");
      out.write("\t\t\t\tstyle=\"LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff\"></DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<DIV>&nbsp;&nbsp;</DIV>\r\n");
      out.write("\t\t\t<DIV>\r\n");
      out.write("\t\t\t\t<TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>\r\n");
      out.write("\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t<!-- <TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD style=\"HEIGHT: 105px\"><IMG src=\"images/login_1.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t\t\t</TR> -->\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD background=images/login_2.jpg height=300>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TABLE height=300 cellPadding=0 width=900 border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD colSpan=2 height=35></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD width=360></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=2 border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\" width=80>登 录 名：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\" width=150><INPUT id=txtName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 130px\" name=username></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\" width=370><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=RequiredFieldValidator3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white\">请输入登录名</SPAN></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\">登录密码：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\"><INPUT id=txtPwd\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 130px\" type=password name=password></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=RequiredFieldValidator4\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white\">请输入密码</SPAN></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\">验证码：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\"><INPUT id=txtcode\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 130px\" name=txtcode></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 28px\">&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD><INPUT id=btn\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick='javascript:WebForm_DoPostBackWithOptions(new WebForm_PostBackOptions(\"btn\", \"\", true, \"\", \"\", false, false))'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=image src=\"images/login_button.gif\" name=btn>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD><IMG src=\"images/login_3.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t</DIV>\r\n");
      out.write("\t\t</DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
