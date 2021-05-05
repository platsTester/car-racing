public class CalculatorImpl implements Calculator{

    String formulaStr;
    String[] formulaArr;

    public CalculatorImpl(String formulaStr) {
        this.formulaStr=formulaStr;
        chkNull();
        chkSpace();
        this.formulaArr=strSplit();
    }

    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    @Override
    public void mul() {

    }

    @Override
    public void div() {

    }

    @Override
    public String[] strSplit() {
        this.formulaArr = this.formulaStr.split(" ");
        return this.formulaArr;
    }

    public void chkNull(){
        if(this.formulaStr==null)throw new IllegalArgumentException("null값은 입력할 수 없습니다.");
    }
    public void chkSpace(){
        if(this.formulaStr.trim().length()==0)throw new IllegalArgumentException("공백만은 입력할 수 없습니다.");
    }
}
