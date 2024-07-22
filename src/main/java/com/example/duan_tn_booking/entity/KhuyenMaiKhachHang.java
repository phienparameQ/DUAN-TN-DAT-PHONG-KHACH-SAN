
import javax.persistence.*;

@Entity
@Table(name = "KhuyenMaiKhachHang")
public class KhuyenMaiKhachHang {
    @Id
    @Column(name = "id_kmkh")
    private Integer idKmkh;

    @Column(name = "ngay_tham_gia")
    private null ngayThamGia;

    @Column(name = "id_khuyen_mai")
    private Integer idKhuyenMai;

    @Column(name = "id_khach_hang")
    private Integer idKhachHang;

    public Integer getIdKmkh() {
        return this.idKmkh;
    }

    public void setIdKmkh(Integer idKmkh) {
        this.idKmkh = idKmkh;
    }

    public null getNgayThamGia() {
        return this.ngayThamGia;
    }

    public void setNgayThamGia(null ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public Integer getIdKhuyenMai() {
        return this.idKhuyenMai;
    }

    public void setIdKhuyenMai(Integer idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public Integer getIdKhachHang() {
        return this.idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }
}
