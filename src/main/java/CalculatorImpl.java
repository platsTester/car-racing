public class CalculatorImpl implements Calculator {

    String formulaStr;
    String[] formulaArr;
    int current =0;

    //짝수는 숫자 홀수는 기호

    public CalculatorImpl(String formulaStr) {
        this.formulaStr = formulaStr;
        chkNull();
        chkSpace();
        this.formulaArr = strSplit();
        chkWrongInput();
        this.current = Integer.parseInt(this.formulaArr[0]);

    }

    @Override
    public void add(String sign) {


    }

    @Override
    public void sub(String sign) {

    }

    @Override
    public void mul(String sign) {

    }

    @Override
    public void div(String sign) {

    }

    @Override
    public String[] strSplit() {
        this.formulaArr = this.formulaStr.split(" ");
        return this.formulaArr;
    }

    public void chkNull() {
        if (this.formulaStr == null) throw new IllegalArgumentException("null값은 입력할 수 없습니다.");
    }

    public void chkSpace() {
        if (this.formulaStr.trim().length() == 0) throw new IllegalArgumentException("공백만은 입력할 수 없습니다.");
    }

    public void chkWrongInput(){
        for (int i = 0; i < this.formulaArr.length; i++) {
            if(i%2==0){
                System.out.println(">> aa "+i);
                isNum(this.formulaArr[i]);
            }
            if(i%2==1){
                System.out.println(">> bb "+i);
                isSign(this.formulaArr[i]);
            }
        }
    }

    public void isNum(String temp){
        try{
            Integer.parseInt(temp);
        }
        catch (NumberFormatException e){
            throw new IllegalArgumentException("잘못된 입력이 존재합니다");
        }
    }

    public void isSign(String temp){
            if(!(temp.equals("+")||temp.equals("-")||temp.equals("*")||temp.equals("/"))){
                throw new IllegalArgumentException("기호가 적절하지 않습니다");
            }
    }



    public String showAll(){
        String str="";
        for (int i = 0; i < this.formulaArr.length; i++) {
            str=str+formulaArr[i];
        }
        return str;
    }


}
