public class Main {
    public static void main(String[] args) {
        CCaNhan cn1 = new CCaNhan(5,0.5, 30000);
        CCaNhan cn2 = new CCaNhan(3,0.2, 50000);
        CCaNhan cn3 = new CCaNhan(1,0.4, 20000);
        CCaNhan cn4 = new CCaNhan(7,0.5, 35000);
        CCaNhan cn5 = new CCaNhan(12,0.1, 10000);

        CDoiNhom cdn1 = new CDoiNhom();
        cdn1.themDonVi(cn1);
        cdn1.themDonVi(cn2);
        cdn1.themDonVi(cn3);

        CDoiNhom congTy = new CDoiNhom();
        congTy.themDonVi(cn4);
        congTy.themDonVi(cn5);

        System.out.println("Doanh thu cua ca he thong la: ");
        System.out.println(congTy.tinhDoanhThu());



    }
}