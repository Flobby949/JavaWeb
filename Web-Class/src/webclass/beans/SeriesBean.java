package webclass.beans;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/21
 * @ClassName :数列
 */

public class SeriesBean {
    //首项
    private double firstItem;
    //公差或公比
    private double var;
    //项数
    private int num;
    //求和
    private double sum;
    //数列类型
    private String name;

    public SeriesBean() {
    }

    public double getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(double firstItem) {
        this.firstItem = firstItem;
    }

    public double getVar() {
        return var;
    }

    public void setVar(double var) {
        this.var = var;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
