<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library MASA | Borrow Transaction</title>

  <!-- start: Css -->
  <link rel="stylesheet" type="text/css" href="assets/asset/css/bootstrap.min.css">

  <!-- plugins -->
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/font-awesome.min.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/simple-line-icons.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/select2.min.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/datatables.bootstrap.min.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/animate.min.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/bootstrap-material-datetimepicker.css"/>
  <link href="assets/asset/css/style.css" rel="stylesheet">
  <!-- end: Css -->

  <link rel="shortcut icon" href="assets/asset/img/logomi.png">
</head>

<body id="mimin" class="dashboard">
	<!-- start: Header -->
	<nav class="navbar navbar-default header navbar-fixed-top">
		<div class="col-md-12 nav-wrapper">
			<div class="navbar-header" style="width: 100%;">
				<div class="opener-left-menu is-open">
					<span class="top"></span> <span class="middle"></span> <span
						class="bottom"></span>
				</div>
				<a class="navbar-brand"> 
                 <b>Library MASA<sup style="font-size: 12px; font-weight: 200">lah</sup></b>
                </a>
				
				<ul class="nav navbar-nav navbar-right user-nav"
					style="margin-right: 5px;">
					<li class="user-name"><span>Akihiko Avaron</span></li>
					<li class="dropdown avatar-dropdown"><img
						src="assets/asset/img/avatar.jpg" class="img-circle avatar"
						alt="user name" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true" />
						</li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- end: Header -->
	
	<div class="container-fluid mimin-wrapper">
		<!-- start:Left Menu -->
		<div id="left-menu">
			<div class="sub-left-menu scroll">
                <ul class="nav nav-list">
                	<li><div class="left-bg"></div></li>
                    <li class="time">
                      <h1 class="animated fadeInLeft">21:00</h1>
                      <p class="animated fadeInRight">Sat,October 1st 2029</p>
                    </li>
                    <li class="ripple animated fadeInLeft">
                    	<a class="nav-header" href="book">
                    		<span class="fa fa-book"></span> Books  
                    		<span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    </li>
                    <li class="active ripple animated fadeInRight">
                    	<a class="tree-toggle nav-header">
                    		<span class="fa fa-money"></span> Rent History 
                    		<span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    	<ul class="nav nav-list tree">
	                        <li><a href="rent_history">Book Rent List</a></li>
	                        <li><a href="borrow_transaction">Borrow Book</a></li>
                      	</ul>
                    </li>
                    <li class="ripple animated fadeInLeft">
                    	<a class="nav-header" href="customer">
                    		<span class="fa fa-users"></span> Customer  <span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    </li>
                    <li class="ripple animated fadeInRight">
                    	<a class="nav-header" href="employee">
                    		<span class="fa fa-user"></span> Employee  <span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    </li>
                    <li class="ripple animated fadeInLeft">
                    	<a class="nav-header" href="shelf">
                    		<span class="fa fa-archive"></span> Shelf  <span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    </li>
                    <li class="ripple animated fadeInRight">
                    	<a class="nav-header" href="publisher">
                    		<span class="fa fa-newspaper-o"></span> Publisher  <span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- end: Left Menu -->
		<!-- start: Content -->
		<div id="content">
			<div class="panel box-shadow-none content-header">
				<div class="panel-body">
					<div class="col-md-12">
						<h3 class="animated fadeInLeft">Rent</h3>
						<p class="animated fadeInDown">
							Borrow <span class="fa-angle-right fa"></span> Book
						</p>
					</div>
				</div>
			</div>
            <div class="col-md-12 top-20 padding-0">
            	<div class="col-md-12">
                  <div class="panel">
                    <div class="panel-body">
                    	<form action="borrow_transaction/save" method="POST" id="borrowForm">
							<div class="form-row">
							    <div class="form-group col-md-6">
								    <label>Customer</label>
								    <select class="form-control customer" name="customer.id">
								    	<option></option>
							    		<c:forEach var="customers" items="${customers }">
							    			<option value="${customers.id }">${customers.name }</option>
							    		</c:forEach>
							    	</select>
								</div>
								<div class="form-group col-md-6">
							    	<label>Borrow Date</label>
							    	<input type="text" class="form-control" name="borrowDate" id="borrowDate"></td>
								</div>
							  	<div class="form-group col-md-6">
							    	<label>Employee</label>
							    	<select class="form-control employee" name="employee.id" style="width: 100%;">
							    	<option></option>
							    		<c:forEach var="employee" items="${employees }">
							    			<option value="${employee.id }">${employee.name }</option>
								    	</c:forEach>
							    	</select>
							  	</div>
							  	<div class="form-group">
								  	<div class="col-md-11 book">
								  		<label>Book</label>
									    <select class="form-control bookTransaction" name="bookTransaction[0].book.id" style="width: 100%;">
									    	<option></option>
								    		<c:forEach var="book" items="${books }">
								    			<option value="${book.id }">${book.title }</option>
								    		</c:forEach>
								    	</select>
								  	</div>
							    	<div class="col-md-1">
								    	<label></label>
										<button type="button" class="btn btn-success addButton" id="addButton"><i class="fa fa-plus"></i></button><br><br>
									</div>
								</div>
								<div class="form-group hide" id="bookTemplate">
									<div class="col-md-11 book">
									    <select class="form-control" name="bookTransaction.book.id">
									    	<option></option>
								    		<c:forEach var="book" items="${books }">
								    			<option value="${book.id }">${book.title }</option>
								    		</c:forEach>
								    	</select>
								  	</div>
								  	<div class="col-md-1">
							            <button type="button" class="btn btn-danger removeButton"><i class="fa fa-minus"></i></button><br><br>
							        </div>
							    </div>
							</div>
							<div class="form-group col-md-6">
								<button type="submit" class="btn btn-primary">Save</button><br><br><br><br>
							</div>
						</form>
                    </div>
                  </div>
                </div>  
            </div>
          <!-- end: content -->         
      </div>

	<!-- start: Javascript -->
	<script src="assets/asset/js/jquery.min.js"></script>
	<script src="assets/asset/js/jquery.ui.min.js"></script>
	<script src="assets/asset/js/popper.min.js"></script>
	<script src="assets/asset/js/bootstrap.min.js"></script>
	
	<!-- plugins -->
	<script src="assets/asset/js/plugins/moment.min.js"></script>
	<script src="assets/asset/js/plugins/jquery.datatables.min.js"></script>
	<script src="assets/asset/js/plugins/datatables.bootstrap.min.js"></script>
	<script src="assets/asset/js/plugins/bootstrap-material-datetimepicker.js"></script>
	<script src="assets/asset/js/plugins/jquery.nicescroll.js"></script>
	<script src="assets/asset/js/plugins/jquery.validate.min.js"></script>
	<script src="assets/asset/js/plugins/select2.full.min.js"></script>
	
	<!-- custom -->
	<script src="assets/asset/js/main.js"></script>
	
	<script>
	$(document).ready(function() {
	    var bookIndex = 1;
		var limit = 3;
	    $('#borrowForm')
	        // Add button click handler
	        .on('click', '.addButton', function() {
	        	
	        	if (bookIndex == limit) {
					alert("ape lu minjem banyak banget!!!");
				} else {
					var $template = $('#bookTemplate'),
	                $clone    = $template
	                                .clone()
	                                .removeClass('hide')
	                                .removeAttr('id')
	                                .attr('data-book-index', bookIndex)
	                                .insertBefore($template);
	
		            // Update the name attributes
		            $clone
		                .find('[name="bookTransaction.book.id"]').attr('name', 'bookTransaction[' + bookIndex + '].book.id').end()
		                .find('[name="bookTransaction[' + bookIndex + '].book.id"]').select2({
		                	placeholder: "Select a book",
		                    allowClear: true
		                })
	                bookIndex++;
				}
	        })
	
	        // Remove button click handler
	        .on('click', '.removeButton', function() {
	            var $row  = $(this).parents('.form-group'),
	                index = $row.attr('data-book-index');
	            
	            // Remove element containing the fields
	            bookIndex--;
	            $row.remove();
	        });
	    
	   $("#bookTransaction['+bookIndex+'].id").select2({
            placeholder: "Select a book",
            allowClear: true
        }); 
	});
	</script>
	
	<script>
        $('#borrowDate').bootstrapMaterialDatePicker({
        	weekStart : 0, 
	       	time: false,
	       	maxDate : new Date(),
	       	format : 'MM/DD/YYYY',
        });
        
        $(".customer").select2({
            placeholder: "Select a customer",
            allowClear: true
        });
        
        $(".employee").select2({
            placeholder: "Select a employee",
            allowClear: true
        });
        $(".bookTransaction").select2({
            placeholder: "Select a book",
            allowClear: true
        });
    </script>
</body>
</html>