<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library MASA | Rent History</title> 

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
  <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
      <![endif]-->
</head>

<body id="mimin" class="dashboard">
      <!-- start: Header -->
        <nav class="navbar navbar-default header navbar-fixed-top">
          <div class="col-md-12 nav-wrapper">
            <div class="navbar-header" style="width:100%;">
              <div class="opener-left-menu is-open">
                <span class="top"></span>
                <span class="middle"></span>
                <span class="bottom"></span>
              </div>
                <a class="navbar-brand"> 
                 <b>Library MASA<sup style="font-size: 12px; font-weight: 200">lah</sup></b>
                </a>
              
              <ul class="nav navbar-nav navbar-right user-nav" style="margin-right: 5px;">
                <li class="user-name"><span>Akihiko Avaron</span></li>
                  <li class="dropdown avatar-dropdown">
                   <img src="assets/asset/img/avatar.jpg" class="img-circle avatar" alt="user name" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"/>                   
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
                        <h3 class="animated fadeInLeft">Rent History</h3>
                        <p class="animated fadeInDown">
                         	Rent History <span class="fa-angle-right fa"></span> List
                        </p>
                    </div>
                  </div>
              </div>
              <div class="col-md-12 top-20 padding-0">
                <div class="col-md-12">
                  <div class="panel">
                    <div class="panel-body">
                      <div class="responsive-table">
                      <table id="rent-list" class="table table-striped table-bordered" width="100%" cellspacing="0">
	                      <thead>
	                        <tr>
								<th>Customer</th>
								<th>Borrow Date</th>
								<th>Due Date</th>
								<th>Return Date</th>
								<th>Fine</th>
								<th style="width: 12%;">Status</th>
								<th style="width: 15%;">Action</th>
							</tr>
	                      </thead>
	                      <tbody>
	                        <c:forEach var="rentHistory" items="${rentHistories }">
								<tr>
									<td>${rentHistory.borrowTransaction.customer.name }</td>
									<td>${rentHistory.borrowTransaction.borrowDate }</td>
									<td>${rentHistory.dueDate }</td>
									<td>${rentHistory.returnTransaction.returnDate }</td>
									<td>${rentHistory.fine }</td>
									<td>
										<c:set var="status" value="Waiting for Return"></c:set>
										<c:if test="${rentHistory.status == status }">
											<label class="label label-danger">${rentHistory.status }</label>
										</c:if>
										<c:if test="${rentHistory.status != status }">
											<label class="label label-success">${rentHistory.status }</label>
										</c:if>
									</td>
									<td style="text-align: center;">
										<button class="btn btn-success btn-xs detail-btn icon-box" data-id="${rentHistory.id}" title="View Books"><span class="icons icon-eye"></span></button>&nbsp;
										<c:if test="${rentHistory.status == status }">
											<button class="btn btn-warning btn-xs update-btn icon-box" data-id="${rentHistory.id}" title="Update"><span class="icons icon-note"></span></button>&nbsp;
										</c:if>
										<c:if test="${rentHistory.status != status }">
											<button disabled class="btn btn-warning btn-xs update-btn icon-box" data-id="${rentHistory.id}" title="Update"><span class="icons icon-note"></span></button>&nbsp;
										</c:if>
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
	    $('#rent-list').DataTable();
	  });
	</script>
	<!-- end: Javascript -->
	
	<script type="text/javascript">
		
		var id = 0;
		
		//update
		$(document).ready(function (){
			$('#rent-list').on('click','.update-btn', function() {
				
				id = $(this).data('id');
				
				//ajax retrive data
				$.ajax({
					type: 'POST',
					url: '/rent_history/edit/'+id,
					success: function(data) {		
						setField(data);
					},
					dataType: 'json'
				});
				
				$('#update-modal').modal('show');
			});
			
			var date = new Date();

			var day = date.getDate();
			var month = date.getMonth() + 1;
			var year = date.getFullYear();

			if (month < 10) month = "0" + month;
			if (day < 10) day = "0" + day;

			var today = year + "-" + month + "-" + day;
						
			function setField(data) {
				
				var oneDay = 24*60*60*1000;
				var firstDate = new Date(data.dueDate);
				var secondDate = new Date(today);
				
				if (secondDate <= firstDate) {
					var diffDays = 0;
				} else {
					var diffDays = Math.round(Math.abs(((firstDate.getTime() - secondDate.getTime())/(oneDay))*5000));
				}
				
				$('#borrowId').val(data.borrowTransaction.id);
				$('#customerId').val(data.borrowTransaction.customer.id);
				$('#customer').val(data.borrowTransaction.customer.name);
				$('#borrowDate').val(data.borrowTransaction.borrowDate);
				$('#employeeBorrowId').val(data.borrowTransaction.employee.id);
				$('#employeeBorrow').val(data.borrowTransaction.employee.name);
				$('#dueDate').val(data.dueDate);
				$('#returnDate').val(today);
				$('#fine').val(diffDays);
			}
			
			//submit update
			$('#submit-update').click(function(){
				var returnTransaction = {
					
					id : id,
					fine : $('#fine').val(),
					dueDate : $('#dueDate').val(),
					borrowTransaction : {
						id : $('#borrowId').val(),
					},
					returnTransaction : {
						returnDate : $('#returnDate').val(),
						employee : {
							id : $('#employeeReturn').val()
						}
					}
					
				};
				
				// ajax update
				$.ajax({
					type: 'PUT',
					url: '/rent_history/update',
					contentType: "application/json",
					data : JSON.stringify(returnTransaction),
					success: function(data) {
						window.location = "/rent_history";
					}
				});
			});
			
			//List Book
			$('#rent-list').on('click','.detail-btn', function() {
				
				id = $(this).data('id');
				
				//ajax retrive data
				$.ajax({
					type: 'POST',
					url: '/rent_history/edit/'+id,
					success: function(data) {
						//console.log(data.borrowTransaction.bookTransaction[0].book.title);
						setFieldDetail(data);
					},
					dataType: 'json'
				});
				
				$('#detail-modal').modal('show');
				$('.close-modal').on('click', function() {
					$('#list-book').empty();
				});
			});
			
			function setFieldDetail(data){
				for (var i = 0; i < data.borrowTransaction.bookTransaction.length; i++) {
					$('#list-book').append("<label class='col-xs-12 control-label'><b>Book </b>"+(i+1)+"</label>");
					$('#list-book').append(
							"<label class='col-xs-1 control-label'>Title</label><div class='col-xs-11'><input type='text' class='form-control' value='"+data.borrowTransaction.bookTransaction[i].book.title+"'><br></div>")
				}
			}
		});
	</script>
	
	<!-- Modal View Books -->
	<div class="col-md-12">
		<div class="modal fade"  id="detail-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close close-modal" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title">List Book</h4>
		        </div>
		        <div class="modal-body">
		        	<form style="margin-top: 3%;">
						<div class="form-row">
							<div class="form-group col-md-12" id="list-book">
						   	    
							</div>
						  	<label> </label>
						</div>
					</form>
		        </div>
		        <div class="modal-footer">
			        <button type="button" class="btn btn-secondary close-modal" data-dismiss="modal">Close</button>
	        	</div>
	        </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
   	</div>
   	
	<!-- Modal Update -->
	<div class="col-md-12">
		<div class="modal fade"  id="update-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title">Return Book</h4>
		        </div>
		        <div class="modal-body">
		        	<form style="margin-top: 3%;">
						<div class="form-row">
							<input type="hidden" class="form-control" name="borrowId" id="borrowId">
						    <div class="form-group col-md-6">
							    <label>Customer</label>
							    <input type="hidden" class="form-control" name="customerId" id="customerId">
							    <input disabled type="text" class="form-control" name="customer" id="customer">
							</div>
							<div class="form-group col-md-6">
						    	<label>Borrow Date</label>
						    	<input disabled type="text" class="form-control" name="borrowDate" id="borrowDate">
						  	</div>
							<div class="form-group col-md-6">
						    	<label>Employee On Duty</label>
						    	<input class="form-control" type="hidden" name="employeeBorrowId" id="employeeBorrowId">
						    	<input disabled class="form-control" type="text" name="employeeBorrow" id="employeeBorrow">
							</div>
						  	<div class="form-group col-md-6">
						    	<label>Due Date</label>
						    	<input disabled type="text" class="form-control" name="dueDate" id="dueDate">
						  	</div>
						  	<div class="form-group col-md-6">
						    	<label>Return Date</label>
						    	<input disabled type="text" class="form-control" name="returnDate" id="returnDate">
						  	</div>
						  	<div class="form-group col-md-6">
						    	<label>Fine</label>
						    	<input disabled type="text" class="form-control" name="fine" id="fine">
						  	</div>
						  	<div class="form-group col-md-6">
							    <label>Employee on Return</label>
							    <select class="form-control" name="employeeReturn" id="employeeReturn">
							    	<c:forEach var="employee" items="${employees }">
							    		<option value="${employee.id }">${employee.name }</option>
								    </c:forEach>
							    </select>
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
</body>
</html>