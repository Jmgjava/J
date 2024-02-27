'use script';
//  기본 내장함수 객체 alert(), prompt(), confirm(),
{
  // alert() -> 팝업창 -> 모달 -> 다른 요소보다 먼저 실행, 처리해야되는 함수나 기능
  // alert('팝업창');
  
  // let result = prompt('입력창'); // 입력값은 prompt() 함수위치에 반환
  // console.log(result);

  // let result2 = confirm('확인창'); // 확인창 -> true, 취소 -> false
  // console.log(result2);

}


console.log('조건문 if, switch'); {

  console.log('if');
  // 조건이 하나일 때
  let userId = 'm1';
  let userPw = '11';
  if ( userId=='m1'){
  console.log('아이디가 일치합니다');
  }
  
  // 조건이 두개일 때
  if ( userId=='m1'){
    console.log('아이디가 일치합니다');
  }else{
    console.log('아이디가 일치하지 않습니다');
  }
  
  // 조건이 두개 이상
  if ( userId=='m1'){
    console.log('아이디가 m1');
  }else if(userId!='m1'){
    console.log('아이디가 m1이 아님')
  }
  else{
    console.log('아이디가 없음');
  }
}

// 실습

// let Id = prompt('아이디 입력');
// let Pw = prompt('패스워드 입력');

//  ld는 'm111', pw는 '1111'이면 '로그인 성공'
// 나머지는 '로그인실패', 메세지를 콘솔에 출력
// if문, &&, console log 사용

// if(Id=='m111'&&Pw=='1111'){
//   console.log('로그인 성공')
// }else{
//   console.log('로그인 실패')
// }

console.log('switch');

// let key = parseInt(prompt('숫자,함수입력: ')) // 문자열 -> 숫자
// console.log(typeof key);
// //  0이면 관리자
// // 1이면 일반회원
// // 2면 비로그인 화면
// // 나머지 접근권한 X

// switch(key){
//   case 0:
//   console.log('관리자');
//   break;
//   case 1:
//   console.log('일반회원');
//   break;
//   case 2:
//   console.log('비로그인');
//   break;
//   default:
//     console.log('접근권한X');
// }