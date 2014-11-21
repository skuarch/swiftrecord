<%-- 
    Document   : createNewProduct
    Created on : Nov 12, 2014, 9:39:31 AM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../application/head.jsp"/>        
    </head>
    <body>                
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <jsp:include page="../application/topmenu.jsp" />
                <jsp:include page="../application/sidemenu.jsp" />
            </nav>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header"><spring:message code="text22" /></h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                create new product form
                            </div>
                            <div class="panel-body">
                                <form role="form">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label>product name</label>
                                                <input class="form-control" type="text"/>
                                            </div>
                                            <div class="form-group">
                                                <label>otra madre</label>
                                                <input class="form-control" type="text"/>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">                                            
                                            <div class="form-group">
                                                <label>product name</label>
                                                <input class="form-control" type="text"/>
                                            </div>
                                            <div class="form-group">
                                                <label>otra madre</label>
                                                <input class="form-control" type="text"/>
                                            </div>
                                        </div>
                                    </div>
                                    <br/>
                                    <button type="reset" class="btn btn-default btn-block btn-xs">
                                        reset form
                                    </button>
                                    <button type="button" class="btn btn-success btn-block btn-lg" onclick="alertify.alert('mocos');">
                                        create new product
                                    </button>
                                </form>
                            </div>
                        </div>                            
                    </div>
                </div>    
            </div>
        </div>

        <script src="scriptI18N.html" type="text/javascript"></script>
        <jsp:include page="../application/scripts.jsp"/>        
        <script type="text/javascript">eval("${js}");</script>        
    </body>
</html>