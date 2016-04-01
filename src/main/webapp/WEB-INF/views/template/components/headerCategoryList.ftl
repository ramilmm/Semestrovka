<#-- @ftlvariable name="Good" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->

<div class="category">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <ul>
                <#list Good as good>
                    <#if good??>
                        <li>
                            <img src="/resources${good.imageUrl}" alt="${good.name}">
                            <a href="/catalog/${good.id}">${good.name}</a>
                        </li>
                    <#else>
                    <h1>ramil</h1>
                    </#if>

                </#list>
                </ul>
                <#--<ul>-->
                    <#--<li><a href="#">Category 1</a></li>-->
                    <#--<li><a href="#">Category 2</a></li>-->
                    <#--<li><a href="#">Category 3</a></li>-->
                    <#--<li><a href="#">Category 4</a></li>-->
                    <#--<li><a href="#">Category 5</a></li>-->
                    <#--<li><a href="#">Category 6</a></li>-->
                    <#--<li><a href="#">Category 7</a></li>-->
                    <#--<li><a href="#">Category 8</a></li>-->
                    <#--<li><a href="#">Category 9</a></li>-->
                <#--</ul>-->
            </div>
        </div>
    </div>
    <hr>
</div>