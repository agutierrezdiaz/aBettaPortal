$(document).ready(function() {

  $('table.abetta-table').tableCheckbox();

/*
$("tr.row-selectable").click(function(event){
  if (event.target.type !== 'checkbox') {
    rowSelect(this);
  }
});
*/


});

/*
function rowSelect(obj) {
  let isCheck = $(obj).find("input.form-check-input").is(":checked");

  $("input.form-check-input").each(function() {
    $(this).prop("checked", false);
    $(this).attr("checked", false);
  });

  $(obj).find("input.form-check-input").prop("checked", !isCheck);
  $(obj).find("input.form-check-input").attr("checked", !isCheck);

}
*/
