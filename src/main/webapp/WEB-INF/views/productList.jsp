<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<script>
    $(document).ready(function(){
        var searchCondition = '${searchCondition}';
        $('.table').DataTable({
            'lengthMenu':[[1,2,3,5,10,-1],[1,2,3,5,10,"All"]],
            'oSearch': {"sSearch":searchCondition}
        });
    });
</script>



<div class="container-wrapper">
    <div class="container">

        <div class="page-header">
            <h1> All products</h1>
            <p class="lead"> Checkout all awesome products available now!</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
                <tr class="bg-success">
                    <th>Photo Thumb</th>
                    <th>Product Name</th>
                    <th>Category </th>
                    <th>Condition</th>
                    <th>Price</th>
                    <th></th>
                </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><img src="<c:url value="/resources/images/${product.productId}.png" />" style="width:100%" alt="image"></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice} USD</td>
                    <td><a href="<spring:url value="/product/viewProduct/${product.productId}" ></spring:url>">
                        <span class="glyphicon glyphicon-info-sign"></span>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>

<%@include file="/WEB-INF/views/template/footer.jsp"%>