<#-- @ftlvariable name="Comments" type="java.util.List<mvc.common.ReviewInfo>" -->

<div class="comments">
    <h3>Book review</h3>
    <#list Comments as comment>
    <div class="comment">
        <#if comment.user.profile_img_url??>
            <img src="${comment.user.profile_img_url}" />
        <#else>
            <img src="/resources/images/icons/noname_icon.png" alt="anon">
        </#if>
        <p><span>${comment.user.name}</span> <br/>${comment.content}</p>
        <hr/>
    </div>
    </#list>
    <div class="write_a_comment">
        <span>Write a comment</span>
        <form class="form-horizontal" role="form">
            <div class="form-group">
                <label for="inputName" class="col-sm-2 control-label">Your name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputName">
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail" class="col-sm-2 control-label">Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputEmail">
                </div>
            </div>
            <div class="form-group">
                <label for="inputComment" class="col-sm-2 control-label">Comment</label>
                <div class="col-sm-10">
                    <textarea class="form-control" rows="3"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Submit</button>
                </div>
            </div>
        </form>
    </div>