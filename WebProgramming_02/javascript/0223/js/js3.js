'use script';


// var
var num1 = 10;
console.log("num1= " + num1);
console.log("num1=", num1);
console.log(`num1= ${num1}`);
// 템플릿 리터럴


// let
let num2 = 20;
// let num2 = 100;
console.log('num2=', num2);

// const
const num3 = 100;
// num3 = 20;

//  bodt요소 선택 ->  const 선택자로 선택
const parent = document.querySelector('#parent');

//  데이터 타입
console.log(typeof 10);
console.log(typeof '문자열');
console.log(typeof  document);
console.log(typeof  new Array());
console.log(typeof  fn1);
let num4;
console.log(typeof  undefined);
console.log(typeof  num4);
console.log(typeof  null);


function fn1(){
  console.log('fn1');
}


// 호이스팅 O
num5=10;
var num5;

// 호이스팅 X
// num6=10;
// let num6;

// 호이스팅 X
// num7=10;
// const num7;