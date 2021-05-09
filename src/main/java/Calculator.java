public class Calculator {

    String str = "";
    String[] strArr;
    int current;
    int count = 0;

    public Calculator(String str) {
        this.str = str;
        isNull();  //공백체크
        removeSpace();  //공백제거
        isSpace();  //공백입력 여부 확인
        splitStr();
        chkStrLen();  //입력값 길이 확인
        chkStrNumAndSign(); //입력값 숫자와 수식기호 위치 확인
        calModule();
    }

    public void isNull() {
        if (this.str == null) throw new IllegalArgumentException("null값은 입력할 수 없습니다.");
    }

    public void isSpace() {
        if (this.str.length() == 0) throw new IllegalArgumentException("공백만은 입력할 수 없습니다.");
    }

    public void removeSpace() {
        this.str = this.str.trim();
    }

    public void splitStr() {
        this.strArr = this.str.split(" ");
    }

    public void isNum(String temp) {
        try {
            Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 입력이 존재합니다");
        }
    }

    public void isSign(String temp) {
        if (!(temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/"))) {
            throw new IllegalArgumentException("기호가 적절하지 않습니다");
        }
    }


    public void chkStrLen() {
        if (this.strArr.length == 1) isNum(this.str); // 입력값이 한개인경우 , 숫자인지 아닌지 부터 판별
        if (this.strArr.length % 2 == 0) throw new IllegalArgumentException("입력 순서에 오류가 존재하거나 띄어쓰기를 준수하지 않은 수식입니다."); // 짝수로 끝날 수 없는 수식 구조
    }


    public void chkStrNumAndSign() {

        for (int i = 0; i < this.strArr.length; i++) {
            if (i % 2 == 0) isNum(this.strArr[i]);  //숫자인가
            if (i % 2 == 1) isSign(this.strArr[i]);   //기호인가
        }

    }

    public void calculate(String sign, int num) {

        if (sign.equals("+")) add(num);
        if (sign.equals("-")) sub(num);
        if (sign.equals("*")) mul(num);
        if (sign.equals("/")) div(num);
    }


    public void add(int num) {
        this.current = this.current + num;
    }

    public void sub(int num) {
        this.current = this.current - num;
    }

    public void mul(int num) {
        this.current = this.current * num;
    }

    public void div(int num) {
        this.current = this.current / num;
    }


    public void calModule() {
        boolean flag = false;
        if (this.count == 0) this.current = Integer.parseInt(this.strArr[0]);
        if (this.count != this.strArr.length - 1) {
            //끝이아닌경우
            flag = true;
        }
        if (flag) {
            calculate(this.strArr[this.count + 1], Integer.parseInt(this.strArr[this.count + 2]));
            this.count += 2;
            calModule();
        }
        if (!flag) printResult();

    }

    public void printResult() {
        System.out.println("result : " + this.current);
    }


}
