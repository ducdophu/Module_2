package _15_Exception_Debug.baitap;

public class TriangleEdgesCheck {
    // Ham kiem tra tam giac hop le
    public void checkTriangleEdges(int a, int b, int c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}