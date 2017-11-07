<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library MASA | Employee</title>

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
                    <li class="ripple animated fadeInLeft">
                    	<a class="nav-header" href="customer">
                    		<span class="fa fa-users"></span> Customer  <span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    </li>
                    <li class=" active ripple animated fadeInRight">
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
						<h3 class="animated fadeInLeft">Employee</h3>
						<p class="animated fadeInDown">
							Employee <span class="fa-angle-right fa"></span> List
						</p>
					</div>
				</div>
			</div>
            <div class="col-md-12 top-20 padding-0">
            	<div class="col-md-12">
                  <div class="panel">
                    <div class="panel-body">
                      <div class="responsive-table">
                      
                      <button class="btn btn-success tree-toggle icon-box"><span class="fa fa-plus"/> Add Employee</button><br><br>
                      <ul class="nav nav-list tree">
                        <form id="add-form" method="POST" action="employee/save">
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
                      
                      <table id="employee-list" class="table table-striped table-bordered" width="100%" cellspacing="0">
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
	                        <c:forEach var="employee" items="${employees }">
								<tr>
									<td>${employee.name }</td>
									<td>${employee.address }</td>
									<td>${employee.email }</td>
									<td>${employee.phoneNumber }</td>
									<td>${employee.birthDate }</td>
									<td style="text-align: center;">
										<button class="btn btn-warning btn-xs update-btn icon-box" data-id="${employee.id}" title="Update"><span class="icons icon-note"></span></button>&nbsp;
										<button class="btn btn-danger btn-xs delete-btn icon-box" data-id="${employee.id}" title="Delete"><span class="icons icon-trash"></span></button>
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

	<!-- start: Javascript -->
	<script src="assets/asset/js/jquery.min.js"></script>
	<script src="assets/asset/js/jquery.ui.min.js"></script>
	<script src="assets/asset/js/popper.min.js"></script>
	<script src="assets/asset/js/bootstrap.min.js"></script>
	
	<!-- plugins -->
	<script src="assets/asset/js/plugins/moment.min.js"></script>
	<script src="assets/asset/js/plugins/jquery.datatables.min.js"></script>
	<script src="assets/asset/js/plugins/datatables.bootstrap.min.js"></script>
	<script src="assets/asset/js/plugins/jquery.nicescroll.js"></script>
	<script src="assets/asset/js/plugins/bootstrap-material-datetimepicker.js"></script>
	<script src="assets/asset/js/plugins/jquery.validate.min.js"></script>
	<script src="assets/asset/js/plugins/jquery.mask.min.js"></script>
	
	<!-- custom -->
	<script src="assets/asset/js/main.js"></script>
	<script type="text/javascript">
	  $(document).ready(function(){
	    $('#employee-list').DataTable();
	    $('.mask-phone').mask('0000-0000-0000');
	  });
	  
	  //form validate
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
	  
	  //datepicker
	  $(document).ready(function(){
			$('#birthDate').bootstrapMaterialDatePicker({ 
				weekStart : 0, 
				time: false, 
				maxDate : new Date(),
				format : 'DD/MM/YYYY'
			});
		});
	</script>
	<!-- end: Javascript -->
	
	<script type="text/javascript">
		
		var id = 0;
			
		//update
		$(document).ready(function (){
			$('#employee-list').on('click','.update-btn', function() {
				
				id = $(this).data('id');
				
				//ajax retrive data
				$.ajax({
					type: 'POST',
					url: '/employee/edit/'+id,
					success: function(data) {		
						setField(data);
					},
					dataType: 'json'
				});
				
				$('#update-modal').modal('show');
			});
			
			function setField(data) {
				$('#modname').val(data.name);
				$('#modaddress').val(data.address);
				$('#modemail').val(data.email);
				$('#modphoneNumber').val(data.phoneNumber);
				$('#modbirthDate').val(data.birthDate);
			}
			
			//submit update
			$('#submit-update').click(function(){
				var Employee = {
					id : id,
					name : $('#modname').val(),
					address : $('#modaddress').val(),
					email : $('#modemail').val(),
					phoneNumber : $('#modphoneNumber').val(),
					birthDate : $('#modbirthDate').val()
				};
				
				// ajax update
				$.ajax({
					type: 'PUT',
					url: '/employee/update',
					contentType: "application/json",
					data : JSON.stringify(Employee),
					success: function(data) {		
						window.location = "/employee";
					}
				});
			});
		});
		
		//delete
		$(document).ready(function (){
			
			$('#employee-list').on('click', '.delete-btn', function() {
				
				id = $(this).data('id');
				$('#delete-modal').modal(id);
			});
			
			$('#ok-delete').click(function(){
				
				$.ajax({
					type: 'DELETE',
					url: '/employee/delete/'+id,
					success: function(data) {		
						window.location = "/employee";
					}
				});
			});
		});
	</script>
	
	<!-- Modal Update -->
	<div class="col-md-12">
		<div class="modal fade"  id="update-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title">Update Employee</h4>
		        </div>
		        <div class="modal-body">
		        	<form style="margin-top: 3%;">
						<div class="form-row">
						    <div class="form-group col-md-6">
							    <label>Name</label>
							    <input disabled type="text" class="form-control" id="modname" name="modname">
							</div>
							<div class="form-group col-md-6">
						    	<label>Email</label>
						    	<input class="form-control" type="email" id="modemail" name="modemail">
							</div>
							<div class="form-group" style="margin-left:2.5%; margin-right: 2.5%;">
						    	<label>Address</label>
						    	<input type="text" class="form-control" id="modaddress" name="modaddress">
						  	</div>
						  	<div class="form-group col-md-6">
						    	<label>Phone Number</label>
						    	<input type="text" class="form-control" name="modphoneNumber" id="modphoneNumber">
						  	</div>
						  	<div class="form-group col-md-6">
						    	<label>Birth Date</label>
						    	<input disabled type="date" class="form-control" name="modbirthDate" id="modbirthDate">
						  	</div>	
						  	<label> </label>
						</div>
					</form>
		        </div>
		        <div class="modal-footer">
			        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	        		<button type="button" class="btn btn-primary" id="submit-update">Save changes</button>
		        </div>
	        </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
   	</div>
	
	<!-- Modal Delete -->
	<div class="col-md-12">
		<div class="modal fade"  id="delete-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title">Delete Employee</h4>
		        </div>
		        <div class="modal-body">
		        	<h4>Are you sure?</h4>
		        </div>
		        <div class="modal-footer">
			        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
	        		<button type="button" class="btn btn-primary" id="ok-delete">Yes</button>
		        </div>
	        </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
   	</div>
</body>
</html>