import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class CDoiNhom implements IDonVi{
    private List<IDonVi> cacDonVi;
    public CDoiNhom(){
        this.cacDonVi = new ArrayList<>();
    }

    public boolean themDonVi(IDonVi dv){
        try {
            this.cacDonVi.add(dv);
            return true;
        }catch (Error err){
            return false;
        }
    }
    public double tinhDoanhThu() {
        double tong = 0;
        for (IDonVi donVi : cacDonVi){
            tong += donVi.tinhDoanhThu();
        }
        return tong;
    }

}
