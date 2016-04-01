<#-- @ftlvariable name="topGoods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="BookStore" styles=["css/product.css"] />
<#macro m_body>
<div class="nav_way">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="nav_line">
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Literature</a></li>
                        <li class="active">Jack London : White Fang</li>
                    </ol>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container">
    <div class="product_info">
        <div class="row">
            <div class="col-md-4">
                <div class="book_view">
                    <img src="/resources/images/White_fang.jpg" alt="Masquerade">
                </div>
            </div>
            <div class="col-md-8">
                <h1>White Fang</h1>
                <div class="description">
                    <span>The story begins before the three-quarters wolf-dog hybrid is born, with two men and their sled dog team on a journey to deliver a coffin to a remote town named Fort McGurry in the higher area of the Yukon Territory, Canada. The men, Bill and Henry, are stalked by a large pack of starving wolves over the course of several days. Finally, after all of their dogs and Bill have been eaten, four more teams find Henry trying to escape from the wolves; the wolf pack scatters when they hear the large group of people coming.</span>
                </div>
                <div class="pay_description">
                    <p>Our price : <span>$150</span>
                        <a href="#" class="add_to_cart_button">Add to cart</a></p><hr>
                    <h7>Safe,Secure Shopping</h7><br>
                    <img src="/resources/images/paypal.png" alt="paypal">
                </div>
            </div>
        </div>
    </div>
</div>
<div class="information">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="tabs">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tab-1" data-toggle="tab">Product Information</a></li>
                        <li><a href="#tab-2" data-toggle="tab">Other Details</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane fade in active" id="tab-1">
                            <p>The story begins before the three-quarters wolf-dog hybrid is born, with two men and their sled dog team on a journey to deliver a coffin to a remote town named Fort McGurry in the higher area of the Yukon Territory, Canada. The men, Bill and Henry, are stalked by a large pack of starving wolves over the course of several days. Finally, after all of their dogs and Bill have been eaten, four more teams find Henry trying to escape from the wolves; the wolf pack scatters when they hear the large group of people coming.</p>
                        </div>
                        <div class="tab-pane fade" id="tab-2">
                            <p>Some other information about this book.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</#macro>