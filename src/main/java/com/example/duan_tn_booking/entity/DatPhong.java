
import javax.persistence.*;

@Entity
@Table(name = "DatPhong")
public class DatPhong {
    @Id
    @Column(name = "id_dat_phong")
    private Integer idDatPhong;

    @Column(name = "ma_dat_phong")
    private String maDatPhong;

    @Column(name = "id_khach_hang")
    private Integer idKhachHang;

    @Column(name = "id_phong")
    private Integer idPhong;

    @Column(name = "ngay_nhan_phong")
    private null ngayNhanPhong;

    @Column(name = "ngay_tra_phong")
    private null ngayTraPhong;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @Column(name = "id_khuyen_mai")
    private Integer idKhuyenMai;

    public Integer getIdDatPhong() {
        return this.idDatPhong;
    }

    public void setIdDatPhong(Integer idDatPhong) {
        this.idDatPhong = idDatPhong;
    }

    public String getMaDatPhong() {
        return this.maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public Integer getIdKhachHang() {
        return this.idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Integer getIdPhong() {
        return this.idPhong;
    }

    public void setIdPhong(Integer idPhong) {
        this.idPhong = idPhong;
    }

    public null getNgayNhanPhong() {
        return this.ngayNhanPhong;
    }

    public void setNgayNhanPhong(null ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public null getNgayTraPhong() {
        return this.ngayTraPhong;
    }

    public void setNgayTraPhong(null ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public Boolean getTinhTrang() {
        return this.tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Integer getIdKhuyenMai() {
        return this.idKhuyenMai;
    }

    public void setIdKhuyenMai(Integer idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }
}
