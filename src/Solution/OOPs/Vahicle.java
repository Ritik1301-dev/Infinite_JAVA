package Solution.OOPs;

public class Vahicle {
    String vahicleName ;
    int vahicleNumber ;
    double vahicleDriverAge ;


    @Override
    public String toString() {
        return "Vahicle{" +
                "vahicleName='" + vahicleName + '\'' +
                ", vahicleNumber=" + vahicleNumber +
                ", vahicleDriverAge=" + vahicleDriverAge +
                '}';
    }

    Vahicle(String a , int b , double c ){
        this.vahicleName = a;
        this.vahicleNumber = b;
        this.vahicleDriverAge = c;

    }
    public static void main(String[] args) {
    Vahicle v = new Vahicle("BMW" , 11307 , 20.5);
        System.out.println(v );
    }
}
