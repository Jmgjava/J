'use script'; {
  // 함수 선언식 -> 호이스팅
  fn1();

  function fn1() {
    console.log('fn1');
  }

  function fn2(num1, num2) {
    console.log(`${num1}+${num2}=${num1+num2}`);
  }

  const btn = document.querySelectorAll('.btn');
  // 바인딩 -> 객체와 이벤트를 연결
  btn[0].addEventListener('click', fn3);


  function fn3(event) {
    console.log(event.currentTarget);

    let num1 = parseInt(prompt('숫자1'));
    let num2 = parseInt(prompt('숫자2'));
    fn2(num1, num2);
  }

  function fn4(num3) {
    return num3;
  }
  let confn4 = fn4(100); // 리턴값은 호출만
  console.log(confn4);

  // 함수 표현식
  const fn5 = function (num1) {
    console.log(num1);
  }
  fn5(100, 200); // 호이스팅 안됨X 선언 후 불러와야함

  const fn6 = function (num1) {
    return num1;
  }
  let constfn2 = fn6(200);



  // 화살표 함수 -> 익명(무명)
  console.log('=>화살표 함수(arrow function) -> 람다식')
  const fn7 = () => {
    console.log('fn7 -> 함수표현식');
  }
  fn7();

  const fn8 = (num1) => {
    console.log(num1);
  }
  fn8(500);

  const fn9 = (num1, num2) => {
    `${num1}+${num2}=${num1+num2}`
  };
  fn9(200, 300);

  const fn10 = (num1) => {
    num1
  };
  let confn3 = fn10(100);
  console.log(fn10);
}

console.clear();
console.log('문자열 함수');

let str = 'javascript, jsp, spring';
console.log(str.indexOf('jsp')); // 문자열
console.log(str.charAt('2')); // 글자 -> 인덱스[2]번지부터
let strArr = str.split(' ');
console.log(strArr);
for (let i of strArr) {
  console.log(i);
}

strArr.forEach((el, idx) => {
  console.log(`${el}:${idx}`);
})



console.log(strArr.join('-'));
console.log(str.substr(0, 3));
console.log(str.substring(0, 3));
console.log(str.toUpperCase());
console.log(str.toLowerCase());
console.log('javascript      '.length);
console.log('javascript      '.trim().length);
let i = '0';
console.log(typeof i);
console.log(typeof eval(i));