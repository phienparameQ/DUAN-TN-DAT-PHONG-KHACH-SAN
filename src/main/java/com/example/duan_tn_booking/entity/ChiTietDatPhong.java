
import javax.persistence.*;

@Entity
@Table(name = "ChiTietDatPhong")
public class ChiTietDatPhong {
    @Id
    @Column(name = "id_chi_tiet_dat_phong")
    private Integer idChiTietDatPhong;

    @Column(name = "ma_chi_tiet_dat_phong")
    private String maChiTietDatPhong;

    @Column(name = "id_dat_phong")
    private Integer idDatPhong;

    @Column(name = "id_khach_hang")
    private Integer idKhachHang;

    @Column(name = "id_khuyen_mai")
    private Integer idKhuyenMai;

    @Column(name = "id_chi_tiet_phong")
    private Integer idChiTietPhong;

    @Column(name = "ngay_lap")
    private null ngayLap;

    @Column(name = "tong_tien")
    private BigDecimal tongTien;

    public Integer getIdChiTietDatPhong() {
        return this.idChiTietDatPhong;
    }

    public void setIdChiTietDatPhong(Integer idChiTietDatPhong) {
        this.idChiTietDatPhong = idChiTietDatPhong;
    }

    public String getMaChiTietDatPhong() {
        return this.maChiTietDatPhong;
    }

    public void setMaChiTietDatPhong(String maChiTietDatPhong) {
        this.maChiTietDatPhong = maChiTietDatPhong;
    }

    public Integer getIdDatPhong() {
        return this.idDatPhong;
    }

    public void setIdDatPhong(Integer idDatPhong) {
        this.idDatPhong = idDatPhong;
    }

    public Integer getIdKhachHang() {
        return this.idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Integer getIdKhuyenMai() {
        return this.idKhuyenMai;
    }

    public void setIdKhuyenMai(Integer idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public Integer getIdChiTietPhong() {
        return this.idChiTietPhong;
    }

    public void setIdChiTietPhong(Integer idChiTietPhong) {
        this.idChiTietPhong = idChiTietPhong;
    }

    public null getNgayLap() {
        return this.ngayLap;
    }

    public void setNgayLap(null ngayLap) {
        this.ngayLap = ngayLap;
    }

    public BigDecimal getTongTien() {
        return this.tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }
}
