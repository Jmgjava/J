'use script';
// 이벤트

const btn = document.querySelectorAll('.btn');

// 인라인
function fn1() {
  console.log('fn1 출력');
}

// 프로퍼티
btn[1].onclick = () => {
  console.log('프로퍼티');
}

const content = document.querySelector('.content');

// 이벤트 리스너
btn[2].addEventListener('click', (event) => {
  console.log(event.type);
  console.log(event.currentTarget); // 바인딩
  console.log(event.target); // 실제 이벤트적용

  // content.style.backgroundColor = '#ff0000';
  // content.style.width = '100px';
  // content.style.height = '100px';
  // content.style.display = 'block';

  // 텍스트 추가
  event.target.innerText = '챗봇';

  content.classList.add('on');

});

const close = document.querySelector('span.close');

close.addEventListener('click', () => {
  // css 클래스 삭제
  content.classList.remove('on');
  btn[2].innerText = "BUTTON3";
})

// btn[4].addEventListener('click', eventFn);
// btn[4].addEventListener('mouseover', eventFn);
// btn[4].addEventListener('mouseout', eventFn);
// btn[4].addEventListener('mouseenter', eventFn);
// btn[4].addEventListener('mouseleave', eventFn);
// btn[4].addEventListener('mousedown', eventFn);
// btn[4].addEventListener('mouseup', eventFn);

function eventFn(event) {
  console.log(event.type);
}


let i = 0;

function autoGallery() {


  i++;
  console.log(`${i}`);
}

// 즉시 실행 함수 -> 한명만
(() => {
  autoGallery();
})();

const setIn = setInterval(autoGallery, 1000);

btn[4].addEventListener('mouseover', (event) => {
  // event.target.style.backgroundColor = '#fff000';
  // event.target.style.color = '#fff';
  event.target.classList.add('on2');

  clearInterval(setIn)
})

btn[4].addEventListener('mouseout', (event) => {
  event.target.classList.remove('on2');
  setInterval(autoGallery, 1000);
})

