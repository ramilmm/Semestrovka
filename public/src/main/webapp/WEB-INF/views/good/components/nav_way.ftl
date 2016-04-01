<#-- @ftlvariable name="Good" type="mvc.common.GoodInfo" -->

<div class="nav_way">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="nav_line">
                    <ol class="breadcrumb">
                        <li><a href="/">Home</a></li>
                        <li><a href="/catalog/${Good.category.id}">${Good.category.name}</a></li>
                        <li class="active">${Good.author} : ${Good.name}</li>
                    </ol>
                </div>
            </div>
        </div>
    </div>
</div>