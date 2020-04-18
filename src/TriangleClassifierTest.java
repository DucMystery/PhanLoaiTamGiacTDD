import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    public void testTriangle(){
        int a =2;
        int b =2;
        int c =2;

        String display ="Tam Giac deu";
        TriangleClassifier triangleClassifier = new TriangleClassifier();

        assertEquals(display,triangleClassifier.checkTriangle(a,b,c));
    }
    @Test
    public void testTriangle1(){
        int a =2;
        int b =2;
        int c =3;

        String display ="Tam Giac Can";
        TriangleClassifier triangleClassifier = new TriangleClassifier();

        assertEquals(display,triangleClassifier.checkTriangle(a,b,c));
    }

    @Test
    public void testTriangle2(){
        int a =3;
        int b =4;
        int c =5;

        String display ="Tam Giac Thuong";
        TriangleClassifier triangleClassifier = new TriangleClassifier();

        assertEquals(display,triangleClassifier.checkTriangle(a,b,c));
    }

    @Test
    public void testTriangle3(){
        int a =8;
        int b =2;
        int c =3;

        String display ="Khong Phai Tam Giac";
        TriangleClassifier triangleClassifier = new TriangleClassifier();

        assertEquals(display,triangleClassifier.checkTriangle(a,b,c));
    }

    @Test
    public void testTriangle4(){
        int a =-1;
        int b =2;
        int c =1;

        String display ="Khong Phai Tam Giac";
        TriangleClassifier triangleClassifier = new TriangleClassifier();

        assertEquals(display,triangleClassifier.checkTriangle(a,b,c));
    }

    @Test
    public void testTriangle5(){
        int a =0;
        int b =1;
        int c =1;

        String display ="Khong Phai Tam Giac";
        TriangleClassifier triangleClassifier = new TriangleClassifier();

        assertEquals(display,triangleClassifier.checkTriangle(a,b,c));
    }




}