'use script';
// var num3;
// 변수
// 변수 선언 1


var num1=10;
window.console.log(num1,typeof num1);
var num1="문자열";
window.console.log(num1,typeof num1);


var num2="문자열";
window.console.log(num2);

// 호이스팅 적용: var, 함수선언식 function(){}

num3=100;

var num3;
window.console.log(num1,typeof num3);


var bool=true;
console.log(bool,typeof bool);

var number=null;
console.log(number,typeof number);

// document 선택 -> css선택자
btn1.document = document.querySelectorAll('#btn1');

console.log(btn1, typeof btn1);

var arr = new Array();
console.log(arr, typeof arr)

window.confirm('확인창');