public class TriangleClassifier {

    public String checkTriangle(int a,int b, int c) {
        if (a == b && b == c && (a>0&& b>0 && c>0)){
            return "Tam Giac deu";
        } else if (a == b || a == c || b == c && (a>0&& b>0 && c>0)) {
            return "Tam Giac Can";
        }else if (a>b+c || b>a+c || c>a+b || a<=0 || b<=0 || c<=0){
            return "Khong Phai Tam Giac";
        }
        return "Tam Giac Thuong";
    }
}
