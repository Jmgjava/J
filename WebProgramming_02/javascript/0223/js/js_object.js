'use script';
// 객체
const obj1 ={
  userId: 'm1', // 프로퍼티(속성)
  userPw: '1111',
  arr:[1,2,3,4], // 메소드
  fn1:()=>{
    console.log('fn1');
  },
  obj2:{ /// 하위객체
    id:'m2',
    Pw:'2222'
  }

};

let userId = obj1.userId;
let userPw = obj1.userPw;
let arr = obj1.arr;
let fn1 =obj1.fn1();
let id = obj1.obj2.id; // 하위 객체 불러오기
let pw = obj1.obj2.Pw;

const obj3 = new Object();
obj3.userId = 'm3';
obj3.userPw = '11';
console.log(obj3.userId);

function Car3(name,coin){
  this.name=name;
  this.coin=coin;
  this.method=()=>{
    console.log(this.name);
    console.log(this.coin);
  }
}
const car1 = new Car3('Ncar',1000);
const car2 = new Car3('Ocar',500);

// window.open('http://naver.com','', 'width=1000,height=800, left=100, top=100');

// window.location.href='http://naver.com';
const email = 'm1'
// window.location.href=`'이동할url/item/email=${mail}'`;

window.history.forward();
window.history.back();
