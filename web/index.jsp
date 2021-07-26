<%-- 
    Document   : index
    Created on : Feb 26, 2018, 11:32:55 PM
    Author     : Nasrin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>English Spoken Admission</title>
        <link href="layout/styles/layout.css" rel="stylesheet" type="text/css"/>
    </head>
    <body id="top">
        <div class="wrapper col1">
            <div id="head">
                <h1><a href="#">English Spoken </a></h1>
                <p>Online Admission</p>
                <div id="topnav">
                    <ul>
                        <li><a class="active" href="#">Home</a></li>
                        <li><a href="#">About</a>
                            <ul>

                                <li class="first collapsed"><a href="#">IELTS</a></li>
                                <li class="collapsed"><a href="#">IELTS for UK Visas and Immigration</a></li>
                                <li class="collapsed"><a href="#">Cambridge English</a></li>
                                <li class="collapsed"><a href="#">Aptis - Assess English Skills</a></li>
                                <li class="collapsed"><a href="#">IGCSE/International GCSE, A Level and school exams</a></li>
                                <li class="collapsed"><a href="#">Professional and university exams</a></li>
                                <li class="leaf"><a href="#">Computer-based (CB) Test</a></li>
                                <li class="collapsed"><a href="#">Why take an exam with the Council?</a></li>
                                <li class="last collapsed"><a href="#">Information for schools and institutions</a></li>
                            </ul>
                        </li>
                        <li><a href="admissionDetail.jsp">Admission</a>

                        </li>
                        <li><a href="signup.jsp">SignUp</a></li>
                        <li class="last"><a href="login.jsp">Login</a></li>
                    </ul>
                </div>
                <div id="search">
                    <form action="#" method="post">
                        <fieldset>
                            <legend>Site Search</legend>
                            <input type="submit" name="go" id="go" value="GO" />
                            <input type="text" value="Search the site&hellip;"  onfocus="this.value = (this.value == 'Search the site&hellip;') ? '' : this.value;" />
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
        <div class="wrapper col2">
            <div id="gallery">
                <ul>
                    <li class="placeholder" style="background-image:url(images/gallery_default.jpg);">Image Holder</li>
                    <li><a class="swap" style="background-image:url(images/d1.png);" href="#gallery"><strong>Services</strong><span><img src="images/gallery_1.jpg" alt="" /></span></a></li>
                    <li><a class="swap" style="background-image:url(images/d1.jpg);" href="#gallery"><strong>Products</strong><span><img src="images/gallery_2.png" alt="" /></span></a></li>
                    <li class="last"><a class="swap" style="background-image:url(images/d2.jpg);" href="#gallery"><strong>Company</strong><span><img src="images/gallery_3.jpg" alt="" /></span></a></li>
                </ul>
                <div class="clear"></div>
            </div>
        </div>
        <div class="wrapper col5">
            <div id="footer">
                <div id="contactform">
                    <h2>Opening Hours</h2>
                    <ul>
                        <li>Mon-Thu 9.00-7.00</li>
                        <li>Fri-Sun 11.00-9.00</li>
                        <li>Company Name Ltd</li>
                        <li>Registered in Spoken &amp; IELTS</li>
                        <li>Company No. 123456</li>
                        <li class="last">VAT No. FRD23456  </li>
                    </ul>
                    <h2>Stay in The Know !</h2>
                    <p><a href="#">Get Our E-Newsletter</a> | <a href="#">Grab The RSS Feed</a></p>
                </div>
                <div id="compdetails">

                    <div id="officialdetails">
                        <h2>Company Information !</h2>
                        <ul>
                            <li>Company Name Ltd</li>
                            <li>Registered in Spoken &amp; IELTS</li>
                            <li>Company No. 123456</li>
                            <li class="last">VAT No. FRD23456  </li>
                        </ul>
                        <h2>Stay in The Know !</h2>
                        <p><a href="#">Get Our E-Newsletter</a> | <a href="#">Grab The RSS Feed</a></p>
                    </div>
                    <div id="contactdetails">
                        <h2>Our Contact Details !</h2>
                        <ul>
                            <li>Ram English Spoken Center</li>
                            <li>Azimpur,Dhaka -1205</li>
                            <li>Tel: +8806 12365478</li>
                            <li>Fax: 14785 12365478</li>
                            <li>Email: spoken@gmail.com</li>
                            <li class="last">LinkedIn: <a href="#">Company Profile</a></li>
                        </ul>
                    </div>
                    <div class="clear"></div>
                </div>
                <!-- End  Details -->
                <div id="copyright">
                    <p class="fl_left">Copyright &copy; 2018 - All Rights Reserved - <a href="#">Nasrin Sultana</a></p>
                    <p class="fl_right">Powered By <a target="_blank" href="#" >NS Software</a></p>
                    <br class="clear" />
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </body>
</html>
