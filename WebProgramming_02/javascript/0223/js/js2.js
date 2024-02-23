'use script';

var btn1 = document.querySelector('#btn1');
console.log(btn1);
btn1 = 110;
console.log(btn1);

// 변수
// 변수 선언2

let num1 = 100;
console.log(num1, typeof num1);
// let num1=200;
num1 = "문자열";
console.log(num1, typeof num1);

for (let i = 0; i < 10; i++) {
  // // 문자열 처리
  // console.log("i -> " + i);
  // 문자열 처리2
  // console.log("i -> ",i);
  // 문자열 처리3 -> 템플릿 리터럴 (추천)
  console.log(`i-> ${i}`);
}
// 이전 콘솔내용 지우기
console.clear();

// 변수선언3
// const num4;
// num4=100;
const num4 = 100;
console.log(num4, typeof num4);

const btn2 = document.querySelector("#btn1");
// btn2를 클릭 -> fn1 함수 호출
btn2.addEventListener('click', fn1);

function fn1() {
  console.log('btn함수 실행');
}

const btnClass = document.querySelectorAll('.btnClass');

console.log(btnClass);

btnClass[0].addEventListener('click',(event)=>{
console.log(event.target)});

btnClass[1].addEventListener('click',(event)=>{
console.log(event.target)});
