<%-- 
    Document   : signup
    Created on : Feb 27, 2018, 12:18:24 AM
    Author     : Nasrin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp</title>
        <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="resources/js/jquery2.js" type="text/javascript"></script>
        <script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="resources/js/angular.min.js" type="text/javascript"></script>
        <script src="resources/js/myangular.js" type="text/javascript"></script>
    </head>
    <body ng-app="simpleApp" ng-controller="simpleCtrl">
        
        <div class="container">
            <div class="col-sm-12">
                <div class="panel panel-success">
                    <div class="panel-heading">
                        <h4 style="text-align: center">Student Registration</h4>
                    </div>
                    <div class="panel-body">
                        <form class="form-horizontal" ng-submit="submitSimple()">
                            <div class="form-group">
                                <label class="col-sm-2">Name</label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="name" placeholder= "name is required" required="true" ng-model="simpleForm.name"/>
                                </div>
                                <label class="col-sm-2">Date of Birth</label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="dob" placeholder="dd-MM-yyyy" ng-model="simpleForm.dob"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2">Email</label>
                                <div class="col-sm-4">
                                    <input type="email" class="form-control" name="email" placeholder="xyz@gmail.com" ng-model="simpleForm.email"/>
                                </div>
                                 <label class="col-sm-2">Password</label>
                                <div class="col-sm-4">
                                    <input type="password" class="form-control" name="password" placeholder="password must be 6 character" required="true" ng-model="simpleForm.password"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2">Address </label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="address" placeholder="Enter your address" ng-model="simpleForm.address"/>
                                </div>
                                <label class="col-sm-2">Gender</label>
                                <div class="col-sm-4">
                                    <input type="radio" value="male" ng-model="simpleForm.gender"/>Male &nbsp;&nbsp;
                                    <input type="radio" value="female" ng-model="simpleForm.gender"/>Female
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2">Contact </label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="contact" placeholder="Enter your contact" ng-model="simpleForm.contact"/>
                                </div>
                                 <label class="col-sm-2">City </label>
                                 <div class="col-sm-4" >
                                     <select ng-model="simpleForm.city">
                                        <option value="">select one</option>
                                        <option value="Dhaka">Dhaka</option>
                                        <option value="Khulna">Khulna</option>
                                        <option value="Chittagong">Chittagong</option>
                                        <option value="Rajshahi">Rajshahi</option>
                                        <option value="Barisal">Barisal</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2">Course </label>
                                <div class="col-sm-4">
                                    <select ng-model="simpleForm.course">
                                        <option value="">select one</option>
                                        <option value="IELTS">IELTS</option>
                                        <option value="GRE">GRE</option>
                                        <option value="Spoken">Spoken</option>
                                        <option value="ACCA">ACCA</option>
                                        <option value="CAT">CAT</option>
                                    </select>
                                </div>
                                <label class="col-sm-2"></label>
                                <div class="col-sm-4">
                                    <button class="btn btn-success">Submit</button>
                                    <button type="reset" class="btn btn-danger">Reset</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="col-sm-12">
                <div class="panel panel-success">
                    <div class="panel-heading">
                        <h4 style="text-align: center">Student Details</h4>
                    </div>
                    <div class="panel-body">
                        <table class="table table-bordered">
                            <thead>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Date of Birth</th>
                            <th>Email</th>
                            <th>Password</th>
                            <th>Address</th>
                            <th>Gender</th>
                            <th>Contact</th>
                            <th>City</th>
                            <th>Course</th>
                            <th>Action</th>
                            </thead>
                            <tr ng-repeat="simple in simples">
                                <td> {{ simple.id}}</td>
                                <td> {{ simple.name}}</td>
                                <td> {{ simple.dob}}</td>
                                <td >{{ simple.email}}</td> 
                                <td >{{ simple.password}}</td> 
                                <td >{{ simple.address}}</td>  
                                <td >{{ simple.gender}}</td>  
                                <td >{{ simple.contact}}</td>  
                                <td >{{ simple.city}}</td>  
                                <td >{{ simple.course}}</td>   
                                <td>
                                    <a ng-click="editSimple(simple)" class="btn btn-warning">
                                        <span >Edit</span>
                                    </a>
                                    <a ng-click="deleteSimple(simple)" class="btn btn-danger">
                                        <span >Delete</span>
                                    </a>
                                </td>
                            </tr>
                        </table> 
                    </div>  
                </div>

            </div> 
        </div>

    </div>
</body>
</html>
