'use script';

// input submit -> 사용자의 입력정보를 컨트롤러에 전송
// 기본적으로 유효성검사에 상관없이 무조건 전송
// input에 name 값이 서버에 전송 -> 컨트롤러 -> 서비스
// requset.getparameter("userId"), request.getparameterValues("checked")
// -> Dao

// 함수 -> 명령문의 집합
// 이벤트를 통해서 호출
// 선택자를 통해서 이벤트를 실행


//1. 선택자
const joinOkbtn = document.querySelector('#joinOkbtn');


//2. 이벤트
// 이벤트 바인딩 (선택 객체와 이벤트를 연결)
joinOkbtn.addEventListener('click', joinOkfn);


//3. 함수
function joinOkfn(event) {
  // 기본적으로 유효성 검사와 상관없이 전송 -> 중지
  // <input type=submit>
  event.preventDefault(); // 기본적인 원래 이벤트를 중지 submit, a href="#"
  
  console.log("회원가입 유효성검사");

  const userId = document.querySelector('#userId')
  const userPw = document.querySelector('#userPw');
  const userEmail = document.querySelector('#userEmail');
  const gender = document.querySelectorAll('input[name=gender]');
  const hobby = document.querySelectorAll('input[name=hobby]');
  // 아이디 검사 -> 값을 반드시 입력 -> "" length==0
  if (userId.value == '' || userId.value.trim().length <= 0) {
    alert('아이디를 입력하세요.');
    userId.focus(); // 아이디 입력창으로 focus가 입력
    return false; // 하위(아래) 명령문을 실행하지 못하게
  }

  // 비밀번호 검사 -> 값을 반드시 입력 -> "" length==0
  if (userPw.value == '' || userPw.value.trim().length <= 0) {
    alert('비밀번호를 입력하세요.');
    userPw.focus();
    return false;
  }

  // 이메일 검사 -> 값을 반드시 입력 -> "" length==0
  if (userEmail.value == '' || userEmail.value.trim().length <= 0) {
    alert('이메일을 입력하세요');
    userEmail.focus();
    return false;
  }

  let cnt = 0;

  // 내장함수(객체) -> js 제공되어지는 API
  // List요소를 하나씩 선택
  gender.forEach(el => {
    if (el.checked) {
      cnt++; // check가 되어 있으면 1증가
    }
  });

  if (cnt == 0) {
    alert('성별을 선택하십시오.')
    gender[0].focus();
    return false;
  }

  cnt = 0;
  hobby.forEach(el => {
    if (el.checked) {
      cnt++; // check가 되어 있으면 1증가
    }
  });

  if (cnt == 0) {
    alert('취미를 하나 이상 선택하십시오.')
    hobby[0].focus();
    return false;
  }

  alert('회원가입 실행');

  joinform.submit();

  
}


// =============================================================


  // 1.선택
  const joinOkbtn2 = document.querySelector('#joinOkbtn2');
  
  // 2.이벤트
  joinOkbtn2.addEventListener('click',joinOkbtn2fn);
  
  function joinOkbtn2fn(event) {
    // 기본적으로 유효성 검사와 상관없이 전송 -> 중지
    // <input type=submit>
    // event.preventDefault(); // 기본적인 원래 이벤트를 중지 submit, a href="#"
    // input 타입이 button일 경우 submit()함수 자동실행되지 않는다.
    console.log("회원가입 유효성검사");
  
    const userId = document.querySelector('#userId')
    const userPw = document.querySelector('#userPw');
    const userEmail = document.querySelector('#userEmail');
    const gender = document.querySelectorAll('input[name=gender]');
    const hobby = document.querySelectorAll('input[name=hobby]');
    // 아이디 검사 -> 값을 반드시 입력 -> "" length==0
    if (userId.value == '' || userId.value.trim().length <= 0) {
      alert('아이디를 입력하세요.');
      userId.focus(); // 아이디 입력창으로 focus가 입력
      return false; // 하위(아래) 명령문을 실행하지 못하게
    }
  
    // 비밀번호 검사 -> 값을 반드시 입력 -> "" length==0
    if (userPw.value == '' || userPw.value.trim().length <= 0) {
      alert('비밀번호를 입력하세요.');
      userPw.focus();
      return false;
    }
  
    // 이메일 검사 -> 값을 반드시 입력 -> "" length==0
    if (userEmail.value == '' || userEmail.value.trim().length <= 0) {
      alert('이메일을 입력하세요');
      userEmail.focus();
      return false;
    }
  
    let cnt = 0;
  
    // 내장함수(객체) -> js 제공되어지는 API
    // List요소를 하나씩 선택
    gender.forEach(el => {
      if (el.checked) {
        cnt++; // check가 되어 있으면 1증가
      }
    });
  
    if (cnt == 0) {
      alert('성별을 선택하십시오.')
      gender[0].focus();
      return false;
    }
  
    cnt = 0;
    hobby.forEach(el => {
      if (el.checked) {
        cnt++; // check가 되어 있으면 1증가
      }
    });
  
    if (cnt == 0) {
      alert('취미를 하나 이상 선택하십시오.')
      hobby[0].focus();
      return false;
    }
  
    alert('회원가입 실행');
  
    joinform.submit();
  
    
  }
    