'use script';

const seciton = document.querySelector('.section');

let i = 0;

function autoGallery() {

  console.log(`i -> ${i}`);

  if (i >= 5) i = -1;
  i++

}
// 3초뒤에 autoGallery 함수를 실행하세요 (무한)
let setIn = setInterval(autoGallery, 1000); // 1000 = 1초

seciton.addEventListener('mouseover', (event)=>{
  console.log(event.currentTarget)
  event.currentTarget.style.backgroundColor = '#fff000'
  clearInterval(setIn)
});

// 즉시 실행함수 -> autoGallery
(() => {
  autoGallery();
})();