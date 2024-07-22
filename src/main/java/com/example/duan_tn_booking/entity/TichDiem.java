
import javax.persistence.*;

@Entity
@Table(name = "TichDiem")
public class TichDiem {
    @Id
    @Column(name = "id_tich_diem")
    private Integer idTichDiem;

    @Column(name = "diem_so")
    private Integer diemSo;

    @Column(name = "ngay_cap_nhap")
    private null ngayCapNhap;

    @Column(name = "id_khach_hang")
    private Integer idKhachHang;

    public Integer getIdTichDiem() {
        return this.idTichDiem;
    }

    public void setIdTichDiem(Integer idTichDiem) {
        this.idTichDiem = idTichDiem;
    }

    public Integer getDiemSo() {
        return this.diemSo;
    }

    public void setDiemSo(Integer diemSo) {
        this.diemSo = diemSo;
    }

    public null getNgayCapNhap() {
        return this.ngayCapNhap;
    }

    public void setNgayCapNhap(null ngayCapNhap) {
        this.ngayCapNhap = ngayCapNhap;
    }

    public Integer getIdKhachHang() {
        return this.idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }
}
