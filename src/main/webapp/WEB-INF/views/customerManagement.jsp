<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<script>
   /* $(document).ready(function(){
        var searchCondition = '${searchCondition}';
        var tableClient = $('.table').DataTable({
            "serverSide": true,
            "processing": true,
            "ajax": {
                "url": '../admin/customer/filter',
                "type": "POST",
                "success": function(data){
                    $.each(data, function(ind, obj){
                        console.log(obj);
                        tableClient.row.add([
                            obj.name,
                            obj.email,
                            obj.phone,
                            obj.username,
                            obj.enabled
                        ]).draw();
                    });
                }
            },
            'lengthMenu':[[3,5,10,-1],[3,5,10,"All"]],
            "iDisplayLength": 10,
            "iDisplayStart": 0,
            'oSearch': {"sSearch":searchCondition},
            "aoColumns": [
                { "mData": "name" },
                { "mData": "email" },
                { "mData": "phone" },
                { "mData": "username" },
                { "mData": "enabled" }
            ]
        });
    });*/
</script>


<div class="container-wrapper">
    <div class="container">

        <div class="page-header">
            <h1> Customer Management Page</h1>
            <p class="lead"> This is the customer management page</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Name</th>
                <th>Email</th>
                <th>Phone </th>
                <th>Username</th>
                <th>Enabled</th>

            </tr>
            </thead>
            <c:forEach items="${customerList}" var="customer">
                <tr>
                   <td>${customer.customerName}</td>
                    <td>${customer.customerEmail}</td>
                    <td>${customer.customerPhone}</td>
                    <td>${customer.username}</td>
                    <td>${customer.enabled}</td>

                </tr>
            </c:forEach>
        </table>

        <%@include file="/WEB-INF/views/template/footer.jsp"%>
