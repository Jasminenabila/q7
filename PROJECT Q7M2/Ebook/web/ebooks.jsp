<%-- 
    Document   : ebooks
    Created on : Apr 14, 2018, 3:28:30 PM
    Author     : Jasmine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.mBook" %>
<%@page import="model.AutoG" %>
<%@page import="config.koneksi" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<html lang="en">
     <head>
     <title>Portfolio</title>
     <meta charset="utf-8">
     <link rel="icon" href="images/favicon.ico">
     <link rel="shortcut icon" href="images/favicon.ico" />
     <link rel="stylesheet" href="css/style.css">
     <link rel="stylesheet" href="css/touchTouch.css">
     <script src="js/jquery.js"></script>
     <script src="js/jquery-migrate-1.1.1.js"></script>
     <script src="js/superfish.js"></script>
     <script src="js/touchTouch.jquery.js"></script>
     <script src="js/jquery.equalheights.js"></script>
     <script src="js/jquery.easing.1.3.js"></script>
     <script>
      $(function(){
        // Initialize the gallery
        $('.port a.gal').touchTouch();
      });
     </script>
     <!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
         </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <link rel="stylesheet" media="screen" href="css/ie.css">

    <![endif]-->
     </head>
     <body  class="">
<!--==============================header=================================-->
 <header> 
  <div class="container_12">
   <div class="grid_12"> 
    <h1><a href="index.html"><img src="#" alt="Boo House"></a> </h1>
    <div class="menu_block">

     <nav  class="" >
      <ul class="sf-menu">
         <li><a href="index.jsp">Home</a></li>
         <li><a href="about.jsp">about</a></li>
         <li class="current"><a href="ebooks.jsp">Ebooks</a></li>      
       </ul>
    </nav>
    
 <div class="clear"></div>
</div>
<div class="clear"></div>
          </div>
      </div>
</header>

<!--==============================Content=================================-->

<div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - September 14, 2013!</div>
  <div class="container_12">
    <div class="grid_12">
      <h3><span>Our Portfolio</span></h3>
    </div>
    <div class="clear"></div>
    <div class="port">
        
        
        <%
                      try{
                        mBook stk = new mBook();
                        ArrayList data = stk.display();
                        for(int i = 0;i < data.size()-1;i+=5)
                        {
                            //fac_code, fac_name, fac_email, fac_phone
                                String idEbook = (String)data.get(i);
                                String judul = (String)data.get(i+1);
                                String deskripsi = (String)data.get(i+2);
                                String filepdf = "/upload/" + (String) data.get(i+3);
                                String gambar = "/foto/" + (String) data.get(i+4);      
                                 
                                  out.println("<div class='grid_4'>");
                                  out.println("<img src ='"+request.getContextPath()+gambar+"' width='500' alt=''></a>");
                                  out.println("<div class='text1 col1'> "+judul+" </div>");
                                  out.println(deskripsi);
                                  out.println("<br>");
                                  out.println("<a href='htmlcss.jsp?id="+idEbook+"'>Detail Book</a>");
                                  out.println("</div>");
                        }
                    }
                    catch(Exception ex) {
                        out.println("Data Gagal Ditampilkan" + ex.toString());
                    }


                      %> 
       
        <%--  <div class="grid_4">
        <a href="C" class="gal"><img src="images/html.PNG" alt=""></a>
        <div class="text1 col1">HTML CSS </div>
       Tutorial HTML dan CSS bagi pemula yang ingin belajar pemograman <br>
        <a href="htmlcss.jsp">Go to Site</a>
      </div>
      <div class="grid_4">
        <a href="images/phph.PNG" class="gal" ><img src="images/phph.PNG" alt=""></a>
        <div class="text1 col1">Dgtyer tomay</div>
        Syrmentum nisl tempus cometumyloterna to. <br>
        <a href="#">Go to Site</a>
      </div>
         <div class="grid_4">
        <a href="images/big2.jpg" class="gal"><img src="images/page3_img2.jpg" alt=""></a>
        <div class="text1 col1">Dgtyer tomay</div>
        Syrmentum nisl tempus cometumyloterna to. <br>
        <a href="#">Go to Site</a>
      </div>
      <div class="clear"></div>
      <div class="grid_4">
        <a href="images/big7.jpg" class="gal"><img src="images/page3_img7.jpg" alt=""></a>
        <div class="text1 col1">Derto malice </div>
        <br>Fermentum nisl tempus cometumylo eterna is. 
        <a href="#">Go to Site</a>
      </div>
      <div class="grid_4">
        <a href="images/big8.jpg" class="gal"><img src="images/page3_img8.jpg" alt=""></a>
        <div class="text1 col1">gtyer tomay</div>
        Syrmentum nisl tempus cometumyloterna to. <br> 
        <a href="#">Go to Site</a>
      </div> --%>
    </div>
  </div>
</div>

<!--==============================footer=================================-->

<footer>    
  <div class="container_12">
    <div class="grid_12">
    <div class="socials">
      <a href="#"></a>
      <a href="#"></a>
      <a href="#"></a>
      <a href="#"></a>
    </div>
      <div class="copy">
      WebDesign (C) 2013 | <a href="#">Privacy Policy</a> | Website Template  designed by <a href="http://www.templatemonster.com/" rel="nofollow">TemplateMonster.com</a>
      </div>
    </div>
  </div>
</footer>

</body>
</html>