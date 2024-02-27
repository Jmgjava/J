'use script';
// 선택자1
{
  // const selector = document.getElementById('selector');
  // selector.style.border = '1px solid red';
  // const sec1 = document.getElementById('sec1');
  // sec1.style.backgroundColor = '#ffff00';
  // const class1 = document.getElementsByClassName('class1');

  // class1[0].style.border = '1px solid silver';
  // class1[0].style.width = '100px';
  // class1[1].style.border = '1px solid blue';
  // class1[1].style.width = '100px';
  // class1[2].style.border = '1px solid #fff000';
  // class1[2].style.width = '100px';
  // const name1 = document.getElementsByName('name1');
  // name1[0].value = 'name1값';
  // name1[1].value = 'name1값 두번째';
  // console.log(name1[0].value);
  // console.log(name1[1].value);

  // const divTag = document.getElementsByTagName('div');
}

// 선택자2
{
  const selector = document.querySelector('#selector');
  selector.style.border = '1px solid #ff00ff';
  const classAll = document.querySelectorAll('.class1')
  classAll[0].style.backgroundColor = 'red';
  classAll[1].style.backgroundColor = 'yellow';
  classAll[2].style.backgroundColor = 'blue';

  // input name
  document.querySelectorAll('input[name=하나]');

  // input name -> 여러개
  const nameAll = document.querySelectorAll('input[name=name1]');
  nameAll[0].value = '글자1';
  nameAll[0].style.backgroundColor = 'aqua';
  nameAll[1].value = '글자2';
  nameAll[1].style.backgroundColor = 'aqua';

  console.log(nameAll[0].value); // name값 출력
  console.log(nameAll[1].value); 
  console.log(nameAll[1].value.length);  // name 값의 길이

  const divTagAll = document.querySelectorAll('div');

}