<%--
  Created by IntelliJ IDEA.
  User: asliddin
  Date: 03/08/22
  Time: 08:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Geeks &mdash; Website by Colorlib</title>
    <jsp:include page="../head.jsp"/>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,700,900" rel="stylesheet">
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">

    <link rel="stylesheet" href="css/jquery.fancybox.min.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">

    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

    <link rel="stylesheet" href="css/aos.css">
    <link href="css/jquery.mb.YTPlayer.min.css" media="all" rel="stylesheet" type="text/css">

    <link rel="stylesheet" href="css/style.css">


</head>

<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">

<div class="site-wrap">

    <div class="site-mobile-menu site-navbar-target">
        <div class="site-mobile-menu-header">
            <div class="site-mobile-menu-close mt-3">
                <span class="icon-close2 js-menu-toggle"></span>
            </div>
        </div>
        <div class="site-mobile-menu-body"></div>
    </div>


    <div class="py-2 bg-light">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-9 d-none d-lg-block">
                    <a href="#" class="small mr-3"><span class="icon-question-circle-o mr-2"></span> Have a
                        questions?</a>
                    <a href="#" class="small mr-3"><span class="icon-phone2 mr-2"></span>+ 99 899 059-99-01</a>
                    <a href="#" class="small mr-3"><span class="icon-envelope-o mr-2"></span> geeks@academia.edu</a>
                </div>
                <div class="col-lg-3 text-right">
                    <a href="login.html" class="small mr-3"><span class="icon-unlock-alt"></span> Log In</a>
                    <a href="register.html" class="small btn btn-primary px-4 py-2 rounded-0"><span
                            class="icon-users"></span> Register</a>
                </div>
            </div>
        </div>
    </div>
    <header class="site-navbar py-4 js-sticky-header site-navbar-target" role="banner">

        <div class="container">
            <div class="d-flex align-items-center">
                <div class="site-logo">
                    <!--            <a href="index.html" class="d-block">-->
                    <img src="/resources/images/logo.jpg" alt="Image" class="img-fluid">
                    <!--            </a>-->
                </div>
                <!--          <div class="mr-auto">-->
                <!--            <nav class="site-navigation position-relative text-right" role="navigation">-->
                <!--              <ul class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">-->
                <!--&lt;!&ndash;                <li>&ndash;&gt;-->
                <!--&lt;!&ndash;                  <a href="index.html" class="nav-link text-left">Home</a>&ndash;&gt;-->
                <!--&lt;!&ndash;                </li>&ndash;&gt;-->
                <!--                <li class="has-children">-->
                <!--                  <a href="about.html" class="nav-link text-left">About Us</a>-->
                <!--                  <ul class="dropdown">-->
                <!--                    <li><a href="teachers.html">Our Teachers</a></li>-->
                <!--                    <li><a href="about.html">Our School</a></li>-->
                <!--                  </ul>-->
                <!--                </li>-->
                <!--                <li>-->
                <!--                  <a href="admissions.html" class="nav-link text-left">Admissions</a>-->
                <!--                </li>-->
                <!--                <li>-->
                <!--                  <a href="courses.html" class="nav-link text-left">Courses</a>-->
                <!--                </li>-->
                <!--                <li>-->
                <!--                    <a href="contact.html" class="nav-link text-left">Contact</a>-->
                <!--                  </li>-->
                <!--              </ul>                                                                                                                                                                                                                                                                                          </ul>-->
                <!--            </nav>-->

                <!--          </div>-->
                <div class="ml-auto">
                    <div class="social-wrap">
                        <a href="https://www.facebook.com/"><span class="icon-facebook"></span></a>
                        <a href="https://twitter.com/home"><span class="icon-twitter"></span></a>
                        <a href="https://www.instagram.com/"><span class="icon-instagram"></span></a>
                        <a href="https://www.linkedin.com/feed/"><span class="icon-linkedin"></span></a>

                        <a href="#" class="d-inline-block d-lg-none site-menu-toggle js-menu-toggle text-black"><span
                                class="icon-menu h3"></span></a>
                    </div>
                </div>

            </div>
        </div>

    </header>


    <div class="site-section ftco-subscribe-1 site-blocks-cover pb-4"
         style="background-image: url('/resources/images/bg_1.jpg')">
        <div class="container">
            <div class="row align-items-end justify-content-center text-center">
                <div class="col-lg-7">
                    <h2 class="mb-0">Register</h2>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing.</p>
                </div>
            </div>
        </div>
    </div>


    <div class="custom-breadcrumns border-bottom">
        <div class="container">
            <!--        <a href="index.html">Home</a>-->
            <span class="mx-3 icon-keyboard_arrow_right"></span>
            <span class="current">Register</span>
        </div>
    </div>

    <div class="site-section">
        <div class="container">


            <div class="row justify-content-center">
                <div class="col-md-5">
                    <div class="row">
                        <form method="post">
                            <div class="col-md-12 form-group">
                                <label for="username">Username</label>
                                <input type="text" id="username" class="form-control form-control-lg">
                            </div>


                            <div class="col-md-12 form-group">
                                <label for="password">Password</label>
                                <input type="password" id="password" class="form-control form-control-lg">
                            </div>

                            <div class="col-md-12 form-group">
                                <label for="password2">Re-type Password</label>
                                <input type="password" id="password2" class="form-control form-control-lg">
                            </div>

                            <div class="row">
                                <div class="col-12">
                                    <input type="submit" value="Register" class="btn btn-primary btn-lg px-5">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <p class="mb-4"><img src="/resources/images/logo.png" alt="Image" class="img-fluid"></p>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae nemo minima qui dolor,
                        iusto
                        iure.</p>
                    <p><a href="#">Learn More</a></p>
                </div>
                <div class="col-lg-3">
                    <h3 class="footer-heading"><span>Contact</span></h3>
                    <ul class="list-unstyled">
                        <li><a href="#">Help Center</a></li>
                        <li><a href="#">Support Community</a></li>
                        <li><a href="#">Press</a></li>
                        <li><a href="#">Share Your Story</a></li>
                        <li><a href="#">Our Supporters</a></li>
                    </ul>
                </div>
            </div>

            <div class="row">
                <div class="col-12">
                    <div class="copyright">
                        <p>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            &copy;<script>document.write(new Date().getFullYear());</script>
                            Tashkent
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>


</div>
<!-- .site-wrap -->

<!-- loader -->
<div id="loader" class="show fullscreen">
    <svg class="circular" width="48px" height="48px">
        <circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/>
        <circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10"
                stroke="#51be78"/>
    </svg>
</div>

<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/jquery-migrate-3.0.1.min.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.stellar.min.js"></script>
<script src="js/jquery.countdown.min.js"></script>
<script src="js/bootstrap-datepicker.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/aos.js"></script>
<script src="js/jquery.fancybox.min.js"></script>
<script src="js/jquery.sticky.js"></script>
<script src="js/jquery.mb.YTPlayer.min.js"></script>


<script src="js/main.js"></script>
</body>

</html>
