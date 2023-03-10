// add event listeners for keyboard buttons
document.addEventListener('keydown', function (e) {
    switch (e.key) {
      case '0':
        pressNum(document.querySelector('button:nth-child(2)'));
        break;
      case '1':
        pressNum(document.querySelector('button:nth-child(5)'));
        break;
      case '2':
        pressNum(document.querySelector('button:nth-child(6)'));
        break;
      case '3':
        pressNum(document.querySelector('button:nth-child(7)'));
        break;
      case '4':
        pressNum(document.querySelector('button:nth-child(9)'));
        break;
      case '5':
        pressNum(document.querySelector('button:nth-child(10)'));
        break;
      case '6':
        pressNum(document.querySelector('button:nth-child(11)'));
        break;
      case '7':
        pressNum(document.querySelector('button:nth-child(13)'));
        break;
      case '8':
        pressNum(document.querySelector('button:nth-child(14)'));
        break;
      case '9':
        pressNum(document.querySelector('button:nth-child(15)'));
        break;
      case '+':
        pressOperator(document.querySelector('button:nth-child(4)'));
        break;
      case '-':
        pressOperator(document.querySelector('button:nth-child(8)'));
        break;
      case '*':
        pressOperator(document.querySelector('button:nth-child(12)'));
        break;
      case '/':
        pressOperator(document.querySelector('button:nth-child(16)'));
        break;
      case '.':
        pressDot();
        break;
      case '(':
        pressBracket(document.querySelector('button:nth-child(18)'));
        break;
      case ')':
        pressBracket(document.querySelector('button:nth-child(19)'));
        break;
      case 'Enter':
        // prevent default action
        e.preventDefault();
        pressEqual();
        break;
      case 'Backspace':
        pressClear();
        break;
      case 'Escape':
        pressAllClear();
        break;
    }
  });