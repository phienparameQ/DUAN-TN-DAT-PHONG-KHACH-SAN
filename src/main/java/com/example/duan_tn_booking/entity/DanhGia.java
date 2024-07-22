
import javax.persistence.*;

@Entity
@Table(name = "DanhGia")
public class DanhGia {
    @Id
    @Column(name = "id_danh_gia")
    private Integer idDanhGia;

    @Column(name = "ma_danh_gia")
    private String maDanhGia;

    @Column(name = "id_chi_tiet_phong")
    private Integer idChiTietPhong;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "diem_danh_gia")
    private BigDecimal diemDanhGia;

    @Column(name = "ngay_danh_gia")
    private null ngayDanhGia;

    public Integer getIdDanhGia() {
        return this.idDanhGia;
    }

    public void setIdDanhGia(Integer idDanhGia) {
        this.idDanhGia = idDanhGia;
    }

    public String getMaDanhGia() {
        return this.maDanhGia;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public Integer getIdChiTietPhong() {
        return this.idChiTietPhong;
    }

    public void setIdChiTietPhong(Integer idChiTietPhong) {
        this.idChiTietPhong = idChiTietPhong;
    }

    public String getNoiDung() {
        return this.noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public BigDecimal getDiemDanhGia() {
        return this.diemDanhGia;
    }

    public void setDiemDanhGia(BigDecimal diemDanhGia) {
        this.diemDanhGia = diemDanhGia;
    }

    public null getNgayDanhGia() {
        return this.ngayDanhGia;
    }

    public void setNgayDanhGia(null ngayDanhGia) {
        this.ngayDanhGia = ngayDanhGia;
    }
}
