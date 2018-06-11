<%-- 
    Document   : index
    Created on : Apr 13, 2018, 2:57:35 PM
    Author     : Jasmine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
     <head>
     <title>Home</title>
     <meta charset="utf-8">
     <link rel="icon" href="images/favicon.ico">
     <link rel="shortcut icon" href="images/favicon.ico" />
     <link rel="stylesheet" href="css/style.css">
     <link rel="stylesheet" href="css/camera.css">
     <script src="js/jquery.js"></script>
     <script src="js/jquery-migrate-1.1.1.js"></script>
     <script src="js/superfish.js"></script>
     <script src="js/jquery.equalheights.js"></script>
     <script src="js/jquery.easing.1.3.js"></script>
     <script src="js/camera.js"></script>
     <!--[if (gt IE 9)|!(IE)]><!-->
     <script src="js/jquery.mobile.customized.min.js"></script>
     <!--<![endif]-->
     <script>
      $(document).ready(function(){
          jQuery('#camera_wrap').camera({
            loader: false,
            pagination: false ,
            thumbnails: false,
            height: '32.92857142857143%',
            minHeight: '300',
            caption: false,
            navigation: true,
            fx: 'mosaic'
          });
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
     <body  class="page1">
<!--==============================header=================================-->
 <header> 
  <div class="container_12">
   <div class="grid_12"> 
    <h1><a href="index.html"><img src="#" width="50%" alt="Boo House"></a> </h1>
    <div class="menu_block">

     <nav  class="" >
      <ul class="sf-menu">
         <li class="current"><a href="index.jsp">Home</a></li>
         <li><a href="about.jsp">About</a></li>
         <li><a href="ebooks.jsp">Ebooks</a></li>
       </ul>
    </nav>
    
 <div class="clear"></div>
</div>
<div class="clear"></div>
          </div>
      </div>
</header>
<div class="slider_wrapper">
      <div id="camera_wrap" class="">
        <div data-src="images/slide.jpg">
        </div>
        <div data-src="images/slide.png">
        </div>
        <div data-src="images/slidee.png" width="50">
        </div>
      </div>
</div>
<!--==============================Content=================================-->

<div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - September 14, 2013!</div>
  <div class="container_12">
    <div class="grid_12">
      <h2>WELCOME TO EBOOKS<span>Temukan Ebooks yang ingin kamu cari
</span></h2>
<h3><span></span></h3>
    </div>
    <div class="grid_4">
      <div class="icon">
        <img src="images/icon1.png" alt="">
        <div class="title">E-BOOKS</div>ebokss adalah haha
      </div>
    </div>
    <div class="grid_3">
      <div class="icon">
        <img src="images/icon2.png" alt="">
        <div class="title">PICTURE</div>Gambar yang lebih menarik dan mudah dipahami
      </div>
    </div>
    <div class="grid_4">
      <div class="icon">
        <img src="images/icon3.png" alt="">
        <div class="title">EASY TO ACCESS</div>mudah untuk di akses
      </div>
    </div>
    <div class="grid_12">
      <h3><span>Most Popular Ebooks</span></h3>
    </div>
    <div class="clear"></div>
    <div class="works">
      <div class="grid_4"><a href="#"><img src="images/html.PNG" alt=""></a></div>
      <div class="grid_4"><a href="#"><img src="images/angular.PNG" alt=""></a></div>
      <div class="grid_4"><a href="#"><img src="images/php.PNG" alt=""></a></div>
      <div class="clear"></div>
    </div>
    <div class="clear">
        
    
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
      Ebooks Online (C) 2018 | <a href="#">Privacy Policy</a> |Created By Jasmine Nabila Novel and Yansiska
      </div>
    </div>
  </div>
</footer>

</body>
</html>