/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function whatone()
{
    alert("blasfalsdj");
};

function somethingcool()
{
    $.ajax({
        url:"http://localhost:8080/WebTesting/",
        context: document.body}).done(
            function(){
                $("#placeholder").text("somerandomtext");
            }
        );
};