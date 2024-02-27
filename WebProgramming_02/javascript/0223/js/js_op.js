'use script';

console.log('연산자'); {

  console.log('단항연산자');
  console.log('+');
  let i = 10;
  console.log(i++);
  console.log(i);
  console.log(++i);
  console.log(i);
  console.log('-');
  console.log(i--);
  console.log(i);
  console.log(--i);
  console.log(i);
}


console.log('이항 연산자'); {
  let num1 = 10;
  let num2 = 20;
  console.log('+');
  console.log(`${num1}+${num2}=${num1+num2}`);
  console.log('-');
  console.log(`${num1}-${num2}=${num1-num2}`);
  console.log('*');
  console.log(`${num1}*${num2}=${num1*num2}`);
  console.log('/');
  console.log(`${num1}/${num2}=${num1/num2}`);
}

console.log('비교 연산자'); {
  let num3 = 30;
  let num4 = 40;
  console.log('>');
  console.log(`${num3}>${num4}=${num3>num4}`);
  console.log('<');
  console.log(`${num3}<${num4}=${num3<num4}`);
  console.log('==');
  console.log(`${num3}==${num4}=${num3==num4}`);
  console.log('!=');
  console.log(`${num3}!=${num4}=${num3!=num4}`);
  console.log('<=');
  console.log(`${num3}<=${num4}=${num3<=num4}`);
  console.log('>=');
  console.log(`${num3}>=${num4}=${num3>=num4}`);

  // 타입까지 비교
  console.log('==');
  console.log(`${num3}==${num4}=${10=="10"}`);
  console.log('!=');
  console.log(`${num3}!=${num4}=${10!=="10"}`);
}

console.log('논리 연산자'); {

  let userId = "n1";
  let userPw = "11";

  console.log(`${userId="n1"} && ${userPw="11"} = ${userId=="n1" && userPw=="11"}`)
  console.log(`${userId="n1"} || ${userPw="11"} = ${userId=="n1" || userPw=="11"}`)
  console.log(`${userId="n1"} ^ ${userPw="11"} = ${userId=="n1" ^ userPw=="11"}`)
}

console.log('복합대입 연산자'); {
  let num10 = 100;
  num10 += 100;
  console.log("num10+=" + num10);
  num10 -= 100;
  console.log("num10-=" + num10);
  num10 *= 100;
  console.log("num10*=" + num10);
  num10 /= 100;
  console.log("num10/=" + num10);
}

console.log("삼항연산자"); {


  let a = 10;

  let result = a>10 ? 1:0;
  console.log(result);
  
  let result2 = a>10 ? 'a가 10보다 큽니다':'a가 10보다 같거나 작습니다.';
  console.log(result2);


}