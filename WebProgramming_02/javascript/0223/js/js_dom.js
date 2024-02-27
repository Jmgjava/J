'use script';

const wrap = document.querySelector('#wrap');
console.log(wrap.childNodes);
console.log(wrap.childElementCount);
console.log(wrap.children);
console.log(wrap.children[0]);


// 자식객체
// wrap.children
// for...in -> 객체 처리

// for(let el in wrap.children){
//   console.log(el);
// }


// HTMLCollection -> NodeList

console.log(wrap.children.array);
// wrap.children.array.forEach(element => {});


console.log(wrap.firstElementChild);
console.log(wrap.lastElementChild);
console.log(wrap.firstChild);
console.log(wrap.lastChild);

const header = document.querySelector('.header');
console.log(header.nextElementSibling);
console.log(header.nextSibling);
console.log(header.previousElementSibling);
console.log(header.previousSibling);

const box = document.querySelector('.box')

let htmlcode = `<div class="box">
<li><a href="#">Menu</a></li>
<li><a href="#">Menu</a></li>
<li><a href="#">Menu</a></li>
<li><a href="#">Menu</a></li>
<li><a href="#">Menu</a></li>
</div>`;

// html 코드 추가
box.innerHTML = htmlcode; 
// 텍스트"만" 추가
box.innerText='텍스트추가'; 


//  *** 리스트

const gnbulli = document.querySelectorAll('.gnb>ul>li');
gnbulli.forEach((el,idx)=>{
  
})