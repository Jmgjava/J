'use script';
// 배열
const arr1 = new Array();

arr1[0] = 10;
arr1[1] = 20;
arr1[2] = 30;
arr1[3] = 40;
arr1[4] = 50;
arr1[5] = 60;
console.log(arr1[0]);
console.log(arr1[1]);
console.log(arr1[2]);
console.log(arr1[3]);
console.log(arr1[4]);
console.log(arr1[5]);
console.log('========================')

const arr2 = new Array(5);
for(let i=0;i<arr1.length;i++){
  arr1[i] = i*10+10;
  console.log(arr1[i]);
}
console.log('========================')

const arr3=[];  // new int[5];

for(let i=0;i<5;i++){
  arr3.push(i*10+10);
}

// 객체형 반복문
for(let i of arr3){
  console.log(`i->${i}`);
}
console.log('========================')

let fruits = ['사과', '바나나'];
let first = fruits[0];
fruits.push('오렌지'); // 마지막 요소 뒤에 추가
for(let el of fruits){
  console.log(el)
}

console.log('====')
fruits.push('딸기');

for(let el of fruits){
  console.log(el)
}

console.log('====')
fruits.pop(); // 마지막 요소 삭제
for(let el of fruits){
  console.log(el)
}

console.log(fruits.indexOf('딸기'));
console.log(fruits.indexOf('바나나'));


let fruits2 = ['망고', '파인애플'];

const fruits3 = fruits.concat(fruits2);
