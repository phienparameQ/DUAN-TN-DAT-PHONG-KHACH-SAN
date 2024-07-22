
import javax.persistence.*;

@Entity
@Table(name = "ThanhToan")
public class ThanhToan {
    @Id
    @Column(name = "id_thanh_toan")
    private Integer idThanhToan;

    @Column(name = "ma_thanh_toan")
    private String maThanhToan;

    @Column(name = "id_chi_tiet_dat_phong")
    private Integer idChiTietDatPhong;

    @Column(name = "ngay_thanh_toan")
    private null ngayThanhToan;

    @Column(name = "phuong_thuc")
    private Boolean phuongThuc;

    @Column(name = "so_tien")
    private BigDecimal soTien;

    public Integer getIdThanhToan() {
        return this.idThanhToan;
    }

    public void setIdThanhToan(Integer idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public String getMaThanhToan() {
        return this.maThanhToan;
    }

    public void setMaThanhToan(String maThanhToan) {
        this.maThanhToan = maThanhToan;
    }

    public Integer getIdChiTietDatPhong() {
        return this.idChiTietDatPhong;
    }

    public void setIdChiTietDatPhong(Integer idChiTietDatPhong) {
        this.idChiTietDatPhong = idChiTietDatPhong;
    }

    public null getNgayThanhToan() {
        return this.ngayThanhToan;
    }

    public void setNgayThanhToan(null ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Boolean getPhuongThuc() {
        return this.phuongThuc;
    }

    public void setPhuongThuc(Boolean phuongThuc) {
        this.phuongThuc = phuongThuc;
    }

    public BigDecimal getSoTien() {
        return this.soTien;
    }

    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }
}
