'use script';
// for
for (let i = 0; i <= 10; i++) {
  console.log(`${'i => '+ i}`);
}

// while
let j = 0;
while (j < 10) {
  console.log(`j => ${j}`)
  j++;
}

// do-while
let h = 0;
do {
  console.log(`h => ${h}`)
  h++;

} while (h < 10);


// 반복문 -> 기본 반복문
{

  // console.clear();

  const seciton = document.querySelector('.seciton');
  for(let i=0;i<10;i++){
    seciton.appendChild(`컨텐츠${i}`);
  }



  //객체형반복문
  //구구단
  for (let i = 2; i <= 9; i++) {
    console.log(`${i}단입니다.`);
    for (let k = 1; k < 10; k++) {
      console.log(`${i}+${k}+${i*k}`)
    }
  }

}

console.log('=========================');


// 객체형 반복문
const arr1 = [1, 2, 3, 4, 5, 6];
const gallery = document.querySelectorAll('.gallery ul > li')
// for...of -> 배열, 컬렉션
for (let i of arr1) {
  console.log(`i -> ${i}`);
}

// forEach -> 배열, NodeList(List) -> li ****
// 1.forEach -> 선택 List의 모든 요소를 하나씩 선택
// gallery.forEach(function(element, index, gallery){
//   console.log(`element ->${element}`);
//   console.log(`index ->${index}`);
//   console.log(`gallery ->${gallery}`);
// })

// 익명함수

console.log('========element,index,parent==========');

gallery.forEach((element, index, gallery) => {
  console.log(`element ->${element}`);
  console.log(`index ->${index}`);
  console.log(`gallery ->${gallery}`);
})

console.log('===========element,index=============');

gallery.forEach((el, idx) => {
  console.log(el);
  console.log(idx);
})

console.log('===========element=============');

gallery.forEach((el) => {
  console.log(`element-> ${el}`);
})

console.log('===========element,index=============');

function Galleryfn() {
  gallery.forEach((el, idx) => {
    el.style.backgroundColor = '#ff0000';
    el.style.border = '1px solid blue';
    el.style.width = '100px';
    el.style.height = '30px';
    el.innerText = `GALLERY${idx+1}`; // 텍스트 입력
  })
}

const title = document.querySelector('h1.title');
title.addEventListener('click', Galleryfn)



// for .... in -> 객체