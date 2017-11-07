<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library MASA | Shelf</title>

  <!-- start: Css -->
  <link rel="stylesheet" type="text/css" href="assets/asset/css/bootstrap.min.css">

  <!-- plugins -->
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/font-awesome.min.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/simple-line-icons.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/datatables.bootstrap.min.css"/>
  <link rel="stylesheet" type="text/css" href="assets/asset/css/plugins/animate.min.css"/>
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
				<a href="index.html" class="navbar-brand"> <b>MASA</b>
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
                    <li class="ripple animated fadeInRight">
                    	<a class="nav-header" href="employee">
                    		<span class="fa fa-user"></span> Employee  <span class="fa-angle-right fa right-arrow text-right"></span>
                    	</a>
                    </li>
                    <li class="active ripple animated fadeInLeft">
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
						<h3 class="animated fadeInLeft">Shelf</h3>
						<p class="animated fadeInDown">
							Shelf <span class="fa-angle-right fa"></span> List
						</p>
					</div>
				</div>
			</div>
            <div class="col-md-12 top-20 padding-0">
            	<div class="col-md-12">
                  <div class="panel">
                    <div class="panel-body">
                      <div class="responsive-table">
                      
                      <button class="btn btn-success tree-toggle icon-box"><span class="fa fa-plus"/> Add Shelf</button><br><br>
                      <ul class="nav nav-list tree">
						<form action="shelf/save" method="post" class="form-horizontal">
						    <div class="form-group">
						        <label class="col-md-1 control-label">Shelf</label>
						        <div class="col-xs-4">
						            <input type="text" class="form-control" name="category" placeholder="Category" />
						        </div>
						        <div class="col-xs-4">
						            <input type="text" class="form-control" name="subCategory" placeholder="Sub-category" />
						        </div>
						        <div class="col-xs-3">
						            <input type="text" class="form-control" name="section" placeholder="Section" />
						        </div>
						    </div>
						    <div class="form-group">
						        <div class="col-xs-5 col-xs-offset-1">
						            <button type="submit" class="btn btn-primary">Submit</button><br><br>
						        </div>
						    </div>
						</form>
                      </ul>
                      
                      <table id="shelf-list" class="table table-striped table-bordered" width="100%" cellspacing="0">
	                      <thead>
	                        <tr>
								<th>Category</th>
								<th>Sub-category</th>
								<th>Section</th>
								<th style="width: 18%;">Action</th>
							</tr>
	                      </thead>
	                      <tbody>
	                        <c:forEach var="shelf" items="${shelfs }">
								<tr>
									<td>${shelf.category }</td>
									<td>${shelf.subCategory }</td>
									<td>${shelf.section }</td>
									<td style="text-align: center;">
										<button class="btn btn-warning btn-xs update-btn icon-box" data-id="${shelf.id}" title="Update"><span class="icons icon-note"></span></button>&nbsp;
										<button class="btn btn-danger btn-xs delete-btn icon-box" data-id="${shelf.id}" title="Delete"><span class="icons icon-trash"></span></button>
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
	
	<!-- custom -->
	<script src="assets/asset/js/main.js"></script>
	<script type="text/javascript">
	  $(document).ready(function(){
	    $('#shelf-list').DataTable();
	  });
	</script>
	<!-- end: Javascript -->
	
	<script type="text/javascript">
		
		var id = 0;
		
		//update
		$(document).ready(function (){
			$('.update-btn').on('click',function() {
				
				id = $(this).data('id');
				
				//ajax retrive data
				$.ajax({
					type: 'POST',
					url: '/shelf/edit/'+id,
					success: function(data) {		
						setField(data);
					},
					dataType: 'json'
				});
				
				$('#update-modal').modal();
			});
			
			function setField(data) {
				$('#modcategory').val(data.category);
				$('#modsubcategory').val(data.subCategory);
				$('#modsection').val(data.section);

			}
			
			//submit update
			$('#submit-update').click(function(){
				var Shelf = {
						id : id,
						category : $('#modcategory').val(),
						subCategory : $('#modsubcategory').val(),
						section : $('#modsection').val(),
					};
				
				// ajax update
				$.ajax({
					type : 'PUT',
					url : 'shelf/update',
					contentType : "application/json",
					data : JSON.stringify(Shelf),
					success : function(data) {
						window.location = "/shelf";
					}
				});
			});
		});
		
		//delete
		$(document).ready(function (){
			
			$('.delete-btn').on('click',function() {
				
				id = $(this).data('id');
				$('#delete-modal').modal(id);
			});
			
			$('#ok-delete').click(function() {

				$.ajax({
					type : 'DELETE',
					url : 'shelf/delete/' + id,
					success : function(data) {
						window.location = "/shelf";
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
			        <h4 class="modal-title">Update Shelf</h4>
		        </div>
		        <div class="modal-body">
		        	<form>
						<div class="form-group">
							<label for="modcategory">Category</label> <input type="text"
								class="form-control" id="modcategory" name="modcategory" placeholder=" ">
							<!-- <small id="nameHelp" class="form-text text-muted">Silahkan anda mengisi nama dengan benar</small> -->
						</div>
						<div class="form-group">
							<label for="modsubcategory">Sub-category</label> <input type="text"
								class="form-control" id="modsubcategory" name="modsubcategory" placeholder=" ">
							<!-- <small id="nameHelp" class="form-text text-muted">Silahkan anda mengisi nama dengan benar</small> -->
						</div>
						<div class="form-group">
							<label for="modsection">Section</label> <input type="text"
								class="form-control" id="modsection" name="modsection"
								placeholder=" ">
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
			        <h4 class="modal-title">Delete Shelf</h4>
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