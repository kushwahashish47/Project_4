/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-05-01 16:06:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.pro4.utility.DataUtility;
import in.co.pro4.controller.GetMarksheetCtl;
import in.co.pro4.utility.ServletUtility;
import in.co.pro4.bean.RoleBean;
import in.co.pro4.controller.LoginCtl;
import in.co.pro4.controller.ORSView;
import in.co.pro4.bean.UserBean;

public final class GetMarksheetView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1682928402446L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1670824608000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.pro4.controller.ORSView");
    _jspx_imports_classes.add("in.co.pro4.bean.UserBean");
    _jspx_imports_classes.add("in.co.pro4.utility.DataUtility");
    _jspx_imports_classes.add("in.co.pro4.utility.ServletUtility");
    _jspx_imports_classes.add("in.co.pro4.bean.RoleBean");
    _jspx_imports_classes.add("in.co.pro4.controller.GetMarksheetCtl");
    _jspx_imports_classes.add("in.co.pro4.controller.LoginCtl");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\r\n");
      out.write("	href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/Raysicon.png\" sizes=\"16*16\" />\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Get Marksheet</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      in.co.pro4.bean.MarksheetBean bean = null;
      bean = (in.co.pro4.bean.MarksheetBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.pro4.bean.MarksheetBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("	<form action=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\r\n");
      out.write("	href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/Raysicon.png\" sizes=\"16*16\" />\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

		UserBean userBean = (UserBean) session.getAttribute("user");
		boolean userLoggedIn = userBean != null;
		String welcomeMsg = "Hi, ";
		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userBean.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<table style=\"font-size: 18px\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th></th>\r\n");
      out.write("			<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</a> |\r\n");
      out.write("				");

				if (userLoggedIn) {
			
      out.write(" <a\r\n");
      out.write("				href=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</a>\r\n");
      out.write("\r\n");
      out.write("				");

					} else {
				
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</a> ");

 	}
 
      out.write("</td>\r\n");
      out.write("			<td rowspan=\"2\">\r\n");
      out.write("				<h1 align=\"right\">\r\n");
      out.write("					<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/RaysLogo.png\" width=\"240\"\r\n");
      out.write("						height=\"90\">\r\n");
      out.write("				</h1>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th></th>\r\n");
      out.write("			<td>\r\n");
      out.write("				<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		");

			if (userLoggedIn) {
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th></th>\r\n");
      out.write("			<td colspan=\"2\"><font> <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet Merit\r\n");
      out.write("						List</b>\r\n");
      out.write("				</a> | ");

					if (userBean.getRoleId() == RoleBean.ADMIN) {
				
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add Time Table</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> | <a\r\n");
      out.write("					target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</a> ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.STUDENT) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> |");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.KIOSK) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</b></a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> |");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.FACULTY) {
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add Time Table</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> |");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.COLLEGE_SCHOOL) {
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Time Table List</a> | <a\r\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | ");

 	}
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</font></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

			}
		
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("	<hr>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("		<center>\r\n");
      out.write("			<div align=\"center\">\r\n");
      out.write("				<h1>Get Marksheet</h1>\r\n");
      out.write("\r\n");
      out.write("				<h3>\r\n");
      out.write("					<font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\r\n");
      out.write("				</h3>\r\n");
      out.write("				<H3>\r\n");
      out.write("					<font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\r\n");
      out.write("				</H3>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<table>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th align=\"left\">Roll No <span style=\"color: red\">*</span> :\r\n");
      out.write("					</th>\r\n");
      out.write("					<td><input type=\"text\" name=\"rollNo\"\r\n");
      out.write("						placeholder=\"Enter RollNo.\" size=\"25\"\r\n");
      out.write("						value=\"");
      out.print(ServletUtility.getParameter("rollNo", request));
      out.write("\">\r\n");
      out.write("					</td>\r\n");
      out.write("					<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("rollNo", request));
      out.write("</font></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th style=\"padding: 3px\"></th>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th></th>\r\n");
      out.write("					<td>&nbsp;&emsp;<input type=\"submit\" name=\"operation\"\r\n");
      out.write("						value=\"");
      out.print(GetMarksheetCtl.OP_GO);
      out.write("\"> &nbsp;&nbsp;<input\r\n");
      out.write("						type=\"submit\" name=\"operation\"\r\n");
      out.write("						value=\"");
      out.print(GetMarksheetCtl.OP_RESET);
      out.write("\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");

				if (bean.getName() != null && bean.getName().length() >= 0) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<table>\r\n");
      out.write("				<table border=\"1\" width=\"100%\">\r\n");
      out.write("					<tr align=\"center\" style=\"background: #0FFAAD\">\r\n");
      out.write("						<td><h2>Rays Technologies</h2></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("				<table border=\"1\" width=\"100%\">\r\n");
      out.write("					<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("						<th>Name</th>\r\n");
      out.write("						<td>");
      out.print(DataUtility.getStringData(bean.getName()));
      out.write("</td>\r\n");
      out.write("						<th>Roll No</th>\r\n");
      out.write("						<td>");
      out.print(DataUtility.getStringData(bean.getRollNo()));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("						<th>Status</th>\r\n");
      out.write("						<td>Regular</td>\r\n");
      out.write("						<th>Course</th>\r\n");
      out.write("						<td>BE</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("				");

					int phy = DataUtility.getInt(DataUtility.getStringData(bean.getPhysics()));
						int chem = DataUtility.getInt(DataUtility.getStringData(bean.getChemistry()));
						int math = DataUtility.getInt(DataUtility.getStringData(bean.getMaths()));
						int total = (phy + chem + math);
						float perc = total / 3;
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<table border=\"1\" width=\"100%\">\r\n");
      out.write("\r\n");
      out.write("					<tr align=\"center\" style=\"background: #0FFAAD\" style=\"width: 25%\">\r\n");
      out.write("						<th>Subject</th>\r\n");
      out.write("						<th>Maximum Marks</th>\r\n");
      out.write("						<th>Minimum Marks</th>\r\n");
      out.write("						<th>Marks Obtained</th>\r\n");
      out.write("						<th>Grade</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("\r\n");
      out.write("					<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("						<td>Physics</td>\r\n");
      out.write("						<td>100</td>\r\n");
      out.write("						<td>33</td>\r\n");
      out.write("						<td>");
      out.print(phy);
      out.write(' ');

 	if (phy < 33) {
 
      out.write(" <span style=\"color: red\">*</span>\r\n");
      out.write("							");

								}
							
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("						<td align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("							");

								if (phy <= 100 && phy > 85) {
							
      out.write(" A+ ");

								} else if (phy <= 85 && phy > 75) {
							
      out.write("B+\r\n");
      out.write("							");

								} else if (phy <= 75 && phy > 65) {
							
      out.write('B');
      out.write(' ');

								} else if (phy <= 65 && phy > 55) {
							
      out.write("C+\r\n");
      out.write("							");

								} else if (phy <= 55 && phy >= 33) {
							
      out.write('C');
      out.write(' ');

								} else if (phy < 33 && phy >= 0) {
							
      out.write("<span\r\n");
      out.write("							style=\"color: red\"> Fail</span> ");

 	}
 
      out.write("\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("\r\n");
      out.write("					<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("						<td>Chemistry</td>\r\n");
      out.write("						<td>100</td>\r\n");
      out.write("						<td>33</td>\r\n");
      out.write("						<td>");
      out.print(chem);
      out.write(' ');

 	if (chem < 33) {
 
      out.write(" <span style=\"color: red\">*</span>\r\n");
      out.write("							");

								}
							
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("						<td align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("							");

								if (chem <= 100 && chem > 85) {
							
      out.write(" A+ ");

								} else if (chem <= 85 && chem > 75) {
							
      out.write("B+\r\n");
      out.write("							");

								} else if (chem <= 75 && chem > 65) {
							
      out.write('B');
      out.write(' ');

								} else if (chem <= 65 && chem > 55) {
							
      out.write("C+\r\n");
      out.write("							");

								} else if (chem <= 55 && chem >= 33) {
							
      out.write('C');
      out.write(' ');

								} else if (chem < 33 && chem >= 0) {
							
      out.write("<span\r\n");
      out.write("							style=\"color: red\"> Fail</span> ");

 	}
 
      out.write("\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("\r\n");
      out.write("					<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("						<td>Maths</td>\r\n");
      out.write("						<td>100</td>\r\n");
      out.write("						<td>33</td>\r\n");
      out.write("						<td>");
      out.print(math);
      out.write(' ');

 	if (math < 33) {
 
      out.write(" <span style=\"color: red\">*</span>\r\n");
      out.write("							");

								}
							
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("						<td align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("							");

								if (math <= 100 && math > 85) {
							
      out.write(" A+ ");

								} else if (math <= 85 && math > 75) {
							
      out.write("B+\r\n");
      out.write("							");

								} else if (math <= 75 && math > 65) {
							
      out.write('B');
      out.write(' ');

								} else if (math <= 65 && math > 55) {
							
      out.write("C+\r\n");
      out.write("							");

								} else if (math <= 55 && math >= 33) {
							
      out.write('C');
      out.write(' ');

								} else if (math < 33 && math >= 0) {
							
      out.write("<span\r\n");
      out.write("							style=\"color: red\"> Fail</span> ");

 	}
 
      out.write("\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("				<table border=\"1\" width=\"100%\">\r\n");
      out.write("					<tr style=\"background: #0FFAAD\">\r\n");
      out.write("						<th>Total</th>\r\n");
      out.write("						<th>Percentage</th>\r\n");
      out.write("						<th>Division</th>\r\n");
      out.write("						<th>Result</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th style=\"background: darkcream\">");
      out.print(total);
      out.write(' ');

 	if (total < 99 || phy < 33 || chem < 33 || math < 33) {
 
      out.write("\r\n");
      out.write("							<span style=\"color: red\">*</span> ");

 	}
 
      out.write("</th>\r\n");
      out.write("\r\n");
      out.write("						<th style=\"background: darkcream\">");
      out.print(perc);
      out.write(" %</th>\r\n");
      out.write("						<th>\r\n");
      out.write("							");

								if (perc < 100 && perc >= 60) {
							
      out.write("1<sup>st</sup> ");

 	} else if (perc < 60 && perc >= 40) {
 
      out.write("2<sup>nd</sup>\r\n");
      out.write("							");

								} else if (perc < 40 && perc >= 0) {
							
      out.write("3<sup>rd</sup> ");

 	}
 
      out.write("\r\n");
      out.write("						</th>\r\n");
      out.write("\r\n");
      out.write("						<th style=\"background: darkcream\">\r\n");
      out.write("							");

								if (phy >= 33 && chem >= 33 && math >= 33) {
							
      out.write(" <span\r\n");
      out.write("							style=\"color: green\"> Pass</span> ");

 	} else {
 
      out.write(" <span\r\n");
      out.write("							style=\"color: red\"> Fail</span> ");

 	}
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("						</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("				");

					}
				
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	</center>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".footer {\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	bottom: 0;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	color: black;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<hr>\r\n");
      out.write("		<h3>&copy; Copyrights RAYS Technologies</h3>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
