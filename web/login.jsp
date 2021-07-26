<%-- 
    Document   : login
    Created on : Feb 27, 2018, 12:18:08 AM
    Author     : Nasrin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="resources/js/jquery2.js" type="text/javascript"></script>
        <script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="wait overlay">
            <div class="loader"></div>
        </div>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">	
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#collapse" aria-expanded="false">
                        <span class="sr-only">navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
            </div>
        </div>	
        <p><br/></p>
        <p><br/></p>
        <p><br/></p>

        <div class="container-fluid">
            <div class="col-md-3 col-xs-12"></div>
            <div class="col-md-6 col-xs-12">
                <div class="row">
                    <div class="col-md-12 col-xs-12" id="product_msg">
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading" style="text-align: center"><strong>Login</strong></div>
                    <div class="panel-body">
                        <form  class="form-horizontal" method="POST" action="query.jsp">
                            <div class="form-group">
                                <label  for="nameField" class="col-xs-2">ID</label>
                                <div class="col-xs-10">
                                    <input  type="text" name="id"  class="form-control" id="nameField" placeholder="Enter Your id" required="true" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label  for="passField" class="col-xs-2">Password</label>
                                <div class="col-xs-10">
                                    <input  type="password" name="password" class="form-control" id="passField" placeholder="Enter Your Password" required="true"/>
                                </div>
                            </div>
                            <div class="col-xs-10 col-xs-offset-2">
                                <button type="submit" class="btn btn-primary glyphicon glyphicon-log-in">&nbsp;Login </button> 
                                <button type="reset" class="btn btn-primary glyphicon glyphicon-remove-sign">&nbsp;Reset</button>
                            </div>
                        </form>
                    </div>
                    <div class="panel-footer"></div>
                </div>
            </div>
            <div class="col-md-3 col-xs-12"></div>
        </div>
    </body>
</html>
