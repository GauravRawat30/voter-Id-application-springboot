
function isEmpty(){
var n0 = document.querySelector(".field0").value;
var n1 = document.querySelector(".field1").value;
var n2 = document.querySelector('.field2').value;
var n3 = document.querySelector('.field3').value;
var n4 = document.querySelector('.field4').value;
var n5 = document.querySelector('.field5').value;
var n6 = document.querySelector('.field6').value;

if(n0 != '' && n1 != '' && n2 != '' && n3 != '' && n4 != '' && n5 != '' && n6 != ''){

document.querySelector(".submitbtn").removeAttribute("disabled");
}else if (n0 == '' || n1 == '' || n2 == '' || n3 == '' || n4 == '' || n5 == '' || n6 == ''){
document.querySelector(".submitbtn").setAttribute("disabled","disabled");

}

}