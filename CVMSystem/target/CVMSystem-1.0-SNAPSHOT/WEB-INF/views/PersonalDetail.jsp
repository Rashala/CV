<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  
         pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>CV Management- Bitscraft</title>

        <!-- Bootstrap Core CSS -->
        <link href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="${pageContext.request.contextPath}/resources/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

        <!-- Timeline CSS -->
        <link href="${pageContext.request.contextPath}/resources/dist/css/timeline.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${pageContext.request.contextPath}/resources/dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="${pageContext.request.contextPath}/resources/bower_components/morrisjs/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/resources/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">




    </head>

    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">CV Management- Bitscraft</a>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">                      
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li class="divider"></li>
                            <li><a href="${pageContext.request.contextPath}/login.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-search">
                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">
                                            <i class="fa fa-search"></i>
                                        </button>
                                    </span>
                                </div>
                                <!-- /input-group -->
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/index.jsp"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Employee<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/PersonalDetail.jsp">Add Employee</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/displayPersonalDetails.jsp">Display Employee</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>

                            <li>
                                <a href="#"><i class="fa fa-sitemap fa-fw"></i> Forms<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/personal/addPersonal">Personal Detail</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/academic/addAcademic">Academic Qualification</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/job/add">Job Experience</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/training/addTraining">Training</a>
                                    </li>    
                                    <li>
                                        <a href="${pageContext.request.contextPath}/appliedInformation/addAppliedInformation">Applied Information</a>
                                    </li>

                                </ul>
                                <!-- /.nav-second-level -->
                            </li>

                        </ul>
                    </div>


                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>

            <div id="page-wrapper">

                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panewl-default">
                            <div class="panel-heading">
                                <h4>Personal Details</h4>
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <form:form action="personal/save" method="post" modelAttribute="personal">

                                            <div class="form-group form-inline">
                                                <form:label path="prefix">Prefix &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:select class="form-control" path="prefix" items="${prefix}">  </form:select> 
                                                </div>

                                                <div class="form-group form-inline">
                                                <form:label path="firstName" >First Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="firstName" value="${personal.firstName}" ></form:input>
                                                </div>

                                                <div class="form-group form-inline">
                                                <form:label path="middleName">Middle Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="middleName" value="${personal.middleName}"></form:input>
                                                </div>

                                                <div class="form-group form-inline">
                                                <form:label path="lastName">Last Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="lastName" value="${personal.lastName}"></form:input>
                                                </div>


                                                <div class="form-group form-inline">
                                                <form:label path="gender">Gender &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>

                                                <form:label path="gender">
                                                    <input type="radio" path="gender" value="${personal.gender}">Male &nbsp;</input>
                                                </form:label>

                                                <form:label path="gender">
                                                    <input type="radio" name="female" value="${personal.gender}">Female &nbsp;
                                                </form:label>

                                                <form:label path="gender">
                                                    <input type="radio" name="others" value="${personal.gender}">Others
                                                </form:label>

                                            </div>

                                            <div class="form-group form-inline">
                                                <form:label for="dob" path="DOB">Date of Birth &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input type="date" class="form-control" path="DOB" id="dob" value="${personal.DOB}"></form:input>
                                                </div>

                                                <div class="form-group form-inline">
                                                <form:label path="address">Address &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="address" value="${personal.address}"></form:input>
                                                </div>   

                                                <div class="form-group form-inline ">
                                                <form:label path="contactNumber">Mobile &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="contactNumber" value="${personal.contactNumber}"></form:input>
                                                </div>

                                                <div class="form-group form-inline">
                                                <form:label path="altContactNumber">Alternate Mobile &nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="altContactNumber" value="${personal.altContactNumber}"></form:input>
                                                </div>

                                                <div class="form-group form-inline ">
                                                <form:label path="email">Email &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="email" value="${personal.email}"></form:input>
                                                </div>

                                                <div class="form-group form-inline">
                                                <form:label path="empType">Employee Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                                                <form:input class="form-control" path="empType" value="${personal.empType}"></form:input>
                                                </div>



                                                <div>
                                                    <input type="submit" name="action" value="add" class="btn btn-success">
                                                    <input type="submit" name="action" value="reset" class="btn btn-danger">
                                                </div>
                                        </form:form>
                                        <!--                                        <div class="form-group ">
                                                                                <table border="2">
                                                                                    <tr>employee Id</tr>
                                                                                    <tr>first name</tr>
                                                                                    <tr>middle name</tr>
                                                                                    <tr>last name</tr>
                                                                                    <tr>gender</tr>
                                                                                    <tr>date of birth</tr>
                                                                                    <tr>address</tr>
                                                                                    <tr>marital status</tr>
                                                                                    <tr>contact number</tr>
                                                                                    <tr>alternate contact</tr>
                                                                                    <tr>email</tr>
                                                                                    <tr>type</tr>
                                                                                    
                                        <c:forEach items="${personalList}" var="personal">
                                            <tr>
                                                <td>${personal.employeeId}</td>
                                                <td>${personal.firstname}</td>
                                                <td>${personal.middlename}</td>
                                                <td>${personal.lastname}</td>
                                                <td>${personal.gender}</td>
                                                <td>${personal.dob}</td>
                                                <td>${personal.address}</td>
                                                <td>${personal.maritalstatus}</td>
                                                <td>${personal.contactnumber}</td>
                                                <td>${personal.alternatecontact}</td>
                                                <td>${personal.email}</td>
                                                <td>${personal.employeetype}</td>
                                                
                                            </tr>
                                           
                                        </c:forEach>
                                        
                                    </table>
                                    </div>-->
                                    </div>

                                </div>
                                <!-- /.row (nested) -->
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="../bower_components/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../dist/js/sb-admin-2.js"></script>

    </body>

</html>
