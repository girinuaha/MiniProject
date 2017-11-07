<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library MASA | Customer</title>

  <!-- start: Css -->
  <link rel="stylesheet" type="text/css" href="assets/asset/css/bootstrap.min.css">

  <!-- plugins -->
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/font-awesome.min.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/simple-line-icons.css"/>
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
                    <li class="ripple animated fadeInRight">
                    	<a class="tree-toggle nav-header">
                    		<span class="fa fa-money"></span> Rent History 
                    		<span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    	<ul class="nav nav-list tree">
	                        <li><a href="rent_history">Book Rent List</a></li>
	                        <li><a href="borrow_transaction">Borrow Book</a></li>
                      	</ul>
                    </li>
                    <li class="active ripple animated fadeInLeft">
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
						<h3 class="animated fadeInLeft">Customer</h3>
						<p class="animated fadeInDown">
							Customer <span class="fa-angle-right fa"></span> List
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-12 top-20 padding-0">
            	<div class="col-md-12">
                  <div class="panel">
                    <div class="panel-body">
                      <div class="responsive-table">
                      
                      <button class="tree-toggle btn btn-success icon-box add-btn"><span class="fa fa-plus"/> Add Customer</button><br><br>
                      <ul class="nav nav-list tree">
                      	<form id="add-form" method="POST" action="customer/save">
                      		<div class="col-md-6">
                      			<div class="form-group form-animate-text" style="margin-top:10px !important;">
                              		<input type="text" class="form-text" name="name" required>
								    <span class="bar"></span>
	                              	<label>Name</label>
	                            </div>
	                            <div class="form-group form-animate-text" style="margin-top:10px !important;">
	                            	<input class="form-text" type="text" name="address" required>
	                            	<span class="bar"></span>
	                            	<label>Address</label>
	                            </div>
	                            <div class="form-group form-animate-text" style="margin-top:10px !important;">
	                            	<input type="text" class="form-text" name="email" required>
	                            	<span class="bar"></span>
	                            	<label>E-mail</label>
	                            </div>
	                       	</div>
	                       	<div class="col-md-6">
	                       		<div class="form-group form-animate-text" style="margin-top:10px !important;">
	                       			<input type="text" class="form-text mask-phone" name="phoneNumber" required>
	                       			<span class="bar"></span>
	                       			<label>Phone Number</label>
	                       		</div>
	                       		<div class="form-group form-animate-text" style="margin-top:10px !important;">
	                       			<input type="text" class="form-text" name="birthDate" id="birthDate" required>
	                       			<span class="bar"></span>
	                       			<label>Birth Date</label>
	                       		</div>
	                       	</div>                   
                          <div class="col-md-12">
                          	<input class="submit btn btn-primary" type="submit" value="Submit"><br><br><br>
                          </div>
                      	</form>
                      </ul>
                      <table id="customer-list" class="table table-striped table-bordered" width="100%" cellspacing="0">
	                      <thead>
	                        <tr>
								<th>Name</th>
								<th>Address</th>
								<th>Email</th>
								<th>Phone Number</th>
								<th>Birth Date</th>
								<th style="width: 14%;">Action</th>
							</tr>
	                      </thead>
	                      <tbody>
	                      	<c:forEach var="customer" items="${customers }">
								<tr>
									<td>${customer.name }</td>
									<td>${customer.address }</td>
									<td>${customer.email }</td>
									<td>${customer.phoneNumber }</td>
									<td>${customer.birthDate }</td>
									<td style="text-align: center;">
										<button class="btn btn-warning btn-xs update-btn icon-box" data-id="${customer.id}" title="Update"><span class="icons icon-note"></span></button>&nbsp;
										<button class="btn btn-danger btn-xs delete-btn icon-box" data-id="${customer.id}" title="Delete"><span class="icons icon-trash"></span></button>
									</td>
								</tr>
							</c:forEach>
	                      </tbody>
                      </table>
                      </div>
                  </div>
                </div>
              </div>  
            </div>
		</div>
		<!-- end: content -->
	</div>
	
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Update
						Confirmation</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="modname">Name</label> 
							<input type="text" class="form-control" id="modname" name="modname" disabled>
						</div>
						<div class="form-group">
							<label>Address</label>
							<input type="text" class="form-control" id="modaddress" name="modaddress">
						</div>
						<div class="form-group">
							<label>Email</label>
							<input type="email" class="form-control" name="modemail" id="modemail">
						</div>
						<div class="form-group">
							<label>Phone Number</label>
							<input type="text" class="form-control" name="modphoneNumber" id="modphoneNumber">
						</div>
						<div class="form-group">
							<label>Birth Date</label>
							<input type="text" class="form-control" id="modbirthDate" name="modbirthDate" disabled>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary" id="submit-update">Update</button>
				</div>
			</div>
		</div>
	</div>
	
	<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Delete
						Confirmation</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Are you sure?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Cancel</button>
					<button type="button" class="btn btn-primary" id="submit-delete">Delete</button>
				</div>
			</div>
		</div>
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
	<script src="assets/asset/js/plugins/jquery.mask.min.js"></script>
	
	<!-- custom -->
	<script src="assets/asset/js/main.js"></script>
		
	<script type="text/javascript">
	  $(document).ready(function(){
		$('#birthDate').bootstrapMaterialDatePicker({
	       	weekStart : 0, 
	       	time: false,
	       	maxDate : new Date(),
	       	format : 'DD/MM/YYYY',
	    });
		  
	    $('#customer-list').DataTable();
	    
	    $('.mask-phone').mask('0000-0000-0000');
	    
	    $("#add-form").validate({
	        errorElement: "em",
	        errorPlacement: function(error, element) {
	          $(element.parent("div").addClass("form-animate-error"));
	          error.appendTo(element.parent("div"));
	        },
	        success: function(label) {
	          $(label.parent("div").removeClass("form-animate-error"));
	        },
	        rules: {
	          name: "required",
	          address: "required",
	          email: {
	            required: true,
	            email: true
	          }
	        },
	        messages: {
	          name: "Please enter your name",
	          address: "Please enter your address",
	          email: "Please enter a valid email address"
	        }
	      });
	  });
	</script>
	
	<script type="text/javascript">
		var id = 0;
		$(document).ready(function() {

			$('#customer-list').on('click', '.update-btn', function() {

				//ambil data dari server => ajax
				id = $(this).attr('data-id');

				$.ajax({
					type : 'POST',
					url : 'customer/edit/' + id,
					success : function(data) {
						_setFieldUpdateModal(data);
					},
					dataType : 'json'
				});

				$('#updateModal').modal('show');
			});

			function _setFieldUpdateModal(data) {
				$('#modname').val(data.name);
				$('#modaddress').val(data.address);
				$('#modemail').val(data.email);
				$('#modphoneNumber').val(data.phoneNumber);
				$('#modbirthDate').val(data.birthDate);
			}

			//event submit data for update
			$('#submit-update').click(function() {

				//Object ala js
				var Customer = {
					id : id,
					name : $('#modname').val(),
					address : $('#modaddress').val(),
					email : $('#modemail').val(),
					phoneNumber : $('#modphoneNumber').val(),
					birthDate : $('#modbirthDate').val()
				};

				//ajax update
				$.ajax({
					type : 'PUT',
					url : 'customer/update',
					contentType : "application/json",
					data : JSON.stringify(Customer),
					success : function(data) {
						window.location = "/customer";
					}
				});
			});
		});

		//delete
		$(document).ready(function() {

			$('#customer-list').on('click', '.delete-btn', function() {

				id = $(this).data('id');
				$('#deleteModal').modal(id);
			});

			$('#submit-delete').click(function() {

				$.ajax({
					type : 'DELETE',
					url : 'customer/delete/' + id,
					success : function(data) {
						window.location = "/customer";
					}
				});
			});
		});
	</script>
</body>
</html>