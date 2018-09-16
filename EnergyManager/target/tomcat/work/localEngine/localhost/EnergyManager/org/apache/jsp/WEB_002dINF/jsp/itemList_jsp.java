package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class itemList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>查询设备列表</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t查询条件：\r\n");
      out.write("\t<span>位置：</span>\r\n");
      out.write("\t<select>\r\n");
      out.write("\t\t<option>杭州电子科技大学</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<select id=\"buildingList\">\r\n");
      out.write("\t\t<option value=\"2\">第二教学楼</option>\r\n");
      out.write("\t\t<option value=\"1\">第一教学楼</option>\r\n");
      out.write("\t\t<option value=\"3\">第三教学楼</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<select id=\"floorList\">\r\n");
      out.write("\t\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<select id=\"roomList\">\r\n");
      out.write("\t\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<input type=\"button\" value=\"搜索\" id=\"btSearch\" class=\"ui right floated positive button btn-search\"/> \r\n");
      out.write("\t<span>设备列表：</span>\r\n");
      out.write("\t<table width=\"100%\" border=1>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>设备ID</td>\r\n");
      out.write("\t\t\t<td>设备名称</td>\r\n");
      out.write("\t\t\t<td>设备所属建筑</td>\r\n");
      out.write("\t\t\t<td>所属楼层</td>\r\n");
      out.write("\t\t\t<td>所属房间</td>\r\n");
      out.write("\t\t\t<td>设备类型</td>\r\n");
      out.write("\t\t\t<td>是否工作</td>\r\n");
      out.write("\t\t\t<td>工作状态</td>\r\n");
      out.write("\t\t\t<td>操作</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tbody id=\"tbody-result\">\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("<script>\t\r\n");
      out.write("$(function () {\r\n");
      out.write("\t\r\n");
      out.write("\tfunction findFloor(){\r\n");
      out.write("        var $buildId=$(\"#buildingList\").val();\r\n");
      out.write("        $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/DeviceInformation/findFloorByBuilding.action\",{\"buildingId\":$buildId},function(obj){\r\n");
      out.write("           var $city=$(\"#floorList\");\r\n");
      out.write("            $city.html(\"\");\r\n");
      out.write("            if(obj!=null){\r\n");
      out.write("                $(obj).each(function(){\r\n");
      out.write("                    $city.append($(\"<option value='\"+this+\"'>第\"+this+\"层</option>\"));\r\n");
      out.write("                });\r\n");
      out.write("            } \r\n");
      out.write("        },\"json\");\r\n");
      out.write("    }\r\n");
      out.write("\tfunction findRoom(){\r\n");
      out.write("\t\t var $buildId=$(\"#buildingList\").val();\r\n");
      out.write("\t     var $floor=$(\"#floorList\").val();\r\n");
      out.write("\t     $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/DeviceInformation/findRoomByBuildingFloor.action\",{\"buildingId\":$buildId,\"floor\":$floor},function(obj){\r\n");
      out.write("\t        var $city=$(\"#roomList\");\r\n");
      out.write("\t         $city.html(\"<option value=''>-请选择-</option>\");\r\n");
      out.write("\t         if(obj!=null){\r\n");
      out.write("\t             $(obj).each(function(){\r\n");
      out.write("\t                 $city.append($(\"<option value='\"+this+\"'>\"+this+\"房间</option>\"));\r\n");
      out.write("\t             });\r\n");
      out.write("\t         } \r\n");
      out.write("\t     },\"json\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("         $(\"#buildingList\").click(findFloor);\t\t \r\n");
      out.write("\t\t $(\"#floorList\").click(findRoom);\r\n");
      out.write("\t\t/*  $(\"#roomList\").click(findRoom);\r\n");
      out.write("\t\t $(\"#floorList\").click(findFloor); */\r\n");
      out.write("\t$(\"#roomList\").change(function(){\r\n");
      out.write("\t\t var buildId=$(\"#buildingList\").val();\r\n");
      out.write("       var floor=$(\"#floorList\").val();\r\n");
      out.write("       var room=$(\"#roomList\").val();\r\n");
      out.write("       $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/DeviceInformation/findDeviceByDeviceInformation.action\",\r\n");
      out.write("       \t\t{\"buildingId\":buildId,\"floor\":floor,\"room\":room},function(obj){\r\n");
      out.write("          var $device=$(\"#deviceList\");\r\n");
      out.write("           $device.html(\"<option>-请选择-</option>\");\r\n");
      out.write("           if(obj!=null){\r\n");
      out.write("               $(obj).each(function(){\r\n");
      out.write("                   $device.append($(\"<option value='\"+this.deviceId+\"'>\"+this.name+\"</option>\"));\r\n");
      out.write("               });\r\n");
      out.write("           } \r\n");
      out.write("       },\"json\");\r\n");
      out.write("   });\r\n");
      out.write("    $('#btSearch').click(function () {\r\n");
      out.write("    \tvar buildId=$(\"#buildingList\").val();\r\n");
      out.write("        var floor=$(\"#floorList\").val();\r\n");
      out.write("        var room=$(\"#roomList\").val();\r\n");
      out.write("        var tbody = window.document.getElementById(\"tbody-result\");\r\n");
      out.write("   \r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            contentType: \"application/json;charset=utf-8\",\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/DeviceInformation/findDeviceByDeviceInformation.action\",\r\n");
      out.write("            data:{\"buildingId\":buildId,\"floor\":floor,\"room\":room},\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("               \r\n");
      out.write("                   var str = \"\";\r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("                   for (i in data) {\r\n");
      out.write("                       str += \"<tr>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].deviceId + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].type + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].buildingId + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].floor + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].room + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].name + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].is_working + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + data[i].energy_consumption_status + \"</td>\" +\r\n");
      out.write("                           \"<td align='center'>\" + '<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/monitor.action\">开启</a><br>' + \"</td>\"  +\r\n");
      out.write("                           \"</tr>\";\r\n");
      out.write("                   }\r\n");
      out.write("                   tbody.innerHTML = str;\r\n");
      out.write("               \r\n");
      out.write("            },\r\n");
      out.write("            error: function () {\r\n");
      out.write("                alert(\"查询失败\")\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
