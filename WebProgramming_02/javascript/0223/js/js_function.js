'use script';
// function fn1(), function fn2() 함수 호이스팅 적용

const btn = document.querySelectorAll('.btn');
btn[0].addEventListener('click', fn1);

// 함수
// 1. 함수 선언방법
function fn1() {
  // 명령문, 처리문,
  console.log('fn1함수');
  // return;  // 생략 가능
}


// 무명(익명)함수 -> 특정 하나의 기능만 구현
// arrow function -> 화살표 함수(익명 함수는 변환)
// function(num1, num2){}; -> (num1, num2)=>{};

btn[1].addEventListener('click', () => {
  let fn2val = fn2(100, 200);
  console.log(fn2val);
})

function fn2(num1, num2) {
  let sum = num1 + num2;
  return sum;
}

btn[2].addEventListener('click', ()=>{
  console.log('콜백함수');
})

function fn3(){
  alert('fn3함수'); 
}

// 2. 함수 선언방식 -> 함수 표현식 -> 화살표함수(익명함수)
// 호이스팅이 안됨 -> 엄격
const fn4 = ()=>{
  alert('무명함수(익명)')
};

// 실행문이 하나일경우{}생략가능
const fn5 = ()=>alert('무명함수(익명)');


btn[4].addEventListener('click', fn4);


function fn6(){
  console.log('fn5함수 -> 브라우저에서 즉각 실행');
}

(()=>{
  fn6();
})();